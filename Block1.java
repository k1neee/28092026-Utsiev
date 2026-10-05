import java.util.Scanner;
public class Block1 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ваше возраст: ");
		int age = scanner.nextInt();
		int true_age = 18;
		String str = age >= true_age ? "Доступ разрешен " : "Доступ запрещен";
		System.out.println(str);
	}
}