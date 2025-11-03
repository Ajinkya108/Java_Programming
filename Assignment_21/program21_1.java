////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : productOfDigits
//  Function Name : productOfDigits
//  Description :   calculates the product of all digits in the given number.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class productOfDigits
{
    void productOfDigits(int iNo)
    {
        int iDigit = 0;
        int iProduct = 1;

        if(iNo == 0)
        {
            iProduct = 0;
        }
        else
        {
            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iProduct = iProduct * iDigit;
                iNo = iNo / 10;
            }
        }

        System.out.println("Product of digits is: " + iProduct);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
////////////////////////////////////////////////////////////////////////////////

class program21_1
{
    public static void main(String args[])
    {
        productOfDigits obj = new productOfDigits();
        obj.productOfDigits(234);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 234      Output : Product of digits is: 24
//
////////////////////////////////////////////////////////////////////////////////