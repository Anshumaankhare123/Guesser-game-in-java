import java.util.Scanner;

class guesser {
	int guessnumber;

	int guessthenumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser guess the number ");
		System.out.println();
		guessnumber = sc.nextInt();
		return guessnumber;

	}
}

class player {
	int pgussernum;

	int playergussthenumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("player guess the number");
		System.out.println();
		pgussernum = sc.nextInt();
		return pgussernum;
	}
}

class umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int j;

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
	public void countandmacth(){
		for(j=0y;j<3;j++){
			umpire u = new umpire();
		    u.collectNumFromGuesser();
		    u.collectNumFromPlayer();
		    u.compare();
			System.out.println();
		}

	}
}

public class game {

	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("-------------------------Guesser Game-------------------------");
		System.out.println();
		int i=1;
		String m;
		Scanner sc =new Scanner(System.in);
		while ( i==1) {
			System.out.println("------do you want to play the Guesser game Y/N:-----------");
			System.out.println();
			m=sc.nextLine();
			switch (m) {
				case "y":
				umpire um=new umpire();
				um.countandmacth();
			    break;

			    case "n":
				i++;
				System.out.println("Game out");
			    break;
				default:
				System.out.println("you choise is wrong:-");
				break;
			}
		    
		}
		
		
		System.out.println();
		System.out.println("-------------------------Guesser Game developed by Anshumaan khare-------------------------");
	}

}