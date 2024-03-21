public class Scooter extends Vehicle{
    //create class specific variables
    private double wheels = 0;
    private double weight = 0 ;


    public Scooter(String inBrand, double inSpeed, int inPassengers, double wheels, double weight) {
        super(inBrand, inSpeed, inPassengers);
        this.wheels = wheels;
        this.weight = weight;
    }


    //create get and setters
    public double getwheels() {
        return wheels;
    }

    public void setwheels(double wheels) {
        this.wheels = wheels;
    }

    public double getweight() {
        return weight;
    }

    public void setweight(double weight) {
        this.weight = weight;
    }
    //create new super string
    public String toString() {
        String result = super.toString() + "\n" + "Weight(lbs): " + this.getweight() + "\n" + "Gears: " + this.getwheels();
        return result;
    }
}