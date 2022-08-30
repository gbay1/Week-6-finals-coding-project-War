
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player p1 = new Player("Bob");
		Player p2 = new Player("Jack");
		deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0)
				p1.draw(deck);
			else
				p2.draw(deck);
		}
			
		
		for(int i = 0; i < 26; i++) {
			Card c1 = p1.flip();
			Card c2 = p2.flip();
			if(c1.getValue() < c2.getValue())
				p2.incrementScore();
			else
				p1.incrementScore();
		}
		
		p1.describe();
		p2.describe();
		int compVal = p1.getScore() - p2.getScore();
		if(compVal < 0)
			System.out.println("Player 2");
		else if(compVal > 0)
			System.out.println("Player 1");
		else
			System.out.println("Draw");
	}
}
