package com.keyin.city;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class TownHall {
    @Id
    @SequenceGenerator(name = "town_hall_sequence", sequenceName = "town_hall_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "town_hall_sequence")
    private long id;

    private String name;
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
