package behavioral.chainofresp.brokerchain;

public class CreatureModifier {
	protected Game game;	
	protected Creature creature;
	public CreatureModifier(Game game, Creature creature) {
		super();
		this.game = game;
		this.creature = creature;
	}
}
