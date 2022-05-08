package filmtar;

import java.util.ArrayList;

public class Update implements Command{
	public String getName() { return "update"; }
	public void action(String[] cmd, ArrayList<Filmek> l) {
		for(int i = 0; i< l.size(); i++) {
			if(l.get(i).getId() == Integer.valueOf(cmd[1])) {
				l.get(i).setTitle(cmd[2]);
				l.get(i).setLength(Integer.valueOf(cmd[3]));
				l.get(i).setYear(Integer.valueOf(cmd[4]));
				if(l.get(i).getClass().toString().equals("class filmtar.Csaladifilm")) {
					Csaladifilm f = (Csaladifilm)l.get(i);
					f.setAgeRestriction(Integer.valueOf(cmd[5]));
					l.set(i, f);
				}
				else if(l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm")) {
					Dokumentumfilm f = Dokumentumfilm.class.cast(l.get(i));
					f.setDescription(cmd[5]);
					l.set(i, f);
				}
			}
		}
	}

}
