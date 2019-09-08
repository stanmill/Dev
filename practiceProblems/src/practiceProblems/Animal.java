package practiceProblems;

public class Animal {
	
	private boolean hasTail;
	private int numbOfLegs;
	private boolean hasFur;
	
	Animal(){
		hasTail = false;
		numbOfLegs = 0;
		hasFur = false;		
	}
	

	
	@Override
	public String toString() {
		return "Animal [hasTail=" + hasTail + ", numbOfLegs=" + numbOfLegs + ", hasFur=" + hasFur + "]";
	}



	public boolean isHasTail() {
		return hasTail;
	}



	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}



	public int getNumbOfLegs() {
		return numbOfLegs;
	}



	public void setNumbOfLegs(int numbOfLegs) {
		this.numbOfLegs = numbOfLegs;
	}



	public boolean isHasFur() {
		return hasFur;
	}



	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}



	public void sound() {
		System.out.println("This animal makes a sound");
	}


}
