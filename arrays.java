
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int numbers[];
		   numbers=new int[5];
		 */
		int numbers[]=new int[5];
		
		numbers[0]=1;
		
		int[] numbers1= {1,2,3,4,56,6};
		
		System.out.println(numbers1[0]);
		
		for (int i : numbers1) {		// Iterator
			System.out.println(i);
		}
	}

}
