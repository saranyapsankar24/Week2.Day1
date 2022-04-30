package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		// Convert the String to character array
		char[] charArray = test.toCharArray();
		//Traverse through each character (using loop)
		for (int i = 0; i < charArray.length; i++) {
			//Find if the given character is what type using (if)
			if(Character.isLetter(charArray[i])) {
				letter=letter+1;
			}
			else if(Character.isDigit(charArray[i])) {
				num=num+1;
			}
			else if(Character.isSpaceChar(charArray[i])) {
				space=space+1;
			}
			else {
				specialChar=specialChar+1;
			}
			
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharacter: " + specialChar);
	}
}