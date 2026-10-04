import java.util.Arrays;
public class Array_task7{
	public static void main(String[]args){
		int[] num = {4, -9, 1, 6, 8, -2, -6, 1, 41};
		int i = 0;
        int j = num.length - 1;

        while (i < j) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;

            i++;
            j--;
        }

        System.out.println(Arrays.toString(num));
	}
}