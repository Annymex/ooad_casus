package nl.han.ooad.quebble;

public abstract class Antwoord {

	private String antwoord;

	public Antwoord(String antwoord) {
		this.antwoord = antwoord;
	}

	public boolean isGelijk(String antwoord) {
		if (antwoord.equals(this.antwoord)){
			return true;
		}else {
			return false;
		}
	}

	public String getAntwoord() {
		return antwoord;
	}
}
