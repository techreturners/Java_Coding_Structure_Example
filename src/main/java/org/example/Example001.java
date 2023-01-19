package org.example;

public class Example001 {

    public boolean favouriteFoodIsSpaghetti(Nintendo nintendo) {
        if(nintendo.getFave() == "Spaghetti"){
            return true;
        }
        return false;
    }

    public boolean canBuy1UP(Nintendo nintendo, int coins) {
        if(nintendo.getCoins() >= 100){
            return true;
        }
        return false;
    }
}
