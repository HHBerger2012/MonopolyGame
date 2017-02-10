import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Move
	{
		static Player player = new Player(0," ",1500);
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public static void move()
		{
			Runner.delay(200);
			int choice;
			Object[] options = {"Roll", "Display Inventory"};
			ImageIcon icon =  new ImageIcon("monono.gif");
			choice = JOptionPane.showOptionDialog(null, 
				"Choose Your Action",
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
								Runner.delay(250);
								int roll=Player.tossDie();
								JOptionPane.showMessageDialog(frame, "You Rolled a "+roll);
								player.setPosition(player.getPosition()+roll);
								if (player.getPosition()>39)
									{
										player.setPosition(player.getPosition()-40);
										Go.passedGo();
										switch(player.getPosition())
											{
											case 0:
												Go.passedGo();
											case 1:
												Properties.landedOnProperty();
												break;
											case 2:
												CardSquares.landedOnCommunityChest();
												break;
											case 3:
												Properties.landedOnProperty();
												break;
											case 4:
												Tax.landedOnTax();
												break;
											case 5: 
												Railroads.landedOnRailroad();
												break;
											case 6: 
												Properties.landedOnProperty();
												break;
											case 7: 
												CardSquares.landedOnChance();
												break;
											case 8: 
												Properties.landedOnProperty();
												break;
											case 9:
												Properties.landedOnProperty();
												break;
											case 10:
												Jail.landedOnJailJustVisiting();
												break;
											case 11:
												Properties.landedOnProperty();
												break;
											case 12:
												Utilities.landedOnUtilities();
												break;
											case 13: 
												Properties.landedOnProperty();
												break;
											case 14:
												Properties.landedOnProperty();
												break;
											case 15:
												Railroads.landedOnRailroad();
												break;
											case 16:
												Properties.landedOnProperty();
												break;
											case 17:
												CardSquares.landedOnCommunityChest();
												break;
											case 18:
												Properties.landedOnProperty();
												break;
											case 19:
												Properties.landedOnProperty();
												break;
											case 20:
												FreeParking.landedOnFreeParking();
												break;
											case 21: 
												Properties.landedOnProperty();
												break;
											case 22:
												CardSquares.landedOnChance();
												break;
											case 23:
												Properties.landedOnProperty();
												break;
											case 24:
												Properties.landedOnProperty();
												break;
											case 25:
												Railroads.landedOnRailroad();
												break;
											case 26:
												Properties.landedOnProperty();
												break;
											case 27:
												Properties.landedOnProperty();
												break;
											case 28:
												Utilities.landedOnUtilities();
												break;
											case 29:
												Properties.landedOnProperty();
												break;
											case 30:
												GoToJail.landedOnGoToJail();
												break;
											case 31: 
												Properties.landedOnProperty();
												break;
											case 32:
												Properties.landedOnProperty();
												break;
											case 33: 
												CardSquares.landedOnCommunityChest();
												break;
											case 34: 
												Properties.landedOnProperty();
												break;
											case 35:
												Railroads.landedOnRailroad();
												break;
											case 36: 
												CardSquares.landedOnChance();
												break;
											case 37:
												Properties.landedOnProperty();
												break;
											case 38:
												Tax.landedOnTax();
												break;
											case 39:
												Properties.landedOnProperty();
												break;
										}
									}
								switch(player.getPosition())
								{
									case 0:
										Go.passedGo();
									case 1:
										Properties.landedOnProperty();
										break;
									case 2:
										CardSquares.landedOnCommunityChest();
										break;
									case 3:
										Properties.landedOnProperty();
										break;
									case 4:
										Tax.landedOnTax();
										break;
									case 5: 
										Railroads.landedOnRailroad();
										break;
									case 6: 
										Properties.landedOnProperty();
										break;
									case 7: 
										CardSquares.landedOnChance();
										break;
									case 8: 
										Properties.landedOnProperty();
										break;
									case 9:
										Properties.landedOnProperty();
										break;
									case 10:
										Jail.landedOnJailJustVisiting();
										break;
									case 11:
										Properties.landedOnProperty();
										break;
									case 12:
										Utilities.landedOnUtilities();
										break;
									case 13: 
										Properties.landedOnProperty();
										break;
									case 14:
										Properties.landedOnProperty();
										break;
									case 15:
										Railroads.landedOnRailroad();
										break;
									case 16:
										Properties.landedOnProperty();
										break;
									case 17:
										CardSquares.landedOnCommunityChest();
										break;
									case 18:
										Properties.landedOnProperty();
										break;
									case 19:
										Properties.landedOnProperty();
										break;
									case 20:
										FreeParking.landedOnFreeParking();
										break;
									case 21: 
										Properties.landedOnProperty();
										break;
									case 22:
										CardSquares.landedOnChance();
										break;
									case 23:
										Properties.landedOnProperty();
										break;
									case 24:
										Properties.landedOnProperty();
										break;
									case 25:
										Railroads.landedOnRailroad();
										break;
									case 26:
										Properties.landedOnProperty();
										break;
									case 27:
										Properties.landedOnProperty();
										break;
									case 28:
										Utilities.landedOnUtilities();
										break;
									case 29:
										Properties.landedOnProperty();
										break;
									case 30:
										GoToJail.landedOnGoToJail();
										break;
									case 31: 
										Properties.landedOnProperty();
										break;
									case 32:
										Properties.landedOnProperty();
										break;
									case 33: 
										CardSquares.landedOnCommunityChest();
										break;
									case 34: 
										Properties.landedOnProperty();
										break;
									case 35:
										Railroads.landedOnRailroad();
										break;
									case 36: 
										CardSquares.landedOnChance();
										break;
									case 37:
										Properties.landedOnProperty();
										break;
									case 38:
										Tax.landedOnTax();
										break;
									case 39:
										Properties.landedOnProperty();
										break;
								}
							}
					case 1:
							{
								int num=0;
								System.out.println("Inventory: ");
								for (Square s: Inventory.inventory)
									{
										num++;
										System.out.println("("+num+") "+s.getName());
									}
								System.out.println();
								Move.move();
							}
				}
			
			
		}
	}
