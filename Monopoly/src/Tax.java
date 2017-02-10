import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tax extends Square	
	{	
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public Tax(String n, int c, int l, int o)
		{
			setName(n);
			setCost(c);
			setLocation(l);
			setOwner(o);
		}
		public static void landedOnTax()
		{
			Runner.delay(200);
			JOptionPane.showMessageDialog(frame, "You landed on "+squares.get(Move.player.getPosition()).getName());
			int choice;
			Object[] options = {"Pay 10%", "Pay $200"};
			ImageIcon icon =  new ImageIcon("tax.jpg");
			choice = JOptionPane.showOptionDialog(null, 
				"You Landed on "+squares.get(Move.player.getPosition()).getName(),
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
								int money = Move.player.getMoney();
								int percent = money/10;
								Move.player.setMoney(Move.player.getMoney()-percent);
								JOptionPane.showMessageDialog(frame, "You now have "+Move.player.getMoney());
								Move.move();
							}
					case 1:
							{
								Move.player.setMoney(Move.player.getMoney()-200);
								JOptionPane.showMessageDialog(frame, "You now have "+Move.player.getMoney());
								Move.move();
							}
				}
		}
	}
