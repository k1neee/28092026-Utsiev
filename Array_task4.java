public class Array_task4 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9, 4, 6, 7, 2};
        int count = 0;

        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}