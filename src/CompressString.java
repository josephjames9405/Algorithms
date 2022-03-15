//Example 1
//
//String input = “aaaabbccccc”;
//
// 
//
//And return the output,
//
// 
//
//“a4b2c5”
//
// 
//
//Example 2
//
//String input = “abbcccccaa”;
//
// 
//
//And return the output,
//
// 
//
//“a1b2c5a2”;
public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "abbcccccddeefeeddddabb";
		compress(input1);

	}

	private static void compress(String input1) {
		// TODO Auto-generated method stub
		/*
		 * char ch = 0; int count = 1; String res = ""; for (int i = 0; i <
		 * input1.length()-1; i++) { ch = input1.charAt(i); if (ch == input1.charAt(i +
		 * 1)) { count++; } else { res = res + ch + count; count = 1; } } if(count>0)
		 * res=res+ch+count; System.out.println(res);
		 */
		char ch = 0;
		int count = 1;
		int n = input1.length();

		String res = "";
		for (int i = 0; i < n - 1; i++) {
			ch = input1.charAt(i);

			if (ch == input1.charAt(i + 1)) {
				count++;
			} else {
				if (count == 1) {
					res = res + ch;
				} else {
					res = res + ch + count;
					count = 1;
				}

			}

		}

		if (count == 1)
			res = res + input1.charAt(n - 1);
		else
			res = res + input1.charAt(n - 1) + count;

		System.out.println(res);

	}

}
