package com.johnbryce.demo.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

    private int x = ((int)(Math.random()*100));

    public PrototypeBean() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "PrototypeBean{" +
                "x=" + x +
                '}';
    }
}
