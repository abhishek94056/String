import java.util.Iterator;
import java.util.Scanner;
public class Task10 {
	//5. WAP to print only special symbols from the String.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=s.nextLine();                     ///take input from the user
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);                   //conver String into character
			if(!Character.isLetterOrDigit(ch)&&!Character.isWhitespace(ch)) {   //check the condition
				System.out.println(ch);                     //print output
			}
		
		}

	}

}
