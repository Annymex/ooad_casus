package nl.han.ooad.quebble;

public class MeerkeuzeAntwoord extends Antwoord {

	private boolean isCorrect;

	public MeerkeuzeAntwoord(String antwoord, boolean isCorrect) {
		super(antwoord);
		this.isCorrect = isCorrect;
	}

	public boolean isCorrect(){
		return isCorrect;
	}
}
