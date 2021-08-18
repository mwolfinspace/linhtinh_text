package abstractclass;

public abstract class Vehicle {
    String type, model;

    //Constructor
    public Vehicle (String type, String model) {
        this.type = type;
        this.model = model;
    }

    //Non-abstract method
    public void start () {
        System.out.println("Vehicle has started.");
    }
    public void stop () {
        System.out.println("Vehicle has stopped.");
    }

    //Abstraction methods
    public abstract int getMaxSpeed();
}
