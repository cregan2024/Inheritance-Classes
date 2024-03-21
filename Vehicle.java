// The Base Vehicle Class, implements the Speedometer interface
public class Vehicle implements Speedometer {
    //base (Class wide) variables
    protected String brandName = "";
    protected double speed = 0.0;
    protected int passengers = 0;
    //Base default constructor
    public Vehicle() {
        brandName = "";
        speed = 0.0;
        passengers = 0;

    }

    public Vehicle(String inBrand, double inSpeed, int inPassengers) {
        brandName = inBrand;
        speed = inSpeed;
        passengers = inPassengers;

    }

    //getters and setters
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
        speed = inPassengers;
    }
    //Base toString
    public String toString() {
        String result = "";
        result = "Brand: " + getBrand() + "\n"+ "Speed(MPH): " + getSpeed() + "\n" + "Passengers: " + getPassengers() ;
        return result;
    }
}