package e029;

import java.math.BigInteger;
import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		
		HashSet<BigInteger> powers = new HashSet<BigInteger>();
		
		for (BigInteger a = new BigInteger("2"); a.compareTo(new BigInteger("100")) != 1; a = a.add(new BigInteger("1"))) {
			for (int b = 2; b <= 100; b++) {
				powers.add(a.pow(b));
			}
		}
		System.out.println(powers.size());
	}
	
}
