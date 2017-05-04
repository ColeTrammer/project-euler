package e019;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
	
		ArrayList<Integer> months = new ArrayList<>();
	
		months.add(31);//January
		months.add(28);//February
		months.add(31);//March
		months.add(30);//April
		months.add(31);//May
		months.add(30);//June
		months.add(31);//July
		months.add(31);//August
		months.add(30);//September
		months.add(31);//October
		months.add(30);//November
		months.add(31);//December
	
		int sundays = 0;
		int dayPointer = 1;//Jan 1 1900 was a Monday
		for (int year = 1900; year <= 2000; year++) {
			
			for (int month = 0; month < 12; month++) {
				int daysInMonth = months.get(month);
				
				if (month == 1) {//February
					if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
						daysInMonth = 29;
					}
				}
				for (int days = 0; days < daysInMonth; days++) {
					
					if (dayPointer == 0 && days == 0 && year != 1900) {//if sunday and first day of month
						sundays++;
					}
					
					dayPointer++;
					dayPointer %= 7;
				}
				
			}
			
		}
		System.out.println(sundays);
	}
}