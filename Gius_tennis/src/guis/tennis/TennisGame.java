package guis.tennis;

public class TennisGame {

	Player player1;
	Player player2;
	boolean gameCompleted = false;
	String results;

	public TennisGame(Player player1, Player player2) {

		this.player1 = player1;

		this.player2 = player2;

		this.gameCompleted = false;

		this.results = "";
	}

	public void pointWonBy(String playerName) {

		int p1Score = Point.PointByTennisScore(this.player1.getCurrentGameScore()).getScore();

		int p2Score = Point.PointByTennisScore(player2.getCurrentGameScore()).getScore();

		if (playerName.equals(this.player1.getPlayerName())) {
			if (p1Score <=3)
				p1Score++;
			else
				p1Score = 3;

			this.player1.setCurrentGameScore(Point.PointByScore(p1Score).getTennisScore());

		} else {

			if (p2Score <=3)
				p2Score++;
			else
				p2Score = 3;

			this.player2.setCurrentGameScore(Point.PointByScore(p2Score).getTennisScore());

		}

		if (p1Score == p2Score && p1Score >= 3) {

			this.results = "Deuce ";

		} else if (p1Score <= 3 && p2Score <= 3) {

			this.results = player1.getCurrentGameScore() + "-" + player2.getCurrentGameScore();

		} else {

			advantageWonResult(p1Score, p2Score);
		}

	}

	private void advantageWonResult(int p1Score, int p2Score) {
		int minusResults = p1Score - p2Score;

		if (minusResults == 1) {

			this.results = "Advantage " + player1.getPlayerName();

		} else if (minusResults == -1) {

			this.results = "Advantage " + player2.getPlayerName();

		} else if (minusResults >= 2) {


			wonAGame(player1,player2);
		} else if (minusResults <= -2) {

			wonAGame(player2,player1);
		}
	}

	public String score() {

		return results;

	}

	public void tieGameScore(String playerName) {

		int p1Score = Integer.parseInt(this.player1.getCurrentGameScore());

		int p2Score = Integer.parseInt(this.player2.getCurrentGameScore());


		if (playerName.equals(player1.getPlayerName())) {

			p1Score++;

			player1.setCurrentGameScore(p1Score + "");

		} else {

			p2Score++;

			player2.setCurrentGameScore(p2Score + "");

		}

		if (p1Score == 7 && p2Score == p1Score) {

			this.results = "Duece";

		} else if (p1Score < 7 && p2Score < 7) {

			this.results = player1.getCurrentGameScore() + "-" + player2.getCurrentGameScore();

		} else {

			advantageWonResult(p1Score, p2Score);
		}

	}

	private void wonAGame(Player p1,Player p2) {
		p1.setSetScore(p1.getSetScore() + 1);

		p2.setCurrentGameScore(Point.ZERO.getTennisScore());

		p1.setCurrentGameScore(Point.ZERO.getTennisScore());

		gameCompleted = true;

		this.results = "";
	}

	public boolean isGameComplated() {

		return gameCompleted;

	}

}
