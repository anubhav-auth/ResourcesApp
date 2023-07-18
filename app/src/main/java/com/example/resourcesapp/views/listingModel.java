package com.example.resourcesapp.views;

public class listingModel {

    String url;
    String title;
    String body;
    int tag;

    public listingModel(String title, String body, String url) {
        this.url = url;
        this.title = title;
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
