package e024;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		
		String base = "0123456789";
	
		ArrayList<String> permutations = makePermutaions(base);
		
		Collections.sort(permutations);
		System.out.println(permutations.get(1000000 - 1));
	}
	
	public static ArrayList<String> makePermutaions(String base) {
	
		ArrayList<String> ans = new ArrayList<>();
		
		if (base.length() == 1) {
			ans.add(base);
			return ans;
		}
		
		for (int i = 0; i < base.length(); i++) {
			ArrayList<String> nextTier = makePermutaions(base.substring(0, i) + base.substring(i + 1, base.length()));
			for (int j = 0; j < nextTier.size(); j++) {
				nextTier.set(j, nextTier.get(j) + base.charAt(i));
			}
			ans.addAll(nextTier);
		}
		return ans;
	}
	
}
