package behavioral.template;

public class Template {

	public static void main(String[] args) {
		
		Creature[] creatures = new Creature[] { new Creature(2, 3), new Creature(3, 3) };
		
		System.out.println("Template - Allows us to define the 'skeleton' of the algorithm with concrete implmentations in sub class");
	
		System.out.println("\nPermanentCardDamageGame - sub class of CardGame");
		CardGame permanentCardGame = new PermanentCardDamageGame(creatures);		
		int combat = permanentCardGame.combat(0, 1);		
		System.out.println(combat < 0 ? "Creatures are of same strength" : "Creature won is " + combat);
		
		System.out.println("\nTemporaryCardDamageGame - sub class of CardGame");
		CardGame temporaryCardDamageGame = new TemporaryCardDamageGame(creatures);		
		combat = temporaryCardDamageGame.combat(0, 1);		
		System.out.println(combat < 0 ? "Creatures are of same strength" : "Creature won is " + combat);

	}

}