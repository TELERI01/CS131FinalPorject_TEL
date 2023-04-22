import java.util.*;

public class Shop extends Village {
	String shopName;
	Item[] items;
	
	public Shop(String shopName, Item[] items) {
		super();
		this.shopName = shopName;
		this.items = items;
		}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public void getItems() {
		for (int i = 0; i< items.length; i++) {
			System.out.println(items[i].name);
		}
	}

	public void setItems(Item[] items) {
		this.items = items;
	}
	
	
	
}
