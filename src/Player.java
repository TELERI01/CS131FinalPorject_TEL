import java.util.ArrayList;

public class Player extends CharacterCreation{
	
	String name;
	classes classes;
	race race;
	ArrayList<Item> inventory = new ArrayList<Item>() ;	
	
	
	
	public enum classes 
	{
		WARRIOR,
		MAGE,
		THIEF
	};
	public enum race{
		HUMAN,
		ELF,
		ORC,
		DWARF
	}
	
	public Player() {
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setRace(race race) {
		this.race = race;
	}

	public Player.race getRace() {
		return race;
	}
	

	public classes getClasses() {
		return classes;
	}

	public void setClasses(classes classes) {
		this.classes = classes;
	}

	public void getInventory() {
		for (int i = 0; i< inventory.size(); i++) {
			System.out.println(inventory.get(i).name);
		}
		
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
	
	public void Pickup(Places place) {
		if (place.item == null) {
			System.out.println("No items here!");
		}
		else {
		inventory.add(place.item);
		System.out.println("You picked up " + place.item.name);
		place.setItem(null);
		}
		
	}
	

	@Override
	public String toString() {
		return "Player [name=" + name + ", classes=" + classes + ", race=" + race + ", inventory=" + inventory + "]";
	}
	
	
};
	
	

	
	
	
	
	
	
	
	
	

