import java.util.Scanner;



public class school {
	
	private Scanner schoolName;
	
	public school(Scanner SN) {
		schoolName = SN;
		// TODO Auto-generated constructor stub
	}
	public void message(){
		System.out.printf("Your first School was " + schoolName);
	} 
}

