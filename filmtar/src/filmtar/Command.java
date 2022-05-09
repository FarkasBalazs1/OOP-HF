package filmtar;

import java.util.ArrayList;

/** A parancsok interface õsosztálya, a parancsok által örökölt absztrakt metódusokat tartalmazza.*/
public interface Command {
	
	/** Absztrakt metódus, a leszármazottak implementálják.*/
	public abstract String getName();
	
	/** Absztrakt metódus, a leszármazottak implementálják.*/
	public abstract void action(String[] cmd, ArrayList<Filmek> l) throws Exception;
}
