package StringBuffer;

public class Methods {
//	1. append
//	2. insert
//	3. delete
//	4. deleteCharAt
//	5. settlength
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Ram");
		System.out.println(str.append("Hari"));
		System.out.println(str.insert(3, "Krishna"));
		System.out.println(str.delete(0, 3));
		System.out.println(str.deleteCharAt(1));
		str.setLength(5);
		System.out.println(str);

	}

}
