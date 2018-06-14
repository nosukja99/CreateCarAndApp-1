package com.company;

public class Pilots extends Person {

    boolean hasLicense;
    @Override
    void setHasLicense(String answer) {
        if(answer.equals("y")||answer.equals("Y"))
            this.hasLicense=true;
        else
            this.hasLicense=false;

    }
}
