package com.autentia.democouchbase.entity;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import org.springframework.data.couchbase.core.mapping.id.IdPrefix;
import org.springframework.data.couchbase.core.mapping.id.IdSuffix;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Document
public class Airport {

    public static final String TYPE = "airport";

    @Id @GeneratedValue(strategy = GenerationStrategy.USE_ATTRIBUTES, delimiter = "_")
    private String documentId;

    @Min(5)
    @Field("airportname")
    private String airportName;

    @Min(5)
    @Field
    private String city;

    @Min(5)
    @Field
    private String country;

    @Min(4)
    @Field
    private String icao;

    @NotNull
    @Field @IdSuffix(order=0)
    private Long id;

    @Min(5)
    @Field
    private String tz;

    @Min(5)
    @Field @IdPrefix(order=0)
    private String type;

    public Airport(String airportName, String city, String country, String icao, Long id, String tz, String type) {
        this.airportName = airportName;
        this.city = city;
        this.country = country;
        this.icao = icao;
        this.id = id;
        this.tz = tz;
        this.type = type;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIcao() {
        return icao;
    }

    public Long getId() {
        return id;
    }

    public String getTz() {
        return tz;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airport{");
        sb.append("documentId='").append(documentId).append('\'');
        sb.append(", airportName='").append(airportName).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", icao='").append(icao).append('\'');
        sb.append(", id=").append(id);
        sb.append(", tz='").append(tz).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
