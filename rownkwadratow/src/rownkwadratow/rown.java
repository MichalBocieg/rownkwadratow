package rownkwadratow;
import java.lang.Math;

public class rown 
{
	public static void gen_pierw(double A, double B, double C)
	{
		double delta = B*B-4*A*C;
		double x1, x2;
		if(A==0)
		{
			System.out.println("To nie jest rownanie kwadratowe");
		}
		else if(delta>0)
		{
			x1=((-B)-Math.sqrt(delta))/2*A;
			x2=((-B)+Math.sqrt(delta))/2*A;
			System.out.println("Rozwiazaniami rownania kwadratowego sa: "+x1+" i "+x2+". ");
		}
		else if(delta==0)
		{
			x1=(-B)/(2*A);
			System.out.println("Rozwiazanie ma jeden pierwiastek podwojny: "+x1+". ");
		}
		else if(delta<0)
		{
			delta=Math.abs(delta);
			urojone u1 = new urojone();
			urojone u2 = new urojone();
			u1.setR((-B)/(2*A));
			u1.setU(Math.sqrt(delta)/(2*A));
			u2.setR((-B)/(2*A));
			u2.setU((-Math.sqrt(delta))/(2*A));
			System.out.println("Rozwiazaniami rownania kwadratowego sa: "+u1.liczbaZ()+" i "+u2.liczbaZ()+". ");
		}
	}
	public static void main(String[] args)
	{
			// test
			gen_pierw(1,2,1);
	}
}
