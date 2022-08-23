package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal() {
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    String getDescription(){
        String ps = null;
        if (numberOfPaws == 1){
            ps += "paw";
        }else if(numberOfPaws > 1) {
            ps += "paws";
        }
        String hFur = null;

        if (hasFur){
            hFur += "a";
        }else {
            hFur += "no";
        }

        String ret = "This animal is mostly " + color + ". It has " + numberOfPaws + " " + ps + " and " + hFur + " fur.";

        return ret;

    }
}
