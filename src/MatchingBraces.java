import java.util.Stack;

public class MatchingBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bracesMarched("{{}{}{}}")); // Should return true
		System.out.println(bracesMarched("}{}{}{}{")); // Should return false
		System.out.println(bracesMarched("{}{}{}{")); // Should return false
		System.out.println(bracesMarched("{}}{{}"));
		System.out.println(bracesMarched("{{{{}}}{}{}}")); // Should return true
	}

	private static boolean bracesMarched(String str) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '{')
				stack.push('{');
			if (ch == '}') {
				if (stack.empty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.empty();

	}

}
