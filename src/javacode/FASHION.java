package javacode;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution to SPOJ problem FASHION
 * @see <a href="http://www.spoj.com/problems/FASHION/">http://www.spoj.com/problems/FASHION/</a>
 * @author Shahbaz Ahmed
 *
 */
public class FASHION {

	public static void main(String[] args) {
		int count, n, a[], b[], sum;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n-- > 0) {
			count = sc.nextInt();
			a = new int[count];
			b = new int[count];
			sum = 0;
			for(int i = 0; i< count; i++) 
				a[i] = sc.nextInt();
			for(int i = 0; i< count; i++) 
				b[i] = sc.nextInt();
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i = 0; i< count; i++) 
				sum += (a[i]*b[i]);
			System.out.println(sum);
		}
		sc.close();
	}

}
