package com.autentia.democouchbase;

import com.autentia.democouchbase.beers.entity.Beer;
import com.autentia.democouchbase.converters.BigDecimalToStringConverter;
import com.autentia.democouchbase.converters.LocalDateTimeToStringConverter;
import com.autentia.democouchbase.converters.StringToBigDecimalConverter;
import com.autentia.democouchbase.converters.StringToLocalDateTimeConverter;
import com.couchbase.client.java.Bucket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.CustomConversions;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.data.couchbase.core.convert.CouchbaseCustomConversions;
import org.springframework.data.couchbase.repository.auditing.EnableCouchbaseAuditing;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.data.couchbase.repository.config.RepositoryOperationsMapping;
import org.springframework.data.domain.AuditorAware;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.autentia.democouchbase.airports.dao", "com.autentia.democouchbase.beers.dao"})
@EnableCouchbaseAuditing
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Override
    protected List<String> getBootstrapHosts() {
        return Collections.singletonList("127.0.0.1");
    }

    @Override
    protected String getBucketName() {
        return "travel-sample";
    }

    @Override
    protected String getBucketPassword() {
        return "travel-sample1234";
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public Bucket beerSampleBucket() throws Exception {
        return couchbaseCluster().openBucket("beer-sample", "beer-sample1234");
    }

    @Bean
    public CouchbaseTemplate beerSampleTemplate() throws Exception {

        CouchbaseTemplate template = new CouchbaseTemplate(couchbaseClusterInfo(), beerSampleBucket(),
                mappingCouchbaseConverter(), translationService());

        template.setDefaultConsistency(getDefaultConsistency());

        return template;
    }

    @Override
    public void configureRepositoryOperationsMapping(RepositoryOperationsMapping baseMapping) {
        try {
            baseMapping.mapEntity(Beer.class, beerSampleTemplate());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public LocalDateTimeToStringConverter localDateTimeToStringConverter() {
        return new LocalDateTimeToStringConverter();
    }

    @Bean
    public StringToLocalDateTimeConverter stringToLocalDateTimeConverter() {
        return new StringToLocalDateTimeConverter();
    }

    @Bean
    public BigDecimalToStringConverter bigDecimalToStringConverter() {
        return new BigDecimalToStringConverter();
    }

    @Bean
    public StringToBigDecimalConverter stringToBigDecimalConverter() {
        return new StringToBigDecimalConverter();
    }

    @Override
    public CustomConversions customConversions() {
        List<Converter> conversions = Arrays.asList(stringToLocalDateTimeConverter(), localDateTimeToStringConverter(),
                stringToBigDecimalConverter(), bigDecimalToStringConverter());
        return new CouchbaseCustomConversions(conversions);
    }

    @Bean
    public AuditorAware auditorAware() {
        return new EntityAuditorAware();
    }
}
