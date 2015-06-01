package com.example.android.common.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Model for wallet item
 */
public class WalletItem implements Cloneable, Comparable<WalletItem> {

    @SerializedName("user_accnumber")
    private String walletId = "";

    @SerializedName("amount")
    private float walletBallance;

    @SerializedName("currency_id")
    private String walletCurrency;

    @SerializedName("uid")
    private String walletUid;

    @SerializedName("userId")
    private String walletUserId;

    @SerializedName("created")
    private String created;

    @Expose
    private String walletCurrencyName;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return new WalletItem();
        }
    }

    /**
     * Compare wallets
     */
    @Override
    public int compareTo(WalletItem another) {
        return this.walletId.compareTo(another.walletId);
    }

    //TODO: make this thing work like [item currency_id=%d, balance=%d...]
    @Override
    public String toString() {
        return super.toString();
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getWalletCurrency() {
        return walletCurrency;
    }

    public void setWalletBallance(float walletBallance) {
        this.walletBallance = walletBallance;
    }

    public void setCurrency(String walletCurrency) {
        this.walletCurrency = walletCurrency;
    }

    public void setWalletUid(String walletUid) {
        this.walletUid = walletUid;
    }

    public void setwalletUserId(String walletUserId) {
        this.walletUserId = walletUserId;
    }


    public String getWalletUid() {
        return walletUid;
    }

}
