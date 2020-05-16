package behavioral.chainofresp.mtdchain;

public class DoubleDefenceModifier extends CreatureModifier {
	
	public DoubleDefenceModifier(Creature creature) {
		super(creature);
	}
	
	@Override
	public void handle() {
		System.out.println("Doubling defence for " + creature.name);
		creature.defence *= 2;
		super.handle();
	}

}
