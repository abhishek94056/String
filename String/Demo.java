
public class Demo {
	public static void main(String[] args) {
		String name="Ram";
		String God="Ram";
		
		if(name==God) {
			System.out.println("Same Memory Location");
		}
		else {
			System.out.println("Different Memory Location");
		}
		
		String s = new String("Hanuman");
		String s1 = new String("Hanuman");
	
		if(s==s1) {
			System.out.println("Same Memory Location");
		}
		else {
			System.out.println("Different Memory Location");
		}
		
		
		String add = "Shirasgaon";
		System.out.println(add.charAt(0));
		System.out.println(add.length());
		System.out.println(add.startsWith("S"));
		System.out.println(add.endsWith("N"));
		System.out.println(add.toUpperCase());
		System.out.println(add.toLowerCase());
		System.out.println(add.concat(" is the best Villege"));
	}

}
