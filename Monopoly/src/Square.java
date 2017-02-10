
import java.util.ArrayList;
public class Square
	{
		protected String name;
		protected int cost;
		protected int location;
		protected int owner;
		static ArrayList<Square>squares=new ArrayList<Square>();
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getCost()
	{
		return cost;
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public int getLocation()
	{
		return location;
	}
	public void setLocation(int location)
	{
		this.location=location;
	}
	public int getOwner()
	{
		return owner;
	}
	public void setOwner(int owner)
	{
		this.owner=owner;
	}
	
	public static void fillStandardBoard()
	{
		squares.add(new Go("GO",0,0,0));
		squares.add(new Properties("Mediterranean Avenue","Brown",60,1,10,30,90,160,250,50,0));
		squares.add(new CardSquares("Community Chest",0,2,0));
		squares.add(new Properties("Baltic Avenue","Brown",60,3,20,60,180,320,450,50,0));
		squares.add(new Tax("INCOME TAX",200,4,0));
		squares.add(new Railroads("Reading Railroad","Black",200,5,0));
		squares.add(new Properties ("Oriental Avenue","Light Blue",100,6,30,90,270,400,550,50,0));
		squares.add(new CardSquares("Chance",0,7,0));
		squares.add(new Properties ("Vermont Avenue","Light Blue",100,8,30,90,200,400,550,50,0));
		squares.add(new Properties ("Connecticut Avenue","Light Blue",120,9,40,100,300,450,600,50,0));
		squares.add(new Jail("Jail",0,10,0));
		squares.add(new Properties ("St. Charles Place","Purple",140,11,50,150,450,625,750,100,0));
		squares.add(new Utilities("Electric Company","none",150,12,0));
		squares.add(new Properties("States Avenue", "Purple", 140, 13, 50, 150, 450, 625, 750, 100, 0));
		squares.add(new Properties("Virginia Avenue", "Purple", 160, 14, 60, 180, 500, 700, 900, 100, 0));
		squares.add(new Railroads("Pennsylvania Railroad", "Black", 200, 15, 0));
		squares.add(new Properties("St. James Place", "Orange", 180, 16, 70, 200, 550, 750, 950, 100, 0));
		squares.add(new CardSquares("Community Chest", 0, 17, 0));
		squares.add(new Properties("Tennesseee Avenue", "Orange", 180, 18, 70, 200, 550, 750, 950, 100, 0));
		squares.add(new Properties("New York Avenue", "Orange", 200, 19, 80, 220, 600, 800, 1000, 100, 0));
		squares.add(new FreeParking("Free Parking", 0, 20, 0));
		squares.add(new Properties("Kentucky Avenue", "Red", 220, 21, 90, 250, 700, 875, 1050, 150, 0));
		squares.add(new CardSquares("Chance", 0, 22, 0));
		squares.add(new Properties("Indiana Avenue", "Red", 220, 23, 90, 250, 700, 875, 1050, 150, 0));
		squares.add(new Properties("Illinois Avenue", "Red", 240, 24, 100, 300, 750, 925, 1100, 150, 0));
		squares.add(new Railroads("B. & O. Railroad", "Black", 200, 25, 0));
		squares.add(new Properties("Atlantic Avenue", "Yellow", 260, 26, 110, 330, 800, 975, 1150, 150, 0));
		squares.add(new Properties("Ventnor Avenue", "Yellow", 260, 27, 110, 330, 800, 975, 1150, 150, 0));
		squares.add(new Utilities("Water Works", "none", 150, 28, 0));
		squares.add(new Properties("Marvin Gardens", "Yellow", 280, 29, 120, 360, 850, 1025, 1200, 150, 0));
		squares.add(new GoToJail("Go to Jail", 0, 30, 0));
		squares.add(new Properties("Pacfic Avenue", "Green", 300, 31, 130, 390, 900, 1100, 1275, 200, 0));
		squares.add(new Properties("North Carolina Avenue", "Green", 300, 32, 130, 390, 900, 1100, 1275, 200, 0));
		squares.add(new CardSquares("Community Chest", 0, 33, 0));
		squares.add(new Properties("Pennsylvania Avenue", "Green", 320, 34, 150, 450, 1000, 1200, 1400, 200, 0));
		squares.add(new Railroads("Short Line", "Black", 200, 35, 0));
		squares.add(new CardSquares("Chance", 0, 36, 0));
		squares.add(new Properties("Park Place", "Dark Blue", 350, 37, 175, 500, 1100, 1300, 1500, 200, 0));
		squares.add(new Tax("Luxury Tax", 0, 38, 0));
		squares.add(new Properties("Boardwalk", "Dark Blue", 400, 39, 200, 600, 1400, 1700, 2000, 200, 0));
	}
	public static void fillColoradoBoard()
	{
		squares.add(new Go("Trailhead",0,0,0));
		squares.add(new Properties("Mt. Sherman","Brown",60,1,10,30,90,160,250,50,0));
		squares.add(new CardSquares("Trail Fortune",0,2,0));
		squares.add(new Properties("Quandary Peak","Brown",60,3,20,60,180,320,450,50,0));
		squares.add(new Tax("CO Fourteeners Initiative",200,4,0));
		squares.add(new Railroads("LittleBear-Blance 14er Traverse","Black",200,5,0));
		squares.add(new Properties ("Mr. Bierstadt","Light Blue",100,6,30,90,270,400,550,50,0));
		squares.add(new CardSquares("Go for an Adventure",0,7,0));
		squares.add(new Properties ("Torreys Peak","Light Blue",100,8,30,90,200,400,550,50,0));
		squares.add(new Properties ("Grays Peak","Light Blue",120,9,40,100,300,450,600,50,0));
		squares.add(new Jail("Basecamp",0,10,0));
		squares.add(new Properties ("Mt. Yale","Purple",140,11,50,150,450,625,750,100,0));
		squares.add(new Utilities("Pikes Peak","none",150,12,0));
		squares.add(new Properties("Mt. Princeton", "Purple", 140, 13, 50, 150, 450, 625, 750, 100, 0));
		squares.add(new Properties("Mt. Harvard", "Purple", 160, 14, 60, 180, 500, 700, 900, 100, 0));
		squares.add(new Railroads("Crestones 14er Traverse", "Black", 200, 15, 0));
		squares.add(new Properties("Humboldt Peak", "Orange", 180, 16, 70, 200, 550, 750, 950, 100, 0));
		squares.add(new CardSquares("Trail Fortune", 0, 17, 0));
		squares.add(new Properties("Mt. Lindsey", "Orange", 180, 18, 70, 200, 550, 750, 950, 100, 0));
		squares.add(new Properties("Kit Carson Peak", "Orange", 200, 19, 80, 220, 600, 800, 1000, 100, 0));
		squares.add(new FreeParking("Scenic Viewpoint", 0, 20, 0));
		squares.add(new Properties("Mt. Sneffels", "Red", 220, 21, 90, 250, 700, 875, 1050, 150, 0));
		squares.add(new CardSquares("Go for an Adventure", 0, 22, 0));
		squares.add(new Properties("Uncompahgre Peak", "Red", 220, 23, 90, 250, 700, 875, 1050, 150, 0));
		squares.add(new Properties("Mt. Eolus", "Red", 240, 24, 100, 300, 750, 925, 1100, 150, 0));
		squares.add(new Railroads("Wilson-El Diente 14er Traverse", "Black", 200, 25, 0));
		squares.add(new Properties("Mount of the Holy Cross", "Yellow", 260, 26, 110, 330, 800, 975, 1150, 150, 0));
		squares.add(new Properties("Mt. Massive", "Yellow", 260, 27, 110, 330, 800, 975, 1150, 150, 0));
		squares.add(new Utilities("Mt. Evans (14er Toll Road)", "none", 150, 28, 0));
		squares.add(new Properties("Mt. Elbert", "Yellow", 280, 29, 120, 360, 850, 1025, 1200, 150, 0));
		squares.add(new GoToJail("Go to Basecamp", 0, 30, 0));
		squares.add(new Properties("Castle Peak", "Green", 300, 31, 130, 390, 900, 1100, 1275, 200, 0));
		squares.add(new Properties("Snowmass Mountain", "Green", 300, 32, 130, 390, 900, 1100, 1275, 200, 0));
		squares.add(new CardSquares("Trail Fortune", 0, 33, 0));
		squares.add(new Properties("Pyramid Peak", "Green", 320, 34, 150, 450, 1000, 1200, 1400, 200, 0));
		squares.add(new Railroads("Maroon Bells 14er Traverse", "Black", 200, 35, 0));
		squares.add(new CardSquares("Go for an Adventure", 0, 36, 0));
		squares.add(new Properties("Longs Peak", "Dark Blue", 350, 37, 175, 500, 1100, 1300, 1500, 200, 0));
		squares.add(new Tax("You Lost a Boot", 0, 38, 0));
		squares.add(new Properties("Capitol Peak", "Dark Blue", 400, 39, 200, 600, 1400, 1700, 2000, 200, 0));
	}
	
}