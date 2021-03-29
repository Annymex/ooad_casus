package nl.han.ooad.quebble;

import java.util.ArrayList;

public class GespeeldeQuiz {

    private int datum;
    private int speelduur;
    private int score;
    private int vraagIndex;
    private QuizState quizState;
    private Woord woord;
    private Quiz quiz;
    private ArrayList<SpelerAntwoord> spelerAntwoorden;
    private ScoreBerekeningsStrategy scoreBerekening;
    private Letters letters;

    public GespeeldeQuiz(Quiz quiz) {
        this.quiz = quiz;
        this.vraagIndex = 0;
        this.quizState = QuizState.VRAGEN;
    }

    public IPritableToConsole getActie() {
        IPritableToConsole actie;
        if (quiz.heeftNogEenVraag(vraagIndex)) {
            actie = quiz.getVraag(vraagIndex);
        } else {
            letters = getLetters();
            actie = letters;
            this.quizState = QuizState.LETTERS;
        }
        return actie;
    }

    private Letters getLetters() {

        ArrayList<Character> letters = new ArrayList<>();

        spelerAntwoorden.forEach(spelerAntwoord -> {
                    if (spelerAntwoord.isCorrect()) {
                        letters.add(spelerAntwoord.getLetter());
                    }
                }
        );

        return new Letters(letters);
    }

    public void verwerkReactie(String reactie) {

        switch(quizState) {
            case VRAGEN:
                verwerkAntwoord(reactie);
                break;
            case LETTERS:
                verwerkGemaaktWoord(reactie);
                break;
            default:
                // code block
        }
    }

    private void verwerkAntwoord(String antwoord) {
        Vraag huidigeVraag = quiz.getVraag(vraagIndex);
        vraagIndex++;
        spelerAntwoorden.add(new SpelerAntwoord(antwoord, huidigeVraag));
    }

    private void verwerkGemaaktWoord(String gemaaktWoord) {
        woord = new Woord(gemaaktWoord, letters);
    }

    public int getScore() {
        return 0;
    }

}
