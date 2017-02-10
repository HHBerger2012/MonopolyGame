import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GoToJail extends Square
	{
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public GoToJail(String n, int c, int l, int o)
		{
			setName(n);
			setCost(c);
			setLocation(l);
			setOwner(o);
		}
		public static void landedOnGoToJail()
		{
			Runner.delay(200);
			JOptionPane.showMessageDialog(frame, "You landed on "+squares.get(Move.player.getPosition()).getName());
			Move.player.setPosition(10);
			Jail.landedOnJailFR();
		}
	}
