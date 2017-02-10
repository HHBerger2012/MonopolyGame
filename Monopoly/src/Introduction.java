import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Introduction
	{
		
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public static void intro()
		{
			int choice;
			Object[] options = {"Start Game", "Learn Rules"};
			ImageIcon icon =  new ImageIcon("36963.gif");
			choice = JOptionPane.showOptionDialog(null, 
				"Welcome to Monopoly",
				"Monopoly",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(choice)
				{
					case 0:
							{
								chooseBoard();
							}
					case 1:
							{
								int choice1;
								Object[] options1 = {"Start Game"};
								ImageIcon icon1 =  new ImageIcon("newinstec.jpg");
								choice = JOptionPane.showOptionDialog(null, 
									"",
									"Monopoly",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.QUESTION_MESSAGE, 
									icon1,
									options1,
									options1[0]);
									switch(choice)
									{
										case 0:
												{
													chooseBoard();
												}
										case 1:
												{
													chooseBoard();
												}
									}
							}
				}
		}
		public static void chooseBoard()
		{
			int choice;
			Object[] options = {"Standard Board", "Colorado 14'er Board"};
			ImageIcon icon =  new ImageIcon("10101.jpg");
			choice = JOptionPane.showOptionDialog(null, 
				"Choose Which Board You Want",
				"Monopoly",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(choice)
				{
					case 0:
							{
								Square.fillStandardBoard();
								Move.move();
							}
					case 1:
							{
								Square.fillColoradoBoard();
								Move.move();
							}
				}
		}
	}
