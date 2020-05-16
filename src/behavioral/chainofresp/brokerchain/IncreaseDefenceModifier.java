package behavioral.chainofresp.brokerchain;

import behavioral.chainofresp.brokerchain.Query.Argument;

public class IncreaseDefenceModifier extends CreatureModifier {

	public IncreaseDefenceModifier(Game game, Creature creature) {
		super(game, creature);
		game.queries.subscribe((q) -> {
			if(q.creatureName.equals(creature.name) && q.argument.equals(Argument.DEFENCE)) {
				q.result +=3;
			}
		});
	}

}
