package Practice;
import java.util.Scanner;
public class Task3 {
//	3. WAP to accept password of the user and replace all digits and special symbols with #.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Password: ");
		StringBuffer str = new StringBuffer(s.nextLine());
		System.out.println("Your Passwod: ");
		for(int i=0;i<str.length();i++){
			System.out.print("#");
		}		
	}
}
