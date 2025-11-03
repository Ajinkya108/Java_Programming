////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : sumEvenOddDigits
//  Function Name : sumEvenOddDigits
//  Description :   It is used to calculate the sum of even and odd digits of a given number
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class sumEvenOddDigits
{
    void sumEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Sum of even digits: " + iEvenSum);
        System.out.println("Sum of odd digits: " + iOddSum);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program18_4
{
    public static void main(String args[])
    {
        sumEvenOddDigits obj = new sumEvenOddDigits();
        obj.sumEvenOddDigits(123456);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 123456
//  Output : Sum of even digits: 12
//           Sum of odd digits: 9
//
////////////////////////////////////////////////////////////////////////////////