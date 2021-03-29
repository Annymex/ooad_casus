package nl.han.ooad.quebble;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        MeerkeuzeAntwoord testAntwoord1 = new MeerkeuzeAntwoord ("fout1", false);
        MeerkeuzeAntwoord testAntwoord2 = new MeerkeuzeAntwoord ("fout2", false);
        MeerkeuzeAntwoord testAntwoord3 = new MeerkeuzeAntwoord ("fout3", false);
        MeerkeuzeAntwoord testAntwoord4 = new MeerkeuzeAntwoord ("correct", true);

        KortAntwoordVraagAntwoord testAntwoord5 = new KortAntwoordVraagAntwoord ("goed");
        KortAntwoordVraagAntwoord testAntwoord6 = new KortAntwoordVraagAntwoord ("ook goed");
        KortAntwoordVraagAntwoord testAntwoord7 = new KortAntwoordVraagAntwoord ("ook goed");

    }
}
