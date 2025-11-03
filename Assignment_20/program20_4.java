////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : findLargestDigit
//  Function Name : findLargestDigit
//  Description :   Used to find the largest digit from the given number.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class findLargestDigit
{
    void findLargestDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Largest digit is: " + iMax);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_4
{
    public static void main(String args[])
    {
        findLargestDigit obj = new findLargestDigit();
        obj.findLargestDigit(63529);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 63529      Output : Largest digit is: 9
//
////////////////////////////////////////////////////////////////////////////////