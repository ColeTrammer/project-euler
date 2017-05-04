package e016;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
		BigInteger n = new BigInteger("2").pow(1000);
		String s = n.toString();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(Character.toString(s.charAt(i)));
		}
		System.out.println(sum);
	}
	
}
