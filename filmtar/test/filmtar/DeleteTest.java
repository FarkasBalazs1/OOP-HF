package filmtar;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

<<<<<<< Updated upstream
=======
/**Delete osztály metódusainak tesztelésére szolgál*/
>>>>>>> Stashed changes
public class DeleteTest {
	static ArrayList<Filmek> l = new ArrayList<Filmek>();
	static ArrayList<Filmek> l2 = new ArrayList<Filmek>();
	static Filmek f1, f2, f3, f4, f5, f6;
	Command c = new Delete();
<<<<<<< Updated upstream
=======
	
	/**Tesztobjektumok létrehozása és listák feltöltése*/
>>>>>>> Stashed changes
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		f1 = new Film("F",110,2000);
		f2 = new Csaladifilm("CS", 140, 2000, 12);
		f3 = new Dokumentumfilm("D", 50, 2000, "test");
		f4 = new Film("F",110,2000);
		f5 = new Csaladifilm("CS", 140, 2000, 12);
		f6 = new Dokumentumfilm("D", 50, 2000, "test");
		l.add(f1);
		l.add(f2);
		l.add(f3);
		l2.add(f4);
		l2.add(f5);
		l2.add(f6);
	}
<<<<<<< Updated upstream

=======
	
	/**Az action() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testAction() throws Exception{
		String a1 = "delete 1";
		String a2 = "delete 5";
		String[] s1 = a1.split(" ");
<<<<<<< Updated upstream
		String[] s2 = a1.split(" ");
=======
		String[] s2 = a2.split(" ");
>>>>>>> Stashed changes
		c.action(s1, l);
		Object[] t1 = l.toArray();
		Object[] t2 = l2.toArray();
		assertNotEquals(t1, t2);
		c.action(s2, l);
		
	}
<<<<<<< Updated upstream
=======
	
	/**A getName() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testGetName() {
		assertEquals("delete name","delete",c.getName());
	}

}
