public class AsciiTable
{
    public static void main(String[] args)
    {
        System.out.println("ASCII TABLE (0 to 255)");
        System.out.println("--------------------------------------------------------");
        System.out.println("Symbol\tDecimal\tHex\tOctal");
        System.out.println("--------------------------------------------------------");

        for(int i = 0; i <= 255; i++)
        {
            char ch = (char)i;

            // To handle non-printable characters
            String symbol;
            if(i < 32 || i == 127)      
            {
                symbol = "NP";  // Non-Printable
            }
            else
            {
                symbol = Character.toString(ch);
            }

            System.out.printf("%-6s\t%-7d\t%02X\t%03o\n", symbol, i, i, i);
        }
    }
}
