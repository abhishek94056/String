import java.util.Iterator;
import java.util.Scanner;
public class Task1 {
//1. WAP to accept the name of the user and print the name character by character.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
}
