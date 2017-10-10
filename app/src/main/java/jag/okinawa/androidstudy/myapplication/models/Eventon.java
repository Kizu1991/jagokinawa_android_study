package jag.okinawa.androidstudy.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Eventon{

    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    @SerializedName("limit")
    @Expose
    private int limit;
    @SerializedName("start")
    @Expose
    private int start;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Eventon withCount(int count) {
        this.count = count;
        return this;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Eventon withEvents(List<Event> events) {
        this.events = events;
        return this;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Eventon withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public Eventon withStart(int start) {
        this.start = start;
        return this;
    }
}
