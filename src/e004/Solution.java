package e004;

public class Solution {

	public static void main(String[] args) {
		
		int largest = 0;
		for (int i = 999; i > 0; i--) {
			for (int j = 999; j > 0; j--) {
				if (i * j > largest && isPalindrome(i * j)) { 
					largest = i * j;
				}
			}
		}
		System.out.println(largest);
	}

	public static boolean isPalindrome(int n) {
		
		String s = Integer.toString(n);
		return reverse(s).equals(s);
	}
	
	public static String reverse(String s) {
		String res = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			res += s.charAt(i);
		}
		
		return res;
	}
	
}
