package main;
import models.Car;
import models.car;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
    
        Car myCar = new Car();
        Car myOtherCar = new Car();

        myCar.setColour("red");
        myCar.setMake("Honda");
        myCar.setRegistration("S12345A");
        myCar.setRegistrationDate(new Date());


    }
}
