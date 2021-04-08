public class school {
	
	private String schoolName;
	
	public void setName(String name){
		schoolName = name;
	}
	public String getName(){
		return schoolName;
	}
	public void message(){
		System.out.printf("Your first School was %s", getName());
	} 
}
