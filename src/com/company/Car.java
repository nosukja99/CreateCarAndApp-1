package com.company;

public class Car extends Vehicle {
    int capacity;
    int maxSpeed;
    String reasonForStop;
    boolean pass;
    Person person;

    public boolean getPass() {
        return pass;
    }

    public void setPass(String pass) {
        if(pass.equals("y")||pass.equals("Y"))
            this.pass=true;
        else
            this.pass=false;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getReasonForStop() {
        return reasonForStop;
    }

    public void setReasonForStop(String reasonForStop) {
        this.reasonForStop = reasonForStop;
    }
    public Car (String name, String color, int speed)
    {
        super (name, color, speed);
    }

    public Car(String name, String color, int speed, int maxSpeed)
    {
        super (name, color, speed);
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String hasStopped()
    {
        return "The "+ super.getColor()+" "+super.getName()
                +" has stopped "+getReasonForStop();
    }

    public String passEmission()
    {
        if(pass==true)
            return "The "+ super.getColor()+" "+super.getName()
                    +" passes its emission test";
        else
            return "The "+ super.getColor()+" "+super.getName()
                    +" fails to pass its emission test";
    }

}