public class CruiseShip extends Boat{
    private double fuelCap = 0;
    private String interiorColor = "";


    public CruiseShip(String inBrand, double inSpeed, int inPassengers, double length, String powerSource, double fuelCap, String interiorColor) {
        super(inBrand, inSpeed, inPassengers, length, powerSource);
        this.fuelCap = fuelCap;
        this.interiorColor = interiorColor;
    }


    //create get and setters
    public double getfuelCap() {
        return fuelCap;
    }

    public void setfuelCap(double fuelCap) {
        this.fuelCap = fuelCap;
    }

    public String getinteriorColor() {
        return interiorColor;
    }

    public void setinteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }
    //create new super string
    public String toString() {
        String result = super.toString() + "\n" + "Interior Color: " + this.getinteriorColor() + "\n" + "Fuel Capacity(Gal.): " + this.getfuelCap();
        return result;
    }
}