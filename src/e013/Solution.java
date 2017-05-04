package e013;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {

		BufferedReader br;
		String num = "";
		try {
			br = new BufferedReader(new FileReader("src\\e013\\num.txt"));
		    String line = br.readLine();
		    while (line != null) {
		        num += line;
		        line = br.readLine();
		    }
			br.close();
		} catch (Exception e) {
			System.out.println("?");
		}
		
		BigInteger sum = new BigInteger("0");
		
		for (int i = 0; i < num.length(); i += 50) {
			sum = sum.add(new BigInteger(num.substring(i, i + 50)));
		}
		
		System.out.println(sum.toString().substring(0, 10));
		
	}

}
