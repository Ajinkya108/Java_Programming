////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : displayFactors
//  Function Name : displayFactors
//  Description :   Displays all factors of a given number except the number itself.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class displayFactors
{
    void displayFactors(int iNo)
    {
        int iCnt = 0;

        System.out.println("Factors of " + iNo + " are:");

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }

        System.out.println(iNo);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
////////////////////////////////////////////////////////////////////////////////

class program21_3
{
    public static void main(String args[])
    {
        displayFactors obj = new displayFactors();
        obj.displayFactors(12);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 12  Output : 1, 2, 3, 4, 6, 12
//
////////////////////////////////////////////////////////////////////////////////