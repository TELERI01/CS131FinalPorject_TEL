
import java.util.*;

public class Game {
	
	
	public static void main(String[] args)
	{
		
		String stringChoice, stringChoice1;
		char charChoice, charChoice1, charChoice2;
		boolean quit =false;
		
		Scanner scan = new Scanner(System.in);
		Player player = new Player();
		CharacterCreation creator = new CharacterCreation();
		
		/*
		 * =================================================================================
		 * World Builder
		 * =================================================================================
		 */
		Item sword = new Item("Sword", 1);
		Item gold = new Item("Gold", 22);
		
		Item[]shop1items = {sword,sword, gold};
		
		
		Shop shop1 = new Shop("The Warstead Trader Post",shop1items);
		

		Location Riverwood= new Location("Riverwood", "You awaken in the village of Riverwood, a road lies north and south is a mountain!", sword);
		Location Northpath = new Location ("Northpath", "The road is long, rolling green hills to your left and right, another town lies north, Riverwood still lies to the South",sword);
		Location Havenfall = new Location ("Havenfall", "The town of Havenfall is small, sitting cozily under the cliff of Mount Warstead. North is the Farpath.",sword);
		Location Warstead1 = new Location ("Foot of Warstead", "At the bottom of the great giant of Polaris, you see a village sitting on a ridge just up ahead, whilst behind you lie Havenfall.",null);
		Village Warstead2 = new Village ("Warstead Keep", "You arrive in the cozy village of Warstead, sitting strong and sound in the mountain breeze. You see many villagers, a shop and tavern",shop1, null,sword);
		
		World polaris = new World();
		polaris.places.add(Riverwood);
		polaris.places.add(Northpath);
		polaris.places.add(Havenfall);
		polaris.places.add(Warstead1);
		polaris.places.add(Warstead2);
		//System.out.println(polaris.getPlaces());
		
		
		
		
		
		System.out.println("==========Faraway==========\n");
		System.out.println("Welcome to the world of Polaris\nWhat is your name?");
		player.setName(scan.nextLine());
		System.out.println(player.getName());
		
		/*
		 * =================================================================================
		 * Character Creation Methods
		 * =================================================================================
		 */
		
		
		creator.SetPlayerRace(player, scan);
		creator.SetPlayerClass(player, scan);
		creator.SetPlayerStats(player, scan);
		System.out.println(polaris.places.get(0));
		
		int travel = 0;
		
		
		
		do {
			System.out.println("=====" + polaris.places.get(travel).placeName+"=====");
			System.out.println(polaris.places.get(travel).flavorText);
			System.out.println("Controls:\nNorth\nSouth\nPickup\nShow Stats\nExit");
			var currentPlace = polaris.places.get(travel);
			
			stringChoice = scan.next();
			
			switch(stringChoice) 
			{
			case "North":
				travel = travel+1;
				break;
			case "South":
				travel = travel-1;
				break;
			case "Pickup":
				player.Pickup(currentPlace);
				break;
			case "Inventory":
				player.getInventory();
				break;
			case "Stats":
				creator.getStats(player);
				break;
			case "Shop":
				var shop = currentPlace.getShop();
				System.out.println(shop.shopName);
				shop.getItems();
				
				
				break;
			case "Quit":
				System.exit(0);
				break;
			}
			
			
			/*
			if(stringChoice.equals("North")) {
				travel = travel+1;
				System.out.println(travel);
			}
			if(stringChoice.equals("South")) {
				travel = travel-1;
			}
			
			else if (stringChoice.equals("Quit")) {
				System.exit(0);
			}
		*/
		}while(stringChoice !="Quit");
		
		/*do {
			
			
			System.out.println("==========Faraway==========\n");
			
			stringChoice = scan.nextLine();
			switch(stringChoice) 
			{
			case "North":
				System.out.println(it.next());
				break;
			case "South":
				System.out.println(it.previous());
			default:
				System.out.println("Invalid Option");
				break;
			
			
			
			}	
			
		}while(stringChoice != "Quit");*/
		
	}
	
}
