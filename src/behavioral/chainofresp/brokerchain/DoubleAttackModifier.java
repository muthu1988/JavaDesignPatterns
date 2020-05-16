package behavioral.chainofresp.brokerchain;

import behavioral.chainofresp.brokerchain.Query.Argument;

public class DoubleAttackModifier extends CreatureModifier implements AutoCloseable {
	
	public int token;

	public DoubleAttackModifier(Game game, Creature creature) {
		super(game, creature);
		token = game.queries.subscribe((q) -> {
			if(q.creatureName.equals(creature.name) && q.argument.equals(Argument.ATTACK)) {
				q.result *= 2;
			}
		});
	}

	@Override
	public void close() {
		game.queries.unSubscribe(token);
	}

}
