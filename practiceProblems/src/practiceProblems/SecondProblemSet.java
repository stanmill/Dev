package practiceProblems;

public class SecondProblemSet {
	
	public static void main(String[] args) {
		
		String s = "abbrhcccc";
		int n = 100;
		System.out.println(compress(s));
		System.out.println(theNextPerfectSquare(50));
		System.out.println(summation(5));
		printPrimes(n);
	}
	
	
	/* Compress a string */
	
	static String compress(String s) {
		
		StringBuffer str = new StringBuffer();
		int count =0;
		
		for (int i = 0; i < s.length(); i++) {
			count++;		
			// compares the two indexes to see if they are the same
			if(i +1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				// if they are the same it adds it to the string builder and resets the count
				 str.append(s.charAt(i));
				 str.append(count);
					count = 0;
			} 
		}
	
		return new String (str);
	}
	
	 /* Return the next perfect square */
	
	static int theNextPerfectSquare(int n) {
		
		// function returns the ceiling of the square root
		int sqr =  (int) Math.ceil(Math.sqrt(n));			
		
		// reverts the square root back to a perfect square
		return sqr * sqr;
	}
	
	/* Write a function that returns the sum of numbers up to n */
	
	static int summation(int n) {
        
		int sum = 0;
		
        for (int i = 0; i <= n; i++) {
        	sum = sum +i;
        
        }
        return sum;
    }
	
	/* Print all the prime numbers from 1 - n*/
	
	static void printPrimes(int n) {
		int flag;
		
		for(int i=2; i<=n; i++) {
			flag =0;
			
			for(int j =2; j <= i/2; j++) {
				if(i % j == 0) {
					flag = 1;
					break;
				}
			} 
			if(flag == 0) System.out.println(i);
		}
		
	}

}
