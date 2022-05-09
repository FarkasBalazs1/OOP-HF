package filmtar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**Csaladifilm objektumok met�dusainak tesztel�s�re szolg�l.*/
public class CsaladiTest {
	Csaladifilm f1, f2;
	
	/**Teszt objektumok l�trehoz�sa*/
	@Before
	public void setUp() {
		f1 = new Csaladifilm("Film1",120,2002,12);
		f2 = new Csaladifilm("Film1",120,2002,12);
	}
	
	/**getAgerestriction() met�dus tesztel�se.*/
	@Test
	public void testAgeRestriction() {
		assertEquals("Film1.age",12,f1.getAgeRestriction());
	}
	
	/**setAgerestriction() met�dus tesztel�se.*/
	@Test
	public void testSetAgeRestriction() {
		f2.setAgeRestriction(6);
		assertNotSame("agerestriction change",f1.getAgeRestriction(),f2.getAgeRestriction());
	}

}
