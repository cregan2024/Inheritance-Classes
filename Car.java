// now implement the car class
// Car Class inherits from Vehicle Class
public class Car extends Vehicle {
    int wheels = 4;
    String color = "White";
    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0; //has an extra variable, mpg

    public Car(String inBrand, double inSpeed, int inPassengers, double inMPG) {
        super(inBrand, inSpeed, inPassengers); //uses super constructor
        mpg = inMPG;
    }

    //another additional variable
    public void setSpoiler(boolean inSpoiler) {
        spoiler = inSpoiler;
    }

    public boolean getSpoiler() {
        return spoiler;
    }

    //another additional variable
    public void setStereo(boolean inStereo) {
        stereo = inStereo;
    }

    public boolean getStereo() {
        return stereo;
    }

    //overrides the super getSpeed method
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

    //used the super toString, as well as adding the new variable to it.
    public String toString() {
        String result = super.toString() + "\n" + "MPG: " + this.getMPG();
        return result;
    }
}