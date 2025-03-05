import java.util.Scanner;
public class Task3 {
//3. WAP to accept the first name middle name and the surname of the user 
//and print the name with initials.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("First Name: ");
		String str1=s.nextLine();
		System.out.println("Middle Name: ");
		String str2=s.nextLine();
		System.out.println("Last Name: ");
		String str3=s.nextLine();
		System.out.println("Mr. "+str1.charAt(0)+"."+str2.charAt(0)+". "+str3);

	}

}
