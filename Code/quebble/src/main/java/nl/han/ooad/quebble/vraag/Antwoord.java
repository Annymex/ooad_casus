package nl.han.ooad.quebble.vraag;

public abstract class Antwoord {

	private String antwoord;

	public Antwoord(String antwoord) {
		this.antwoord = antwoord;
	}

	public boolean isGelijk(String antwoord) {
		return antwoord.equals(this.antwoord);
	}

	public String getAntwoord() {
		return antwoord;
	}
}
