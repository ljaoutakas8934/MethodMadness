public class TestFile
{


    public static void main(String args[])
    {
        System.out.println("isFibonnaci(3):");
        System.out.println(LjaoutakasLib.isFibonnaci(3));
        System.out.println("isFibonnaci(4):");
        System.out.println(LjaoutakasLib.isFibonnaci(4));
            //isFibonacci of a
        System.out.println("quadSolver(x^2+x+20):");
        System.out.println(LjaoutakasLib.quadSolver(1,1,20));
            // An equation with imaginary roots
        System.out.println("quadSolver(x^2+x-20):");
        System.out.println(LjaoutakasLib.quadSolver(1,1,-20));
            // An equation with real roots
    }

}
