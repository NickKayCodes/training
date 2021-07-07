package Java_Assignment_2_statements;



public class assignment11 {
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4,5,6, 7,8, 9, 10};
		int result = 1;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				result = num[i]*num[j];
				System.out.println(result);
			}
		}
	}
}
