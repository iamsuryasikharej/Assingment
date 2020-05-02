package com.assingment2;
import java.lang.Math; 
public class FindSol {
	public int solution_count(int a ,int b ,int c)
	{
		int x=(b*b)-4*a*c;
		double Discriminant=Math.sqrt(x);
		if(x<0)
		{
			return 0;
			
		}
		else if(Discriminant>0)
		{
			return 2;
			
		}
		else if(Discriminant==0)
		{
			return 1;
			
		}
		else
		{
			return 1000;//terminating condition
		}
	
		
	}

}
