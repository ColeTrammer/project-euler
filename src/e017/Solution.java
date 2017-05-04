package e017;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		
		int hundred = 7;
		
		HashMap<Integer, Integer> words = new HashMap<>();
		
		words.put(1, 3);
		words.put(2, 3);
		words.put(3, 5);
		words.put(4, 4);
		words.put(5, 4);
		words.put(6, 3);
		words.put(7, 5);
		words.put(8, 5);
		words.put(9, 4);
		words.put(10, 3);
		words.put(11, 6);
		words.put(12, 6);
		words.put(13, 8);
		words.put(14, 8);
		words.put(15, 7);
		words.put(16, 7);
		words.put(17, 9);
		words.put(18, 8);
		words.put(19, 8);
		words.put(20, 6);
		words.put(30, 6);
		words.put(40, 5);
		words.put(50, 5);
		words.put(60, 5);
		words.put(70, 7);
		words.put(80, 6);
		words.put(90, 6);
		
		int sum = 0;
		for (int i = 1; i <= 999; i++) {
			int sumT = 0;
			if (i >= 100) {
				sumT += hundred;
				sumT += words.get(i / 100);
				if (i % 100 != 0) {
					sumT += 3;//for and
				} else {
					sum += sumT;
					continue;
				}
				
			}
			if (i % 100 >= 10) {
				if (i % 100 >= 10 && i % 100 <= 20) {
					sumT += words.get(i % 100);
					sum += sumT;
					continue;
				} else {
					sumT += words.get(((i % 100) / 10) * 10);
				}
			}
			if ((i % 100) % 10 == 0) {
				sum += sumT;
				continue;
			}
			if (i % 100 < 10) {
				sumT += words.get(i % 100);
			} else {
				sumT += words.get((i % 100) % 10);
			}
			sum += sumT;
		}
		System.out.println(sum + 11);//for one thousand
		
	}
	
}
