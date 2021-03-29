package nl.han.ooad.quebble;

import java.util.ArrayList;

public class Speler {

	private int gebruikersnaam;

	private int wachtwoord;

	private int saldo;

	private ArrayList<GespeeldeQuiz> gespeeldeQuizen;

	private GespeeldeQuiz actieveQuiz;

	public boolean checkVoldoendeSaldo(int bedrag) {
		return saldo > bedrag;
	}

	public void schrijfSaldoAf(int bedrag) {
		saldo -= bedrag;
	}

	public void startQuiz(Quiz quiz) {
		actieveQuiz = new GespeeldeQuiz(quiz);
	}

	public IPritableToConsole getActie() {
		return actieveQuiz.getActie();
	}

	public void verwerkReactie(String reactie) {
		actieveQuiz.verwerkReactie(reactie);
	}

	public int getScore() {
		return actieveQuiz.getScore();
	}

}
