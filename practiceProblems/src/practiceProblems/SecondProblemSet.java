package practiceProblems;

public class SecondProblemSet {
	
	public static void main(String[] args) {
		
		String s = "abbrhcccc";
		System.out.println(compress(s));
	}
	
	
	/* Compress a string */
	
	static String compress(String s) {
		
		StringBuffer str = new StringBuffer();
		int count =0;
		
		for (int i = 0; i < s.length(); i++) {
			count++;		
			
			if(i +1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				 str.append(s.charAt(i));
				 str.append(count);
					count = 0;
			} 
		}
			
		return new String (str);
	}

}
