////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : findSmallestDigit
//  Function Name : findSmallestDigit
//  Description :   Used to find the smallest digit from the given number.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class findSmallestDigit
{
    void findSmallestDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 9;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Smallest digit is: " + iMin);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_5
{
    public static void main(String args[])
    {
        findSmallestDigit obj = new findSmallestDigit();
        obj.findSmallestDigit(63529);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 63529      Output : Smallest digit is: 2
//
////////////////////////////////////////////////////////////////////////////////