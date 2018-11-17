package Test;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FactorialParameterizedTest
{
	@Test
	@Parameters(source=FactorialDataProvider.class)
	public void factorial_test(int number,int expectedResult)throws Exception
	{
		Factorial f=new Factorial();
		Assert.assertEquals(f.factorial(number),expectedResult);
	}
}
