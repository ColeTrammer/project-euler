package e018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		
		BufferedReader br;
		ArrayList<ArrayList<Integer>> pyramid = new ArrayList<>();
		
		try {
			br = new BufferedReader(new FileReader("src\\e018\\pyramid.txt"));
		    String line = br.readLine();
		    int count = 0;
		    
		    while (line != null) {
		        
		    	pyramid.add(new ArrayList<Integer>());
		  
		    	String[] row = line.split(" ");
		    	
		    	for (int i = 0; i <= count; i++) {
		    		
		    		pyramid.get(count).add(Integer.parseInt(row[i]));
		    		
		    	}
		    	
		    	line = br.readLine();
		    	count++;
		    }
			br.close();
		} catch (Exception e) {
			System.out.println("?");
		}

		for (int row = pyramid.size() - 2; row >= 0; row--) {
			for (int n = 0; n < pyramid.get(row).size(); n++) {
				pyramid.get(row).set(n, Math.max(pyramid.get(row + 1).get(n), pyramid.get(row + 1).get(n + 1)) + pyramid.get(row).get(n));
			}
		}

		System.out.println(pyramid.get(0).get(0));
		
	}
	
}
