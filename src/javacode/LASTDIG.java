package javacode;
import java.util.Scanner;

public class LASTDIG {

	public static void main(String[] args) {
		int a;
		long b;
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		while (n-- > 0) {
			a = sc.nextInt();
			b = sc.nextLong();
			if (b == 0) {
				System.out.println(1);
				continue;
			}
			int power = mod(b, 4);
			if (power != 0)
				System.out.println((int)(Math.pow(a, power) % 10));
			else 
				System.out.println((int)(Math.pow(a, 4) % 10));
		}
		sc.close();
	}
	
	public static int mod(long n1, int n2) {
		return (int) n1 % n2;
	}
}
