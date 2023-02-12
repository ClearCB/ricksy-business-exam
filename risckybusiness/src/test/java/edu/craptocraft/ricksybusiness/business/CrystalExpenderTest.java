package edu.craptocraft.ricksybusiness.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CrystalExpenderTest {
    CrystalExpender expender;

    @Before
    public void expenderCreateTest(){
        expender = new CrystalExpender(3,50);
    }

    @Test
    public void constructorTest(){
        assertNotNull(expender);

        assertEquals("\nActual stock: 3\nCost per item: 50",expender.toString());
    }

    @Test
    public void dispatchTest(){

        CreditCard creditCardOne = new CreditCard("Abradolph Lincler", "4916119711304546");
        CreditCard creditCardTwo = new CreditCard("Natalie Lucker", "1234567891231231");

        expender.dispatch(creditCardOne);
        expender.dispatch(creditCardTwo);
        
        assertEquals(2950,creditCardOne.getCredit(),0);
        assertEquals(2950,creditCardTwo.getCredit(),0);

    }
}
