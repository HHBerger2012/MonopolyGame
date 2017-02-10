
public class Player
	{
		private int position;
		private String name;
		private int money;
		
		public Player(int p, String n, int m)
		{
			position=p;
			name=n;
			money=m;
		}
		public int getPosition()
		{
			return position;
		}
		public void setPosition(int position)
		{
			this.position=position;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
				this.name=name;
		}
		public int getMoney()
		{
			return money;
		}
		public void setMoney(int money)
		{
				this.money=money;
		}
		
		public static int tossDie()
		{
			Dice dice = new Dice();
			int playerDice=Dice.roll();
			return playerDice;
		}
		
	}
