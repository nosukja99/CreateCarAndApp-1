package com.company;

public class Drivers extends Person {
    boolean hasLicense;



    public Drivers()
    {

    }

    public Drivers(String name)
    {
        super.setName(name);
    }

    @Override
    void setHasLicense(String answer) {
        if(answer.equals("y")||answer.equals("Y"))
            this.hasLicense=true;
        else
            this.hasLicense=false;
    }

}
