package org.myBank;

public abstract class Account {
    
    protected String name;
    protected long number;
    protected float balance;
    protected String type;

    public Account(){}

    public Account(String name, long number, String type, float initialDebosit) throws Exception {
        this.name = name;
        this.number = number;
        this.type = type;

        if (initialDebosit < GetMinimumBalance())
                throw new Exception("Minimum debosit amount for account type " + type + " is " + GetMinimumBalance());

        this.balance = initialDebosit;
    }

    public void Transact(float amount, String action) throws Exception {
        switch(action.toLowerCase())
        {
            case "deposit":
                if (amount <1)
                    throw new Exception("Minimum debosit amount is '1'.");

                this.balance += amount;
            break;
            case "withdraw":
            if (amount <1)
                throw new Exception("Minimum withdraw amount is '1'.");

                float expectedBalance = this.balance - amount; 
                System.out.println(GetMinimumBalance()+ " " + expectedBalance);
                if (expectedBalance < GetMinimumBalance())
                    throw new Exception("Can not withdraw beyond minimum balance.");
                
                this.balance -= amount;
                
            break;
            default:
                throw new Exception("Unknown transaction type.");
        }
    }

    public void Transact(float amount) throws Exception {
        Transact(amount, "deposit");
    }

    public float getBalance(){
        return this.balance;
    }

    public abstract float GetMinimumBalance();
}