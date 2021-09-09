import java.util.Scanner;

public class Method {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        show(number1, number2);
        int a = add(number1, number2);
        int b = min(number1, number2);
        System.out.println("Sum of numbers: " + a);
        System.out.println("Minimun number: " + b);
        input.close();
    }

    public static void show(int num1, int num2) {
        System.out.println("You entered " + num1 + " and " + num2);
    }

    public static int add(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

    public static int min(int num1, int num2) {
        int min;
        if (num1 < num2)
            min = num1;
        else
            min = num2;
        return min;
    }
}
