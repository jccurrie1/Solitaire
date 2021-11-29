package solitaire;

public class Solitaire {
	private final int NUM_TABLEAUS = 7;
	private final int NUM_FOUNDATIONS = 4;
	Pile pile = new Pile();
	View view = new View();
	Tableau[] tableau = new Tableau[NUM_TABLEAUS];
	Foundation[] foundation = new Foundation[NUM_FOUNDATIONS];
	boolean gameOver = false;

	// the plan is to distribute all cards through the controller constructor
	Solitaire() {
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = new Tableau();
		}
		for (int i = 0; i < foundation.length; i++) {
			foundation[i] = new Foundation();
		}
		// this distributes all of the cards to deck(stack)
		for (int a = 0; a <= 3; a++) {
			for (int b = 0; b <= 12; b++) {
				pile.stack.push(new Card(a, b));
				pile.shuffle();
			}
		}
		// distributes cards to rightful tableau
		for (int i = 0; i != 28; i++) {
			if (i == 1) {
				tableau[0].stack.push(pile.stack.pop());
			}
			if (i == 2 || i == 3) {
				tableau[1].stack.push(pile.stack.pop());
			}
			if (i == 4 || i == 5 || i == 6) {
				tableau[2].stack.push(pile.stack.pop());
			}
			if (i == 7 || i == 8 || i == 9 || i == 10) {
				tableau[3].stack.push(pile.stack.pop());
			}
			if (i == 11 || i == 12 || i == 13 || i == 14 || i == 15) {
				tableau[4].stack.push(pile.stack.pop());
			}
			if (i == 16 || i == 17 || i == 18 || i == 19 || i == 20 || i == 21) {
				tableau[5].stack.push(pile.stack.pop());
			}
			if (i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27 || i == 28) {
				tableau[6].stack.push(pile.stack.pop());
			}
			
		}
	}

	public void board() {
		view.board(pile, tableau, foundation);
	}

	public boolean isGameOver() {
		if (winningMove() == true) {
			return true;
		}
		return false;
	}

	public void gameLoop() {
		while (isGameOver() == false && gameOver == false) {
			board();
			executeCommand();
		}
	}

	public void help() {
		view.help();
	}

	public void move() {
		view.move(pile, tableau, foundation);
	}

	public void executeCommand() {
		String[] words = view.getCommand();
		if (words[0].equalsIgnoreCase("Quit")) {
			gameOver = true;
		}
		if (words[0].equalsIgnoreCase("Help")) {
			help();
		}
		if (words[0].equalsIgnoreCase("MOVE")) {
			move();
		}
	}

	public boolean winningMove() {
		if (foundation[0].stack.size() == 13 && foundation[1].stack.size() == 13 && foundation[2].stack.size() == 13
				&& foundation[3].stack.size() == 13) {
			return true;
		} else {
			return false;
		}
	}

	public void movePop() {
		view.movePop(pile, tableau, foundation, null);
	}

	public static void main(String[] args) {
		Solitaire game = new Solitaire();
		game.gameLoop();

	}
}
