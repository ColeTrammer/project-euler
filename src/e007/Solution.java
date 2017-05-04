package e007;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
		int numPrimes = 1;
		int i = 3;
		
		while (numPrimes < 10001) {
			if (new BigInteger(Integer.toString(i)).isProbablePrime(50)) {
				numPrimes++;
			}
			i++;
		}
		System.out.println(i - 1);
	}
	
}
