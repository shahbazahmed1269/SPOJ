import java.util.Scanner;

/**
 * Solution to SPOJ problem TEST
 * @see <a href="http://www.spoj.com/problems/TEST/">http://www.spoj.com/problems/TEST/</a>
 * @author Shahbaz Ahmed
 *
 */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		while((no = sc.nextInt()) != 42)
			System.out.println(no);
		sc.close();
	}

}
