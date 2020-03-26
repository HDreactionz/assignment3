public class Card {
	private Suit suit;
	private Face face;
	
	public Card(Face face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public Face getFace() {
		return face;
	}
	
	public String toString() {
		return face.getFace()+ "" + suit.getSuit();
	}
}