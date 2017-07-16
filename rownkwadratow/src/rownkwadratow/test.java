package rownkwadratow;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class test {

	@Test
	public void testRzeczywistePodwojne()
	{
		double A=1,B=2,C=1;
		double tabtest[] = new double[4];
		
		tabtest = rown.gen_pierw(A,B,C);
		
		Assert.assertArrayEquals(new double[]{-1,0,-1,0},tabtest,0);
		fail("Not yet implemented");
	}
	@Test
	public void testRzeczywisteRozne()
	{
		double A=1,B=-4,C=-5;
		double tabtest[] = new double[4];
		
		tabtest = rown.gen_pierw(A,B,C);
		
		Assert.assertArrayEquals(new double[]{-1,0,5,0},tabtest,0);
		fail("Not yet implemented");
	}
	@Test
	public void testUrojonetylko()
	{
		double A=1,B=0,C=9;
		double tabtest[] = new double[4];
		
		tabtest = rown.gen_pierw(A,B,C);
		
		Assert.assertArrayEquals(new double[]{0,3,0,-3},tabtest,0);
		fail("Not yet implemented");
	}
	@Test
	public void testUrojone()
	{
		double A=1,B=-4,C=8;
		double tabtest[] = new double[4];
		
		tabtest = rown.gen_pierw(A,B,C);
		
		Assert.assertArrayEquals(new double[]{2,2,2,-2},tabtest,0);
		fail("Not yet implemented");
	}

}
