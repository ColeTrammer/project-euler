package e014;

import java.math.BigInteger;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		
		BigInteger one = new BigInteger("1");
		BigInteger one_million = new BigInteger("1000000");
		BigInteger two = new BigInteger("2");
		BigInteger zero = new BigInteger("0");
		BigInteger three = new BigInteger("3");
		
		HashMap<Integer, Integer> chains = new HashMap<Integer, Integer>();
		
		int max = 1;
		
		for (int i = 1; i < 1000000; i++) {
			int length = 1;
			BigInteger n = new BigInteger(Integer.toString(i));
			while (!n.equals(one)) {
				if (n.compareTo(one_million) != 1 && chains.get(Integer.parseInt(n.toString())) != null) {
					length += chains.get(Integer.parseInt(n.toString()));
					break;
				}
				if (n.mod(two).equals(zero)) {
					n = n.divide(two);
				} else {
					n = n.multiply(three).add(one);
				}
				length++;
			}
			chains.put(i, length);
			if (length > chains.get(max)) {
				max = i;
			}
		}
		
		System.out.println(max);
		
	}
	
}
