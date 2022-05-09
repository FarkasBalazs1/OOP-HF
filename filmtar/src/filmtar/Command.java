package filmtar;

import java.util.ArrayList;

/** A parancsok interface �soszt�lya, a parancsok �ltal �r�k�lt absztrakt met�dusokat tartalmazza.*/
public interface Command {
	
	/** Absztrakt met�dus, a lesz�rmazottak implement�lj�k.*/
	public abstract String getName();
	
	/** Absztrakt met�dus, a lesz�rmazottak implement�lj�k.*/
	public abstract void action(String[] cmd, ArrayList<Filmek> l) throws Exception;
}
