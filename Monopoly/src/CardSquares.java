import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CardSquares extends Square
	{
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public CardSquares(String n, int c, int l, int o)
		{
			setName(n);
			setCost(c);
			setLocation(l);
			setOwner(o);
		}
		public static void landedOnCommunityChest()
		{
			JOptionPane.showMessageDialog(frame, "You Landed On a "+squares.get(Move.player.getPosition()).getName());
			int comChest=(int)(Math.random()*11)+1;
			switch (comChest)
			{
				case 1:
						{
					JOptionPane.showMessageDialog(frame, "Advance to "+squares.get(Move.player.getPosition()).getName()+"!");
					Move.player.setPosition(0);
					Go.passedGo();
					Move.move();
					break;
						}
				case 2:
						{
					JOptionPane.showMessageDialog(frame, "Doctor's Fee! Pay $50");
					Move.player.setMoney(Move.player.getMoney()-50);
					Move.move();
					break;
						}
				case 3:
						{
							JOptionPane.showMessageDialog(frame, "Stock Sale! You Get $50");
							Move.player.setMoney(Move.player.getMoney()+50);
							Move.move();
							break;
						}
				case 4:
						{
							JOptionPane.showMessageDialog(frame, "Go To "+squares.get(10).getName());
							Move.player.setPosition(10);
							Jail.landedOnJailFR();
							break;
						}
				case 5:
						{
							JOptionPane.showMessageDialog(frame, "Income Tax Refund! You Get $20");
							Move.player.setMoney(Move.player.getMoney()+20);
							Move.move();
							break;
						}
				case 6:
						{
							JOptionPane.showMessageDialog(frame, "Life Insurance Matures! You Get $100");
							Move.player.setMoney(Move.player.getMoney()+100);
							Move.move();
							break;
						}
				case 7:
						{
							JOptionPane.showMessageDialog(frame, "Pay Hospital Fees! Pay $100");
							Move.player.setMoney(Move.player.getMoney()-100);
							Move.move();
							break;
						}
				case 8:
						{
							JOptionPane.showMessageDialog(frame, "Pay School Tax Fees! Pay $150");
							Move.player.setMoney(Move.player.getMoney()-150);
							Move.move();
							break;
						}	
				case 9:
						{
							JOptionPane.showMessageDialog(frame, "You get $25 as a Consultancy Fee!");
							Move.player.setMoney(Move.player.getMoney()+25);
							Move.move();
							break;
						}	
				case 10:
						{
							JOptionPane.showMessageDialog(frame, "You Won 2nd Place in a Beauty Contest! You Get $50");
							Move.player.setMoney(Move.player.getMoney()+50);
							Move.move();
							break;	
						}
				case 11:
						{
							JOptionPane.showMessageDialog(frame, "You inherit $100");
							Move.player.setMoney(Move.player.getMoney()+100);
							Move.move();
							break;		
						}
			}	
		}
		public static void landedOnChance()
		{
			JOptionPane.showMessageDialog(frame, "You Landed On "+squares.get(Move.player.getPosition()).getName());
			int chance=(int)(Math.random()*10)+1;
			switch (chance)
			{
				case 1:
						{
							JOptionPane.showMessageDialog(frame, "Advance to "+squares.get(Move.player.getPosition()).getName()+"!");
							Move.player.setPosition(0);
							Go.passedGo();
							Move.move();
							break;
						}
				case 2:
						{
							JOptionPane.showMessageDialog(frame, "Advance to "+squares.get(24).getName());
							Move.player.setPosition(24);
							Properties.landedOnProperty();
							break;
						}
				case 3:
						{
							JOptionPane.showMessageDialog(frame, "Advance to "+squares.get(11).getName());
							Move.player.setPosition(11);
							Properties.landedOnProperty();
							break;
						}
				case 4:
						{
							JOptionPane.showMessageDialog(frame, "Bank Pays you $50");
							Move.player.setMoney(Move.player.getMoney()+50);
							Move.move();
							break;
						}
				case 5:
						{
							JOptionPane.showMessageDialog(frame, "Go Back Three Spaces!");
							Move.player.setPosition(Move.player.getPosition()-3);
							switch(Move.player.getPosition())
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
							break;
						}
				case 6:
						{
							JOptionPane.showMessageDialog(frame, "Go To "+squares.get(10).getName());
							Move.player.setPosition(10);
							Jail.landedOnJailFR();
							break;
						}
				case 7:
						{
							JOptionPane.showMessageDialog(frame, "Pay Poor Tax of $15");
							Move.player.setMoney(Move.player.getMoney()-15);
							Move.move();
							break;
						}
				case 8:
						{
							JOptionPane.showMessageDialog(frame, "Take a trip to "+squares.get(5).getName());
							Move.player.setPosition(5);
							Railroads.landedOnRailroad();
							break;
						}	
				case 9:
						{
							JOptionPane.showMessageDialog(frame, "Take a trip to "+squares.get(37).getName());
							Move.player.setPosition(37);
							Properties.landedOnProperty();
							break;
						}	
				case 10:
						{
							JOptionPane.showMessageDialog(frame, "You Won a Crossword Competition! You get $150");
							Move.player.setMoney(Move.player.getMoney()+150);
							Move.move();
							break;	
						}
		}
		}
	}
