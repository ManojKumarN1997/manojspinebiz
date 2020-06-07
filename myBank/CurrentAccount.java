package org.myBank;

public class CurrentAccount extends Account {

    public static final String AccountType = "CurrentAccount";

    public static final float MinimumBalance = 10000;

    public CurrentAccount(String name, long number, String type, float initialDebosit) throws Exception {
        super(name, number, AccountType, initialDebosit);
    }

    public float GetMinimumBalance() {
        return MinimumBalance;
    }  
}