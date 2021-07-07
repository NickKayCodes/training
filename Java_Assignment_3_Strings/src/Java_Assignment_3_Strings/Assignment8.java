package Java_Assignment_3_Strings;
import java.util.Arrays;

public class Assignment8 {
	public static void main(String[] args) {
		isAnagram("desserts", "stressed" );
		isAnagram("dessert", "stressed");
		
	}
	
	public static void isAnagram(String str1, String str2) {
		
		//replaces all whitespace
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		boolean status = true;
		if(s1.length() != s2.length()) {
			status = false;
		}else {
			//puts all letters of the string in char array and in lowercase
			char[] arrS1 = s1.toLowerCase().toCharArray();
			char[] arrS2 = s2.toLowerCase().toCharArray();
			//sorts array
			Arrays.sort(arrS1);
			Arrays.sort(arrS2);
			//checks if arrays are equal
			status = Arrays.equals(arrS1, arrS2);
		}
		if(status) {
			System.out.println(s1+" and "+ s2 + " are anagrams");
		}else {
			System.out.println(s1+" and "+ s2+ " are not anagrams");
		}
	}
}
