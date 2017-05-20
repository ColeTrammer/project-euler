package e030;

public class Solution {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 2; i <= 1000000; i++) {
			String n = Integer.toString(i);
			int currSum = 0;
			for (int j = 0; j < n.length(); j++) {
				currSum += Math.pow((int)n.charAt(j) - 48, 5);
			}
			if (currSum == i) {
				sum += currSum;
			}
		}
		System.out.println(sum);
	}
	
}
