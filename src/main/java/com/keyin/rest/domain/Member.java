package com.keyin.rest.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {
    @Id
    @SequenceGenerator(name = "member_sequence", sequenceName = "member_sequence", allocationSize = 1, initialValue=10)
    @GeneratedValue(generator = "member_sequence")
    private long id;

    private String firstName;
    private String lastName;
    private String address;
    private String emailAddress;
    private Date membershipStartDate;
    private double membershipDuration;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(Date membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public double getMembershipDuration() {
        return membershipDuration;
    }

    public void setMembershipDuration(double membershipDuration) {
        this.membershipDuration = membershipDuration;
    }
}
