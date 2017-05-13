package e026;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		
		ArrayList<BigDecimal> divisionAnswers = new ArrayList<>();
		
		for (BigDecimal i = new BigDecimal("2"); i.compareTo(new BigDecimal("1000")) == -1; i = i.add(new BigDecimal("1"))) {
			divisionAnswers.add((new BigDecimal("1").divide(i, new MathContext(2000, RoundingMode.DOWN))));//get decimal to 2000 places
		}
	
		int max = 0;
		int ans = 0;
		for (int d = 0; d < divisionAnswers.size(); d++) {
			String decimal = divisionAnswers.get(d).toString().substring(2);
			boolean found = false;
			for (int length = 3; length < decimal.length() / 2; length++) {//assume cycle length must be at least 3
				for (int start = 0; start < decimal.length() - (length * 2); start++) {
					if (decimal.substring(start, start + length).equals(decimal.substring(start + length, start + (length * 2)))) {	
						if (length > max) {
							max = length;
							ans = d + 2;
						}
						found = true;
						break;
					}
				}
				if (found)break;
			}
			
		}
		System.out.println(ans);
	}
	
}
