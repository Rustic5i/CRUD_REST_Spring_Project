package web.dao;

import org.springframework.stereotype.Component;

import java.io.Serializable;


public class Cat implements Serializable {
    private int c = 10;

    public Cat() {
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
