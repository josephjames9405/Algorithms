import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> stack = new ArrayDeque<>();
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		int s = stack.size() - 1;
		while (s >= 0) {
			System.out.println(stack.pop());
			s--;
		}
	}

}
