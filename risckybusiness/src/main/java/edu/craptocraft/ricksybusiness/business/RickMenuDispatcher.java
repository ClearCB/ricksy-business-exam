package edu.craptocraft.ricksybusiness.business;

import javax.security.auth.login.CredentialExpiredException;

public class RickMenuDispatcher implements GuestDispatcher{
    private int menuStock = 100;
    private int costPerMenu = 10;
    private StringBuilder pedidos = new StringBuilder("");

    RickMenuDispatcher(){}

    public int getMenuStock() {
        return menuStock;
    }

    public int getCostPerMenu() {
        return costPerMenu;
    }

    private void setMenuStock(){
        this.menuStock -= 1;
    }

    private StringBuilder getPedidos(){
        return this.pedidos;
    }

    public void addNewMenuRegistre(CreditCard userCard){

        this.getPedidos().append("\nThe user: " + userCard.getOwner() + "with card: " + userCard.getNumber() + " got a menu.");
    }

    @Override
    public void dispatch(CreditCard userCard) {

        if (menuStock>0 && userCard.pay(costPerMenu)){

            this.setMenuStock();
            this.addNewMenuRegistre(userCard);

        }


    }

    @Override
    public String toString(){
        StringBuilder information = new StringBuilder();

        information.append("The menu stock is: " + this.getMenuStock());
        information.append("\nThe actual menu cost is: " + this.getCostPerMenu());
        information.append("\nThe menus already adquiered: " + this.getPedidos());

        return information.toString();
    }
}
