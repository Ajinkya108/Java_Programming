////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : displayGrade
//  Function Name : displayGrade
//  Description :   Used to display the grade of a student based on the entered marks.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class displayGrade
{
    void displayGrade(int iMarks)
    {
        if(iMarks < 0 || iMarks > 100)
        {
            System.out.println("Invalid Marks! Please enter between 0 and 100.");
        }
        else if(iMarks >= 90)
        {
            System.out.println("Grade: A+");
        }
        else if(iMarks >= 75)
        {
            System.out.println("Grade: A");
        }
        else if(iMarks >= 60)
        {
            System.out.println("Grade: B");
        }
        else if(iMarks >= 50)
        {
            System.out.println("Grade: C");
        }
        else if(iMarks >= 35)
        {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program19_2
{
    public static void main(String args[])
    {
        displayGrade obj = new displayGrade();
        obj.displayGrade(82);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 82   Output : Grade: A
//
////////////////////////////////////////////////////////////////////////////////