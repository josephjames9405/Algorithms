//Problem2:
//String[] input = {“Samsung”, “Nokia”, “iPhone”, “Pixel”, “Nokia”,. “Samsung”};
//Given above input, you should be able to return output:
//Output = {“Samsung1”, “Nokia1”, “iPhone1”, “Pixel1”, “Nokia2”,. “Samsung2”}
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Samsung", "Nokia", "iPhone", "Pixel", "Nokia", "Samsung" };
		mobile(input);

	}

	private static void mobile(String[] input) {
		// TODO Auto-generated method stub
		int[] counter = { 1, 1, 1, 1, 1, 1 };
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].equals(input[j])) {
					counter[j]++;
				}
			}
		}
		for (int i = 0; i < input.length; i++) {
			input[i] = input[i] + counter[i];
			System.out.print(input[i] + " ");
		}
	}

}
