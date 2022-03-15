import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(100);
		for (int i : numbers)
			System.out.println(i);
		System.out.println("-------------------------------------------------------------------");
		Set<Integer> num = new TreeSet<>();
		num.add(700);
		num.add(200);
		num.add(1000);
		for (int i : num)
			System.out.println(i);
	}

}
