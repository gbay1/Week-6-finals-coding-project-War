import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
		String[] suites = {
				"Hearts",
				"Diamonds",
				"Spades",
				"Clubs"
		};
		String[] names = {
				"Ace",
				"Two",
				"Three",
				"Four",
				"Five",
				"Six",
				"Seven",
				"Eight",
				"Nine",
				"Ten",
				"Jack",
				"Queen",
				"King"
		};
		
		for(String suite : suites) {
			int value = 2;
			for(String name : names) {
				Card c = new Card();
				c.setName(name + " of " + suite);
				c.setValue(value++);
				cards.add(c);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(cards.size() - 1);	
	}
}

