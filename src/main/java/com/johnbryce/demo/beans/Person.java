package com.johnbryce.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {

    @Value("17")
    private int id;

    @Value("${person.name}")
    private String name;

    @Autowired
    @Qualifier("roni")
    private Teacher myTeacher;

    public Person() {

        System.out.println("CTOR IN ACTION");
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("CTOR IN ACTION");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getMyTeacher() {
        return myTeacher;
    }

    public void setMyTeacher(Teacher myTeacher) {
        this.myTeacher = myTeacher;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", myTeacher=" + myTeacher +
                '}';
    }
}
