package practiceProblems;

public class FourthProblemSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] arr = {-1000,1,4,50,-100, 200, 1000};
		System.out.println(fibb(8));
		System.out.println(findTheLongest(arr));
		System.out.println(calculateYears(1000,0.05,0.18,1000));
		System.out.println(showSequence(4));

	}
		
	/* Fibonacci series*/
	
	static int fibb(int n) {
		
		if(n == 0) return 0;
		else if(n == 1) return 1;
		
		return fibb(n-1)+fibb(n-2);
	}
	
	/* find the number with the longest digits*/
	
	static int findTheLongest(int[] numbers) {
		
		int max =0;
		int count = 0;
		int currentNum = 0;
		int temp =0;
		
		for(int i=0; i< numbers.length; i++) {
			count =0;
			temp = numbers[i];
			while(temp != 0) {	
				temp /= 10;
				count++;
			}
			
			if(count > max) {
				currentNum = numbers[i];
				max = count;
			}	
		}	
		
		return currentNum;
	}
	
	 /* caluculate the years it takes to get the desired amount*/
	
	 static int calculateYears(double principal, double interest,  double tax, double desired) {
		
		 if(principal >= desired) return 0;
		 
	    double taxable = principal * interest; //5
	    double newTax = taxable * tax;
	    double x = taxable - newTax; //4.5 profit
	    double finalAmount = principal + x;
	    int numOfYears =1;
	    
	    while(finalAmount < desired){
	      taxable = finalAmount * interest;
	      newTax = taxable * tax;
	      x = taxable - newTax;
	      finalAmount = finalAmount + x;
	      numOfYears++;
	    
	    }
	    return numOfYears;
	  }
	 
	 /* print the sequence up to the actual value and include the sum*/
	 
	 public static String showSequence(int value){
		 StringBuilder s = new StringBuilder();
		    int total =0;
		    int n =0;
		    if(value < 0){ 
		    	s.append(value+"<"+n);
		    	return s.toString();}
		    else if(value == 0){
		    	s.append(value+"="+n);
		    	return s.toString();
		    }
		    
		    while(value >= 0 && n <= value){
		    	total += n;
		    	s.append(n);
		    	if(n == value)break;
		    		s.append("+");
		    		n++;
		    	}
		    
		    s.append(" = "+total);
		    return s.toString();
		  }

}
