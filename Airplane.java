public class Airplane extends Vehicle{
    //create class specific variables
    private double maxAltitude = 0;
    private int numEngine = 0;
    public Airplane(String inBrand, double inSpeed, int inPassengers, double maxAltitude, int numEngine ) {
        super(inBrand, inSpeed, inPassengers); //uses super constructor
        this.maxAltitude = maxAltitude;
        this.numEngine = numEngine;

    }
    //create get and setters
    public double getmaxAltitude() {
        return maxAltitude;
    }

    public void setmaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getnumEngine() {
        return numEngine;
    }

    public void setnumEngine(int numEngine) {
        this.numEngine = numEngine;
    }
    //create new super string
    public String toString() {
        String result = super.toString() + "\n" + "# of Engines: " + this.getnumEngine() + "\n" + "Max Altitude(ft): " + this.getmaxAltitude();
        return result;
    }
}