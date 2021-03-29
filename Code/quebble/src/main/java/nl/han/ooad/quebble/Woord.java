package nl.han.ooad.quebble;

import java.util.ArrayList;
import java.util.stream.Collector;

public class Woord implements IPritableToConsole {

	private String woord;

	private boolean isCorrect;

	private WoordControleur woordControleur;

	private Letters letters;

	public Woord(String gemaaktWoord, Letters letters) {
		this.woord = gemaaktWoord;
		if (controleerWoord() && controleerLetters(letters.getLetters())){
			isCorrect = true;
		} else {
			isCorrect = false;
		}


	}

	private boolean controleerWoord() {
		return woordControleur.controleerWoordBestaat(woord);
	}

	private boolean controleerLetters(ArrayList<Character> letters) {
		return !woord.chars().mapToObj(character -> (char) character)
				.anyMatch(character -> !letters.contains(character));
	}


	/**
	 * @see IPritableToConsole#printToConsole()
	 *  
	 */
	public void printToConsole() {

	}

}
