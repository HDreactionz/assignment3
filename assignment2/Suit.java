public enum Suit {
	Clubs('\u2663'), Spades('\u2660'), Hearts('\u2665'), Diamonds('\u2666');
	private char unicode;
	
	private Suit(char unicode) {
		this.unicode = unicode;
	}
	
	public char getSuit() {
		return unicode;
	}
	
}