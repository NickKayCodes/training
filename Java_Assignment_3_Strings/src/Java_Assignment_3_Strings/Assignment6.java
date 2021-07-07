package Java_Assignment_3_Strings;

public class Assignment6 {
	public static void main(String[] args) {
		String str = "Hello my name is Java";
		int index = str.indexOf(" ", str.indexOf(" ")+1);
		
		System.out.println("The index of the second space is: " + index);
	}
}
