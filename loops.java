
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0,sum=0;
		for(int i=0;i<10;i++) {
			System.out.println("Hello");
		}
		while (j <10) {
			sum+=j;
		}
		System.out.println(sum);
		
		int numbers[]= {0,1,2,3,4,5,6,7,8,9};  // We will learn next code.
		for (int a : numbers) {				  // Called iterator
			System.out.println(a);
		}
	}

}
