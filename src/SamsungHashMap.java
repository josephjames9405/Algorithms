import java.util.HashMap;

public class SamsungHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Samsung", "Nokia", "iPhone", "Pixel", "Nokia", "Samsung" };
		samsunghashmap(input);

	}

	private static void samsunghashmap(String[] input) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> myDict = new HashMap<String, Integer>();
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String curr = input[i];
			if (myDict.get(curr) != null) {
				myDict.put(curr, myDict.get(curr) + 1);
			} else {
				myDict.put(curr, 1);
			}
			output[i] = curr + myDict.get(curr);
		}
		for (int i = 0; i < input.length; i++) {
			System.out.print(output[i]+" ");
		}

	}

}
