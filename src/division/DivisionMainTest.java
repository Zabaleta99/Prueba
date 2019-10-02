package division;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static string.MyString.quitarTabsYSaltosLinea;

class DivisionMainTest {

    @org.junit.jupiter.api.Test
    @Test
    public void division()
    {
        try
        {
            assertEquals( 2, DivisionMain.division(10, 5));
        }

        catch (ArithmeticException e)
        {
            System.out.println("Errorrrrr: " + e.getMessage());
        }

        System.out.println("crack");
        //fail("Error - deberia generar Arithmetic Exception");
    }
}