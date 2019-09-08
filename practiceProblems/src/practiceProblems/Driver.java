package practiceProblems;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal();
		Fox f = new Fox();
		f.setHasTail(true);
		a.sound();
		f.sound();
		
		System.out.println(a.toString());
		System.out.println(f.toString());
	}

}
