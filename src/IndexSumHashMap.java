import java.util.HashMap;

public class IndexSumHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 6, 2, 4, 8, 7 };
		int[] a = indexsum(input, 8);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	private static int[] indexsum(int[] input, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> indice = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			int difference = target - input[i];
			if (indice.containsKey(difference)) {
				return new int[] { indice.get(difference), i };
			} else {
				indice.put(input[i], i);
			}
		}
		return new int[] {};
	}
}
