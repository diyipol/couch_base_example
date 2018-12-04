package com.autentia.democouchbase.entity;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import org.springframework.data.couchbase.core.mapping.id.IdPrefix;
import org.springframework.data.couchbase.core.mapping.id.IdSuffix;

@Document
public class Airline {

    @Id
    private String documentId;

    @Field
    private String callsign;

    @Field
    private String country;

    @Field
    private String iata;

    @Field
    private String icao;

    @Field
    private Long id;

    @Field
    private String name;

    public Airline(String documentId, String callsign, String country, String iata, String icao, Long id, String name) {
        this.documentId = documentId;
        this.callsign = callsign;
        this.country = country;
        this.iata = iata;
        this.icao = icao;
        this.id = id;
        this.name = name;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getCallsign() {
        return callsign;
    }

    public String getCountry() {
        return country;
    }

    public String getIata() {
        return iata;
    }

    public String getIcao() {
        return icao;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airline{");
        sb.append("documentId='").append(documentId).append('\'');
        sb.append(", callsign='").append(callsign).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", iata='").append(iata).append('\'');
        sb.append(", icao='").append(icao).append('\'');
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
