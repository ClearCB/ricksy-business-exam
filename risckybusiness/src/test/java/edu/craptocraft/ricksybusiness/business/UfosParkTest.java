package edu.craptocraft.ricksybusiness.business;

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

        
    }
}
