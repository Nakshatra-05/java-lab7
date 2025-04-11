package Assignment_7;

public class Sqroot 
{
    public static double squareRoot(double a) 
    {
        if(a < 0){
            throw new ArithmeticException("Cannot calculate square root of a negative number.");
        }

        return Math.sqrt(a);
    }
}
