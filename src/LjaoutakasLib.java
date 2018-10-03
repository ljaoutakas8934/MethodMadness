public class LjaoutakasLib
{
    public static String quadSolver(double a, double b, double c)
    {
        if (Math.pow(b,2)-4*a*c > 0 )
        {
            double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            return ( String.valueOf(root1) + ","  + String.valueOf(root2) );
        }
        else
        {
            return ("The roots are imaginary");
        }
    }
}
