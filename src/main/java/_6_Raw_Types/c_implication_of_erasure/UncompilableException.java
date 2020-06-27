package _6_Raw_Types.c_implication_of_erasure;

public class UncompilableException/*<T> */ extends Exception
{
    public static void main(String[] args)
    {
        try
        {
            throw new UncompilableException();
        }
        catch (UncompilableException/*<T>*/ e)
        {
            e.printStackTrace();
        }
    }
}
