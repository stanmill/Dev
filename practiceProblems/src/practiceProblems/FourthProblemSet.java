package practiceProblems;

public class FourthProblemSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] arr = {-1000,1,4,50,-100, 200, 1000};
		System.out.println(fibb(n));
		System.out.println(findTheLongest(arr));

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

}
