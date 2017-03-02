package solved;

import org.junit.Assert;
import org.junit.Test;


public class ArrayInverterTest {

	@Test(expected = IllegalArgumentException.class)
	public void nullArgument() {
		ArrayInverter.revert(null);
	}

	@Test
	public void emptyArray() {
		int[] result = ArrayInverter.revert(new int[]{});
		int[] expected = new int[]{};
		Assert.assertEquals(expected.length, result.length);
	}

	@Test
	public void twoElements() {
		int[] result = ArrayInverter.revert(new int[]{5, 7});
		int[] expected = new int[]{7, 5};
		Assert.assertTrue(areEqual(result, expected));
	}

	@Test
	public void threeElements() {
		int[] result = ArrayInverter.revert(new int[]{5, 7, 11});
		int[] expected = new int[]{11, 7, 5};
		Assert.assertTrue(areEqual(result, expected));
	}

	@Test
	public void fourElements() {
		int[] result = ArrayInverter.revert(new int[]{5, 7, 11, 13});
		int[] expected = new int[]{13, 11, 7, 5};
		Assert.assertTrue(areEqual(result, expected));
	}

	@Test
	public void fiveElements() {
		int[] result = ArrayInverter.revert(new int[]{5, 7, 11, 13, 17});
		int[] expected = new int[]{17, 13, 11, 7, 5};
		Assert.assertTrue(areEqual(result, expected));
	}

	@Test
	public void sixElements() {
		int[] result = ArrayInverter.revert(new int[]{5, 7, 11, 13, 17, 19});
		int[] expected = new int[]{19, 17, 13, 11, 7, 5};
		Assert.assertTrue(areEqual(result, expected));
	}

	@Test
	public void sevenElements() {
		int[] result = ArrayInverter.revert(new int[]{5, 7, 11, 13, 17, 19, 21});
		int[] expected = new int[]{21, 19, 17, 13, 11, 7, 5};
		Assert.assertTrue(areEqual(result, expected));
	}

	private static boolean areEqual(int[] array1, int[] array2) {
		if (array1 == null || array2 == null)
			return false;
		if (array1.length != array2.length)
			return false;
		for (int i = 0; i < array1.length; i++)
			if (array2[i] != array1[i])
				return false;
		return true;
	}

}
