package nl.han.ooad.quebble;

public class FakeAdapter implements WoordControleur {

	private WoordControleLibrary woordControleLibrary;

	public boolean controleerWoordBestaat(String woord) {
		return false;
	}

}
