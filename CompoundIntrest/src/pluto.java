import java.util.Scanner;
public class pluto {
	private static Scanner input;

	public static void main(String agrs[]){
		input = new Scanner(System.in);
		
		double amount,principle,rate,years;
		
		System.out.print("Enter Principle here: ");
		principle = input.nextDouble();
		System.out.print("Enter Rate here: ");
		rate = input.nextDouble();
		System.out.print("Enter Time Period here: ");
		years = input.nextDouble();
		
		amount=principle*Math.pow(1+rate, years);
		
		System.out.println("Your total amount is " + amount);
	}

}
