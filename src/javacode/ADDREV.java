package javacode;
import java.util.Scanner;

/**
 * Solution to SPOJ problem ADDREV
 * @see <a href="http://www.spoj.com/problems/ADDREV/">http://www.spoj.com/problems/ADDREV/</a>
 * @author Shahbaz Ahmed
 *
 */
public class ADDREV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		while (n-- > 0) {
			int a = reverse(sc.nextInt());
			int b = reverse(sc.nextInt());
			System.out.println(reverse(a + b));
		}
		sc.close();
	}
	
	public static int reverse(int no) {
		int rev = 0;
		while(no > 0) {
			rev = (rev * 10) + (no % 10);
			no /= 10;
		}
		return rev;
	}

}
