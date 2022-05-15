
public class Strings {

	public static void main(String[] args) {
		String name="  Nusret   ";	// Every space valuable
		int length=name.length();
		name=name.strip();			// Strip function delete spaces.
		int length1=name.length();	
		System.out.println(length+"\n"+length1);
		
		name=name.toUpperCase();
		System.out.println(name);		// NUSRET
		name=name.toLowerCase();
		System.out.println(name); 		// nusret
		
		
	}

}
