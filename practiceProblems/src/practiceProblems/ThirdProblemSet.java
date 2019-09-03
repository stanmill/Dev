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

}
