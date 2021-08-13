public class BreakStatement {
    public static void main(String[] args) {
        int a = 0;
        switch (a) {
            case 0:
                System.out.println("Hi!");
                // break;
            case 1:
                System.out.println("Hello!");
                break;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 7)
                break;
            System.out.println(i);
        }
    }
}
