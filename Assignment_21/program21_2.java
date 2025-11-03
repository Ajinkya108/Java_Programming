////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : countEvenOddRange
//  Function Name : countEvenOddRange
//  Description :   Counts how many even and odd numbers exist between 1 and the given number.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class countEvenOddRange
{
    void countEvenOddRange(int iNo)
    {
        int iCnt = 0;
        int evenCount = 0;
        int oddCount = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("Count of even numbers between 1 and " + iNo + " is: " + evenCount);
        System.out.println("Count of odd numbers between 1 and " + iNo + " is: " + oddCount);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
////////////////////////////////////////////////////////////////////////////////

class program21_2
{
    public static void main(String args[])
    {
        countEvenOddRange obj = new countEvenOddRange();
        obj.countEvenOddRange(50);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 50   Output : Even = 25, Odd = 25
//
////////////////////////////////////////////////////////////////////////////////