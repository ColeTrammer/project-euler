package e006;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
		BigInteger sum_of_squares = new BigInteger("0");
		BigInteger square_of_sum = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger one_hundred_one = new BigInteger("101");
		
		BigInteger i = new BigInteger("1");
		while (i.compareTo(one_hundred_one) == -1) {
			sum_of_squares = sum_of_squares.add(i.pow(2));
			i = i.add(one);
		}
		
		i = new BigInteger("1");
		while (i.compareTo(one_hundred_one) == -1) {
			square_of_sum = square_of_sum.add(i);
			i = i.add(one);
		}
		square_of_sum = square_of_sum.pow(2);
		System.out.println(square_of_sum.subtract(sum_of_squares));
	}
	
}
