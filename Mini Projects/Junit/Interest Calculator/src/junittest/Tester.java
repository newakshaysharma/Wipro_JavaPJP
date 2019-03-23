package junittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestFDAccount.class,
	TestRDAccount.class,
	TestSBAccount.class
})

public class Tester {

}
