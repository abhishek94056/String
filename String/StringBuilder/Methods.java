package StringBuilder;
import java.util.Scanner;
public class Methods {
//	1. append
//	2. insert
//	3. delete
//	4. deleteCharAt
//	5. settlength
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder(s.next());
		System.out.println(str.append(" Hii"));
		System.out.println(str.insert(5, "hey "));
		System.out.println(str.delete(0, 1));
		System.out.println(str.deleteCharAt(0));
		str.setLength(5);
		System.out.println(str);
		
	}

}
