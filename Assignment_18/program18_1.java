////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : checkPrime
//  Function Name : checkPrime
//  Description :   It is used to check whether a given number is prime or not
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class checkPrime
{
    void checkPrime(int iNo)
    {
        int iCnt = 0;
        boolean isPrime = true;

        if(iNo <= 1)
        {
            isPrime = false;
        }
        else
        {
            for(iCnt = 2; iCnt <= iNo / 2; iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
        {
            System.out.println(iNo + " is a Prime number.");
        }
        else
        {
            System.out.println(iNo + " is NOT a Prime number.");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program18_1
{
    public static void main(String args[])
    {
        checkPrime obj = new checkPrime();
        obj.checkPrime(11);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 11      Output : 11 is a Prime number.
//
////////////////////////////////////////////////////////////////////////////////