import java.util.ArrayList;
/*
 * Austin Johnson 3082800
 */

public class SixCardGolf {

	public static void main(String[] args) {
		Deck newDeck = new Deck();
		ArrayList<Card> cards = new ArrayList();
		ArrayList<Hand> hands = new ArrayList();
		newDeck.shuffle();
		Hand h;
		Card cardo;
		if(newDeck.cards.size() == 52) {
			for (int i = 1; i <= 4; i++) {
				h = new Hand(cards, 6);
				System.out.println("Player " + i + ": ");
				for (int j = 0; j < 6; j++) {
					cardo = newDeck.deal();
					cards.add(cardo);
					hands.add(h);
					
				}
			System.out.println(hands.get(i));
			System.out.println(hands.get(i).evaluate());
			cards.clear();
			System.out.println("\n");
		}
			System.out.println(newDeck.evaluate());
		}
	}

}