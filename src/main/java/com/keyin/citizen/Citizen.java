package com.keyin.citizen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Citizen {

    @Id
    @SequenceGenerator(name = "citizen_sequence", sequenceName = "citizen_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "citizen_sequence")
    private long id;

    private String name;

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
}
