package nl.han.ooad.quebble.woord;

public class VoorbeeldWoordControleLibraryAdapter implements WoordControleur {

	private VoorbeeldWoordControleLibrary woordControleLibrary = new VoorbeeldWoordControleLibrary();

	public boolean controleerWoordBestaat(String woord) {
		return woordControleLibrary.isBestaandWoord(woord);
	}

}
