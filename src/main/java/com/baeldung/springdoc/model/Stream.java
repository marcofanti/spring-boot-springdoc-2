package com.baeldung.springdoc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "stream")
public class Stream {
    @Id
    private String id;
    private String name;
    private String deliveryMethod;
    private String deliveryUrl;
    //private List<String> eventsRequest = new ArrayList<>();
    private String format;

    public Stream(String id, String name, String deliveryMethod, String deliveryUrl,
//                  ArrayList eventsRequest,
                  String format) {
        this.id = id;
        this.name = name;
        this.deliveryMethod = deliveryMethod;
        this.deliveryUrl = deliveryUrl;
        //this.eventsRequest = eventsRequest;
        this.format = format;
    }

    public Stream() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryUrl(String deliveryUrl) {
        this.deliveryUrl = deliveryUrl;
    }

    public String getDeliveryUrl() {
        return deliveryUrl;
    }
/*
    public void setEventsRequest(ArrayList eventsRequest) {
        this.eventsRequest = eventsRequest;
    }

    public List<String> getEventsRequest() {
        return eventsRequest;
    }
*/
    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stream)) return false;
        Stream stream = (Stream) o;
        return id.equals(stream.id) && name.equals(stream.name) && deliveryMethod.equals(stream.deliveryMethod) && deliveryUrl.equals(stream.deliveryUrl)
            //&& eventsRequest.equals(stream.eventsRequest)
            && format.equals(stream.format);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(id, name, deliveryMethod, deliveryUrl, eventsRequest, format);
        return Objects.hash(id, name, deliveryMethod, deliveryUrl, format);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                ", deliveryUrl='" + deliveryUrl + '\'' +
//                ", eventsRequest=" + eventsRequest +
                ", format='" + format + '\'' +
                '}';
    }
}



