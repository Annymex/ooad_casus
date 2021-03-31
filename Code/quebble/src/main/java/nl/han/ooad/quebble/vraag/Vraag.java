package nl.han.ooad.quebble.vraag;

import nl.han.ooad.quebble.IPrintableToConsole;
import nl.han.ooad.quebble.vraag.Antwoord;
import nl.han.ooad.quebble.vraag.Categorie;

import java.util.ArrayList;

public abstract class Vraag implements IPrintableToConsole {

	protected String vraag;
	private boolean actief;
	private char letter;
	private Categorie categorie;
	protected ArrayList<Antwoord> antwoorden;

	public Vraag(String vraag, char letter, ArrayList<Antwoord> antwoorden) {
		this.vraag = vraag;
		this.letter = letter;
		this.antwoorden = antwoorden;
		categorie = null;
		actief = true;
	}

	public abstract boolean controleerAntwoord(String gegevenAntwoord);
	public abstract void printToConsole();

	public String getVraag() {
		return vraag;
	}

	public char getLetter() {
		return letter;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
}
