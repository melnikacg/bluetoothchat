package com.example.android.common.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Class designed to handle AccountItem model
 */
public class AccountItem {

    @SerializedName("accounts")
    private ArrayList<WalletItem> walletItems;

    public ArrayList<WalletItem> getWalletItems() {
        return walletItems;
    }

    public void setWalletItems(ArrayList<WalletItem> walletItems) {
        this.walletItems = walletItems;
    }

    public static AccountItem createDummyAccount(){

        AccountItem accountItem = new AccountItem();

        ArrayList<WalletItem> walletItems = new ArrayList<>();

        WalletItem walletItem1 = new WalletItem();
        walletItem1.setWalletId("3424234234");
        walletItem1.setCurrency("22");
        walletItem1.setWalletUid("34242");
        walletItems.add(walletItem1);

        WalletItem walletItem2 = new WalletItem();
        walletItem2.setWalletId("32324234234");
        walletItem2.setCurrency("21");
        walletItem2.setWalletUid("34242");
        walletItems.add(walletItem2);

        WalletItem walletItem3 = new WalletItem();
        walletItem3.setWalletId("32324234234");
        walletItem3.setCurrency("20");
        walletItem3.setWalletUid("34242");
        walletItems.add(walletItem3);

        accountItem.setWalletItems(walletItems);

        return accountItem;
    }
}
