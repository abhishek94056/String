import java.util.Scanner;
public class Task5 {
//5. WAP to accept the name of the fruit and check if it is Mango or not.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Fruit Name: ");
		String str=s.nextLine();
		System.out.println(str.equalsIgnoreCase("Mango"));
	}
}
