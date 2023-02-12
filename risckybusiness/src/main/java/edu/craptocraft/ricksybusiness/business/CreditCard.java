package edu.craptocraft.ricksybusiness.business;

public class CreditCard {
    private final String owner;
    private final String number;
    private Double credit;
    private static final  String SYMBOL = "EZI";

    protected CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
        this.credit = 3000d;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getNumber() {
        return this.number;
    }

    public Double getCredit() {
        return this.credit;
    }

    public String toString() {
        StringBuilder information = new StringBuilder();

        information.append("\nCredit card of: " + this.getOwner());
        information.append("\nNumber: " + this.getNumber());
        information.append("\nCredit: " + this.getCredit() + " " + CreditCard.SYMBOL);

        return information.toString();
    }

}
