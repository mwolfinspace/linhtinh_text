package methodoverride;

public class Vehicle {
    public void start () {
        System.out.println("Vehicle has started.");
    }
    public void stop () {
        System.out.println("Vehicle has stopped.");
    }
    public void accelerate (int speed) {
        System.out.println("Vehicle accelerates at " + speed);
    }
}
