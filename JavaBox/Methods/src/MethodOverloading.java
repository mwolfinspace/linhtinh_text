public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum of two numbers: " + add(22, 25));
        System.out.println("Sum of three numbers: " + add(3, 5, 8));
        System.out.println("Sum of two double numbers: " + add(3.4, 6.7));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static double add(double x, double y) {
        return x + y;
    }
}
