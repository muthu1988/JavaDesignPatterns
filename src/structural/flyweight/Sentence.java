package structural.flyweight;

import java.util.*;

public class Sentence {

	private String[] words;

	private Map<Integer,WordToken> wordTokens = new HashMap<>();

	public Sentence(String plainText) {
		words = plainText.split(" ");
	}

	public WordToken getWord(int index) {
		wordTokens.put(index, new WordToken());
		return wordTokens.get(index);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; ++i) {
			String word = words[i] + " ";
			sb.append(wordTokens.containsKey(i) && wordTokens.get(i).capitalize ? word.toUpperCase() : word);
		}
		return sb.toString().trim();
	}
}
