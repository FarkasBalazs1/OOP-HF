package filmtar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

<<<<<<< Updated upstream
public class DokumentumTest {
	Dokumentumfilm f1, f2;
=======
/**Dokumentumfilm objektumok metódusainak tesztelésére szolgál.*/
public class DokumentumTest {
	Dokumentumfilm f1, f2;
	
	/**Teszt objektumok létrehozása*/
>>>>>>> Stashed changes
	@Before
	public void setUp() {
		f1 = new Dokumentumfilm("Film1",50,2001,"test");
		f2 = new Dokumentumfilm("Film1",50,2001,"test");
	}
<<<<<<< Updated upstream
=======
	
	/**getDescription() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testDescription() {
		assertEquals("Film1.description","test",f1.getDescription());
	}
<<<<<<< Updated upstream
=======
	
	/**setDescription() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testDescriptionChange() {
		f2.setDescription("changed");
		assertNotSame("description change",f2.getDescription(),f1.getDescription());
	}

}
