
public class Item {
	public  String name;
	public int quantity;
	
	
	enum itemType{
		KEY,
		WEAPON,
		GOLD
	}
	
	public Item(String name, int quantity) 
	{
		this.name =name;
		this.quantity = quantity;
	}
	
	
}
