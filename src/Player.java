import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		score = 0;
		hand =  new ArrayList<Card>();
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Player: " + name + "\nScore: " + score);
		for(Card c : hand)
			c.describe();
	}
	
	public Card flip() {
		return hand.remove(hand.size() - 1);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
}
