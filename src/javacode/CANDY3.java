package javacode;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Solution to SPOJ problem CANDY3
 * @see <a href="http://www.spoj.com/problems/CANDY3/">http://www.spoj.com/problems/CANDY3/</a>
 * @author Shahbaz Ahmed
 *
 */
public class CANDY3 {

	public static void main(String[] args) {
		int t, n;
		BigInteger mod;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			mod = new BigInteger("0");
			for (int i = 0; i < n; i++) {
				mod = mod.add(new BigInteger(sc.next()).mod(new BigInteger(n+"")));
			}
			mod = mod.mod(new BigInteger(n+""));
			if (mod.equals(new BigInteger("0"))) 
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
