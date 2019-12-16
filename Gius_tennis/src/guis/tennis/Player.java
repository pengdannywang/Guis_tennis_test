package guis.tennis;

public class Player {
	String playerName;
	int setScore;
	String currentGameScore;

	public Player(String playerName) {
		this.playerName=playerName;
		this.setScore = 0;
		this.currentGameScore = Point.ZERO.getTennisScore();
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getSetScore() {
		return setScore;
	}

	public void setSetScore(int setScore) {
		this.setScore = setScore;
	}

	public String getCurrentGameScore() {
		return currentGameScore;
	}

	public void setCurrentGameScore(String currentGameScore) {
		this.currentGameScore = currentGameScore;
	}



	

}
