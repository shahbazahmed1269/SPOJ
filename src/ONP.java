import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * Solution to SPOJ problem ONP
 * @see <a href="http://www.spoj.com/problems/ONP/"http://www.spoj.com/problems/ONP/</a>
 * @author Shahbaz Ahmed
 *
 */
public class ONP {
	public static HashMap<Character, Integer> precedence;
	public static void main(String[] args) {
		precedence = new HashMap<Character, Integer>();
		precedence.put('*', 2);
		precedence.put('/', 2);
		precedence.put('^', 2);
		precedence.put('+', 1);
		precedence.put('-', 1);
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		while (n-- > 0) {
			 System.out.println(getPostFix(sc.next()));
		}
		sc.close();
	}

	private static String getPostFix(String str) {
		char[] exp =str.toCharArray();
		String op = "";
		Stack<Character> stack = new Stack<Character>();
		for(char c: exp) {
			if(c == '*' || c == '/' || c == '^' || c == '+' || c == '-' ) {
				while (stack.peek() != '(' && precedence.get(c) >= precedence.get(stack.peek())) {
					char operator = stack.pop();
					op += operator;
				}
				stack.push(c);
			} else if (c == ')'){
				while (stack.peek() != '(') {
					char operator = stack.pop();
					op += operator;
				}
				stack.pop();
			} else if (c == '(') {
				stack.push(c);
			} else {
				op += c;
			}
		}
		while (!stack.isEmpty()) {
			char operator = stack.pop();
			op += operator;
		}
		return op;
	}

}
