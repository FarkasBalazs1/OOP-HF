package filmtar;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

<<<<<<< Updated upstream
=======
/**Load osztály metódusainak tesztelésére szolgál*/
>>>>>>> Stashed changes
public class LoadTest {
	static ArrayList<Filmek> l = new ArrayList<Filmek>();
	static ArrayList<Filmek> l2 = new ArrayList<Filmek>();
	static Filmek f1, f2, f3;
	Command c = new Load();
<<<<<<< Updated upstream

=======
	
	/**Tesztobjektumok létrehozása és lista feltöltése*/
>>>>>>> Stashed changes
	@BeforeClass
	public static void setUpBeforeClass() {
		f1 = new Film("Avatar", 162, 2009);
		f2 = new Dokumentumfilm("Life_in_the_Undergrowth", 50, 2005, "A_study_of_the_evolution_and_habits_of_invertebrates.");
		f3 = new Csaladifilm("The_Lion_King", 118, 2019, 6);
		l2.add(f1);
		l2.add(f2);
		l2.add(f3);
	}
<<<<<<< Updated upstream

=======
	
	/**Az action() metódus tesztelése nem létezõ fájlra.*/
>>>>>>> Stashed changes
	@Test(expected = IOException.class)
	public void testActionFileNotFound() throws Exception {
		String a1 = "load test.txt";
		String[] s1 = a1.split(" ");
		c.action(s1, l);
	}
<<<<<<< Updated upstream

=======
	
	/**Az action() metódus tesztelése hibás formátumú elemeket tartalmazó fájlra.*/
>>>>>>> Stashed changes
	@Test(expected = Exception.class)
	public void testActionWrongFileFormat() throws Exception {
		String a1 = "load testerror.txt";
		String[] s1 = a1.split(" ");
		c.action(s1, l);
	}
<<<<<<< Updated upstream
=======
	
	/**Az action() metódus tesztelése ideális körülmények között.*/
>>>>>>> Stashed changes
	@Test
	public void testAction() throws Exception{
		String a1 = "load testok.txt";
		String[] s1 = a1.split(" ");
		c.action(s1, l);
		assertEquals(l.get(0).toString(), l2.get(0).toString());
		assertEquals(l.get(1).toString(), l2.get(1).toString());
		assertEquals(l.get(2).toString(), l2.get(2).toString());
	}
<<<<<<< Updated upstream
=======
	
	/**A getName() metódus tesztelése.*/
	@Test
	public void testGetName() {
		assertEquals("load name","load",c.getName());
	}
>>>>>>> Stashed changes

}
