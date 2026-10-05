import java.util.Scanner;

public class Block4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Введите операцию( +, -, /, *): ");
        String operation = scanner.next();
        
        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                switch (num2) {
                    case 0:
                        System.out.println("На ноль делить нельзя");
                        break;
                    default:
                        System.out.println(num1 / num2);
                        break;
                }
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Нет такой операции");
        }
        
        scanner.close();
    }
}
