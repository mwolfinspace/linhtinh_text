public class ConditionalOperator {
    public static void main(String[] args) {
        int number1 = 5, number2 = 8, number3 = 12;
        boolean result = false;
        result = (number1 > number2) && (number3 > number1);
        System.out.println("Result: " + result);

        result = (number1 > number2) || (number3 > number2);
        System.out.println("Result: " + result);

        result = (number1 < number2) ? false : true;
        System.out.println("Result: " + result);
    }
}
