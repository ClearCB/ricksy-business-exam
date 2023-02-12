package edu.craptocraft.ricksybusiness.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class RickMenuDispatcherTest {
    RickMenuDispatcher menuDispatcher;

    @Before
    public void createMenuDispatcherTest() {
        menuDispatcher = new RickMenuDispatcher();

    }

    @Test
    public void constructorTest() {

        assertNotNull(menuDispatcher);

    }

    @Test
    public void dispatchTest(){

        CreditCard morty = new CreditCard("Morty", "0000000000000000");
        CreditCard birdpearson = new CreditCard("Birdpearson", "1111111111111111");
        
        menuDispatcher.dispatch(morty);
        menuDispatcher.dispatch(morty);
        menuDispatcher.dispatch(morty);
        menuDispatcher.dispatch(morty);
        menuDispatcher.dispatch(morty);
        menuDispatcher.dispatch(birdpearson);
        menuDispatcher.dispatch(birdpearson);
        menuDispatcher.dispatch(birdpearson);

        assertEquals(2950.0,morty.getCredit(),0);
        assertEquals(2970.0,birdpearson.getCredit(),0);

    }
}
