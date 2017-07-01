package javacode;
import java.util.Scanner;

/**
 * Solution to SPOJ problem CANDY
 * @see <a href="http://www.spoj.com/problems/CANDY/">http://www.spoj.com/problems/CANDY/</a>
 * @author Shahbaz Ahmed
 *
 */
public class CANDY {

	public static void main(String[] args) {
		int n, sum, arr[], steps;
		float mean;
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == -1)
				break;
			arr = new int[n];
			sum = 0;
			steps = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			mean = ((float) sum)/n;
			if (mean - Math.floor(mean) == 0) {
				for  (int i = 0; i < n; i++) {
					if (arr[i] < mean)
						steps += (mean - arr[i]);
				}
				System.out.println(steps);
			} else {
				System.out.println("-1");
			}
		}
		sc.close();
	}

}
