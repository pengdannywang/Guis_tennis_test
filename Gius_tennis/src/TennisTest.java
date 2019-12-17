import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import guis.tennis.Match;

/**
 * 
 */

/**
 * @author pengwang
 *
 */
class TennisTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	//@Test
	void test() {
		Match match = new Match("player 1", "player 2");
		  match.pointWonBy("player 1");
		  match.pointWonBy("player 2");
		  // this will return "0-0, 15-15"
		  match.score();

		  match.pointWonBy("player 1");
		  match.pointWonBy("player 1");
		  // this will return "0-0, 40-15"
		  match.score();
		  
		  match.pointWonBy("player 2");
		  match.pointWonBy("player 2");
		  // this will return "0-0, Deuce"
		  match.score();
		  
		  match.pointWonBy("player 1");
		  // this will return "0-0, Advantage player 1"
		  match.score();
		  
		  match.pointWonBy("player 1");
		  // this will return "1-0"
		  match.score();
		 
	}
	//@Test
	public void SevenToFive() {
		Match match = new Match("player 1", "player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();

		assertEquals("0- 0,Deuce ",match.getScore());
		
		
	}
	@Test
	public void TieGamesTest() {
		Match match = new Match("player 1", "player 2");
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		
		
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
	}

}
