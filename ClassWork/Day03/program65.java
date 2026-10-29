import java.util.Scanner;

class program65
{
    public static void main(String A[])
    {
        Scanner scanner =  new Scanner(System.in);
        int iValue = 0;

        Iteration11 iteration = new Iteration11();

        System.out.println("Enter the Frequency : ");
        iValue = scanner.nextInt();

        iteration.Display(iValue);
    }
}

class Iteration11
{   
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.println("--------------------");
            System.out.println(iCnt + " Jay Ganesh...");
            System.out.println("--------------------");
        }
    }
}   