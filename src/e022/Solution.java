package e022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		BufferedReader br;
		String[] names = new String[0];
		
		try {
			br = new BufferedReader(new FileReader("src\\e022\\names.txt"));
		    String line = br.readLine();
		    
		    while (line != null) {
		    	names = line.split("((\".\"))");//get stuff between quotes
		    	line = br.readLine();
		    }
		    
		    names[0] = names[0].substring(1, names[0].length());//removes excess quotes that somehow aren't removed from beginning and end
		    names[names.length - 1] = names[names.length - 1].substring(0, names[names.length - 1].length() - 1);
		    
			br.close();
		} catch (Exception e) {
			System.out.println("?");
			return;
		}
		
		Arrays.sort(names);
		
		BigInteger sum = new BigInteger("0");
		
		for (int i = 0; i < names.length; i++) {
			
			int alpha = 0;
			
			for (int j = 0; j < names[i].length(); j++) {
				alpha += Character.getNumericValue((names[i].charAt(j))) - 9;//subtract 9 because get numeric value returns from 10 - 35 for some reason
			}
			
			sum = sum.add(new BigInteger(Integer.toString((i + 1) * alpha)));
		}
		System.out.println(sum);
	}
	
}
