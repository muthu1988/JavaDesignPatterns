package behavioral.chainofresp.mtdchain;

public class DoubleAttackModifier extends CreatureModifier {

	public DoubleAttackModifier(Creature creature) {
		super(creature);
	}
	
	@Override
	public void handle() {
		System.out.println("Doubling attack for " + creature.name);
		creature.attack *= 2;
		super.handle();
	}

}
