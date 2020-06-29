package com.epam.bookcatalogservice.model;

import java.util.List;

public class Catalog {

    private List<CatalogItem> catalogList;

    public Catalog(){}

    public Catalog(List<CatalogItem> catalogList) {
        this.catalogList = catalogList;
    }

    public List<CatalogItem> getCatalogList() {
        return catalogList;
    }

    public void setCatalogList(List<CatalogItem> catalogList) {
        this.catalogList = catalogList;
    }
}
