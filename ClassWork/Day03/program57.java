import java.util.Scanner;

class program57
{
    public static void main(String A[])
    {
        Scanner scanner =  new Scanner(System.in);
        int iValue = 0;

        Iteration4 iteration = new Iteration4();

        System.out.println("Enter the Frequency : ");
        iValue = scanner.nextInt();

        iteration.Display(iValue);
    }
}

class Iteration4
{   
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}   