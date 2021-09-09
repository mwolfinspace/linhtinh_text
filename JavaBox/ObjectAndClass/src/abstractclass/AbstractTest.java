package abstractclass;

public class AbstractTest {
    public static void main(String[] args){
        //Creating Car object.
        Car car = new Car("Car", "Honda");
        car.start();
        car.stop();
        car.getMaxSpeed();
    }
}
