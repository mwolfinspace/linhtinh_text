package string;

public class StringExample {
    public static void main(String[] args) {
        String s = "Java Programing";
        String s1 = "Java Programing";

        String sobj = new String("Java Programing");
        String sobj1 = new String("Java Programing");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(sobj);
        System.out.println(sobj1);

        // '==' operator matched the references
        System.out.println("s == s1: " + (s == s1));
        System.out.println("s == sobj: " + (s == sobj));
        System.out.println("s.equals(s1): " + (s.equals(s1)));
        System.out.println("s.equals(sobj): " + (s.equals(sobj)));
        System.out.println("sobj == sobj1: " + (sobj == sobj1));
        System.out.println("sobj.equals(sobj1): " + (sobj.equals(sobj1)));
    }
}
