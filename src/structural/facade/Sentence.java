package structural.facade;

public class Sentence {
	
	public int numberOfLines;
	
	public Word[] words;
	
	public Sentence(Word[] words) {
		this.words = words;
	}
	
	public static Sentence newSentence(int numberOfLines) {
		MyCharacter[] characters = new MyCharacter[] {};
		Word[] Words = new Word[] {new Word(characters)};
		Sentence sentence = new Sentence(Words);
		return sentence;
	}

}
