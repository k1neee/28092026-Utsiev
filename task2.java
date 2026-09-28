public class task2 {
	public static void main(String[] args){
		String word = args[0];
		char c1 = word.charAt(0);
		if (c1 == 'A' || c1 == 'a'){
			System.out.println("Все верно");

		}else {
			System.out.println("Не верно");
		}
	}
}