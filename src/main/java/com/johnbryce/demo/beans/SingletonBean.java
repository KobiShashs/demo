package com.johnbryce.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private int x = ((int)(Math.random()*100));

    public SingletonBean() {
    }


    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "SingletonBean{" +
                "x=" + x +
                '}';
    }
}
