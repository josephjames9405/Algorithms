import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SimpleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Hadi");
		arr.add("Margaret");
		arr.add("Joseph");
		arr.add("Hamilton");

		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("**************************************************");
		Collections.sort(arr);
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("**************************************************");
		Collections.sort(arr, Collections.reverseOrder());
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("**************************************************");

		Collections.sort(arr, new ReverseLengthComparator());
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("**************************************************");
	}

}

class ReverseLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int result = o2.length() - o1.length();
		if(result == 0) {
			
			return o1.compareTo(o2);
		}
		return result;
	}
	
}
