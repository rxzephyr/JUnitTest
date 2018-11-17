package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import Test.App;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue()
	{
		assertTrue(true);
	}

	@Test
	public void usual_op1_true_op2_true_op3_true()
	{
		boolean op1=true;
		boolean op2=true;
		boolean op3=true;
		App app=new App();
		assertTrue(app.usualLogic(op1,op2,op3));
	}

	@Test
	public void usual_op1_true_op2_true_op3_false()
	{
		boolean op1=true;
		boolean op2=true;
		boolean op3=false;
		App app=new App();
		assertTrue(app.usualLogic(op1,op2,op3));
	}

	@Test
	public void usual_op1_true_op2_false_op3_true()
	{
		boolean op1=true;
		boolean op2=false;
		boolean op3=true;
		App app=new App();
		assertTrue(app.usualLogic(op1,op2,op3));
	}

	@Test
	public void usual_op1_true_op2_false_op3_false()
	{
		boolean op1=true;
		boolean op2=false;
		boolean op3=false;
		App app=new App();
		assertFalse(app.usualLogic(op1,op2,op3));
	}

	@Test
	public void usual_op1_false_op2_true_op3_true()
	{
		boolean op1=false;
		boolean op2=true;
		boolean op3=true;
		App app=new App();
		assertTrue(app.usualLogic(op1,op2,op3));
	}

	@Test
	public void usual_op1_false_op2_true_op3_false()
	{
		boolean op1=false;
		boolean op2=true;
		boolean op3=false;
		App app=new App();
		assertFalse(app.usualLogic(op1,op2,op3));
	}

	@Test
	public void usual_op1_false_op2_false_op3_true()
	{
		boolean op1=false;
		boolean op2=false;
		boolean op3=true;
		App app=new App();
		assertTrue(app.usualLogic(op1,op2,op3));
	}

	@Test
	public void usual_op1_false_op2_false_op3_false()
	{
		boolean op1=false;
		boolean op2=false;
		boolean op3=false;
		App app=new App();
		assertFalse(app.usualLogic(op1,op2,op3));
	}




	@Test
	public void unUsual_op1_true_op2_true_op3_true()
	{
		boolean op1=true;
		boolean op2=true;
		boolean op3=true;
		App app=new App();
		assertTrue(app.unUsualLogic(op1,op2,op3));
	}

//	@Test
//	public void unUsual_op1_true_op2_true_op3_false()
//	{
//		boolean op1=true;
//		boolean op2=true;
//		boolean op3=false;
//		App app=new App();
//		assertTrue(app.unUsualLogic(op1,op2,op3));
//	}
//
//	@Test
//	public void unUsual_op1_true_op2_false_op3_true()
//	{
//		boolean op1=true;
//		boolean op2=false;
//		boolean op3=true;
//		App app=new App();
//		assertTrue(app.unUsualLogic(op1,op2,op3));
//	}
//
//	@Test
//	public void unUsual_op1_true_op2_false_op3_false()
//	{
//		boolean op1=true;
//		boolean op2=false;
//		boolean op3=false;
//		App app=new App();
//		assertFalse(app.unUsualLogic(op1,op2,op3));
//	}
//
//	@Test
//	public void unUsual_op1_false_op2_true_op3_true()
//	{
//		boolean op1=false;
//		boolean op2=true;
//		boolean op3=true;
//		App app=new App();
//		assertTrue(app.unUsualLogic(op1,op2,op3));
//	}
//
//	@Test
//	public void unUsual_op1_false_op2_true_op3_false()
//	{
//		boolean op1=false;
//		boolean op2=true;
//		boolean op3=false;
//		App app=new App();
//		assertFalse(app.unUsualLogic(op1,op2,op3));
//	}
//
//	@Test
//	public void unUsual_op1_false_op2_false_op3_true()
//	{
//		boolean op1=false;
//		boolean op2=false;
//		boolean op3=true;
//		App app=new App();
//		assertTrue(app.unUsualLogic(op1,op2,op3));
//	}
//
	@Test
	public void unUsual_op1_false_op2_false_op3_false()
	{
		boolean op1=false;
		boolean op2=false;
		boolean op3=false;
		App app=new App();
		assertFalse(app.unUsualLogic(op1,op2,op3));
	}




	@Test
	public void nested_op1_true_op2_true_op3_true()
	{
		boolean op1=true;
		boolean op2=true;
		boolean op3=true;
		App app=new App();
		assertTrue(app.nestedLogic(op1,op2,op3));
	}

	@Test
	public void nested_op1_true_op2_true_op3_false()
	{
		boolean op1=true;
		boolean op2=true;
		boolean op3=false;
		App app=new App();
		assertTrue(app.nestedLogic(op1,op2,op3));
	}

	@Test
	public void nested_op1_true_op2_false_op3_true()
	{
		boolean op1=true;
		boolean op2=false;
		boolean op3=true;
		App app=new App();
		assertTrue(app.nestedLogic(op1,op2,op3));
	}

	@Test
	public void nested_op1_true_op2_false_op3_false()
	{
		boolean op1=true;
		boolean op2=false;
		boolean op3=false;
		App app=new App();
		assertFalse(app.nestedLogic(op1,op2,op3));
	}

	@Test
	public void nested_op1_false_op2_true_op3_true()
	{
		boolean op1=false;
		boolean op2=true;
		boolean op3=true;
		App app=new App();
		assertTrue(app.nestedLogic(op1,op2,op3));
	}

	@Test
	public void nested_op1_false_op2_true_op3_false()
	{
		boolean op1=false;
		boolean op2=true;
		boolean op3=false;
		App app=new App();
		assertFalse(app.nestedLogic(op1,op2,op3));
	}

	@Test
	public void nested_op1_false_op2_false_op3_true()
	{
		boolean op1=false;
		boolean op2=false;
		boolean op3=true;
		App app=new App();
		assertTrue(app.nestedLogic(op1,op2,op3));
	}

	@Test
	public void nested_op1_false_op2_false_op3_false()
	{
		boolean op1=false;
		boolean op2=false;
		boolean op3=false;
		App app=new App();
		assertFalse(app.nestedLogic(op1,op2,op3));
	}
}
