package com.autentia.democouchbase.entity;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import org.springframework.data.couchbase.core.mapping.id.IdPrefix;
import org.springframework.data.couchbase.core.mapping.id.IdSuffix;

@Document
public class Airport {

    @Id
    private String documentId;

    @Field
    private String airportname;

    @Field
    private String city;

    @Field
    private String country;

    @Field
    private String icao;

    @Field
    private Long id;

    @Field
    private String tz;

    public Airport(String documentId, String airportname, String city, String country, String icao, Long id, String tz) {
        this.documentId = documentId;
        this.airportname = airportname;
        this.city = city;
        this.country = country;
        this.icao = icao;
        this.id = id;
        this.tz = tz;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getAirportname() {
        return airportname;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airport{");
        sb.append("documentId='").append(documentId).append('\'');
        sb.append(", airportname='").append(airportname).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", icao='").append(icao).append('\'');
        sb.append(", id=").append(id);
        sb.append(", tz='").append(tz).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
