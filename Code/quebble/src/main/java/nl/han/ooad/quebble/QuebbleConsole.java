package nl.han.ooad.quebble;

import java.util.Scanner;

public class QuebbleConsole {

    public static void main(String[] args) {

        String huidigeSpeler;
        QuebbleGame quebbleGame = new QuebbleGame();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef gebruikersnaam: ");
        huidigeSpeler = scanner.nextLine();

        quebbleGame.startQuebble(huidigeSpeler);

        System.out.println( System.lineSeparator() +
                "Bij meerkeuzevragen moet het antwoord overgenomen worden zonder voorafgaande letter." +
                System.lineSeparator());

        while (quebbleGame.nogEenActie(huidigeSpeler)) {
            quebbleGame.getActie(huidigeSpeler).printToConsole();
            quebbleGame.verwerkReactie(huidigeSpeler, scanner.nextLine());
        }

        System.out.println("Score: " + quebbleGame.getScore(huidigeSpeler));

    }

}

