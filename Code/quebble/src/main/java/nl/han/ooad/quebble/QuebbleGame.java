package nl.han.ooad.quebble;

public class QuebbleGame {

	private Speler[] speler;

	private Quiz[] quiz;
	private QuebbleRepository repo;

	public void startQuebble(String username) {

	}

	public boolean nogEenActie(String username) {
		Speler speler = repo.getSpeler(username);
		speler.nogEenActie();
	}

	public IPritableToConsole getActie(String username) {
		return null;
	}

	public void verwerkReactie(String username, String reactie) {

	}

	public int getScore(String username) {
		return 0;
	}

	private Speler getSpeler(String username) {
		return null;
	}

	private Quiz selecteerGeschikteQuiz(Speler speler) {
		return null;
	}

}
