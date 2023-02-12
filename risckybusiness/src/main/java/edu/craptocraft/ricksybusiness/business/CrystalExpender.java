package edu.craptocraft.ricksybusiness.business;

public class CrystalExpender implements GuestDispatcher {
    private int stock;
    private int costPerItem;

    protected CrystalExpender(int initialStock, int costPerItem) {
        this.stock = initialStock;
        this.costPerItem = costPerItem;
    }

    public int getStock() {
        return stock;
    }

    public int getCostPerItem() {
        return costPerItem;
    }

    private void setStock() {
        this.stock -= 1;

    }

    public void dispatch(CreditCard userCard) {

        if (this.getStock() > 0) {
            if (userCard.pay(this.getCostPerItem())) {
                this.setStock();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder information = new StringBuilder();

        information.append("\nActual stock: " + this.getStock());
        information.append("\nCost per item: " + this.getCostPerItem());

        return information.toString();
    }
}
