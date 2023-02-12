package edu.craptocraft.ricksybusiness.business;

public class CreditCard {
    private final String owner;
    private final String number;
    private double credit;
    private static final String SYMBOL = "EZI";

    protected CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
        this.credit = 3000d;
    }

    String getOwner() {
        return this.owner;
    }

    String getNumber() {
        return this.number;
    }

    double getCredit() {
        return this.credit;
    }

    boolean pay(double quantityToPay) {

        if (this.getCredit() >= quantityToPay) {
            this.credit -= quantityToPay;
            return true;
        }

        else {
            return false;
        }

    }

    @Override
    public String toString() {
        StringBuilder information = new StringBuilder();

        information.append("\nCredit card of: " + this.getOwner());
        information.append("\nNumber: " + this.getNumber());
        information.append("\nCredit: " + this.getCredit() + " " + CreditCard.SYMBOL);

        return information.toString();
    }

}
