package Exercicios3;

public class Ex1_For {
	public static void main (System[]args) 
	{
		int x;
		
		for(x=1000;x<=1999;x++)
		{
			if(x%11 == 5)
			{
				System.out.println(x);
			}
		}
	}

}