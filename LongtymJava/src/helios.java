import java.util.Scanner;

class helios{
	private static Scanner name;
	public static void main(String[] args){
		
		name = new Scanner(System.in);
		System.out.println("My name is " + name.nextLine());
	}
}