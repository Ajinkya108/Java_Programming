////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : CalculateSum
//  Function Name : CalculateSum
//  Description :   It is used to calculate the sum of first 'n' natural numbers
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class CalculateSum
{
    void CalculateSum(int n)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        System.out.println("Sum of first " + n + " numbers is : " + iSum);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class Program16_1
{
    public static void main(String args[])
    {
        CalculateSum obj = new CalculateSum();
        obj.CalculateSum(10);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10
//  Output : Sum of first 10 numbers is : 55
//
////////////////////////////////////////////////////////////////////////////////