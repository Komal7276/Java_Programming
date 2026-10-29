import java.util.Scanner;

class program58
{
    public static void main(String A[])
    {
        Scanner scanner =  new Scanner(System.in);
        int iValue = 0;

        Iteration5 iteration = new Iteration5();

        System.out.println("Enter the Frequency : ");
        iValue = scanner.nextInt();

        iteration.Display(iValue);
    }
}

class Iteration5
{   
    public void Display(int iNo)
    {
        int iCnt = 0;

        //input filter
        if(iNo <= 0)
        {
            System.out.println("Invalid input");
            
            return; //Function return type is void so thee is no noeed to write anything font of return
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}   