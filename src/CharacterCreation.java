import java.util.*;

public class CharacterCreation extends Stats{

	Random rand = new Random();
	char charChoice, charChoice1, charChoice2;
	Player player;
	
	/*
	 * ===============================================================================
	 * WORLD
	 * ===============================================================================
	 */
	
	
	
	
	public CharacterCreation() {
		
		// TODO Auto-generated constructor stub
	}

	public CharacterCreation(String name) {
		player.name = name;
	}

	/*
	 * ===============================================================================
	 * PLAYER RACE
	 * ===============================================================================
	 */
	public void SetPlayerRace(Player player, Scanner scan) 
	{
		System.out.println("Now, " + player.getName() + " what race are you?\n");
		System.out.println("1. Human\n2. Elf\n3.Dwarf\n4.Orc");
		charChoice =  scan.next().charAt(0);
		
		switch(charChoice) 
		{
		case '1':
			player.setRace(player.race.HUMAN);
			System.out.println(player.getRace());
			break;
		case '2':
			player.setRace(player.race.ELF);
			System.out.println(player.getRace());
			break;
		case '3':
			player.setRace(player.race.DWARF);
			System.out.println(player.getRace());
			break;
		case '4':
			player.setRace(player.race.ORC);
			break;
		default:
			System.out.println("Start over!");	
		}	
	}
	/*
	 * ===============================================================================
	 * PLAYER CLASS
	 * ===============================================================================
	 */
	public void SetPlayerClass(Player player, Scanner scan) 
	{
		System.out.println("Choose your class:\n");
		System.out.println("1. Warrior\n2. Mage\n3. Thief");
		
		charChoice1=scan.next().charAt(0);
		switch(charChoice1) 
		{
		case '1':
			player.setClasses(player.classes.WARRIOR);
			System.out.println(player.getClasses());
			break;
		case '2':
			player.setClasses(player.classes.MAGE);
			System.out.println(player.getClasses());
			break;
		case '3':
			player.setClasses(player.classes.THIEF);
			System.out.println(player.getClasses());
			break;
		default:
			System.out.println("Start over!");
		}
	}
	public void SetPlayerStats(Player player, Scanner scan) 
	{
		System.out.println("Here are your stats!\n");
		try {
		if(player.getClasses()== player.classes.MAGE) 
		{
			player.strength = rand.nextInt(10)+1;
			player.intellegence = rand.nextInt(5,10);
			player.agility = rand.nextInt(10)+1;
			player.wisdom = rand.nextInt(5,10);	
		}
		
		if(player.getClasses()== player.classes.WARRIOR) 
		{
			player.strength = rand.nextInt(5,10);
			player.intellegence = rand.nextInt(10)+1;
			player.agility = rand.nextInt(2,8);
			player.wisdom = rand.nextInt(5,10);	
		}
		if(player.getClasses()== player.classes.THIEF) 
		{
			player.strength = rand.nextInt(10-1)+1;
			player.intellegence = rand.nextInt(10)+1;
			player.agility = rand.nextInt(5,10);
			player.wisdom = rand.nextInt(10)+1;	
		}
	
		System.out.println("Strength: " + player.getStrength()+"\nIntellegence: " + player.getIntellegence() + "\nAgility: " 
				+ player.getAgility() + "\nWisdom:" + player.getWisdom());
		}
		catch(Exception e)
		{
			System.out.println("Stats Not Set");
		}
	}
	public void getStats(Player player){
		System.out.println("Strength: " + player.getStrength()+"\nIntellegence: " + player.getIntellegence() + "\nAgility: " 
				+ player.getAgility() + "\nWisdom:" + player.getWisdom());
	}
	
}
