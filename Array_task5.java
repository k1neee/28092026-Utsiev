import java.util.Arrays;
public class Array_task5{
	public static void main(String[]args){
		int[] numbers = {4, -9, 1, 6, 8, -2, -6, 1, 41};

		for (int i = 0; i < numbers.length; i++){
			if (numbers[i]< 0){

				numbers[i] = 0;

			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}