package Car;

/*
Not necessary to import class if in the same package
import Car.Car;
import Car.TurboChargedCar;
*/
import java.util.Date;

public class ObjCar {
    
    public static void main(String[] args) {

        //Instantiating myCar
        Car myCar = new Car("SAB1234A");

        //Setting the details of the car
        myCar.setColour("red");
        myCar.setMake("Honda");
        myCar.setRegistrationDate(new Date());
        System.out.printf("This %s %s car is registered on %tc.\nThe car registration number is %s.\n", myCar.getColour(), myCar.getMake(), myCar.getRegistrationDate(), myCar.getRegistration());

        myCar.horn();
        myCar.accelerate(5);
        System.out.printf("Acceleration: %d units.\n", myCar.getAcceleration());

        //Instantiating myOtherCar
        Car myOtherCar = new TurboChargedCar("SAB5678A");
        
        System.out.println(myOtherCar.getClass()); //to find out the class
        
        //If theOtherCar is an object from class TurboChargedCar
        //Cast into TurboChargedCar type and turn on turbo
        if(myOtherCar instanceof TurboChargedCar) {
            TurboChargedCar turboOtherCar = (TurboChargedCar)myOtherCar;
            turboOtherCar.setTurbo(true);
            System.out.printf("Car registration %s is a turbo-charged car.\n", myOtherCar.getRegistration());
            turboOtherCar.accelerate();
        }
        else {
            System.out.printf("Car registration %s is not a turbo-charged car.\n", myOtherCar.getRegistration());
            myOtherCar.accelerate();
        }

    }

}
