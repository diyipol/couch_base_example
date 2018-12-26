package com.autentia.democouchbase.beers.command;

import java.math.BigDecimal;

public class CreateBeerCommand {

    private BigDecimal abv;

    private String breweryId;

    private String category;

    private String description;

    private Long ibu;

    private String name;

    private Long srm;

    private String style;

    private Long upc;

    public BigDecimal getAbv() {
        return abv;
    }

    public void setAbv(BigDecimal abv) {
        this.abv = abv;
    }

    public String getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(String breweryId) {
        this.breweryId = breweryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getIbu() {
        return ibu;
    }

    public void setIbu(Long ibu) {
        this.ibu = ibu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSrm() {
        return srm;
    }

    public void setSrm(Long srm) {
        this.srm = srm;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Long getUpc() {
        return upc;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateBeerCommand{");
        sb.append("abv=").append(abv);
        sb.append(", breweryId='").append(breweryId).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", ibu=").append(ibu);
        sb.append(", name='").append(name).append('\'');
        sb.append(", srm=").append(srm);
        sb.append(", style='").append(style).append('\'');
        sb.append(", upc=").append(upc);
        sb.append('}');
        return sb.toString();
    }
}
