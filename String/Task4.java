import java.util.Scanner;
public class Task4 {
//4. WAP to accept the password from the user and print its report as no of consonants, 
//no of vowels no of digits and no of special symbols.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String str=s.nextLine();
		str=str.toLowerCase();
		int consonants=0,vowels=0,digits=0,symbols=0;
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(Character.isDigit(ch)) {
				digits++;
			}
			else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else if(ch>='a'&&ch<='z') {
				consonants++;
			}
			else {
				symbols++;
			}
		}
		System.out.println("Number of consonants: "+consonants);
		System.out.println("Number of vowels: "+vowels);
		System.out.println("Number of digits: "+digits);
		System.out.println("Number of symbols: "+symbols);
	}
}
