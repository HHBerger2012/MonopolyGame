import java.util.ArrayList;

public class Inventory
	{
		static ArrayList<Square>inventory=new ArrayList<Square>();
		
		public static void addProperty()
		{
			inventory.add(new Properties(Square.squares.get(Move.player.getPosition()).getName(), null, Square.squares.get(Move.player.getPosition()).getCost(), 0, 0, 0, 0, 0, 0, 0, 0));
		}
		public static void addRailroad()
		{
			inventory.add(new Railroads(Square.squares.get(Move.player.getPosition()).getName(), null, Square.squares.get(Move.player.getPosition()).getCost(), 0, 0));
		}
	}
