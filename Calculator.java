package class3;
import java.util.Scanner;

 class Cal1 {
	 
 
	 void operations() {
		Scanner cal = new Scanner(System.in);
		
	System.out.println("please enter the first number");
	int num1=cal.nextInt();
	
	
	
	System.out.println("please enter the Second number");
	int num2=cal.nextInt();
	
	System.out.println("plese select the operation to be performed ");
	System.out.println(" press1 for addition +");
	System.out.println("press 2 for subtraction -");
	System.out.println("press 3 for multiplication  *");
	System.out.println("press 4 for division  /");
	System.out.println("press 5 for exit");
	int n=cal.nextInt();
	
	if (n==1) {
		int result =num1+num2;
	System.out.println("value of addition:  "+result);
	}
	else if (n==2) {
		int result=num1-num2;
		System.out.println("value of subtraction:  "+result);
		}
	else if (n==3) {
		int result=num1*num2;
		System.out.println("value of multiplication:  "+result);
		}
	else if (n==4) {
		int result=num1/num2;
		System.out.println("value of divition:  "+result);
     }
	else if (n==5) {
		System.exit(0);
	}
	}
 }
	public class Calculator {
		  public static void main(String[] args) {
		        
		      Cal1 c = new Cal1();
		        for(; ;) 
		        {
		            c.operations();
		        }
		        
		  }
	 }
	 
 

	

