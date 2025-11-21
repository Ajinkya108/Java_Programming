import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize = 0;

    public ArrayX(int iNo)
    {
        System.out.println("Inside");

        iSize = iNo;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter the element of Array :");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt(); 
        }
    }

    public void DisplaySumDigit()
    {
        for(int i = 0; i < iSize; i++)
        {
            int temp = Arr[i];
            int sum = 0;

            temp = Math.abs(temp);  // for negative numbers

            while(temp != 0)
            {
                sum += temp % 10;
                temp = temp / 10;
            }

            System.out.println("Sum of digits of " + Arr[i] + " is : " + sum);
        }
    }

}
class program24_5
{
    public static void main(String A[])
    {
        int iValue = 0, iCal = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();

        aobj1.DisplaySumDigit();

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}