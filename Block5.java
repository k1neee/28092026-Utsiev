import java.util.Scanner;
public class Block5{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int num;
		do {

			System.out.println("1. Поздароваться\n2. Показать случайное число\n0. Выйти");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("Саламайлекум");
				break;
			case 2:
				int randomNum = (int) (Math.random() * 100) + 1;
				System.out.println(randomNum);
				break;
			case 0:
				System.out.println("Выход из программы");
				break;
			default:
				System.out.println("Неизвестная команда");
			}

		} while (num != 0);

	}

}