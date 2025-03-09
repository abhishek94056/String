import java.util.Scanner;
import java.util.Scanner;
public class Task7 {
	//2. WAP to check whether the string is palindrome or not.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str =s.nextLine();                 //Take input From the user
		str=str.toLowerCase();                   //conver it into lowecase
		String Reverse="";                         //insert blank variable to store reverse variable
		
		for(int i = str.length()-1;i>=0;i--) {              //reverse using for loop (charat())
			Reverse += str.charAt(i);
		}
		if(str.equals(Reverse)) {                             //compare the original and reverse
			System.out.println("String is palindrom");
		}
		else{
			System.out.println("String is not Palindrom");		
		}
	}
}