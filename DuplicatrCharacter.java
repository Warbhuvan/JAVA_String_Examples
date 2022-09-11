package org.stringPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicatrCharacter {

	public static void main(String args[])
	{
		String inp="Sheetal";
		printDuplicateCharacters(inp);
	}

	private static void printDuplicateCharacters(String inp) {
		
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<inp.length();i++)
		{
			if(map.containsKey(inp.charAt(i)))
			{
				map.put(inp.charAt(i), map.get(inp.charAt(i))+1);
			}
			else if(!map.containsKey(inp.charAt(i)))
			{
				map.put(inp.charAt(i), 1);
			}
		}
		map.forEach((k,v)->{
			if(v>1)
			{
				System.out.println(k+" is repeating for "+v+" times");
			}
		});
	}
}

