import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FreeParking extends Square
	{	
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public FreeParking(String n, int c, int l, int o)
		{
			setName(n);
			setCost(c);
			setLocation(l);
			setOwner(o);
		}
		public static void landedOnFreeParking()
		{
			Runner.delay(200);
			JOptionPane.showMessageDialog(frame, "You landed on "+squares.get(Move.player.getPosition()).getName());
			Move.move();
		}
	}
