package polymorphism;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        //This work because Car is a subclass of Vehicle.
        vehicle.accelerate();

        Vehicle vehicle1 = new Motocycle();
        vehicle1.accelerate();
    }
}
