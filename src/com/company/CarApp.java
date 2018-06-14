package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CarApp {

    public static void main(String args[]) throws IOException {
        String carName;
        String carColor;
        int speed;
        String answer = "";
        Car car = null;
        Scanner scanner = new Scanner(System.in);
        String reason="";
        String pass="";
        String driver="";
        while(!answer.equals("n"))
        {
            System.out.println("What is the name of your car? ");
            carName = scanner.next();
            System.out.println("What is your cars color?");
            carColor = scanner.next();
            System.out.println("What is the car's speed? ");
            speed = scanner.nextInt();
            System.out.println("What is the reason for stop? ");
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            reason = bf.readLine();


            car = new Car(carName, carColor, speed);
            car.setReasonForStop(reason);
            System.out.println("Did this car pass emission test? <y/n>");
            pass = scanner.next();
            car.setPass(pass);
            System.out.println("Who is driving the car? ");
            driver = bf.readLine();
            Drivers newDriver = new Drivers(driver);
            System.out.println("This car is operating by "+newDriver.getName());


            System.out.println(car.start());
            System.out.println(car.accelerate());
            System.out.println(car.go());
            System.out.println(car.stop());
            System.out.println(car.hasStopped());
            System.out.println(car.passEmission());

            System.out.println("Do you want to input more car? <y/n>");
            answer = scanner.next().toLowerCase();
        }
    }
}