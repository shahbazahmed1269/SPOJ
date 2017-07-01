package javacode;
import java.util.Scanner;

public class AE00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		for (int i = 2; i <= n/2; i++)
			for (int j = i; j <= n/2; j++) {
				if (i * j <= n) 
					count +=1;
			}
		System.out.println(count);
		sc.close();
	}
}
