package javacode;
import java.util.Scanner;

/**
 * Solution to SPOJ problem TOANDFRO
 * @see <a href="http://www.spoj.com/problems/TOANDFRO/">http://www.spoj.com/problems/TOANDFRO/</a>
 * @author Shahbaz Ahmed
 *
 */
public class TOANDFRO {

	public static void main(String[] args) {
		char arr[][];
		int col;
		Scanner sc = new Scanner(System.in);
		while (true) {
			col = sc.nextInt();
			if (col == 0)
				break;
			int count = 0;
			String str = sc.next();
			int row = str.length()/col;
			arr = new char[row][col];
			for (int i = 0; i< row; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < col; j++)
						arr[i][j] = str.charAt(count++);
				} else {
					for (int j = col-1; j >= 0; j--)
						arr[i][j] = str.charAt(count++);
				}
			}
			for (int i = 0; i < col; i++)
				for (int j = 0; j < row; j++)
					System.out.print(arr[j][i]);
			System.out.println();
		}
		sc.close();
	}
}
