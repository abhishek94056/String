
import java.util.*;
public class Task8 {
	//3. WAP to check whether the string is made up of all vowels or not.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=s.nextLine();         //Take input
		str=str.toLowerCase();           //Convert String to Lowercase
		boolean b = true;
		for(int i =0;i<str.length();i++) {       //Loop Through Each Character
			char ch = str.charAt(i);
			if(ch !='a'&&ch !='e'&&ch !='i'&&ch !='o'&&ch !='u') {   //check is Vowel
				b=false;                                             //if not vowel return true
				break;
			}			
		}
		if(b) {
			System.out.println("vowels");
		}
		else
		{
			System.out.println("not vowels");
		}
	}
}



