package javacode;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Solution to SPOJ problem FCTRL2
 * @see <a href="http://www.spoj.com/problems/FCTRL2/">http://www.spoj.com/problems/FCTRL2/</a>
 * @author Shahbaz Ahmed
 *
 */
public class FCTRL2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		while (n-- > 0) {
			 System.out.println(getFactorial(sc.nextInt()));
		}
		sc.close();
	}

	private static BigInteger getFactorial(int no) {
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i <= no; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		return fact;
	}

}
