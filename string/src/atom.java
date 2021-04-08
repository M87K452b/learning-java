
public class atom {
	
	public static void main(String[] args){
		getAnswer();
	}
	public static int getAnswer(){
		int x=56;
		int y=98;
		int answer = x*y;
		return answer;
	}
	
	public String toString(){
		return String.format("The anwer is %i", getAnswer());
	}
}
