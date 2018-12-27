package com.autentia.democouchbase.beers.entity;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import org.springframework.data.annotation.*;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document
public class Beer {

    @Id
    private String id;

    @NotNull
    @Min(0)
    @Field
    private BigDecimal abv;

    @NotNull
    @Size(min = 3)
    @Field("brewery_id")
    private String breweryId;

    @NotNull
    @Size(min = 5)
    @Field
    private String category;

    @NotNull
    @Size(min = 5)
    @Field
    private String description;

    @NotNull
    @Min(0)
    @Field
    private Long ibu;

    @NotNull
    @Size(min = 5)
    @Field
    private String name;

    @NotNull
    @Min(0)
    @Field
    private Long srm;

    @NotNull
    @Size(min = 5)
    @Field
    private String style;

    @NotNull
    @Min(0)
    @Field
    private Long upc;

    @CreatedDate
    private LocalDateTime created;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime updated;

    @LastModifiedBy
    private String lastModifiedBy;

    @Version
    private Long version;

    public Beer(String id, BigDecimal abv, String breweryId, String category, String description, Long ibu, String name, Long srm,
                String style, Long upc) {
        this.id = id;
        this.abv = abv;
        this.breweryId = breweryId;
        this.category = category;
        this.description = description;
        this.ibu = ibu;
        this.name = name;
        this.srm = srm;
        this.style = style;
        this.upc = upc;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getAbv() {
        return abv;
    }

    public String getBreweryId() {
        return breweryId;
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

    public LocalDateTime getCreated() {
        return created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public Long getVersion() {
        return version;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Beer{");
        sb.append("id='").append(id).append('\'');
        sb.append(", abv=").append(abv);
        sb.append(", breweryId='").append(breweryId).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", ibu=").append(ibu);
        sb.append(", name='").append(name).append('\'');
        sb.append(", srm=").append(srm);
        sb.append(", style='").append(style).append('\'');
        sb.append(", upc=").append(upc);
        sb.append(", updated=").append(updated);
        sb.append(", lastModifiedBy='").append(lastModifiedBy).append('\'');
        sb.append(", version=").append(version);
        sb.append('}');
        return sb.toString();
    }
}
