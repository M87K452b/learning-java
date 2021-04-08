import javax.swing.JOptionPane;
public class nuke {
	
	public static void main(String[] args){
	
	String firstNum = JOptionPane.showInputDialog("Enter a number");
	String secondNum = JOptionPane.showInputDialog("Enter another number");
	
	double num1 = Double.parseDouble(firstNum);
	double num2 = Double.parseDouble(secondNum);
	double sum = num1 + num2;
	
	JOptionPane.showMessageDialog(null, "The Sum is "+sum,"answerBox", JOptionPane.PLAIN_MESSAGE);
	
	}
}