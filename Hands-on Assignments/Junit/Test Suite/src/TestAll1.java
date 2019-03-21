import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import topic2.src.Test1;
import topic3.src.assignment1.EmployeeTest;
import topic3.src.assignment2.Demo1Test;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Test1.class,
	EmployeeTest.class,
	Demo1Test.class
})
public class TestAll1 {
}
