package com.festicovoit.entity.dbo;

import org.hibernate.validator.constraints.Length;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@DiscriminatorValue("1")
public class UserParticipantDbo extends UserDbo {

    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    @NotNull
    @Length(max = 10)
    private Long phoneNumber;
    @NotNull
    private Date dateOfBirth;
    @NotNull
    private String address;
    @NotNull
    private int zipCode;
    @NotNull
    private String city;


    public UserParticipantDbo () {}

    public UserParticipantDbo(String password, String email, String firstname, String lastname, Long phoneNumber,
                           Date dateOfBirth, String address, int zipCode, String city) {
        super(password, email);
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
}
