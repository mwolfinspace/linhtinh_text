public class CarTest {
    public static void main(String[] args){
        Car myCar = new Car("Honda");
        myCar.start();
        myCar.accelerate();
        myCar.showSpeed();
        myCar.stop();
        myCar.showSpeed();

        Car myCar1 = new Car("Honda", "Blue", 2019);
        System.out.println(myCar1);
    }
}
