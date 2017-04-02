import java.util.Scanner;
/**
 * Solution to SPOJ problem ACODE
 * @see <a href="http://www.spoj.com/problems/ACODE/">http://www.spoj.com/problems/ACODE/</a>
 */
public class ACODE {

	public static void main(String[] args) {
		String input;
		int b[], n, no;
		Scanner sc = new Scanner(System.in);
		while (true) {
			input = sc.next();
			if (input.equals("0"))
				break;
			n = input.length();
			b = new int [n];
			b[0] = 1;
			for (int i = 1; i < n; i++) {
				if ((input.charAt(i) - '0') > 0)
					b[i] += b[i-1];
				no = ((input.charAt(i-1) - '0') * 10) + (input.charAt(i) - '0');
				
				if (no >= 10 && no <= 26) {
					if(i==1)
	                    b[i] = b[i] + 1;
					else
						b[i] += b[i-2];
				}
			}
			System.out.println(b[n-1]);
		}
	}
}
