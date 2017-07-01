package javacode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Solution to SPOJ problem COINS
 * @see <a href="http://www.spoj.com/problems/COINS/">http://www.spoj.com/problems/COINS/</a>
 * @author Shahbaz Ahmed
 *
 */
public class COINS {
	static HashMap<Long, Long> dp;
	
	public static void main(String[] args) throws IOException {
		dp = new HashMap<Long, Long>();
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	     String line;
	     while ((line = in.readLine()) != null && line.length() != 0) {
	    	 try {
	    		 int n = Integer.parseInt(line);
	 			System.out.println(calc(n));
	    	 } catch (NumberFormatException e) {
	    		 break;
	    	 }
		}
	}
	public static long calc(long no) {
		if (dp.containsKey(no) && dp.get(no) > 0)
			return dp.get(no);
		if (no < 1)
			return 0;
		long  sum = calc((int)no/4) + calc((int)no/3) + calc((int)no/2);
		if (sum > no) 
			dp.put(no, sum);
		else
			dp.put(no, (long)no);
		return  dp.get(no);
	}
}
