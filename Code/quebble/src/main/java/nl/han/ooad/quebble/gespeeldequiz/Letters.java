package nl.han.ooad.quebble.gespeeldequiz;

import nl.han.ooad.quebble.IPrintableToConsole;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Letters implements IPrintableToConsole {

	private ArrayList<Character> letters;

	public Letters(ArrayList<Character> letters) {
		this.letters = letters;
	}

	public void printToConsole() {
		var letters = this.letters.stream().map(String::valueOf).collect(Collectors.joining(" "));
		System.out.println("Maak een woord met de volgende letters: " + letters);
	}

    public ArrayList<Character> getLetters() {
		return letters;
    }

}
