import java.util.ArrayList;
/*
 * Austin Johnson 3082800
 */
import java.util.Collections;
import java.util.Random;

public class Deck extends SetOfCards{
	public Deck() {
		cards = new ArrayList();
		maxSize = 52;
		createCards();
		
		
		
		
	}
	private void createCards() {
		Card c;
		int counter  = 0;
			for(int i=0; i < Suit.values().length; i++) {
			
				for(int j = 0; j < Face.values().length; j++) {
					Face f = Face.values()[j];
					Suit s = Suit.values()[i];
					c = new Card(f, s);
						cards.add(c);
					counter++;
				}
			}
		
		if(counter > 52) {
			cards.clear();
				System.out.println("Deck size to large, can not add full set");
			}
	}
	public String evaluate() {
		int deckLeft = cards.size();
		return "Number of cards remaining in deck: "+deckLeft;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card deal() {
		Card card = cards.get(0);
			cards.remove(card);
			
		
		return card;
	}
	

}
