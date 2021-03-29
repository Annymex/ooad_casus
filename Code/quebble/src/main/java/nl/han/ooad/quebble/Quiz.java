package nl.han.ooad.quebble;

import java.util.ArrayList;

public class Quiz {

	private ArrayList<Vraag> vragen;

	public Quiz(ArrayList<Vraag> vragen) {
		this.vragen = vragen;
	}

	public boolean heeftNogEenVraag (int index){
		return vragen.size() > index;
	}

	public Vraag getVraag(int index) {
		return vragen.get(index);
	}

}
