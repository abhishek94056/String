import java.util.Arrays;
import java.util.Scanner;
public class Task6 {
	//1. WAP to check whether the strings is anagram or not.
	
	public static boolean isanagram(String str1, String str2) {
		str1=str1.replaceAll(("\\s"), "");
		str2=str2.replaceAll(("\\s"), "");
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		return Arrays.equals(array1, array2);
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String str1=s.nextLine();
		System.out.println("Enter 2nd String: ");
		String str2=s.nextLine();
		if(isanagram(str1,str2)) {
			System.out.println("String is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
		
	}
}             