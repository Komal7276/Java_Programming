import java.util.Scanner;

class program67
{
    public static void main(String A[])
    {
        Scanner scanner =  new Scanner(System.in);
        int iValue = 0;

        Iteration13 iteration = new Iteration13();

        System.out.println("Enter the Frequency : ");
        iValue = scanner.nextInt();

        iteration.Display(iValue);
    }
}

class Iteration13
{   
    public void Display(int iNo)
    {
        int iCnt = 0;

        iCnt = 1;

        do
        {
            System.out.println("--------------------");
            System.out.println(iCnt + " Jay Ganesh...");
            System.out.println("--------------------");

            iCnt++;
            
        }while(iCnt <= iNo);
    }
}   