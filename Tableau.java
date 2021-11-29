package solitaire;

public class Tableau extends Pile {
	boolean isFlipped;

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < stack.size(); i++) {
			s = s + stack.get(i) + " ";
		}
		return s;
	}
}
