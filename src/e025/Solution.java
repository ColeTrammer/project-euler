package e025;

import java.math.BigInteger;
import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		
		ArrayList<BigInteger> fibs = new ArrayList<>();
		fibs.add(new BigInteger("1"));
		
		BigInteger nextFib = new BigInteger("1");
		while(nextFib.toString().length() < 1000) {
			fibs.add(nextFib);
			nextFib = fibs.get(fibs.size() - 1).add(fibs.get(fibs.size() - 2));
		}
		System.out.println(fibs.size() + 1);
	}
	
}
