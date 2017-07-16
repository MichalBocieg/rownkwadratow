package rownkwadratow;
import java.lang.Math;

public class rown 
{
	public static double[] gen_pierw(double A, double B, double C) //nie dziala bez static
	{
		double delta = B*B-4*A*C;
		double x[]={0,0,0,0};
		if(A==0)
		{
			System.out.println("To nie jest rownanie kwadratowe");
		}
		else if(delta>0)
		{
			x[0]=((-B)-Math.sqrt(delta))/2*A;
			x[2]=((-B)+Math.sqrt(delta))/2*A;
			System.out.println("Rozwiazaniami rownania kwadratowego sa: "+x[0]+" i "+x[2]+". ");
		}
		else if(delta==0)
		{
			x[0]=x[2]=(-B)/(2*A);
			System.out.println("Rozwiazanie ma jeden pierwiastek podwojny: "+x[0]+". ");
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
			x[0]=u1.R;
			x[1]=u1.U;
			x[2]=u2.R;
			x[3]=u2.U;
			System.out.println("Rozwiazaniami rownania kwadratowego sa: "+u1.liczbaZ()+" i "+u2.liczbaZ()+". ");
		}
		return x;
	}
}
