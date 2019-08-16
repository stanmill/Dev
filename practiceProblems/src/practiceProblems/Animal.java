package practiceProblems;

public class Animal {
	
	boolean hasTail;
	int numbOfLegs;
	boolean hasFur;
	
	Animal(){
		hasTail = false;
		numbOfLegs = 0;
		hasFur = false;		
	}
	
	Animal(boolean hasFur, int numbOfLegs, boolean hasTail){
		this.hasFur = hasFur;
		this.numbOfLegs = numbOfLegs;
		this.hasTail  = hasTail;
	}
	
	public void sound() {
		System.out.println("This animal makes a sound");
	}


}
