package com.autentia.democouchbase.beers.entity;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document
public class Beer {

    @Id
    private String id;

    @Field
    private BigDecimal abv;

    @Field
    private String brewery_id;

    @Field
    private String category;

    @Field
    private String description;

    @Field
    private Long ibu;

    @Field
    private String name;

    @Field
    private Long srm;

    @Field
    private String style;

    @Field
    private Long upc;

    @Field
    private LocalDateTime updated;

    public Beer(BigDecimal abv, String brewery_id, String category, String description, Long ibu, String name, Long srm,
                String style, Long upc, LocalDateTime updated) {
        this.abv = abv;
        this.brewery_id = brewery_id;
        this.category = category;
        this.description = description;
        this.ibu = ibu;
        this.name = name;
        this.srm = srm;
        this.style = style;
        this.upc = upc;
        this.updated = updated;
    }

    public BigDecimal getAbv() {
        return abv;
    }

    public String getBrewery_id() {
        return brewery_id;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public Long getIbu() {
        return ibu;
    }

    public String getName() {
        return name;
    }

    public Long getSrm() {
        return srm;
    }

    public String getStyle() {
        return style;
    }

    public Long getUpc() {
        return upc;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Beer{");
        sb.append("abv=").append(abv);
        sb.append(", brewery_id='").append(brewery_id).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", ibu=").append(ibu);
        sb.append(", name='").append(name).append('\'');
        sb.append(", srm=").append(srm);
        sb.append(", style='").append(style).append('\'');
        sb.append(", upc=").append(upc);
        sb.append(", updated=").append(updated);
        sb.append('}');
        return sb.toString();
    }
}
