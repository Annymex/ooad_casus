package nl.han.ooad.quebble;

import java.util.ArrayList;
import java.util.Scanner;

public class QuebbleConsole {

	public static void main(String[] args) {

		String huidigeSpeler;
		QuebbleGame quebbleGame = new QuebbleGame();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef gebruikersnaam: ");
		huidigeSpeler = scanner.nextLine();

		quebbleGame.startQuebble(huidigeSpeler);

		while( quebbleGame.nogEenActie(huidigeSpeler) ){
			quebbleGame.getActie(huidigeSpeler).printToConsole();
			quebbleGame.verwerkReactie( huidigeSpeler, scanner.nextLine() );
		}

		System.out.println( "Score: " + quebbleGame.getScore(huidigeSpeler));

	}



}

//	ArrayList<Antwoord> antwoordenVraag1 = new ArrayList<>();
//        antwoordenVraag1.add(new MeerkeuzeAntwoord ("fout1", false));
//				antwoordenVraag1.add(new MeerkeuzeAntwoord ("fout2", false));
//				antwoordenVraag1.add(new MeerkeuzeAntwoord ("fout3", false));
//				antwoordenVraag1.add(new MeerkeuzeAntwoord ("correct", true));
//
//				ArrayList<Antwoord> antwoordenVraag2 = new ArrayList<>();
//		antwoordenVraag2.add(new KortAntwoordVraagAntwoord ("goed"));
//		antwoordenVraag2.add(new KortAntwoordVraagAntwoord ("ook goed"));
//
//		ArrayList<Antwoord> antwoordenVraag3 = new ArrayList<>();
//		antwoordenVraag3.add(new KortAntwoordVraagAntwoord ("goed"));
//
//		MeerkeuzeVraag vraag1 = new MeerkeuzeVraag(antwoordenVraag1);
//		KortAntwoordVraag vraag2 = new KortAntwoordVraag(antwoordenVraag2);
//		KortAntwoordVraag vraag3 = new KortAntwoordVraag(antwoordenVraag3);
