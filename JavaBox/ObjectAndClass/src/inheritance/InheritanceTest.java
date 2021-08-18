package inheritance;

public class InheritanceTest {
    public static void main(String[] args){
        //Creating car object.
        Car car = new Car();
        car.type = "Car";
        car.model = "Toyota";
        car.maxSpeed = 320;
        car.print();

        //Creating motorcycle object.
        Motorcycle motor = new Motorcycle();
        motor.type = "Motorcycle";
        motor.model = "Honda";
        motor.maxSpeed = 160;
        motor.print();
    }
}
