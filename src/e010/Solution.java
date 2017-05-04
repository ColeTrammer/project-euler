package e010;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
		BigInteger sum = new BigInteger("2");
		
		for (int i = 3; i < 2000000; i += 2) {
		
			BigInteger current = new BigInteger(Integer.toString(i));
			
			if (current.isProbablePrime(50)) {
				sum = sum.add(current);
			}
			
		}
		
		System.out.println(sum);
	}
	
}
