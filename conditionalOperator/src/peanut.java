//Using Conditional Operator
import java.util.Scanner;
public class peanut {
	private static Scanner number;//This is an instance variable.
	public static void main(String args[]){ 
	int num;
	number = new Scanner(System.in);
	System.out.print("Enter a number here: ");
	num = number.nextInt();
	System.out.println(num % 2 == 0 ? "It is an even number." : "It is an odd number.");
	//num % 2 == 0 ? is conditional operator, Its a boolean expression.//
	}
}
