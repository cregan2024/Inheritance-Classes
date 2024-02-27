
// Car Class inherits from Vehicle Class
public class Main{


    public static void main(String[] args){

    }
}
class Car extends Vehicle{
    int wheels = 4;
     private String color = "White";
    private boolean spoiler = false;
    private boolean stereo = false;
    private double mpg = 0.0;
    public Car(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG) {
        super(inBrand, inSpeed, inPassengers, inCargo);
        mpg = inMPG;
    }

    public void setSpoiler(boolean inSpoiler) {
        spoiler = inSpoiler;
    }

    public boolean getSpoiler() {
        return spoiler;
    }

    public void setStereo(boolean inStereo) {
        stereo = inStereo;
    }

    public boolean getStereo() {
        return stereo;
    }

    @Override
    public double getSpeed() {
        if (spoiler)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getMPG() {
        if (stereo)
            return mpg - (mpg / 10);
        else
            return mpg;
    }

    public String toString() {
        String result = super.toString() +
                "MPG: \t\t\t" + this.getMPG();
        return result;
    }
}

// The Base Vehicle Class, implements the Speedometer interface
class Vehicle implements Speedometer {
    protected String brandName = "";
    protected double speed = 0.0;
    protected int passengers = 0;
    protected double cargoWeight = 0.0;

    public Vehicle() {
        brandName = "";
        speed = 0.0;
        passengers = 0;
        cargoWeight = 0.0;
    }

    public Vehicle(String inBrand, double inSpeed, int inPassengers, double inCargo) {
        brandName = inBrand;
        speed = inSpeed;
        passengers = inPassengers;
        cargoWeight = inCargo;
    }

    public Vehicle(String inBrand) {
        brandName = inBrand;
    }

    public String getBrand() {
        return brandName;
    }

    public void setBrandName(String inBrand) {
        brandName = inBrand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double inSpeed) {
        speed = inSpeed;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int inPassengers) {
        speed = inPassengers; // This should set passengers instead of speed
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double inCargoWeight) {
        cargoWeight = inCargoWeight;
    }

    public String toString() {
        String result = "";
        result = "Brand: \t\t\t" + getBrand() + "\n" +
                "Speed (mph): \t" + getSpeed() + "\n" +
                "Passengers: \t" + getPassengers() + "\n" +
                "Cargo (lbs): \t" + getCargoWeight() + "\n";
        return result;
    }
}

// Interface to show the speed of any vehicle in mph
interface Speedometer {
    public void setSpeed(double inSpeed);
    public double getSpeed();
}

// Boat class inherits from Car
class Boat extends Car {
    private int numberOfEngines;

    public Boat(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int numEngines) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG);
        numberOfEngines = numEngines;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numEngines) {
        numberOfEngines = numEngines;
    }

    // Override toString method to include special characteristics
    @Override
    public String toString() {
        String result = super.toString() +
                "Number of Engines: \t" + getNumberOfEngines();
        return result;
    }
}

// Create another boat class with additional features
class SpeedBoat extends Boat {
    private double maxSpeed;

    public SpeedBoat(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int numEngines, double maxSpeed) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG, numEngines);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "Max Speed: \t\t" + getMaxSpeed() + " knots";
    }
}


