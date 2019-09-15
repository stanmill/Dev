package practiceProblems;

public class FourthProblemSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(fibb(n));;

	}
	
	
	/* Fibonacci series*/
	
	static int fibb(int n) {
		
		if(n == 0) return 0;
		else if(n == 1) return 1;
		
		return fibb(n-1)+fibb(n-2);
	}

}
