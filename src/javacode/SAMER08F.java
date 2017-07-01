package javacode;
import java.util.Scanner;

/**
 * Solution to SPOJ problem SAMER08F
 * @see <a href="http://www.spoj.com/problems/SAMER08F/">http://www.spoj.com/problems/SAMER08F/</a>
 * @author Shahbaz Ahmed
 *
 */
public class SAMER08F {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			 System.out.println(getSquareCount(n));
		}
		sc.close();
	}

	private static int getSquareCount(int no) {
		int sos = 0;
		for (int i = 1; i  <= no; i++)
			sos += (i*i);
		return sos;
	}

}
