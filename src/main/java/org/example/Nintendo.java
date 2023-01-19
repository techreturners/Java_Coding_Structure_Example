package org.example;

public class Nintendo {

    private String fNm;
    private String lNm;
    private String fave;

    private int coins;

    public Nintendo(String fNm, String lNm, String fave, int coins) {
        this.fNm = fNm;
        this.lNm = lNm;
        this.fave = fave;
        this.coins = coins;
    }

    public String getfNm() {
        return fNm;
    }

    public void setfNm(String fNm) {
        this.fNm = fNm;
    }

    public String getlNm() {
        return lNm;
    }

    public void setlNm(String lNm) {
        this.lNm = lNm;
    }

    public String getFave() {
        return fave;
    }

    public void setFave(String fave) {
        this.fave = fave;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
