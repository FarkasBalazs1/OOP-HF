package filmtar;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
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
