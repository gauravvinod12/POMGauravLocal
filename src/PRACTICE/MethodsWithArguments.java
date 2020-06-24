package PRACTICE;

public class MethodsWithArguments
{
    //defining data members
    int addition;

    //creating a method and parsing arguments in it
    public void addition(int a, int b)
    {
    addition = a+b;
    System.out.println("Addition = "+addition);
    }

    //Creating a method with name and roll num as arguments
    public void Myname(String str,int RollNo)
    {
        System.out.println("My Name is : "+str);
        System.out.println( "My Roll Number is :"+RollNo);
    }

    //Creating Array as an Argument
    //In the method "MyArray" parsing an array of type integer named "a"
    public void MyArray(int[] a)
    {
        //Printing Array
        System.out.println("Given values of array are : "+a);
        for (int i=0; i<=a.length;i++)
        {
            //sout (array name[index 0 as array is starting from 0])
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args)
    {
        // To call the addition method/function we need to create an object of the class mentioned Above
        MethodsWithArguments ob = new MethodsWithArguments();

        //Calling Method addition
        ob.addition(23,3);

        //Calling method Myname
        ob.Myname("Gaurav",24);

        //For Calling method MyArray first you need to declare an array
        //this is a single dimentional array in two ways
        //int[] arr = new int[] {10,12,14} // or below one
        int[] arr = new int[3];
        //Storing values this way
        arr[0] = 11;
        arr[1] = 13;
        arr[2] = 15;
        ob.MyArray(arr);
    }
}
