package com.company;

public class Vehicle {

    String name;
    int speed;
    String color;

    public Vehicle()
    {

    }
    public Vehicle(String name, String color, int speed)
    {
        this.name=name;
        this.color=color;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String start()
    {
        return "The "+getColor()+" "+getName()+" is starting";
    }

    public String accelerate()
    {
        return "The "+getColor()+" "+getName()+" is accelerating";
    }

    public String go()
    {
        return "The "+getColor()+" "+getName()+" is going "+getSpeed()+" mph";
    }

    public String stop()
    {
        return "The "+getColor()+" "+getName()+" is stopped";
    }
}