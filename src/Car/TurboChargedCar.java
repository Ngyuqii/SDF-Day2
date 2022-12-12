package Car;

public class TurboChargedCar extends Car {

    private Boolean turbo = false;

    //Constructor
    public TurboChargedCar(String registration) {
        super(registration);
    }

    //Getter and setter
    public Boolean getTurbo() {
        return this.turbo;
    }
    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    //Override the parent class method
    @Override
    public void accelerate() {
        if (this.turbo) {
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            System.out.println("Vroom vroom vroom!");
        } else {
            super.accelerate();
            System.out.println("Woosh.");
        }
    }

}