public class LjaoutakasLib
{
    public static Boolean isFibonnaci(int n)
    {
        Boolean output = false;
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        while(num3<n)
        {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            if (num3 == n)
            {
                output = true;
            }
        }
        return output;
    }
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
    public static String vigCipher(String msg, String key)
    {
        String enc = "";
        msg = msg.toLowerCase();
        key = key.toLowerCase();

        for (int i = 0; i < msg.length(); i++)
        {

        }
        return enc;
    }
}
