package guis.tennis;

import java.util.ArrayList;
import java.util.List;

public class Match {
TennisSet ts;
List<TennisGame> tennisGames = new ArrayList<TennisGame>();
Player player1;
Player player2;



public Match(String playerName1, String playerName2) {
	player1=new Player(playerName1);
	player2=new Player(playerName2);
	ts = new TennisSet(player1, player2);
	
}

  public void score() {
	  System.out.println( ts.score());
  }
  public void pointWonBy(String playerName) {
	  ts.pointWonBy(playerName);
  }
}
