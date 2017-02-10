import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Utilities extends Square
	{
		private String color;
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public Utilities(String n, String cl, int co, int l, int o)
		{
			setName(n);
			color=cl;
			setCost(co);
			setLocation(l);
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
		
		public static void landedOnUtilities()
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
