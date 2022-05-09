package filmtar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**Dokumentumfilm objektumok met�dusainak tesztel�s�re szolg�l.*/
public class DokumentumTest {
	Dokumentumfilm f1, f2;
	
	/**Teszt objektumok l�trehoz�sa*/
	@Before
	public void setUp() {
		f1 = new Dokumentumfilm("Film1",50,2001,"test");
		f2 = new Dokumentumfilm("Film1",50,2001,"test");
	}
	
	/**getDescription() met�dus tesztel�se.*/
	@Test
	public void testDescription() {
		assertEquals("Film1.description","test",f1.getDescription());
	}
	
	/**setDescription() met�dus tesztel�se.*/
	@Test
	public void testDescriptionChange() {
		f2.setDescription("changed");
		assertNotSame("description change",f2.getDescription(),f1.getDescription());
	}

}
