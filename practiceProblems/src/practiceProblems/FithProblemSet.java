package practiceProblems;

import java.util.Arrays;

public class FithProblemSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/* Compare two string if they have the same characters*/
	
	public static boolean isAnagram(String test, String original) {
		
		char[] origin = original.toLowerCase().toCharArray();
		char[] compare = test.toLowerCase().toCharArray();
		Arrays.sort(origin);
		Arrays.sort(compare);
		
		if(Arrays.equals(origin, compare)) return true;
		
	    return false;
	  }
	
	/* Return the perfect power*/
	public static int[] isPerfectPower(int n) {
		
		return null;
	    // ...
	  }

}
