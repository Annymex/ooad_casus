package nl.han.ooad.quebble;

public class GespeeldeQuiz {

	private int datum;

	private int speelduur;

	private int score;

	private Woord woord;

	private Quiz quiz;

	private SpelerAntwoord spelerAntwoord;

	private ScoreBerekeningsStrategy scoreBerekeningsStrategy;

	private WoordControleur woordControleur;

	private Letters letters;

	public IPritableToConsole getActie() {
		return null;
	}

	private Vraag getVraag(int index) {
		return null;
	}

	private Letters getLetters() {
		return null;
	}

	public void verwerkReactie(String reactie) {

	}

	private void verwerkAntwoord(String antwoord) {

	}

	private void verwerkGemaaktWoord(String gemaaktWoord) {

	}

	public int getScore() {
		return 0;
	}

}
