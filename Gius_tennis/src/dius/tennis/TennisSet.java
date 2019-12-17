package dius.tennis;

import java.util.ArrayList;
import java.util.List;

public class TennisSet {
	List<TennisGame> tennisGames = new ArrayList<TennisGame>();
	Player player1;
	Player player2;
	boolean isSetCompleted;
	TennisGame currentTennisGame;

	public TennisSet(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		currentTennisGame = new TennisGame(player1, player2);
		this.isSetCompleted = false;

	}

	public String score() {
		if (!"".equals(this.currentTennisGame.score())) {
			return player1.getSetScore() + "- " + player2.getSetScore() + "," + this.currentTennisGame.score();
		} else {
			return player1.getSetScore() + "- " + player2.getSetScore();
		}

	}

	public void pointWonBy(String playerName) {

	if (player1.getSetScore() <= 5 && player2.getSetScore() <= 5) {
		
			this.currentTennisGame.pointWonBy(playerName);
		
			if (this.currentTennisGame.isGameComplated()) {
				this.tennisGames.add(currentTennisGame);
			}
		} else if (player1.getSetScore() == 6 && player2.getSetScore() == 6) {
		
			this.currentTennisGame.tieGameScore(playerName);
			
			if (this.currentTennisGame.isGameComplated()) {
				
				this.tennisGames.add(currentTennisGame);
				
				this.currentTennisGame =  new TennisGame(player1, player2);
				
				this.isSetCompleted = true;
			}
		} else {
			
			this.currentTennisGame.pointWonBy(playerName);
			
			int minusSetResults = Math.abs(player1.getSetScore() - player2.getSetScore());

			if (minusSetResults >= 2 && this.currentTennisGame.isGameComplated()) {
			
				this.tennisGames.add(currentTennisGame);
				
				this.currentTennisGame =  new TennisGame(player1, player2);
				
				this.isSetCompleted = true;
			
				
			}
		}

	}

}
