import java.util.Scanner;
public class main {
	private static Scanner input;

	public static void main(String args[]){
	input = new Scanner(System.in);
	school sobject = new school();
	System.out.print("Enter your first school name here: ");
	String temp = input.nextLine();
	sobject.setName(temp);
	sobject.message();	
	}
}
