package e002;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
	
		ArrayList<Integer> fibs = new ArrayList<>();
		fibs.add(1);
		
		int nextFib = 1;
		while(nextFib < 4000000) {
			fibs.add(nextFib);
			nextFib = fibs.get(fibs.size() - 1) + fibs.get(fibs.size() - 2);
		}
		
		int sum = 0;
		for (int n : fibs) {
			if (n % 2 == 0) {
				sum += n;
			}
		}
		System.out.println(sum);
		
	}
	
}
