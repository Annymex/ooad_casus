package nl.han.ooad.quebble;

import java.util.ArrayList;

public class Quiz {

	private ArrayList<Vraag> vragen;

	public Quiz(ArrayList<Vraag> vragen) {
		this.vragen = vragen;
	}

	public boolean heeftNogEenVraag (int index){
		if (vragen.size() > index){
			return true;
		} else {
			return false;
		}
	}

	public Vraag getVraag(int index) {
		return vragen.get(index);
	}

}
