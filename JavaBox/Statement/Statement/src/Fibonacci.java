import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Max Sequence Number: ");
        int number = input.nextInt();
        int fibPrevious = 0, fibonacci = 1, sum =0;
        for (int i = 1; i<number; i++) {
            System.out.print(fibPrevious + " ");
            sum = fibonacci + fibPrevious;
            fibPrevious = fibonacci;
            fibonacci = sum;
        }
        input.close();
    }
}
