//Problem 3:
//Given a sentence
//String sentence = “racecar is driven by madam”;
//Find the longest palindrome word in the sentence
//Output: “racecar”
public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "racecar is driven by madam";
		String temp = "";
		String longest = "";
		char ch = 0;
		boolean a = false;
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (ch == ' ') {
				a = palindrome(temp);
				if (a == true) {
					if (longest.length() <= temp.length()) {
						longest = temp;
					}

				}
				temp = "";
			} else {
				temp = temp + ch;
			}

		}
		a = palindrome(temp);
		if (a == true) {
			if (longest.length() <= temp.length()) {
				longest = temp;
			}
		}
		System.out.println("Longest palindrome is:" + longest);
	}

	private static boolean palindrome(String temp) {
		// TODO Auto-generated method stub
		for (int i = 0, j = temp.length() - 1; i < temp.length() / 2 && j > -1; i++, j--) {
			if (temp.charAt(i) != temp.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
