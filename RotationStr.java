package org.stringPractice;

public class RotationStr {

	public static void main(String args[])
	{
		String str="IndiaUSAEngland";
		String rotation="USAEnglandIndiaTurkey";
		checkRotation(str,rotation);
	}

	private static void checkRotation(String str, String rotation) {
		if(str.length()!=rotation.length())
		{
			System.out.println(rotation +" String is not rotation of "+str);
		}
		str=str+str;
		if(str.contains(rotation))
		{
			System.out.println(rotation +" String is rotation of "+str);
		}
		else
		{
			System.out.println(rotation +" String is not rotation of "+str);
		}
	}
}
