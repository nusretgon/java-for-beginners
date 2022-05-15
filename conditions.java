
public class conditions {

	public static void main(String[] args) {
		int num1=15,num2=16,num3=16;
		if(num1>num2) {		
			System.out.println(num1+" greater than "+num2);
		}
		else if (num1<num2) {		// We create third option.
			System.out.println(num2+" greater than "+num1);
		}
		else {
			System.out.println(num1+" = "+num2);
		}
		System.out.println("------------------------");
		if(num2>num3) {		
			System.out.println(num1+" greater than "+num2);
		}
		else if (num3<num2) {		// We create third option.
			System.out.println(num2+" greater than "+num1);
		}
		else {
			System.out.println(num3+" = "+num2);
		}
	}

}
