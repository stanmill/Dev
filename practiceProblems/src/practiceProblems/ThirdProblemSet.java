package practiceProblems;

public class ThirdProblemSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,10,10};
		System.out.println(betterThanAverage(arr,5));

	}
	
	/* calculate the average and compare against your score */
	
	static boolean betterThanAverage(int[] classPoints, int yourPoints) {
			
		int total = classPoints.length;
		int average = 0;
		
		for (int i : classPoints) {
			average += i;
		}
		
		if(average / total < yourPoints) return true;
		
		return false;
	}
	
	/* Create a funciton which translates a given DNA string into RNA */
	
	static  String convertToRna(String dna) {
		char[] arr = dna.toCharArray();
	    
	    for (int i = 0; i < arr.length; i++) {
	    	if(arr[i] == 'T') {
	    		arr[i] = 'U';
	    	}	
		}
			String newDna = new String(arr);
			return newDna;
		}
	
	/* Return the value based on the given operation */
	
	static Integer basicMath(String op, int v1, int v2) {
	    
		switch(op){
	    case "+": return v1+v2;
	    case "-": return v1-v2;
	    case "*": return v1*v2;
	    case "/": return v1/v2;  
	    }
	    return 0;
	  }

}
