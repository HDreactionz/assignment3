import java.util.ArrayList;
/*
 * Austin Johnson 3082800
 */

public abstract class SetOfCards {
	protected ArrayList<Card> cards;
	protected int maxSize;
	public SetOfCards() {
		cards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	public void addCard(Card newCard){
		if(cards.size() < maxSize) {
		cards.add(newCard);
		}
	}
	public abstract String evaluate();
	
	public String toString() {
		StringBuilder set = new StringBuilder();
		set.append("[");
		for(Card c: cards) {
		set.append(c);
		set.append(" ");
		}
		set.append("]");
		return set.toString();
	}
	
}