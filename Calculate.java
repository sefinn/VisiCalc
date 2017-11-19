
public class Calculate 
{
	public static int square(int num)
	{
		int answer = num * num;
		return answer;
	}
	
	public static int cube(int num)
	{
		int answer = num * num * num;
		return answer;
	}
	
	public static double average(double num1, double num2)
	{	
		double answer = (num1 + num2) / 2;
		return answer;
	}

	public static double average(double num1, double num2, double num3)
	{
		double answer = (num1 + num2 + num3) / 3;
		return answer;
	}

	public static double toDegrees(double rad)
	{
		double angle = (rad * 180) / 3.14159;
		return angle;
	}
	
	public static double toRadians(double angle)
	{
		double rad = (angle * 3.14159) / 180;
		return rad;
	}

	public static double discriminant(double a, double b, double c)
	{
		double discriminant = b * b - (4 * a * c);
		return discriminant;
	}

	public static String toImproperFrac(int whole, int num, int denom)
	{
		int numerator = whole * denom + num;
		int denominator = num;
		return numerator + "/" + denominator;
	}

	public static String toMixedNum(int numer, int denom)
	{
		int whole = numer / denom;
		int numerator = numer % denom;
		int denominator = denom;
		return whole + "_" + numerator + "/" + denominator;
	}

	public static String foil(int num1, int num2, int num3, int num4, String var)
	{
		int a = num1 * num3;
		int b = (num1 * num4) + (num2 * num3);
		int c = num2 * num4;
		return a + var + "^2 + " + b + var + " + " + c;
		
	}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	









}