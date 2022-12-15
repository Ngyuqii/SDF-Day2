package car;

import java.util.Date;

public class Car {

    private String colour;
    private String make;
    private String registration;
    private Date registrationDate;
    private Integer acceleration = 0;
    
    //Creating multiple contructors
    //When adding a constructor, the default constructor disappears
    public Car() { }

    public Car(String reg) {
        registration = reg;
    }

    public Car(String reg, String clr) {
        registration = reg;
        colour = clr;
    }

    public Car(String reg, String clr, String mk) {
        registration = reg;
        colour = clr;
        make = mk;
    }

    // Getters and Setters
    public String getColour() {
        return this.colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return this.make;
    }
    public void setMake(String make) {
        switch (make.toLowerCase()) {
            // if make.equals "honda" or "toyota" or "mazda"
            case "honda":
            case "toyota":
            case "mazda":
            this.make = make;
            break;

            default:
            System.out.println("Incompatible car make.");
        }
    }
    
    public String getRegistration() {
        return this.registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getRegistrationDate() {
        return this.registrationDate;
    }
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getAcceleration() {
        return this.acceleration;
    }

    // Method behaviour
    public void horn() {
        System.out.println("Horn Horn!");
    }

    public void accelerate() {
        if (this.acceleration < 200)
            this.acceleration++;
    }
    
    public void accelerate(Integer n) {
        for (Integer i = 0; i < n; i++)
            this.accelerate();
    }
    public void decelerate() {
        if (this.acceleration > 0)
            this.acceleration--;
    }

}