public class Array {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[4];
        numbers[0] = 4;
        numbers[1] = 3;
        numbers[2] = -2;
        numbers[3] = 6;
        //int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3];
        System.out.println("Sum: " + (numbers[0] + numbers[1] + numbers[2] + numbers[3]));

        int[] newnumlist = {2, 4, 5, -7};
        newnumlist[3] = -9;
        System.out.println("New sum: " + (newnumlist[0] + newnumlist[1] + newnumlist[2] + newnumlist[3]));
    }
}
