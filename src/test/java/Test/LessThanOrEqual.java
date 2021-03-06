package Test;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

public class LessThanOrEqual<T extends Comparable<T>>extends BaseMatcher<Comparable<T>>
{
	private final Comparable<T> expectedValue;
	public LessThanOrEqual(T expectedValue)
	{
		this.expectedValue=expectedValue;
	}

	@Override
	public void describeTo(Description description)
	{
		description.appendText("less than or equal (<=)"+expectedValue);
	}

	@Override
	public boolean matches(Object t)
	{
		int compareTo=expectedValue.compareTo((T)t);
		return compareTo>-1;
	}
	@Factory
	public static <T extends Comparable<T>>
	LessThanOrEqual lessThanOrEqual(T t)
	{
		return new LessThanOrEqual(t);
	}
}
