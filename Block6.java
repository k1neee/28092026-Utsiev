import java.util.Scanner;
public class Block6{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		String password = "java123";
		String pass;
		do {
			System.out.println("Введите пароль: ");
			pass = scanner.next();

			if (pass.equals(password)){
				System.out.println("Вход выполнен");
			} else {
				System.out.println("Вход не выполнен");
			}
		} while (!pass.equals(password));

	}
}