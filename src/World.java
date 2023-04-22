import java.util.ArrayList;
import java.util.Arrays;

public class World {
	
	String worldName;
	ArrayList<Places> places = new ArrayList<Places>();
	int location;
	
	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public World(){
	}
	
	public World(String worldName, ArrayList<Places> T) {
		super();
		this.worldName = worldName;
		this.places = T;
	}

	public String getWorldName() {
		return worldName;
	}

	public void setWorldName(String worldName) {
		this.worldName = worldName;
	}

	public ArrayList<Places> getPlaces() {
		return places;
	}

	public void setPlaces(ArrayList<Places> T) {
		this.places = T;
	}
	
	public void Build() {
		
	}
	
	
	@Override
	public String toString() {
		return "World [worldName=" + worldName + ", places=" + places + "]";
	}

	
	
	
	
	
	
}
