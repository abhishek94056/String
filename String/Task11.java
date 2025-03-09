import java.util.Iterator;
import java.util.Scanner;
public class Task11 {
	//6. WAP to accept names of 5 fruits, 
	//save it in the array of Strings and print only 
	//those fruit names which has "n" or "p" in it.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] fruit = new String[5];
		System.out.println("Enter 5 Frits: ");
		for(int i=0;i<fruit.length;i++) {
			fruit[i]=s.nextLine().toLowerCase();   //Take input from the user & compile convert it into Lowecase at  same time
		}
		for(int i=0;i<fruit.length;i++) {         //Print output
			String f=fruit[i];                    //fruit character add in f string
			if(f.contains("n")||f.contains("p")) {     //check the condition
				System.out.println(f);               //print output
			}
		}
	}
}
