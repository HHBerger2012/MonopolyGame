import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Properties extends Square
	{
		private String color;
		private int cost;
		private int location;
		private int valueOneHouse;
		private int valueTwoHouse;
		private int valueThreeHouse;
		private int valueFourHouse;
		private int valueHotel;
		private int costHouseHotel;
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		
		public Properties(String n, String cl, int co, int l, int v1, int v2, int v3, int v4, int vh, int c, int o)
		{
			setName(n);
			color=cl;
			setCost(co);
			setLocation(l);
			valueOneHouse=v1;
			valueTwoHouse=v2;
			valueThreeHouse=v3;
			valueFourHouse=v4;
			valueHotel=vh;
			costHouseHotel=c;
			setOwner(o);
		}
		
		public String getColor()
		{
			return color;
		}
		public void setColor(String color)
		{
			this.color=color;
		}	
		public int getValueOneHouse()
		{
			return valueOneHouse;
		}
		public void setValueOneHouse(int valueOneHouse)
		{
			this.valueOneHouse=valueOneHouse;
		}
		public int getValueTwoHouse()
		{
			return valueTwoHouse;
		}
		public void setValueTwoHouse(int valueTwoHouse)
		{
			this.valueTwoHouse=valueTwoHouse;
		}
		public int getValueThreeHouse()
		{
			return valueThreeHouse;
		}
		public void setValueThreeHouse(int valueThreeHouse)
		{
			this.valueThreeHouse=valueThreeHouse;
		}
		public int getValueFourHouse()
		{
			return valueFourHouse;
		}
		public void setValueFourHouse(int valueFourHouse)
		{
			this.valueFourHouse=valueFourHouse;
		}
		public int getValueHotel()
		{
			return valueHotel;
		}
		public void valueHotel(int valueHotel)
		{
			this.valueHotel=valueHotel;
		}
		public int getCostHouseHotel()
		{
			return valueTwoHouse;
		}
		public void setCostHouseHotel(int costHouseHotel)
		{
			this.costHouseHotel=costHouseHotel;
		}
		
		public static void landedOnProperty()
		{
			Runner.delay(200);
			int choice;
			Object[] options = {"Buy", "Move On"};
			ImageIcon icon =  new ImageIcon("qwewq.gif");
			choice = JOptionPane.showOptionDialog(null, 
				"You Landed On "+squares.get(Move.player.getPosition()).getName()
				+" - "
				+"It Costs "+squares.get(Move.player.getPosition()).getCost(),
				"Wallet- "+Move.player.getMoney(),
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(choice)
				{
					case 0:
							{
								if (squares.get(Move.player.getPosition()).getCost()>Move.player.getMoney())
									{
										JOptionPane.showMessageDialog(frame, "You don't have enough money");
									}
								else
									{
								Inventory.addProperty();
								JOptionPane.showMessageDialog(frame, "Purchased");
								Move.player.setMoney(Move.player.getMoney()-squares.get(Move.player.getPosition()).getCost());
								Move.move();
									}
							}
					case 1:
							{
								Move.move();
							}
				}
		}

	}
