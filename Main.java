    public class Main {
        public static void main(String[] args){
            /* 1 задача
            int n = Integer.parseInt(args[0]);
            if (n%2==0){
                System.out.println("Четное");

            } else {
                System.out.println("Не четное");

            }
            */

            /* 2 задача
            int n = Integer.parseInt(args[0]);
            if (n > 0){
                System.out.println("Положительное");

            }else if (n < 0){
                System.out.println("Отрицательное");

            } else {
                System.out.println("Равно нулю");
            }
            */

            /* 3 задача
            int age = Integer.parseInt(args[0]);
            boolean Passport = Boolean.parseBoolean(args[1]);

            if (age >= 18 && Passport==true){
                System.out.println("Одобрено");

            }else {
                System.out.println("Не одобрено");

            }
            */

            /* 4 задача
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            int[] numbers = {a, b, c};

            int max = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            System.out.println("Максимальное число: " + max);
            */

            /* 5 задача
            int n = Integer.parseInt(args[0]);
            int sum = n * (n + 1) / 2;
            System.out.println(sum);
            */
        }
    }
