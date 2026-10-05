import java.util.Scanner;
public class Block2{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите целое число: ");
		int num = scanner.nextInt();
		String str = num%2 == 0 ? "Четное" : "Нечетное";
		System.out.println(str);
	}
}