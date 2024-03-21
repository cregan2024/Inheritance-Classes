public class Boat extends Vehicle{
    private double length = 0;
    private String powerSource = "";


    public Boat(String inBrand, double inSpeed, int inPassengers, double length, String powerSource) {
        super(inBrand, inSpeed, inPassengers);
        this.length = length;
        this.powerSource = powerSource;
    }


    //create get and setters
    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public String getpowerSource() {
        return powerSource;
    }

    public void setpowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
    //create new super string
    public String toString() {
        String result = super.toString() + "\n" + "Power Source: " + this.getpowerSource() + "\n" + "Length: " + this.getlength();
        return result;
    }

}