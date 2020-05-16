package behavioral.chainofresp.brokerchain;

public class Creature {
	
	public Game game;
	public String name;
	public int baseAttack, baseDefece;
	public Creature(Game game, String name, int baseAttack, int baseDefece) {
		super();
		this.game = game;
		this.name = name;
		this.baseAttack = baseAttack;
		this.baseDefece = baseDefece;
	}
	
	public int getAttack() {
		Query q = new Query(name, Query.Argument.ATTACK, baseAttack);
		game.queries.fire(q);
		return q.result;
	}
	
	public int getDefence() {
		Query q = new Query(name, Query.Argument.DEFENCE, baseDefece);
		game.queries.fire(q);
		return q.result;
	}

	@Override
	public String toString() {
		return "Creature [name=" + name + ", attack=" + getAttack() + ", defece=" + getDefence() + "]";
	}
}
