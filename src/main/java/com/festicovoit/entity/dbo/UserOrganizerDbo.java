package com.festicovoit.entity.dbo;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@DiscriminatorValue("2")
public class UserOrganizerDbo extends UserDbo {

    @NotNull
    private String organisationName;
    @NotNull
    private Long phoneNumber;
    @NotNull
    private String address;
    @NotNull
    private int zipCode;
    @NotNull
    private String city;

    @OneToMany(fetch = FetchType.LAZY)
    private List<EventDbo> eventList;

    public UserOrganizerDbo(String password, String email, @NotNull String organisationName, @NotNull Long phoneNumber, @NotNull String address, @NotNull int zipCode, @NotNull String city, List<EventDbo> eventList) {
        super(password, email);
        this.organisationName = organisationName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.eventList = eventList;
    }

    public UserOrganizerDbo () {}

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<EventDbo> getEventList() {
        return eventList;
    }

    public void setEventList(List<EventDbo> eventList) {
        this.eventList = eventList;
    }
}
