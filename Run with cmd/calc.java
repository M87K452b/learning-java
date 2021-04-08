import java.util.Scanner;
class atom{
	public static void main(String args[]){
		double num1, num2, answer;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		num1 = number.nextDouble();
		num2 = number.nextDouble();
		answer = num1+num2;
		System.out.println(answer);
	}
}
