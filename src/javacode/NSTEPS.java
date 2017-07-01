package javacode;
import java.util.Scanner;

/**
 * Solution to SPOJ problem NSTEPS
 * @see <a href="http://www.spoj.com/problems/NSTEPS/">http://www.spoj.com/problems/NSTEPS/</a>
 * @author Shahbaz Ahmed
 *
 */
public class NSTEPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		while (n-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x % 2 == 0 && y % 2 == 0 && (x == y || x - y == 2)) {
				System.out.println(x + y);
			} else if (x % 2 == 1 && y % 2 == 1 && (x == y || x - y == 2)) {
				System.out.println(x + y - 1);
			} else {
				System.out.println("No Number");
			}
		}
		sc.close();
	}
}
