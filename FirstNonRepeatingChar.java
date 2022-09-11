package org.stringPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingChar {
	
	public static void main(String args[])
	{
		String inp="sheetal";
		printFirstNonRepeatingStr(inp);
	}

	private static void printFirstNonRepeatingStr(String inp) {
			
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<inp.length();i++)
		{
			if(map.containsKey(inp.charAt(i)))
			{
				map.put(inp.charAt(i),map.get(inp.charAt(i))+1);
			}
			else
			{
				map.put(inp.charAt(i), 1);
			}
		}
		Set<Entry<Character,Integer>> entrySet=map.entrySet();
		Iterator<Entry<Character, Integer>> itr=entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<Character,Integer> next=itr.next();
			if(next.getValue()==1)
			{
				System.out.println(next.getKey() +" is first non repeating character");
				break;
			}
		}
	}

}
