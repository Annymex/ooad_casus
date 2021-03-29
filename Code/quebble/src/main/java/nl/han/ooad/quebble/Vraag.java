public class Vraag implements IPritableToConsole {

	private boolean actief;

	private char letter;

	private Quiz[] quiz;

	private Letter letter;

	private Categorie categorie;

	public boolean controleerAntwoord(String antwoord) {
		return false;
	}


	/**
	 * @see IPritableToConsole#printToConsole()
	 *  
	 */
	public void printToConsole() {

	}

}
