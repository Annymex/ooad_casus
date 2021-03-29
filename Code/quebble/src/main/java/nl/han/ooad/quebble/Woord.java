public class Woord implements IPritableToConsole {

	private String woord;

	private boolean isCorrect;

	private Letter[] letter;

	private WoordControleur woordControleur;

	private Letters letters;

	private boolean controleerWoord() {
		return false;
	}

	private boolean controleerLetters(Letters letters) {
		return false;
	}


	/**
	 * @see IPritableToConsole#printToConsole()
	 *  
	 */
	public void printToConsole() {

	}

}
