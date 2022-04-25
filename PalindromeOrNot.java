package week2.day1;



public class PalindromeOrNot {
	public static void main(String[] args) {
		//Declare A String value as"madam"
		String str="Madam";
		//Declare another String rev value as ""
		String rev="";
		//Iterate over the String in reverse order
		for(int i=str.length()-1;i>=0;i--) {
			//Add the char into rev
			rev=rev+str.charAt(i);

		}
		//Compare the original String with the reversed String, if it is same then print palinDrome
		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str + " is a Palindrome string");
		}
		else {
			System.out.println(str + "is not a Palindrome string");
		}

	}

}
