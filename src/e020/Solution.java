package e020;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
		BigInteger n = new BigInteger("100");
		BigInteger f = new BigInteger("1");
		
		while (n.compareTo(new BigInteger("1")) == 1) {
			f = f.multiply(n);
			n = n.subtract(new BigInteger("1"));	
		}
		String s = f.toString();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(Character.toString(s.charAt(i)));
		}
		System.out.println(sum);
	}
}
