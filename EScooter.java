public class EScooter extends Scooter{
    //create class specific variables
    private double MPC = 0;
    private double chargingTime = 0;


    public EScooter(String inBrand, double inSpeed, int inPassengers, double gears, double weight, double MPC, double chargingTime) {
        super(inBrand, inSpeed, inPassengers, gears, weight);
        this.MPC = MPC;
        this.chargingTime = chargingTime;
    }


    //create get and setters
    public double getMPC() {
        return MPC;
    }

    public void setMPC(double MPC) {
        this.MPC = MPC;
    }

    public double getchargingTime() {
        return chargingTime;
    }

    public void setchargingTime(double chargingTime) {
        this.chargingTime = chargingTime;
    }
    //create new super string
    public String toString() {
        String result = super.toString() + "\n" + "Charging Time(Hrs): " + this.getchargingTime() + "\n" + "Miles Per Charge: " +  this.getMPC();
        return result;
    }
}