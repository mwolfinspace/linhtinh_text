package encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Car car = new Car("Honda", 320, true);
        System.out.println("Model: "+ car.getModel());
        System.out.println("Max speed: "+ car.getMaxSpeed());
        System.out.println("Is automatic ?:" + car.isAutomatic());
    }
}
