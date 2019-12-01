package com.festicovoit.entity.dbo;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "trip")
public class TripDbo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private LocalDateTime startDate;
    @NotNull
    private LocalDateTime endDate;
    @NotNull
    private String startLocation;
    @NotNull
    private String endLocation;
    @NotNull
    private Duration duration;
    @NotNull
    private int places;
    @NotNull
    private Double price;
    @NotNull
    private String description;

    public TripDbo () {}

    public TripDbo(@NotNull LocalDateTime startDate, @NotNull LocalDateTime endDate, @NotNull String startLocation,
                   @NotNull String endLocation, @NotNull Duration duration, @NotNull int places, @NotNull Double price,
                   @NotNull String description, UserParticipantDbo userDriver, List<UserParticipantDbo> carMates) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.duration = duration;
        this.places = places;
        this.price = price;
        this.description = description;
        this.userDriver = userDriver;
        this.carMates = carMates;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_driver_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private UserParticipantDbo userDriver;

    @ManyToMany
    @JoinTable(
            name = "car_mates_trip",
            joinColumns = @JoinColumn(name = "car_mates_id"),
            inverseJoinColumns = @JoinColumn(name = "trip_id"))
    private List<UserParticipantDbo> carMates;

    public Long getId() {
        return id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserParticipantDbo getUserDriver() {
        return userDriver;
    }

    public void setUserDriver(UserParticipantDbo userDriver) {
        this.userDriver = userDriver;
    }

    public List<UserParticipantDbo> getCarMates() {
        return carMates;
    }

    public void setCarMates(List<UserParticipantDbo> carMates) {
        this.carMates = carMates;
    }
}
