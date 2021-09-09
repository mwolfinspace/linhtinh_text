package methodoverride;

public class Car extends Vehicle {
    public void start () {
        System.out.println("Car has started.");
    }
    public void stop () {
        System.out.println("Car has stopped.");
    }
    public void accelerate (int speed) {
        System.out.println("Car accelerates at " + speed);
    }
}
