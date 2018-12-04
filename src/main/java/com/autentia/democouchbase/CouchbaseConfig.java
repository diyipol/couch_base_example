package com.autentia.democouchbase;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.data.couchbase.repository.support.IndexManager;

import java.util.Collections;
import java.util.List;

@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.autentia.democouchbase.dao"})
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
}
