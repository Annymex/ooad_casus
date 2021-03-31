package nl.han.ooad.quebble.woord;

import nl.han.ooad.quebble.woord.FakeWoordControleLibrary;
import nl.han.ooad.quebble.woord.WoordControleur;

public class FakeWoordControleAdapter implements WoordControleur {

	private FakeWoordControleLibrary woordControleLibrary = new FakeWoordControleLibrary();

	public boolean controleerWoordBestaat(String woord) {
		return woordControleLibrary.isBestaandWoord(woord);
	}

}
