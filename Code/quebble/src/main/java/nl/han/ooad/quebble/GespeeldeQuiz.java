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


	private SpelerAntwoord spelerAntwoord;
	private ScoreBerekeningsStrategy scoreBerekeningsStrategy;
	private Letters letters;


	public GespeeldeQuiz(Quiz quiz) {
		this.quiz = quiz;
		this.vraagIndex = 0;
		this.quizState = QuizState.VRAGEN;
	}


	public IPritableToConsole getActie() {
		IPritableToConsole actie;
		switch(quizState){
			case VRAGEN:
				actie = quiz.getVraag(vraagIndex);
				break;
			case LETTERS:
				actie = getLetters();
				break;
			default:
				actie = null;
		}
		return actie;
	}




	private Vraag getVraag(int index) {
		return null;
	}

	private Letters getLetters() {
		return null;
	}

	public void verwerkReactie(String reactie) {

	}

	private void verwerkAntwoord(String antwoord) {

	}

	private void verwerkGemaaktWoord(String gemaaktWoord) {

	}

	public int getScore() {
		return 0;
	}

}
