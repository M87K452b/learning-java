import java.util.Scanner;
public class atom {
	private static Scanner SN;
	public static void main(String args[]){
		
		SN = new Scanner(System.in);
		school sObject = new school(SN);
		sObject.message();
	}

}
