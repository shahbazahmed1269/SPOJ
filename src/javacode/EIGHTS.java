package javacode;
import java.util.Scanner;

/**
 * Solution to SPOJ problem EIGHTS
 * @see <a href="http://www.spoj.com/problems/EIGHTS/">http://www.spoj.com/problems/EIGHTS/</a>
 * @author Shahbaz Ahmed
 *
 */
public class EIGHTS {
	
	public static void main(String[] args) {
		long n, cal;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextLong();
			cal = (n - 1) * 250 + 192;
			System.out.println(cal);
		}
		sc.close();
	}
}
