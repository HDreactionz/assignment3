import java.util.ArrayList;
/*
 * Austin Johnson 3082800
 */

public class Hand extends SetOfCards{
	
	
	public Hand() {
		maxSize = 6;
	}
	
	public Hand(ArrayList<Card> cards, int maxSize) {
		this.maxSize = maxSize;
		this.cards = cards;
	}
	
	
	public String evaluate() {
		int total = 0;
		for(int i = 0; i < maxSize; i++) {
			 Card cc = cards.get(i);
			 
			 int num = cc.getFace().getPoints();
			 total += num;
			 
		}
		if(cards.get(0).getFace() == cards.get(3).getFace()) {
			 if(cards.get(0).getFace().equals("2")) {
				 total = total + 4;
			 }
			 else {
				 total = total - (cards.get(0).getFace().getPoints())*2;
			 }
		 }
		 if(cards.get(1).getFace() == cards.get(4).getFace()) {
			 if(cards.get(1).getFace().equals("2")) {
				 total = total + 4;
			 }
			 else {
				 total = total - (cards.get(1).getFace().getPoints())*2;
			 }
		 }
		 
		 if(cards.get(2).getFace() == cards.get(5).getFace()) {
			 if(cards.get(2).getFace().equals("2")) {
				 total = total + 4;
			 }
			 else {
				 total = total - (cards.get(2).getFace().getPoints())*2;
			 }
		 }
		return "Score: "+total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < maxSize; i++) {
			if(i == maxSize/2) {
				sb.append("\n");
			}
			sb.append(cards.get(i)+ "\t");
		}
		return sb.toString();
	}

}