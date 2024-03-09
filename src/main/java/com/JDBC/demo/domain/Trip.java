package com.JDBC.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trip_with_isha")
public class Trip {

    @Id
    @Column(name = "id")
    public String id;

    @Column(name = "traveller_name")
    public String name;

    @Column(name = "traveller_age")
    public int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
