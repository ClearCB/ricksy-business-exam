package edu.craptocraft.ricksybusiness.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class UfosParkTest {
    static UfosPark ufosPark;

    @BeforeClass
    public static void ufosParkCreateTest() {
        ufosPark = new UfosPark();

    }

    @Test
    public void constructorTest() {
        assertNotNull(ufosPark);
    }

    @Test
    public void addGetUfofTest(){

        String[] ufosID = { "unx", "dox" };
		for (String ovni : ufosID) {
			ufosPark.add(ovni);
        }

        CreditCard creditCardOne = new CreditCard("Abradolph Lincler", "4916119711304546");
        CreditCard creditCardTwo = new CreditCard("Natalie Lucker", "1234567891231231");

        ufosPark.dispatch(creditCardOne);
        ufosPark.dispatch(creditCardTwo);

        assertEquals("dox",ufosPark.getUfoOf(creditCardOne.getNumber()));
        assertEquals("unx",ufosPark.getUfoOf(creditCardTwo.getNumber()));
        
    }
}
