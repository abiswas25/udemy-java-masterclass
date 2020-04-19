/**
 * 
 */
package udemy.java.masterclass;

/**
 * @author abviper25
 *
 */
public class MethodsChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		displayHighScorePosition("John Doe", calculateHighScorePosition(1500));
		displayHighScorePosition("Jane Doe", calculateHighScorePosition(900));
		displayHighScorePosition("Tim Buchalka", calculateHighScorePosition(400));
		displayHighScorePosition("Anuvab Biswas", calculateHighScorePosition(50));

	}
	
	public static void displayHighScorePosition(String playerName, int playerPosition) {
		System.out.println(playerName + 
				" managed to get into position " + 
				playerPosition + 
				" on the high score table");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500) {
			return 2;
		} else if (playerScore >= 100) {
			return 3;
		} else {
			return 4;
		}
	}

}
