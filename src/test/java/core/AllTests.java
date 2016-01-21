/**
 *   File Name: AllTests.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 20, 2016
 *   
 */

package core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * AllTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ 
	SeleniumTest_001.class, 
	SeleniumTest_002.class, 
	SeleniumTest_003.class 
	})
public class AllTests {
}
