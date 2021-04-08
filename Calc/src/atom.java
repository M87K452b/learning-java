import java.util.Scanner;

public class atom {
	public static void main(String args[]){
		System.out.println("This is a simple Calc.");
		double num1,num2,Sum;
		
		Scanner number = new Scanner(System.in);
		num1=number.nextDouble();
		num2=number.nextDouble();
		Sum=num1+num2;
		System.out.println("Sum is  " + Sum);
		
		
	}
}
