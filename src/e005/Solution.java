package e005;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
		BigInteger n = new BigInteger("0");
		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger twenty_one = new BigInteger("21");
		
		while (true) {
			n = n.add(one);
			
			BigInteger i = new BigInteger("1");
			boolean isMultiple = true;
			
			while (i.compareTo(twenty_one) == -1) {
				if (!n.mod(i).equals(zero)) {
					isMultiple = false;
					break;
				}
				i = i.add(one);
			}
			if (isMultiple) {
				System.out.println(n);
				break;
			}
		}
		
	}
	
}
