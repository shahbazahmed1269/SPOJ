package javacode;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Solution to SPOJ problem JULKA
 * @see <a href="http://www.spoj.com/problems/JULKA/">http://www.spoj.com/problems/JULKA/</a>
 * @author Shahbaz Ahmed
 *
 */
public class JULKA {

	public static void main(String[] args) {
		BigInteger n, res, diff;
		int cases = 10;
		 Scanner sc = new Scanner(System.in);
	     while (cases-- > 0) {
	    	 n = new BigInteger(sc.next());
	    	 diff = new BigInteger(sc.next());
	    	 res = (n.add(diff)).divide(new BigInteger("2"));
	    	 System.out.println(res.toString());
	    	 System.out.println((res.subtract(diff)).toString());
		}
	    sc.close();
	}

}
