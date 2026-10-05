public class task4 {
	public static void main(String[] args){
		String text = args[0];
		int count = 0;
		for (int i = 0; i < text.length(); i++){
			if (text.charAt(i) == 'a'){
				count++;
			}
		}
		System.out.println(count);
	}
}