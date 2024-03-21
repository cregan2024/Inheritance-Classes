public class Main {
    public static void main(String[] args) {
        //create all of the vehicles
        Vehicle a = new Toyota("Toyota Prius", 145 , 5, 35,23800, "Black");
        Vehicle b = new Tesla("Tesla  Model Y", 195 , 5,350,"Wing Doors", "Lithium Ion Battery");
        Vehicle c = new Boat("Whaler", 40  , 12,50,"Mercury outboards engine");
        Vehicle d = new CruiseShip("STX Europe", 34.5 , 6000,880.5,"Engine", 2000000, "White");
        Vehicle e = new Scooter("Razor", 35 , 1,2, 4.62);
        Vehicle f = new EScooter("Lime", 25 , 1,1,46, 15, 3);
        Vehicle g = new Airplane("Concord", 515 , 525,39000,2);
        Vehicle h = new Boeing("Boeing 737", 570 , 426 ,35105,2, 3850, "Rolls Royce Pearl 700 engines");
        //prints out all the info. it has every vehicle and all the stats the will go in it
        System.out.println(a + "\n");
        System.out.println(b+ "\n");
        System.out.println(c+ "\n");
        System.out.println(d+ "\n");
        System.out.println(e+ "\n");
        System.out.println(f+ "\n");
        System.out.println(g+ "\n");
        System.out.println(h);
    }
}
//making the speedometer interface in order for every vehicle to their speed presented in the same mph
interface Speedometer{
    public void setSpeed(double inSpeed);
    public double getSpeed();

}
