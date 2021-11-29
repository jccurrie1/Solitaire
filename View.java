package solitaire;

import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	String F1;
	String F2;
	String F3;
	String F4;

	public void board(Pile pile, Tableau[] tableau, Foundation[] foundation) {
		foundationFill(foundation);
		StringBuilder sb = new StringBuilder();
		sb.append("F1    F2    F3    F4\n" + F1 + "   " + F2 + "   " + F3 + "   " + F4
				+ "\n\n1   2   3   4   5   6   7\n");
		sb.append(tableau[0].stack.peek() + " --- --- --- --- --- ---\n");
		sb.append("    " + tableau[1].stack.peek() + "\n");
		sb.append("       " + tableau[2].stack.peek() + "\n");
		sb.append("          " + tableau[3].stack.peek() + "\n");
		sb.append("            " + tableau[4].stack.peek() + "\n");
		sb.append("               " + tableau[5].stack.peek() + "\n");
		sb.append("                  " + tableau[6].stack.peek() + "\n");
		try {
			sb.append("\nWaste: " + pile.waste.peek());
		} catch (Exception exception) {
			sb.append("\nWaste: ");
		}
		System.out.println(sb);
	}

	// this methods is for filling in the foundations in the StringBuiler
	public void foundationFill(Foundation[] foundation) {
		try {
			F1 = foundation[0].stack.peek().toString();
		} catch (Exception exception) {
			F1 = "[ ]";
		}
		try {
			F2 = foundation[1].stack.peek().toString();
		} catch (Exception exception) {
			F2 = "[ ]";
		}
		try {
			F3 = foundation[2].stack.peek().toString();
		} catch (Exception exception) {
			F3 = "[ ]";
		}
		try {
			F4 = foundation[3].stack.peek().toString();
		} catch (Exception exception) {
			F4 = "[ ]";
		}
	}

	public String[] getCommand() {
		System.out.println("Command: ");
		String commandString = sc.nextLine();
		return new String[] { commandString };
	}

	public void help() {
		System.out.println("Help yourself!!");
	}

	public void move(Pile pile, Tableau[] tableau, Foundation[] foundation) {
		// this is the template for game rules.
		// if(tableau[0].canPush(tableau[0].stack.peek()) == true) {

		// }
		System.out.println("What would you like to move?");
		String pick = sc.next();
		String location = sc.next();
		try {
			if (pick.equalsIgnoreCase("D")) {
				if (pile.canPush(pile.stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					pile.stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("W") && pick.equalsIgnoreCase("W")) {
				if (pile.canPush(pile.waste.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					pile.waste.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("1")) {
				if (pile.canPush(foundation[0].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[0].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("2")) {
				if (pile.canPush(foundation[1].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[1].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("3")) {
				if (pile.canPush(foundation[2].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[2].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("4")) {
				if (pile.canPush(foundation[3].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[3].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("5")) {
				if (pile.canPush(foundation[4].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[4].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("6")) {
				if (pile.canPush(foundation[5].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[5].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("7")) {
				if (pile.canPush(foundation[6].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[6].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("F1")) {
				if (pile.canPush(foundation[0].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[0].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("F2")) {
				if (pile.canPush(foundation[1].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[1].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("F3")) {
				if (pile.canPush(foundation[2].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[2].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
		try {
			if (location.equalsIgnoreCase("F4")) {
				if (pile.canPush(foundation[3].stack.peek(), movePeek(pile, tableau, foundation, pick), location) == true) {
					foundation[3].stack.push(movePop(pile, tableau, foundation, pick));
				}
			}
		} catch (Exception exception) {
			System.out.println("You cannot move it there.");
		}
	}

	public Card movePop(Pile pile, Tableau[] tableau, Foundation[] foundation, String pick) {
		if (pick.equalsIgnoreCase("D")) {
			return pile.stack.pop();
		}
		if (pick.equalsIgnoreCase("W")) {
			return pile.waste.pop();
		}
		if (pick.equalsIgnoreCase("1")) {
			return tableau[0].stack.pop();
		}
		if (pick.equalsIgnoreCase("2")) {
			return tableau[1].stack.pop();
		}
		if (pick.equalsIgnoreCase("3")) {
			return tableau[2].stack.pop();
		}
		if (pick.equalsIgnoreCase("4")) {
			return tableau[3].stack.pop();
		}
		if (pick.equalsIgnoreCase("5")) {
			return tableau[4].stack.pop();
		}
		if (pick.equalsIgnoreCase("6")) {
			return tableau[5].stack.pop();
		}
		if (pick.equalsIgnoreCase("7")) {
			return tableau[6].stack.pop();
		}
		if (pick.equalsIgnoreCase("F1")) {
			return foundation[0].stack.pop();
		}
		if (pick.equalsIgnoreCase("F2")) {
			return foundation[1].stack.pop();
		}
		if (pick.equalsIgnoreCase("F3")) {
			return foundation[2].stack.pop();
		}
		if (pick.equalsIgnoreCase("F4")) {
			return foundation[3].stack.pop();
		}
		return null;
	}

	public Card movePeek(Pile pile, Tableau[] tableau, Foundation[] foundation, String pick) {
		if (pick.equalsIgnoreCase("D")) {
			return pile.stack.peek();
		}
		if (pick.equalsIgnoreCase("W")) {
			return pile.waste.peek();
		}
		if (pick.equalsIgnoreCase("1")) {
			return tableau[0].stack.peek();
		}
		if (pick.equalsIgnoreCase("2")) {
			return tableau[1].stack.peek();
		}
		if (pick.equalsIgnoreCase("3")) {
			return tableau[2].stack.peek();
		}
		if (pick.equalsIgnoreCase("4")) {
			return tableau[3].stack.peek();
		}
		if (pick.equalsIgnoreCase("5")) {
			return tableau[4].stack.peek();
		}
		if (pick.equalsIgnoreCase("6")) {
			return tableau[5].stack.peek();
		}
		if (pick.equalsIgnoreCase("7")) {
			return tableau[6].stack.peek();
		}
		if (pick.equalsIgnoreCase("F1")) {
			return foundation[0].stack.peek();
		}
		if (pick.equalsIgnoreCase("F2")) {
			return foundation[1].stack.peek();
		}
		if (pick.equalsIgnoreCase("F3")) {
			return foundation[2].stack.peek();
		}
		if (pick.equalsIgnoreCase("F4")) {
			return foundation[3].stack.peek();
		}
		return null;
	}
}
