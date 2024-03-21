public class Toyota extends Car{
    //create some specific variables for this class
    private double price = 0;
    private String color = "";


    public Toyota(String inBrand, double inSpeed, int inPassengers, double inMPG, double price, String color) {
        super(inBrand, inSpeed, inPassengers, inMPG);
        this.price = price;
        this.color = color;
    }


    //create get and setters
    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }
    //create new super string
    public String toString() {
        String result = super.toString() + "\n" + "Color: " + this.getcolor() + "\n" + "Price: " + "$" + this.getprice();
        return result;
    }
}