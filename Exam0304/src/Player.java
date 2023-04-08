
public class Player {
	
	String name;
	  int wickets;
	  String role;
	  
 
	  public Player(String name, int wickets, String role) {
		this.name = name;
		this.wickets = wickets;
		this.role = role;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", wickets=" + wickets + ", role=" + role + "]";
	}  
}
	