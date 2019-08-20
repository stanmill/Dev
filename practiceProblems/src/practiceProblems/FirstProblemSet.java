package practiceProblems;

public class FirstProblemSet {

	public static void main(String[] args) {
		Animal a  = new Animal();
		Fox f = new Fox();
		a.sound();
		f.sound();
		String s = "stanmillz";
		System.out.println(convert(s));

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
	
	/* Create a method that takes a String and return the last three letters added to the
	 * front and back of the string. Example: "python" would return "honpythonhon*/
	
	static String convert(String s) {
		// pass in the string to the StringBuffer and takes the last three characters in the string
		StringBuffer str = new StringBuffer(s);
		String newString = str.substring(s.length()-3, s.length());
		
		// the new string gets concatenated and returned
		return newString+s+newString;
	}
	
	
	

}
