package com.Blackcoffer.blackcoffer.models;

public class UserModel {

    private Long id;
    private String endYear;
    private String intensity;
    private String sector;
    private String region;
    private String topic;
    private String insight;
    private String url;
    private String startYear;
    private String added;
    private String published;
    private String source;
    private String title;
    private String country;
    private String city;
    private String likelihood;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getInsight() {
        return insight;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(String likelihood) {
        this.likelihood = likelihood;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", endYear='" + endYear + '\'' +
                ", intensity='" + intensity + '\'' +
                ", sector='" + sector + '\'' +
                ", region='" + region + '\'' +
                ", topic='" + topic + '\'' +
                ", insight='" + insight + '\'' +
                ", url='" + url + '\'' +
                ", startYear='" + startYear + '\'' +
                ", added='" + added + '\'' +
                ", published='" + published + '\'' +
                ", source='" + source + '\'' +
                ", title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", likelihood='" + likelihood + '\'' +
                '}';
    }
}
