public class Boeing extends Airplane{
    //create variables
    private double maxRange = 0;
    //miles
    private String engineName = "";
    public Boeing(String inBrand, double inSpeed, int inPassengers, double maxAltitude, int numEngine, double maxRange, String engineName) {
        super(inBrand, inSpeed, inPassengers, maxAltitude, numEngine);
        this.maxRange = maxRange;
        this.engineName = engineName;
    }
    //create get and setters
    public double getmaxRange() {

        return maxRange;
    }

    public void setmaxRange(double maxRange) {

        this.maxRange = maxRange;
    }

    public String getengineName() {

        return engineName;
    }

    public void setengineName(String engineName) {

        this.engineName = engineName;
    }
    //create new super string
    public String toString() {
        String result = super.toString() + "\n" + "Maximum Range(Miles): " + this.getmaxRange() + "\n" + "Engine Name: " + this.getengineName();
        return result;
    }
}