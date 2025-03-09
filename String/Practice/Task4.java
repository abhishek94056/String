package Practice;
import java.util.Scanner;
public class Task4 {
//	4. WAP to accept email id of the user and print the domain name only.
//	For example:
//	input = rohan@outlook.com
//	output = outlook
//	input = shreya@yahoo.co.in
//	output = yahoo
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter email id: ");
	    String str = s.nextLine();
		int a = str.indexOf("@");
		int d = str.indexOf(".");
		String Domain = str.substring(a+1, d);
		System.out.println("Domain name of your emeil id is: "+Domain);
	}
}
