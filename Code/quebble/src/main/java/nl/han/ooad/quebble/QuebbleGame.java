package nl.han.ooad.quebble;

public class QuebbleGame {

	private QuebbleRepository repo = new QuebbleRepository();

	public void startQuebble(String username) {
		var speler = repo.getSpeler(username);
		var quiz = repo.getGeschikteQuiz(speler);
		speler.startQuiz(quiz);
	}

	public boolean nogEenActie(String username) {
		return repo.getSpeler(username).nogEenActie();
	}

	public IPritableToConsole getActie(String username) {
		return repo.getSpeler(username).getActie();
	}

	public void verwerkReactie(String username, String reactie) {
		repo.getSpeler(username).verwerkReactie(reactie);
	}

	public int getScore(String username) {
		return repo.getSpeler(username).getScore();
	}

}
