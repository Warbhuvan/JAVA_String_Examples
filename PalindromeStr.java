package org.stringPractice;

public class PalindromeStr {

	public static void main(String args[])
	{
		String inp="abaa";
		checkPalindrome(inp);
	}

	private static void checkPalindrome(String inp) {
		
		String reverse=getReverseStr(inp);
		if(reverse.equals(inp))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
	}

	private static String getReverseStr(String inp) {
		if(inp.isEmpty())
		{
			return inp;
		}
		else
			return getReverseStr(inp.substring(1))+inp.charAt(0);
	}
}
