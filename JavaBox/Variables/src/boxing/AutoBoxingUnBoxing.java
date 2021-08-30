package boxing;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        Double db = 12.8; // Auto-boxing of double
        double d = db; // Auto-unboxing of double
        System.out.println(db + " " + d);

        Integer in = 5; // Auto-boxing of integer
        int i = in; // Auto-unboxing of integer
        System.out.println(in + " " + i);

        Character ch = 'b'; // Auto-boxing of char
        char c = ch; // Auto-unboxing of char
        System.out.println(ch + " " + c);

    }
}
