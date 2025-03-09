package Practice;
import java.util.Scanner;
public class Task2 {
//	2. WAP for the following:
//		input = I love India
//		output = India love I
//
//		input = I am Java developer
//		output = developer Java am I
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		String[] sp = str.split(" ");
		for(int i = sp.length-1;i>=0;i--) {
			System.out.print(sp[i]+" ");
		}
		
	}

}
