package e023;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		
		ArrayList<Integer> abundant = new ArrayList<>();
		
		for (int i = 1; i < 28123; i++) {
			if (isAbundant(i)) {
				abundant.add(i);
			}
		}
		
		int sum = 0;
		
		for (int i = 1; i < 28123; i++) {
			boolean sumOfAbundant = false;
			for (int j = 0; j < abundant.size() && i > abundant.get(j); j++) {
				int x1 = abundant.get(j);
				if (x1 < i)
				for (int x2 : abundant) {
					if (x1 + x2 == i) {
						sumOfAbundant = true;break;
					}
				}
				if (sumOfAbundant)break;
			}
			
			if (!sumOfAbundant) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
	
	private static boolean isAbundant(int n) {
		return e021.Solution.d(n) > n && n != 2;
		
	}
	
}
