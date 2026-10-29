import java.util.Scanner;

class program60
{
    public static void main(String A[])
    {
        Scanner scanner =  new Scanner(System.in);
        int iValue = 0;

        Iteration6 iteration = new Iteration6();

        System.out.println("Enter the Frequency : ");
        iValue = scanner.nextInt();

        iteration.Display(iValue);
    }
}

class Iteration6
{   
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("-------------");
            System.out.println("Jay Ganesh...");
            System.out.println("-------------");
        }
    }
}   