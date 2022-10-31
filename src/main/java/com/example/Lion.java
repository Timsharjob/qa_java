package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private IFiline iFiline;

    public Lion(String sex, IFiline iFiline) throws Exception {
        this.iFiline = iFiline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    //Feline feline = new Feline();

    public int getKittens() {
        return iFiline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return iFiline.getFood("Хищник");
    }
}
