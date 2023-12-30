/*
 * Given two strings, write a method to decide if one is permutation of the other.
 */

import java.util.Arrays;

public class Q1_02_Check_Permutation {

	public static void main(String[] args) {
		String str1 = "dogo ";
		String str2 = "good";

		if (isPermutation(str1, str2)) {
			System.out.println("one string is permutation of other");
		} else {
			System.out.println("one string is not permutation of other");
		}
	}

	static boolean isPermutation(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		return sortString(str1).equals(sortString(str2));
	}

	static String sortString(String str) {
		char[] char_Array = str.toCharArray();// converting string to character array
		Arrays.sort(char_Array);
		return new String(char_Array);// converting character array to string
	}
}
