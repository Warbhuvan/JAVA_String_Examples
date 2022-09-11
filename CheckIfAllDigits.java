package org.stringPractice;

import java.util.regex.Pattern;

public class CheckIfAllDigits {
	
	public static void main(String args[])
	{
		String str="12345";
		checkIfAllDigits(str);
	}

	private static void checkIfAllDigits(String str) {

		Pattern pattern=Pattern.compile(".*[^0-9].*");
		if(pattern.matcher(str).matches())
		{
			System.out.println("All are numbers");
		}
		System.out.println("All are not numbers");
	}

}
