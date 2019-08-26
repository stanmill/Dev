package practiceProblems;

public class SecondProblemSet {
	
	
	/* Compress a string */
	
	String compress(String s) {
		
		StringBuffer str = new StringBuffer();
		int count =0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				count++;
			} else {
				str.append(s.charAt(i)+count);
				count = 0;
			}
		}
		
		s = str.toString();
		
		return s;
	}

}
