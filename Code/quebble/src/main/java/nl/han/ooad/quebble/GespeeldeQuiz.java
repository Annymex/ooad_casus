package nl.han.ooad.quebble;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class GespeeldeQuiz {

    private int datum;
    private int speelduur;
    private int vraagIndex;
    private QuizState quizState;
    private Woord woord;
    private final Quiz quiz;
    private final ArrayList<SpelerAntwoord> spelerAntwoorden;
    private final ScoreBerekeningsStrategy scoreBerekening;
    private Letters letters;

    public GespeeldeQuiz(Quiz quiz) {
        this.quiz = quiz;
        this.vraagIndex = 0;
        this.quizState = QuizState.VRAGEN;
        this.spelerAntwoorden = new ArrayList<>();
        this.scoreBerekening = new StandaardBerekeningsStrategy();
    }

    public boolean nogEenActie() {
        return !quizState.equals(QuizState.SCORE);
    }

    public IPritableToConsole getActie() {

        IPritableToConsole actie = null;

        switch (quizState) {
            case VRAGEN:
                actie = quiz.getVraag(vraagIndex);
                break;
            case LETTERS:
                actie = getLetters();
                this.quizState = QuizState.LETTERS;
                break;
        }

        return actie;
    }

    public void verwerkReactie(String reactie) {

        switch (quizState) {
            case VRAGEN:
                verwerkAntwoord(reactie);
                break;
            case LETTERS:
                verwerkGemaaktWoord(reactie);
                break;
        }
    }

    public int getScore() {
        return scoreBerekening.berekenScore(this);
    }

    private void verwerkAntwoord(String antwoord) {
        // verwerken antwoord
        Vraag huidigeVraag = quiz.getVraag(vraagIndex);
        vraagIndex++;
        spelerAntwoorden.add(new SpelerAntwoord(antwoord, huidigeVraag));
        // controleren of gamestate verandert moet worden
        if (!quiz.heeftNogEenVraag(vraagIndex)) {
            this.quizState = QuizState.LETTERS;
        }
    }

    private void verwerkGemaaktWoord(String gemaaktWoord) {
        this.woord = new Woord(gemaaktWoord, letters);
        this.quizState = QuizState.SCORE;
    }

    private Letters getLetters() {

        ArrayList<Character> letters = spelerAntwoorden.stream()
                .filter(SpelerAntwoord::isCorrect)
                .map(SpelerAntwoord::getLetter)
                .collect(Collectors.toCollection(ArrayList::new));

        return new Letters(letters);
    }
}
