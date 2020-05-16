package behavioral.chainofresp.mtdchain;

public class Creature {
	
	public String name;
	public int attack, defence;
	
	public Creature(String name, int attack, int defence) {
		super();
		this.name = name;
		this.attack = attack;
		this.defence = defence;
	}
	
	@Override
	public String toString() {
		return "Creature [name=" + name + ", attack=" + attack + ", defence=" + defence + "]";
	}

}
