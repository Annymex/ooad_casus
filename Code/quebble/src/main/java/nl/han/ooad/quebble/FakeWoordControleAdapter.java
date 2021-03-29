package nl.han.ooad.quebble;

public class FakeWoordControleAdapter implements WoordControleur {

	private FakeWoordControleLibrary fakeWoordControleLibrary;

	public boolean controleerWoordBestaat(String woord) {
		return false;
	}

}
