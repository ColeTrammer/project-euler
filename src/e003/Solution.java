package e003;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		System.out.println(largePrimeFactor(new BigInteger("600851475143")));
	}
	
	public static BigInteger largePrimeFactor(BigInteger n) {
		BigInteger i = new BigInteger("2");
		BigInteger largest = new BigInteger("0");
		while (i.compareTo(n) != 1) {
			if (n.mod(i).equals(new BigInteger("0")) && isPrime(i)) {
				while (n.mod(i).equals(new BigInteger("0"))) {
					n = n.divide(i);
				}
				largest = i;
			}
			i = i.add(new BigInteger("1"));
		}
		return largest;
	}
	
	public static boolean isPrime(BigInteger i) {
		return i.isProbablePrime(5);
	}
	
}
