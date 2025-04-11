package Assignment_7;

public class Division 
{
    public static double divide(double a, double b)
    {
        //Handling ArithmeticException for divide-by-zero case
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero.");
        }
        
        return a / b;
    }
}
