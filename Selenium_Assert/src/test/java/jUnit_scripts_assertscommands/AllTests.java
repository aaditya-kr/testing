package jUnit_scripts_assertscommands;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AssertsTest.class, Ignore_sync_exceptionHandle_exampleTest.class })
public class AllTests {

}
