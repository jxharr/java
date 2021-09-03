package Recursion;

public class Exercise_18_12 {

	public static void main(String[] args) {
		reverseDisplay("sheesh");
	}

	public static void reverseDisplay(String value) {
		reverseDisplay(value, value.length() - 1);
	}

	public static void reverseDisplay(String value, int high) {
		if (high >= 0) {
			System.out.print(value.charAt(high));
			reverseDisplay(value, high - 1);
		}
	}

}
