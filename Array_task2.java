public class Array_task2 {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        System.out.println(sum);
    }
}