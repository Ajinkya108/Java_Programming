////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : countFactors
//  Function Name : countFactors
//  Description :   Counts the total number of factors of a given number.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class countFactors
{
    void countFactors(int iNo)
    {
        int iCnt = 0;
        int count = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                count++;
            }
        }

        System.out.println("Total number of factors of " + iNo + " is: " + count);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
////////////////////////////////////////////////////////////////////////////////

class program21_4
{
    public static void main(String args[])
    {
        countFactors obj = new countFactors();
        obj.countFactors(20);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 20  Output : 6  (Factors: 1, 2, 4, 5, 10, 20)
//
////////////////////////////////////////////////////////////////////////////////