package jag.okinawa.androidstudy.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Event {

    @SerializedName("accepted")
    @Expose
    private int accepted;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("cancel_at")
    @Expose
    private String cancelAt;
    @SerializedName("cancel_policy")
    @Expose
    private String cancelPolicy;
    @SerializedName("capacity")
    @Expose
    private String capacity;
    @SerializedName("categories")
    @Expose
    private List<String> categories = null;
    @SerializedName("contents")
    @Expose
    private String contents;
    @SerializedName("ended_at")
    @Expose
    private String endedAt;
    @SerializedName("entry_ended_at")
    @Expose
    private String entryEndedAt;
    @SerializedName("entry_started_at")
    @Expose
    private String entryStartedAt;
    @SerializedName("event_id")
    @Expose
    private String eventId;
    @SerializedName("event_url")
    @Expose
    private String eventUrl;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("opened_at")
    @Expose
    private String openedAt;
    @SerializedName("owners")
    @Expose
    private List<Owner> owners = null;
    @SerializedName("payment_types")
    @Expose
    private List<String> paymentTypes = null;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("prefecture_id")
    @Expose
    private String prefectureId;
    @SerializedName("started_at")
    @Expose
    private String startedAt;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("tickets")
    @Expose
    private List<Ticket> tickets = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("waiting")
    @Expose
    private int waiting;

    public int getAccepted() {
        return accepted;
    }

    public void setAccepted(int accepted) {
        this.accepted = accepted;
    }

    public Event withAccepted(int accepted) {
        this.accepted = accepted;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Event withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCancelAt() {
        return cancelAt;
    }

    public void setCancelAt(String cancelAt) {
        this.cancelAt = cancelAt;
    }

    public Event withCancelAt(String cancelAt) {
        this.cancelAt = cancelAt;
        return this;
    }

    public String getCancelPolicy() {
        return cancelPolicy;
    }

    public void setCancelPolicy(String cancelPolicy) {
        this.cancelPolicy = cancelPolicy;
    }

    public Event withCancelPolicy(String cancelPolicy) {
        this.cancelPolicy = cancelPolicy;
        return this;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Event withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public Event withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Event withContents(String contents) {
        this.contents = contents;
        return this;
    }

    public String getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(String endedAt) {
        this.endedAt = endedAt;
    }

    public Event withEndedAt(String endedAt) {
        this.endedAt = endedAt;
        return this;
    }

    public String getEntryEndedAt() {
        return entryEndedAt;
    }

    public void setEntryEndedAt(String entryEndedAt) {
        this.entryEndedAt = entryEndedAt;
    }

    public Event withEntryEndedAt(String entryEndedAt) {
        this.entryEndedAt = entryEndedAt;
        return this;
    }

    public String getEntryStartedAt() {
        return entryStartedAt;
    }

    public void setEntryStartedAt(String entryStartedAt) {
        this.entryStartedAt = entryStartedAt;
    }

    public Event withEntryStartedAt(String entryStartedAt) {
        this.entryStartedAt = entryStartedAt;
        return this;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Event withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public Event withEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
        return this;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Event withImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Event withLat(String lat) {
        this.lat = lat;
        return this;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Event withLng(String lng) {
        this.lng = lng;
        return this;
    }

    public String getOpenedAt() {
        return openedAt;
    }

    public void setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
    }

    public Event withOpenedAt(String openedAt) {
        this.openedAt = openedAt;
        return this;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public Event withOwners(List<Owner> owners) {
        this.owners = owners;
        return this;
    }

    public List<String> getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(List<String> paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public Event withPaymentTypes(List<String> paymentTypes) {
        this.paymentTypes = paymentTypes;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Event withPlace(String place) {
        this.place = place;
        return this;
    }

    public String getPrefectureId() {
        return prefectureId;
    }

    public void setPrefectureId(String prefectureId) {
        this.prefectureId = prefectureId;
    }

    public Event withPrefectureId(String prefectureId) {
        this.prefectureId = prefectureId;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public Event withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Event withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Event withTickets(List<Ticket> tickets) {
        this.tickets = tickets;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Event withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Event withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Event withUrl(String url) {
        this.url = url;
        return this;
    }

    public int getWaiting() {
        return waiting;
    }

    public void setWaiting(int waiting) {
        this.waiting = waiting;
    }

    public Event withWaiting(int waiting) {
        this.waiting = waiting;
        return this;
    }
}
