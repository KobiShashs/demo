package com.johnbryce.demo.beans;

import javax.persistence.*;

@Entity
@Table (name = "animals")
public class Animal {

    private int id;
    private String name;
    private String gender;
    public Animal() {
    }

    public Animal(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
