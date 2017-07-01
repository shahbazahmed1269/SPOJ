package javacode;
import java.util.Scanner;

/**
 * Solution to SPOJ problem ACPC10A
 * @see <a href="http://www.spoj.com/problems/ACPC10A/">http://www.spoj.com/problems/ACPC10A/</a>
 * @author Shahbaz Ahmed
 *
 */
public class ACPC10A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 int c = sc.nextInt();
			 if (a==b && b==c && a == 0)
				 break;
			 if (b - a == c - b) {
				 System.out.println("AP " + (c + (c-b)));
			 } else if (b/a == c/b) {
				 System.out.println("GP " + (c * (c/b)));
			 } else {
				 continue;
			 }
		}
		sc.close();
	}

}
