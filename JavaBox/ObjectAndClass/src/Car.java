public class Car {
    private String model;
    private int currentSpeed;
    private String color;
    private int year;

    //Construstors
    public Car (String model) {
        this.model = model;
    }

    public Car (String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    //Methods
    public void start(){
        System.out.println(this.model + " has started.");
        this.currentSpeed = 20;
    }

    public void accelerate(){
        this.currentSpeed += 20;
    }

    public void stop(){
        System.out.println(this.model + " has stopped.");
        this.currentSpeed = 0;
    }

    public void showSpeed(){
        System.out.println("The current speed of " + this.model + " is: " + this.currentSpeed);
    }
    
    public String toString(){
        return "Model: " + this.model + " Color: " + this.color + " Year: " + this.year;
    }
}
