////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : sumEvenNumbers
//  Function Name : sumEvenNumbers
//  Description :   Used to calculate the sum of all even numbers up to a given limit.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class sumEvenNumbers
{
    void sumEvenNumbers(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Sum of even numbers up to " + iNo + " is: " + iSum);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_1
{
    public static void main(String args[])
    {
        sumEvenNumbers obj = new sumEvenNumbers();
        obj.sumEvenNumbers(10);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10      Output : Sum of even numbers up to 10 is: 30
//
////////////////////////////////////////////////////////////////////////////////