package week2.day1;

public class OccuranceOfCharacters {
	public static void main(String[] args) {

		//String - "welcome to chennai" - Print the number of e in the string e=2

		String input="welcome to chennai";
		//// declare and initialize a variable count to store the number of occurrences
		int count=0;
		// traverse from 0 till the array length 
		for(int i=0; i<input.length();i++) {
			//// Check for the particular char
			if(input.charAt(i)=='w')
				// if is has increment the count
				count++;
		}
		// print the count out of the loop
		System.out.println("The number of 'e' in the string is " + count);
	}

}
