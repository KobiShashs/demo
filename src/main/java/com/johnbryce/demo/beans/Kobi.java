package com.johnbryce.demo.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Kobi implements Teacher{

    private String name;
    private String course;

    public Kobi() {
    }

    public Kobi(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Kobi{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public void teach() {
        System.out.println("Java");
    }
}
