import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Runner 
	{	
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public static void main(String[] args)
			{
				Introduction.intro();				
			}
		public static void delay(int time)
		{
			try{Thread.sleep(time);} catch (InterruptedException e){e.printStackTrace();}
		}
	}