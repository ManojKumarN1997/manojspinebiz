package org.myBank;

public class SavingsAccount extends Account{

    public static final String AccountType = "SavingsAccount";

    public static final float MinimumBalance = 5000;

    public SavingsAccount(String name, long number, String type, float initialDebosit) throws Exception {
        super(name, number, AccountType, initialDebosit);
    }

    public float GetMinimumBalance() {
        return MinimumBalance;
    }
}