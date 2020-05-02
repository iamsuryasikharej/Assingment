package com.assingment;

import java.util.HashSet;

public class CheckUnique {
	public boolean same(int[] firstArray,int[] secondArray)
	{
		HashSet s1=new HashSet();// creating hash set to strore unique elements of firstArrya
		HashSet s2=new HashSet();// creating hash set to strore unique elements of secondArrya
		for(int temp:firstArray)
		{
			s1.add(temp);//adding unique elemements of firstArray to first hashset
		}
		for(int temp:secondArray)
		{
			s2.add(temp);//adding unique elemements of secondArray to second hashset
		}
		if(s1.size()==s2.size())//comparing the sizes
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
