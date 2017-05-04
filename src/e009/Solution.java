package e009;

public class Solution {
	
	public static void main(String[] args) {
		
		int sum = 1000;
		for (int a = 1; a < sum - 2; a++) {
			for (int b = 1; b < sum - 2; b++) {
				for (int c = 1; c < sum - 2; c++) {
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == sum) {
						System.out.println(a * b * c);
						return;
					}
				}	
			}	
		}
		
	}
	
}
