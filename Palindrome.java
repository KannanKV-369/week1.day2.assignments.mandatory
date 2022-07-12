package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not

		/*
		 * Pseudo Code

		 * a) Declare A String value as"madam"

		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String str1 = "madam";
		String rev = "";
		for (int  i = str1.length()-1;i>=0; i--) {
			rev = rev + str1.charAt(i);
		}
		System.out.println("Reversed String: "+rev);
		if(rev.equalsIgnoreCase(str1))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palnidrome");

	}

}
