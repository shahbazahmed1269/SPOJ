package javacode;
import java.util.Scanner;

/**
 * Solution to SPOJ problem FCTRL
 * @see <a href="http://www.spoj.com/problems/FCTRL/">http://www.spoj.com/problems/FCTRL/</a>
 * @author Shahbaz Ahmed
 *
 */
public class FCTRL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		while (n-- > 0) {
			 System.out.println(getFactorialZeros(sc.nextInt()));
		}
		sc.close();

	}

	private static int getFactorialZeros(int no) {
		int pow5 = (int) (Math.log(no) / Math.log(5));
		int zeros = 0;
		while (pow5 > 0) {
			zeros += (int) (no / (Math.pow(5, pow5)));
			pow5--;
		}
		return zeros;
	}

}
