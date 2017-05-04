package e012;

public class Solution {

	public static void main(String[] args) {
		
		int n = 0;
		int i = 0;
		while (true) {
			i++;
			n += i;
			if (n % 2 == 1) {//has lots of divisors so must be even
				continue;
			}
		    int d = numDivisors(n);
			//System.out.println(d + "    " + n + "    " + i);
		    if (d > 500) {
				System.out.println(n);
				return;
			}
		}
		
	}
	
	public static int numDivisors(int n) {
		
		int ans = 1; // 1 is always a divisor so count starts as one
		for (int i = n / 2; i > 2; i--) {
			if (n % i == 0) {
				ans++;
			}
		}
		return ans;
	}
	
}
