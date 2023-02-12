package edu.craptocraft.ricksybusiness.business;

import java.util.HashSet;
import java.util.Set;

public class Receptivo {
    private Set<GuestDispatcher> observer = new HashSet<GuestDispatcher>();

    Receptivo() {
    }

    public Set<GuestDispatcher> getObserver() {
        return this.observer;
    }

    void registre(GuestDispatcher newDispatcher){

        this.getObserver().add(newDispatcher);
    }

    void dispatch(CreditCard userCard){

        this.getObserver().forEach(dispatcher -> dispatcher.dispatch(userCard));

    }
}
