import java.util.Scanner;
public class Task9 {
	//4. WAP to add all the digits in the string.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = s.nextLine();                  //take input
		int sum = 0;                                //Initialize a Variable for Sum
		for(int i =0;i<str.length();i++) {          // Loop Through Each Character in the String
			char ch=str.charAt(i);                 //covert into char
			if(Character.isDigit(ch)) {             //Check if the Character is a Digit()
				sum+=(Character.getNumericValue(ch));    //and Add to Sum(Character.getNumericValue())
			}
		}
		System.out.println("Sum of digits is: "+sum);
	}
}





