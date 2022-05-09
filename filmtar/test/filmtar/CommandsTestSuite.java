package filmtar;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**A Command típusú objektumok test suite-ja.*/
@RunWith (Suite.class)
@Suite.SuiteClasses ({
	AddTest.class,
	DeleteTest.class,
	ListTest.class,
	LoadTest.class,
	UpdateTest.class
})
public class CommandsTestSuite {

}
