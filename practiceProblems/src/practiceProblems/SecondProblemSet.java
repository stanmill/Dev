package practiceProblems;

public class SecondProblemSet {
	
	public static void main(String[] args) {
		
		String s = "aaaabbbbc";
		System.out.println(compress(s));
	}
	
	
	/* Compress a string */
	
	static String compress(String s) {
		
		StringBuffer str = new StringBuffer();
		char[] arr = s.toCharArray();
		int count =0;
		
		for (int i = 0; i < arr.length-1; i++) {
			count++;
			if(arr[i] != arr[i+1]) {
				 str.append(""+arr[i]+count);
					count = 0;
			} 
		}
		String newStr = str.toString();
			
		return newStr;
	}

}
