import java.util.Scanner;
public class star {
		
	private static Scanner food;

	public static void main (String args[]){
		
		food = new Scanner(System.in);
		light photon = new light();
		
		String name = food.nextLine();
		photon.method1(name);
		}
}
