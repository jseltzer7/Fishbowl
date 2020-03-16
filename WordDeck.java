import java.util.ArrayList;
import java.util.Random;
public class WordDeck {
	private Word word;
	private ArrayList<Word> deck;
	private int numWords; //Total number of words
	
	public WordDeck(int numWords) {
		this.numWords = numWords;
		deck = new ArrayList<Word>();
	}
	
	public void addWord(Word w) {
		deck.add(w);
	}
	
	/**
	Allow user to pull from the pile and get word to play
	**/
	public Word drawWord() {
		//int r = Random.nextInt(deck.size());
		int r = (int)(Math.random() * deck.size());
		
		return deck.remove(r);
	}
	
	
	/**
	Return how many words are left in the deck
	*/
	public int getSize() {
		return deck.size();
	}
	
	public int originalSize() {
		return numWords;
	}
	
	public Word getWord(int index) {
		return deck.get(index);
	}
	
	
	
	
	
}

