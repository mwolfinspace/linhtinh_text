public class WhileLoop {
    public static void main(String[] args) {
        int i = 5;
        while (i > 1) {
            System.out.println(i);
            i--;
        }
        int k = 1, fact = 1;
        while (k <= 5) {
            fact *= k;
            System.out.println(k + "!" + "  = " + fact);
            k++;
        }
    }
}
