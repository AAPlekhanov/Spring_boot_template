package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {


    @Id
    @GeneratedValue
    private int id;

    private String name;



    public User() {}

    public User(String name) {
        this.name = name;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
