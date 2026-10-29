import java.util.Scanner;

class program62
{
    public static void main(String A[])
    {
        Scanner scanner =  new Scanner(System.in);
        int iValue = 0;

        Iteration8 iteration = new Iteration8();

        System.out.println("Enter the Frequency : ");
        iValue = scanner.nextInt();

        iteration.Display(iValue);
    }
}

class Iteration8
{   
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("--------------------");
            System.out.println(iCnt + " Jay Ganesh...");
            System.out.println("--------------------");
        }
    }
}   