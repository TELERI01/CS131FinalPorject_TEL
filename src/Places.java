import java.util.ArrayList;


public class Places extends World{
	
	Shop shop;
	Tavern tavern;
	String placeName;
	String flavorText;
	Item item;
	String itemName;
	

	public Places() {}
	
	public Places(String placeName, String flavorText, Item item) {
		super();
		this.placeName = placeName;
		this.flavorText = flavorText;
		this.item = item;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	public Shop getShop() {
		return shop;
	}

	@Override
	public String toString() {
		return  placeName +"\n"+ flavorText +"\n";
	}
	
	
	
	
	
	
	
	
}
