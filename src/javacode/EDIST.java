package javacode;

import java.util.Scanner;
/**
 * Solution to SPOJ problem EDIST
 * @see <a href="https://www.spoj.com/problems/EDIST/">https://www.spoj.com/problems/EDIST/</a>
 * @author Shahbaz Ahmed
 */
public class EDIST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			String from = sc.next();
			String to = sc.next();
			editDistance(from, to);
		}
		sc.close();
	}
	
	public static void editDistance(String from, String to) {
		int fromLen = from.length();
		int toLen = to.length();
		int[][] minDist = new int[toLen + 1][fromLen + 1];
		
		for (int i = 0; i <= toLen; i++) {
			for (int j = 0; j <= fromLen; j++) {
				if (i == 0) {
					minDist[i][j] = j;
				} else if (j == 0) {
					minDist[i][j] = i;
				} else if (to.charAt(i - 1) == from.charAt(j - 1)) {
					minDist[i][j] = minDist[i - 1][j - 1];
				} else {
					minDist[i][j] = Math.min(
							minDist[i][j - 1] + 1, 
							Math.min(minDist[i - 1][j - 1] + 1, minDist[i - 1][j] + 1)
					);
				}
			}
		}
		
		System.out.println(minDist[toLen][fromLen]);
	}
}
