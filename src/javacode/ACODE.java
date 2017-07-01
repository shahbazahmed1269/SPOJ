package javacode;
import java.util.Scanner;
/**
 * Solution to SPOJ problem ACODE
 * @see <a href="http://www.spoj.com/problems/ACODE/">http://www.spoj.com/problems/ACODE/</a>
 * Dynamic Programming problem, solved by bottom up memoization
 */
public class ACODE {

	public static void main(String[] args) {
		String input;
		int b[], n, no;
		Scanner sc = new Scanner(System.in);
		while (true) {
			input = sc.next();
			if (input.equals("0"))
				break;
			n = input.length();
			b = new int [n];
			b[0] = 1;
			for (int i = 1; i < n; i++) {
				if ((input.charAt(i) - '0') > 0) // If number at i th position is valid
					b[i] += b[i-1]; // When adding a character to the right of code sequence, the no. of permutation remains the same as previous code.
				no = ((input.charAt(i-1) - '0') * 10) + (input.charAt(i) - '0');
				if (no >= 10 && no <= 26) { // If combined number at (i-1)th and i th positions is valid
					if(i==1)
	                    b[i] = b[i] + 1;
					else
						b[i] += b[i-2]; // Since (i-1)th and i th characters are already used up.
				}
			}
			System.out.println(b[n-1]);
		}
	}
}
