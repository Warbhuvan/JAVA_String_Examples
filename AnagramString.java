package org.stringPractice;

import java.util.Arrays;


public class AnagramString {

	public static void main(String args[])
	{
		String inp="abcd";
		String out="dcba";
		//checkAnagram(inp,out);
		//checkAnagram1(inp,out);
		checkAnagram2(inp,out);
	}

	private static void checkAnagram2(String inp, String out) {
		char[] inpArray=inp.toCharArray();
		char[] outArray=out.toCharArray();
		Arrays.sort(inpArray);
		Arrays.sort(outArray);
		if(Arrays.equals(inpArray, outArray))
		{
			System.out.println(inp+" and "+out+" are anagrams");
		}
		else
		{
			System.out.println(inp+" and "+out+" are not anagrams");
		}
	}

	private static void checkAnagram1(String inp, String out) {
		char[] inputArr=inp.toCharArray();
		StringBuilder temp=new StringBuilder(out);
		for(char c : inputArr)
		{
			int index=temp.indexOf(""+c);
			if(index!=-1)
			{
				temp.deleteCharAt(index);
			}
			else 
			{
				break;
			}
		}
		if(temp.length()==0)
		{
			System.out.println(inp+" and "+out+" are anagrams");
		}
		else
		{
			System.out.println(inp+" and "+out+" are not anagrams");
		}
	}

	private static void checkAnagram(String inp,String out) {
	
		if(inp.length()!=out.length())
		{
			System.out.println(inp+" and"+out+" are not anagrams");
			return;
		}
		boolean isAnagram=false;
		for(int i=0;i<inp.length();i++)
		{
			 isAnagram=false;
			for(int j=0;j<out.length();j++)
			{
				if(inp.charAt(i)==out.charAt(j)) {
					isAnagram=true;
					break;
				}
			}
			if(!isAnagram)
			{
				break;
			}
		}
		if(isAnagram)
		{
			System.out.println(inp+" and "+out+" are anagrams");
		}
		else
		{
			System.out.println(inp+" and "+out+" are not anagrams");
		}
	}
}
