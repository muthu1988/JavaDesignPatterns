package structural.facade;

public class Facade {
	
	public static void main(String[] args) {
		
		System.out.println("Object created by creating all base objects");
		MyCharacter g = new MyCharacter('g');
		MyCharacter o = new MyCharacter('o');
		MyCharacter d = new MyCharacter('d');
		MyCharacter[] good = new MyCharacter[] {g,o,o,d};
		MyCharacter[] god = new MyCharacter[] {g,o,d};
		Word word = new Word(good);Word word1 = new Word(god);
		Sentence sentence = new Sentence(new Word[] {word, word1});
		
		System.out.println("Object created by facade - without creating base objects");
		Sentence sentence2 = Sentence.newSentence(10);
		
	}

}
