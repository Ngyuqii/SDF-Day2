package models;
import java.util.Date;

public class Car {

private String colour;
private String make;
private String registration;
private Date registrationDate;

public String getColour() {
    return colour;
}
public void setColour(String colour) {
    this.colour = colour;
}
public String getMake() {
    return make;
}
public void setMake(String make) {
    this.make = make;
}
public String getRegistration() {
    return registration;
}
public void setRegistration(String registration) {
    this.registration = registration;
}

}