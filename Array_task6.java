public class Array_task6{
	public static void main(String[]args){
		int[] num = {4, -9, 1, 6, 8, -2, -6, 1, 41};
		int target = -2;
		boolean found = false;
		for (int i = 0; i < num.length; i++){
			if (num[i] == target){
				found = true;

			}
		}
		System.out.println(found);
	}
}