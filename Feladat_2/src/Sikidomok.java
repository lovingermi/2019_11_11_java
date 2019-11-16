
public class Sikidomok 
{
	private static final double PI=Math.PI;
	
	public static double getNegyzetKerulet(double a)
	{
		return 4*a;
	}
	public static double getNegyzetTerulet(double a)
	{
		return a*a;
	}
	public static double getTeglalapTerulet(double a, double b)
	{
		return a*b;
	}
	public static double getTeglalapKerulet(double a, double b)
	{
		return 2*(a+b);
	}
	public static double  getHaromszogKerulet(double a, double b, double c)
	{
		return a+b+c;
	}
	public static double getHaromszogTerulet(double a, double ma)
	{
		return a*ma;
	}

	public static  double getHaromszogTerulet_II(double a, double b, double c)
    {
            // Hérón képlet
            // https://hu.wikipedia.org/wiki/H%C3%A9r%C3%B3n-k%C3%A9plet
            double s = (a + b + c) / 2;
            double terulet = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return terulet;
    }
	public static double getKorTerulet(double r)
	{
		return Math.pow(r,2)*PI;
	}
	public static double getKorKerulet(double r)
	{
		return 2*r*PI;
	}
	public static float getParalelogrammaKerulet(float a, float b) 
	{
		return 2 * (a + b);
	}
}
