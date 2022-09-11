package org.stringPractice;

public class ReverseStr {
	
	public static void main(String argd[])
	{
		String str="Sheetal";
		String rev=reverseStr(str);
		System.out.println(rev);
	}

	private static String reverseStr(String str) {
		if(str.isEmpty())  
		{  
		System.out.println("String is empty.") ; 
		return str;  
		}   
		else   
		{  
		return reverseStr(str.substring(1))+str.charAt(0);  
		}  
		
	}

}
