package class3;
import java.util.Scanner;

public class Calculator {
	

	
	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
		
	System.out.println("please enter the first number");
	int num1=cal.nextInt();
	
	
	
	System.out.println("please enter the Second number");
	int num2=cal.nextInt();
	
	System.out.println("plese select the operation to be preformed ");
	System.out.println(" press1 for addition +");
	System.out.println("press 2 for substraction -");
	System.out.println("press 3 for multiplication  *");
	System.out.println("press 4 for division  /");
	
	int n=cal.nextInt();
	
	if (n==1) {
		int result =num1+num2;
	System.out.println("value of addition:  "+result);
	}
	else if (n==2) {
		int result=num1-num2;
		System.out.println("value of substraction:  "+result);
		

	}
	else if (n==3) {
		int result=num1*num2;
		System.out.println("value of multiplication:  "+result);
		

		
	}
	else if (n==4) {
		int result=num1/num2;
		System.out.println("value of divition:  "+result);


		
	}
	}
}
