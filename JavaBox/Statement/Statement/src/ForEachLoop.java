public class ForEachLoop {
    public static void main(String[] args){
        char[] letters = {'h', 'e', 'l', 'l', 'o'};
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        for (char items : letters) {
            System.out.println(items);
        }

        int[] numbers = {6,4,3,5};
        int sum =0;
        for (int num : numbers) {
            sum += num;
            System.out.println(num);
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
