
public class Dice
	{
		static int dice1=0;
		static int dice2=0;
		static int sum=0;
		
		public static int roll()
		{
			dice1=(int)(Math.random()*6)+1;
			dice2=(int)(Math.random()*6)+1;
			sum = dice1+dice2;
			return sum;
		}
		
	}
