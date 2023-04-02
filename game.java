import java.util.Scanner;

class guesser {
	int guessnumber;

	int guessthenumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser guess the number ");
		guessnumber = sc.nextInt();
		return guessnumber;

	}
}


class player {
	int pgussernum;

	int playergussthenumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("player guess the number");
		pgussernum = sc.nextInt();
		return pgussernum;
	}
}


class umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;


	public void collectNumFromGuesser() {
		guesser g = new guesser();
		numFromGuesser = g.guessthenumber();

	}


	public void collectNumFromPlayer() {
		player p1 = new player();
		player p2 = new player();
		player p3 = new player();

		numFromPlayer1 = p1.playergussthenumber();
		numFromPlayer2 = p2.playergussthenumber();
		numFromPlayer3 = p3.playergussthenumber();
	}


	void compare() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game tied all three players guessed correctly");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player2 won the game");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 and Player3 won ");
			} else {
				System.out.println("player 1 guess the right number");
			}

		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player 3 won the game");
			} else {
				System.out.println("player 2 guess the right number");
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("player 3 guess the right number");
		} else {
			System.out.println("you guess the wrong number");
		}
	}
}


public class game {

	public static void main(String[] args) {
		umpire u = new umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}