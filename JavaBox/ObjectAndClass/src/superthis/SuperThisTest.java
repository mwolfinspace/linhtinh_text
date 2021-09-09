package superthis;

public class SuperThisTest {
    public static void main(String[] args) {
        // Creating Car object with
        Car car = new Car("Car", "Honda", 320, true);
        System.out.println("Type: " + car.getType());
        System.out.println("Model: " + car.getModel());
        System.out.println("Max Speed: " + car.getMaxSpeed());
        System.out.println("Is Car automatic? " + car.isAutomatic());
    }
}
