package e015;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

	private static final int GRID_WIDTH = 20;
	
	public static void main(String[] args) {
		
		BigInteger one = new BigInteger("1");
		
		HashMap<ArrayList<Integer>, BigInteger> grid = new HashMap<ArrayList<Integer>, BigInteger>();

		for (int i = GRID_WIDTH; i >= 0; i--) {
			for (int j = GRID_WIDTH; j >= 0; j--) {
				if (j == GRID_WIDTH) {
					grid.put(make2D(i,  j), one);
				} else if (i == GRID_WIDTH) {
					grid.put(make2D(i,  j), one);	
				} else {
					grid.put(make2D(i,  j), grid.get(make2D(i, j + 1)).add(grid.get(make2D(i + 1, j))));
				}	
			}
		}
		
		System.out.println(grid.get(make2D(0, 0)));
		
	}
	
	public static ArrayList<Integer> make2D(int x, int y) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(x);
		l.add(y);
		return l;
	}

}
