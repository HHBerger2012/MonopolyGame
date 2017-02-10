import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jail extends Square
	{
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public Jail(String n, int c, int l, int o)
		{
			setName(n);
			setCost(c);
			setLocation(l);
			setOwner(o);
		}
		public static void landedOnJailJustVisiting()
		{
			JOptionPane.showMessageDialog(frame, "You Landed on "+squares.get(Move.player.getPosition()).getName()+", but you're just visiting");
			Move.move();
		}
		public static void landedOnJailFR()
		{
			JOptionPane.showMessageDialog(frame, "You're in "+squares.get(10).getName());
			JOptionPane.showMessageDialog(frame, "You can either (1) Pay $250 or (2) Roll Until You Roll a Double (Each roll costs $20)");
			int choice;
			Object[] options = {"Pay $250", "Roll for Double"};
			ImageIcon icon =  new ImageIcon("jail.gif-c200");
			choice = JOptionPane.showOptionDialog(null, 
				"Choose Your Action",
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
								Move.player.setMoney(Move.player.getMoney()-250);
								Move.move();
							}
					case 1:
							{
								boolean go=true;
								while (go=true)
									{
										Move.player.setMoney(Move.player.getMoney()-20);
										int dice1=(int)(Math.random()*6)+1;
										int dice2=(int)(Math.random()*6)+1;
										if (dice1==dice2)
											{
										JOptionPane.showMessageDialog(frame, "You rolled a "+dice1+" and a "+dice2+" for a double! You're Free");
										JOptionPane.showMessageDialog(frame, "You Now Have "+Move.player.getMoney());
										go=false;
										Move.move();
											}
										else
											{
												JOptionPane.showMessageDialog(frame, "Nope, -$20");
												Runner.delay(650);
											}
									}
								
							
								
							}
				}
		}
	}
