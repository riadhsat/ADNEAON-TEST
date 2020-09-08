package fr.adneon.test.tu;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import fr.adneon.test.utils.Utility;

public class UtilityTest {

	@Rule
	public ExpectedException thrownException = ExpectedException.none();

	@Test
	public void partitionAvecListNullTest() throws Exception {
		thrownException.expect(Exception.class);
		thrownException.expectMessage("input parametre doit etre non nulle");
		Utility.partition(null, 4);

	}

	@Test
	public void partitionAvecTailleZeroTest() throws Exception {
		thrownException.expect(Exception.class);
		thrownException.expectMessage("taille parametre doit etre superieur à zero");

		List input = Arrays.asList(1, 2, 3);
		Utility.partition(input, 0);
	}

	@Test
	public void partitionAvecTailleNegativeTest() throws Exception {
		thrownException.expect(Exception.class);
		thrownException.expectMessage("taille parametre doit etre superieur à zero");

		List input = Arrays.asList(1, 2, 3);
		Utility.partition(input, 0);
	}

	@Test
	public void partitionAvecListVideTest() throws Exception {

		List input = Arrays.asList();
		List actualResult = Utility.partition(input, 4);

		Assert.assertEquals(Arrays.asList(), actualResult);

	}

	@Test
	public void partitionAvecTailleParamSupSizeInputTest() throws Exception {

		List input = Arrays.asList(1, 2, 3, 4);
		List actualResult = Utility.partition(input, 6);
		List expected = Arrays.asList(Arrays.asList(1, 2, 3, 4));
		Assert.assertEquals(expected, actualResult);

	}

	@Test
	public void partitionAvecTailleParamEgaleSizeInputTest() throws Exception {

		List input = Arrays.asList(1, 2, 3, 4, 5, 6);
		List actualResult = Utility.partition(input, 6);
		List expected = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6));

		Assert.assertEquals(expected, actualResult);

	}

	@Test
	public void partitionAvecTailleParamInfSizeInputTest() throws Exception {

		List input = Arrays.asList(1, 2, 3, 4, 5);
		List actualResult = Utility.partition(input, 2);
		List expected = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));

		Assert.assertEquals(expected, actualResult);

	}

}
