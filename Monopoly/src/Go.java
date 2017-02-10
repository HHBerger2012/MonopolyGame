import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Go extends Square
	{
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public Go(String n, int c, int l, int o)
		{
			setName(n);
			setCost(c);
			setLocation(l);
			setOwner(o);
		}
		public static void passedGo()
		{
			Runner.delay(200);
			JOptionPane.showMessageDialog(frame, "You Passed "+squares.get(0).getName()+"! +$200");
			Move.player.setMoney(Move.player.getMoney()+200);
		}

	}