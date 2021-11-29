package solitaire;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThrows;

import java.util.Collections;
import java.util.Stack;

import org.junit.Test;

public class Pile {
	Stack<Card> waste = new Stack<Card>();
	Stack<Card> stack = new Stack<Card>();
	boolean isFlipped;

	// put game rules in this class maybe a boolean method.

	public boolean canPush(Card cardPick, Card cardLocation, String location) {
		if (location.equalsIgnoreCase("1") || location.equalsIgnoreCase("2") || location.equalsIgnoreCase("3")
				|| location.equalsIgnoreCase("4") || location.equalsIgnoreCase("5") || location.equalsIgnoreCase("6")
				|| location.equalsIgnoreCase("7")) {

		}
		if (location.equalsIgnoreCase("F1") || location.equalsIgnoreCase("F2") || location.equalsIgnoreCase("F3")
				|| location.equalsIgnoreCase("F4")) {
			if (cardLocation.toString().equalsIgnoreCase("AH")) {
				if (cardPick.toString().equalsIgnoreCase("2H")) {
					return true;
				}
			}
			if (cardLocation.toString().equalsIgnoreCase("AD")) {
				if (cardPick.toString().equalsIgnoreCase("2D")) {
					return true;
				}
			}
			if (cardLocation.toString().equalsIgnoreCase("AC")) {
				if (cardPick.toString().equalsIgnoreCase("2C")) {
					return true;
				}
			}
			if (cardLocation.toString().equalsIgnoreCase("AS")) {
				if (cardPick.toString().equalsIgnoreCase("2S")) {
					return true;
				}
			}
		}

		return false;
	}

	public void push(Card card) {
		stack.push(card);
	}

	public void pop(Card card) {
		stack.remove(card);
	}

	public Card peek() {
		return stack.get(0);
	}

	public void shuffle() {
		Collections.shuffle(stack);
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < stack.size(); i++) {
			s = s + stack.get(i) + " ";
		}
		return s;
	}

	@Test
	public void testFoundationAce() {
		Pile pile = new Pile();
		assertEquals(true, pile.canPush(new Card(0, 1), new Card(0, 0), "F1"));
	}
}