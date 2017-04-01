import java.util.Scanner;

public class PALIN {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			str = sc.next();
			System.out.println(nextPalin(str));
		}
		sc.close();
	}

	private static String nextPalin(String str) {
		StringBuilder left, right, s, res;
		int n;
		n = str.length();
		left = new StringBuilder(str.substring(0, (n-1)/2 + 1)); // Including middle digit in case of odd number
		right = new StringBuilder(left);
		if ((n & 1) == 1) // n has odd number of digits
			right = right.deleteCharAt(left.length() - 1);
		right = right.reverse();
		res = new StringBuilder(left);
		res = res.append(right);
		if (res.toString().compareTo(str) > 0) {
			return res.toString();
		} else {
			// Increment left by 1 
			for (int i = left.length() - 1 ; i >= 0; i--) {
				if (left.charAt(i) != '9') {
					char c = (char) (left.charAt(i) + 1);
					left.setCharAt(i, c);
					// Set all Digits starting from i + 1 th position to 0
					for (int j = i + 1; j < left.length(); j ++) {
						left.setCharAt(j, '0');
					}
					right = new StringBuilder(left);
					if ((n & 1) == 1)
						right = right.deleteCharAt(left.length() - 1);
					right = right.reverse();
					return left.append(right).toString();
				}
			}
			// Handle case where input containers only '9' chars
			s = new StringBuilder("1");
			for (int i = 0; i < n-1; i++)
				s = s.append("0"); 
			s = s.append("1");
			return s.toString();
		}
	}
}
