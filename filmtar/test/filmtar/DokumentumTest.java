package filmtar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**Dokumentumfilm objektumok metódusainak tesztelésére szolgál.*/
public class DokumentumTest {
	Dokumentumfilm f1, f2;
	
	/**Teszt objektumok létrehozása*/
	@Before
	public void setUp() {
		f1 = new Dokumentumfilm("Film1",50,2001,"test");
		f2 = new Dokumentumfilm("Film1",50,2001,"test");
	}
	
	/**getDescription() metódus tesztelése.*/
	@Test
	public void testDescription() {
		assertEquals("Film1.description","test",f1.getDescription());
	}
	
	/**setDescription() metódus tesztelése.*/
	@Test
	public void testDescriptionChange() {
		f2.setDescription("changed");
		assertNotSame("description change",f2.getDescription(),f1.getDescription());
	}

}
