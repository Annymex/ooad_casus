package nl.han.ooad.quebble;

import java.util.ArrayList;

public abstract class Vraag implements IPritableToConsole {

	protected String vraag;
	private boolean actief;
	private char letter;
	private Categorie categorie;
	protected ArrayList<Antwoord> antwoorden;

	public abstract boolean controleerAntwoord(String gegevenAntwoord);
	public abstract void printToConsole();

	public String getVraag() {
		return vraag;
	}

	public char getLetter() {
		return letter;
	}
}
