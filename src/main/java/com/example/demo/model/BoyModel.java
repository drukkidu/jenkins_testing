package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="boy")
public class BoyModel {
    @Id
    public int id;
    private String name;
    private String phone;


    public BoyModel() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
