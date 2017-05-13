package e027;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
		int max = 0;
		int product = 0;
		for (int a = -999; a < 1000; a++) {
			for (int b = -1000; b <= 1000; b++) {
				if (new BigInteger(Integer.toString(b)).isProbablePrime(50)) {
					int n = 1;
					while (new BigInteger(Integer.toString(apply(a, b, n))).isProbablePrime(50)) {
						n++;
					}
					if (n > max) {
						max = n;
						product = a * b;
					}
				}
			}
		}
		System.out.println(product);
	}
	
	private static int apply(int a, int b, int n) {
		return (int)Math.pow(n, 2) + a * n + b;
	}
	
}
