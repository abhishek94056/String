package Practice;
import java.util.Scanner;
public class Task1 {
//	1. WAP to delete all the vowels from the name of the user.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=s.nextLine();
		StringBuilder result = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'
			&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U') {
				result.append(ch);
			}
		}
		System.out.println(result.toString());

	}

}
