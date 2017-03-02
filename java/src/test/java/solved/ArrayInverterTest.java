package solved;

import org.junit.Test;


public class ArrayInverterTest {

    //exemplary test
	@Test(expected = IllegalArgumentException.class)
	public void nullArgument() {
		ArrayInverter.revert(null);
	}


}
