import java.util.Scanner;

public class HANGOVER {

	public static void main(String[] args) {
		float n, sum = 0.0f;
		int i;
		Scanner sc = new Scanner(System.in);
		while ((n = sc.nextFloat())!= 0.0f) {
			i = 0;
			sum = 0;
			for (i = 2; sum <= n; i++) {
				sum += 1.0/i;
			}
			System.out.println((i-2) + " card(s)");
		}
		sc.close();
	}

}
