public class task6 {
	public static void main(String[]args){

		String word = args[0];
		String reversed = new StringBuilder(word).reverse().toString();
		System.out.println(word.equals(reversed));
	}
}