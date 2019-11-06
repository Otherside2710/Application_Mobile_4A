package com.example.myapplication;

import java.util.List;

public class RestAPILinuxResponse {

    private List<Linux> distro;

    public List<Linux> getResults() {
        return distro;
    }

    public void setResults(List<Linux> results) {
        this.distro = results;
    }
}
