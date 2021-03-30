package nl.han.ooad.quebble;

import java.util.ArrayList;

public class Woord {

    private final String woord;

    private final boolean isCorrect;

    private final WoordControleur woordControleur = new FakeWoordControleAdapter();

    public Woord(String gemaaktWoord, Letters letters) {
        this.woord = gemaaktWoord;
		isCorrect = controleerWoord() && controleerLetters(letters.getLetters());
    }

    private boolean controleerWoord() {
        return woordControleur.controleerWoordBestaat(woord);
    }

    private boolean controleerLetters(ArrayList<Character> letters) {
        return !woord.chars().mapToObj(character -> (char) character)
                .anyMatch(character -> !letters.contains(character));
    }
}
