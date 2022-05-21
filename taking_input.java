import java.util.Scanner;
public class taking_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num1=0,sum=0;
		while(true) {
			System.out.println("Enter the number: (To stop enter -1)");
			num1=scan.nextInt();
			if(num1==-1) {
				break;
			}
			sum+=num1;
		}	
		System.out.println(sum);
		scan.close();
}
}
