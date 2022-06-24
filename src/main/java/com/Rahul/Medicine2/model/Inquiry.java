package com.Rahul.Medicine2.model;

public class Inquiry {
    private String searchString;

    public Inquiry(String searchString) {
        this.searchString = searchString;
    }

    public Inquiry() {
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
