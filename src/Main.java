public class Main
{
    public static void main(String[] args)
    {
        double numberA = 25.5;
        double numberB = 25.6;

        if (numberA == numberB)
        {
            System.out.println("These numbers are equal");
        }
        else if (numberA > numberB)
        {
            System.out.println("Number A is greater than Number B ");
        }
        else //Number B must be Greater than Number A
        {
            System.out.println("Number A is less than Number B");
        }
    }
}