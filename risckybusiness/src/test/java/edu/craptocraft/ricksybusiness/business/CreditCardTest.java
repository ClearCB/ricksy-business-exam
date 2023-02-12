package edu.craptocraft.ricksybusiness.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
    static CreditCard creditCardOne;
    static CreditCard creditCardTwo;

    @Before
    public void creatingCreditCardTest() {

        creditCardOne = new CreditCard("Abradolph Lincler", "4916119711304546");
        creditCardTwo = new CreditCard("Natalie Lucker", "1234567891231231");

    }

    @Test
    public void constructorTesT() {

        assertNotNull(creditCardOne);
        assertNotNull(creditCardTwo);
    }

    @Test
    public void toStringTest(){

        assertEquals("\nCredit card of: Abradolph Lincler\nNumber: 4916119711304546\nCredit: 3000.0 EZI",creditCardOne.toString());

        assertEquals("\nCredit card of: Natalie Lucker\nNumber: 1234567891231231\nCredit: 3000.0 EZI",creditCardTwo.toString());

    }

    @Test
    public void payTest(){

        assertTrue(creditCardOne.pay(500d));
        assertTrue(creditCardOne.pay(500d));
        assertTrue(creditCardOne.pay(500d));
        assertTrue(creditCardOne.pay(500d));
        assertTrue(creditCardOne.pay(500d));
        assertTrue(creditCardOne.pay(500d));
        assertFalse(creditCardOne.pay(500d));
    }
}
