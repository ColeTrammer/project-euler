package e032;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		
		ArrayList<Integer> prodects = new ArrayList<>();
		
		int sum = 0;
		
		for (int i = 1; i < 2000; i++) {
			for (int j = 1; j < 2000; j++) {
				String s = Integer.toString(j) + Integer.toString(i) + Integer.toString(i * j);
				if (s.length() == 9 && !prodects.contains(i * j) && isPandigital(s)) {
					prodects.add(i * j);
					sum += i * j;
				}
			}
		}
		System.out.println(sum);
		
	}

	//assumes string is of length 9 (1..9 pandigital)
	private static boolean isPandigital(String s) {
		ArrayList<Character> c = new ArrayList<>();
		
		for (int ii = 0; ii < s.length(); ii++) {
			if (c.contains(s.charAt(ii))) {
				return false;
			}
			c.add(s.charAt(ii));
		}
		
		return !s.contains("0");
	}
	
}
