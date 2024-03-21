public class Tesla extends Car{


    private String doorType = "";
    private String engine = "";


    public Tesla(String inBrand, double inSpeed, int inPassengers, double inMPG, String doorType, String engine) {
        super(inBrand, inSpeed, inPassengers, inMPG);
        this.doorType = doorType;
        this.color = engine;
    }


    //create get and setters
    public String getdoorType() {
        return doorType;
    }

    public void setdoorType(String doorType) {
        this.doorType = doorType;
    }

    public String getengine() {
        return engine;
    }

    public void setengine(String engine) {
        this.engine = engine;
    }
    //create new super string
    public String toString() {
        String result = super.toString() + "\n" + "Engine: " + this.getengine() + "\n" + "Door Type: " + this.getdoorType();
        return result;
    }

}