package edu.craptocraft.ricksybusiness.business;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class UfosPark implements GuestDispatcher {
    private double fee = 500d;
    private final Map<String, String> flota = new HashMap<String, String>();

    UfosPark() {
        // Avoiding future problems
    }

    protected void add(String ufosId) {
        this.flota.putIfAbsent(ufosId, null);
    }

    @Override
    public void dispatch(CreditCard userCard) {

        Entry<String, String> ufo = null;

        if (!this.flota.containsValue(userCard.getNumber())) {

            Optional<Entry<String, String>> ufoFree = this.flota.entrySet().stream()
                    .filter(ovni -> ovni.getValue() == null)
                    .findFirst();

            ufo = ((ufoFree.isPresent() && userCard.pay(fee)) ? ufoFree.get() : null);

        }

        if (ufo != null) {

            this.flota.put(ufo.getKey(), userCard.getNumber());
        }
    }

    public String getUfoOf(String cardNumber) {

        Optional<Entry<String, String>> ufo = this.flota.entrySet().stream()
                             .filter(entry -> entry.getValue().equals(cardNumber))
                             .findFirst();
        
        return ufo.isPresent()? ufo.get().getKey() : null;

    }
}
