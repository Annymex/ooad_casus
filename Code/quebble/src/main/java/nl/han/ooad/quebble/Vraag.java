package nl.han.ooad.quebble;

import java.util.ArrayList;

public abstract class Vraag implements IPritableToConsole {

	protected String vraag;
	private boolean actief;
	private char letter;
	private Categorie categorie;
	protected ArrayList<Antwoord> antwoorden;

	public boolean controleerAntwoord(String gegevenAntwoord){
		return antwoorden.stream()
				.anyMatch( (antwoord) -> gegevenAntwoord.equals(antwoord.getAntwoord()));
	}

	public abstract void printToConsole();

	public String getVraag() {
		return vraag;
	}
}
