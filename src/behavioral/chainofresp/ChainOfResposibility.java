package behavioral.chainofresp;

import behavioral.chainofresp.brokerchain.Game;
import behavioral.chainofresp.brokerchain.IncreaseDefenceModifier;
import behavioral.chainofresp.mtdchain.Creature;
import behavioral.chainofresp.mtdchain.CreatureModifier;
import behavioral.chainofresp.mtdchain.DoubleAttackModifier;
import behavioral.chainofresp.mtdchain.DoubleDefenceModifier;
import behavioral.chainofresp.mtdchain.NoBonusModifier;

public class ChainOfResposibility {
		
	public static void main(String[] args) {
		
		System.out.println("Chain of resposibility - Method Chain");
		Creature godzilla = new Creature("Godzilla", 2, 2);
		System.out.println("Creature Modifier takes a next modifier as itself and does a chain opertaion");
		CreatureModifier creatureModifier = new CreatureModifier(godzilla);
		System.out.println("Added 2 modifiers as a chain operation");
		creatureModifier.add(new DoubleDefenceModifier(godzilla));
		creatureModifier.add(new DoubleAttackModifier(godzilla));
		creatureModifier.add(new NoBonusModifier(godzilla));
		creatureModifier.handle();
		System.out.println(godzilla);
		
		System.out.println("\nChain of resposibility - Broker Chain");
		Game game = new Game();
		behavioral.chainofresp.brokerchain.Creature strongCreature = new behavioral.chainofresp.brokerchain.Creature(game, "Strong Creature", 2, 2);
		System.out.println(strongCreature);
		
		IncreaseDefenceModifier idm = new IncreaseDefenceModifier(game, strongCreature);
		behavioral.chainofresp.brokerchain.DoubleAttackModifier dam = new behavioral.chainofresp.brokerchain.DoubleAttackModifier(game, strongCreature);
		System.out.println(strongCreature);
		dam.close();
		System.out.println(strongCreature);
		

	}
	
}

