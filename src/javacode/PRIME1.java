package javacode;
import java.util.Scanner;

/**
 * Solution to SPOJ problem PRIME1
 * @see <a href="http://www.spoj.com/problems/PRIME1/">http://www.spoj.com/problems/PRIME1/</a>
 * @author Shahbaz Ahmed
 *
 */
public class PRIME1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		while (n-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			printPrimesBetween(a, b);
			System.out.println();
		}
		sc.close();
	}
	
	public static void printPrimesBetween(int n, int m) {
		for (int i = n; i <= m; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}

	private static boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
			else 
				continue;
		}
		return true;
	}
}
