package nl.han.ooad.quebble.vraag;

public class MeerkeuzeAntwoord extends Antwoord {

    private final boolean isCorrect;

    public MeerkeuzeAntwoord(String antwoord, boolean isCorrect) {
        super(antwoord);
        this.isCorrect = isCorrect;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    @Override
    public String toString() {
        return this.getAntwoord();
    }
}
