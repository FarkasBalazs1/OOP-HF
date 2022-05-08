package filmtar;

import java.util.ArrayList;

public interface Command {
	public abstract String getName();
	public abstract void action(String[] cmd, ArrayList<Filmek> l) throws Exception;
}
