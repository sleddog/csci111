/**
 * Second Java Program (error example).
 * 
 */
public class Example2
{
    public static void main(String[] args)
    {
        System.out.println("Begin Countdown");
        int x = 3;
        
        while(x > 0)    // change > 0 to < 4 for a runtime error.
        {
            System.out.println(x);
            x = x - 1;
        }
        System.out.println("Go!");
    }
}
