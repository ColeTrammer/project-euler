package e021;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		
		int sum = 0;
		
		HashMap<Integer, Integer> divisors = new HashMap<>();
		
		for (int i = 1; i < 10000; i++) {
			divisors.put(i, d(i));
		}

		for (int key : divisors.keySet()) {
			
			int a = divisors.get(key);
			if (a < 10000) {
				int b = divisors.get(a);
			
				if (key == b && a != key) {
					sum += key;
				}
			}
			
		}
		System.out.println(sum);
	}
	
	public static int d(int n) {
		int d = 0;
		
		for (int i = n / 2 + 1; i > 0; i--) {
			if (n % i == 0) {
				d += i;
			}
		}
		return d;
	}
	
}
