import java.util.Scanner;
public class Block7{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите балл от 0 до 100: ");
		int ball = scanner.nextInt();
		int grade = (ball >= 90) ? 5 :
		               (ball >= 75) ? 4 :
		               (ball >= 60) ? 3 : 2;
		System.out.println(grade);
	}
}