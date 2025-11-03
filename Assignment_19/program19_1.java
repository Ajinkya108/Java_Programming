////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : checkLeapYear
//  Function Name : checkLeapYear
//  Description :   Used to check whether the given year is a leap year or not
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class checkLeapYear
{
    void checkLeapYear(int iNo)
    {
        if((iNo % 400 == 0) || (iNo % 4 == 0 && iNo % 100 != 0))
        {
            System.out.println(iNo + " is a Leap Year.");
        }
        else
        {
            System.out.println(iNo + " is NOT a Leap Year.");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program19_1
{
    public static void main(String args[])
    {
        checkLeapYear obj = new checkLeapYear();
        obj.checkLeapYear(2024);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 2024     Output : 2024 is a Leap Year.
//
////////////////////////////////////////////////////////////////////////////////