package javacode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution to SPOJ problem STAMPS
 * @see <a href="http://www.spoj.com/problems/STAMPS/">http://www.spoj.com/problems/STAMPS/</a>
 * @author Shahbaz Ahmed
 *
 */ 
public class STAMPS {

	public static void main(String[] args) {
		int total, noStamps, stampsCollected, noOfFriends, a[];
		boolean isPossible;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nCopy = n;
		while(n-->0) {
			noStamps = 0;
			stampsCollected = 0;
			isPossible = false;
			total = sc.nextInt();
			noOfFriends = sc.nextInt();
			a = new int[noOfFriends];
			for (int i = 0; i < noOfFriends; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			for (int i = noOfFriends-1; i >= 0; i--) {
				stampsCollected += a[i];
				noStamps++;
				if (stampsCollected >= total) {
					isPossible = true;
					break;
				}
			}
			System.out.println("Scenario #"+(nCopy - n)+":");
			if (isPossible) {
				System.out.println(noStamps);
			} else {
				System.out.println("impossible");
			}
			System.out.println();
		}
		sc.close();
	}
}
