package PRACTICE;

public class PracticeMethodArguments
{
    //defining data members
    int subtraction;

    //defining a method parsing arguments in it
    public void subtraction (int a, int b)
    {
        subtraction =a-b;
        System.out.println("Subtraction = "+ subtraction);
    }

    public static void main(String[] args)
    {
        //to call subtraction method we need to create an object
        PracticeMethodArguments sub = new PracticeMethodArguments();
        sub.subtraction(23,3);
    }
}
