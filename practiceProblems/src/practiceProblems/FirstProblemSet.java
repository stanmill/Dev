package practiceProblems;

public class FirstProblemSet {

	public static void main(String[] args) {

	}
	
	
	/* Create a method that print the number of even and odd numbers found in a array */
	
	static void count(int[] arr) {
		
		int even=0;
		int odd=0;
		  
		for(int i=0; i<arr.length; i++) {
		// If the integers in a array are divisible by two,
		// that will increment the count of the even variable	  
			if(arr[i] %2 == 0) even++;
		// Else, it will increase the odd count	  
			else odd++;
		 }
		 
		  System.out.println("number of even numbers is " +even);
		  System.out.println("number of odd numbers is " +odd);	     
	}
	
	
	

}
