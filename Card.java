package solitaire;

public class Card {

	private final int suit;
	private final int value;
	private final char[] cardSuit = { 'H', 'D', 'C', 'S' };
	private final String[] cardValue = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public Card(int suits, int values) {
		suit = suits;
		value = values;
	}

	@Override
	public String toString() {
		String card = cardValue[value] + "" + cardSuit[suit];
		return card;
	}
}
