
//  Account.java       Author: Lewis/Loftus
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;

public class Konto
{

    private long acctNumber;
    private double balance;
    private String name;

    //-----------------------------------------------------------------
    //  Sets up the Konto by defining its owner, Konto number,
    //  and initial balance.
    //-----------------------------------------------------------------
    public Konto(String owner, long Konto, double initial)
    {
        name = owner;
        acctNumber = Konto;
        balance = initial;
    }

    //-----------------------------------------------------------------
    //  Deposits the specified amount into the account. Returns the
    //  new balance.
    //-----------------------------------------------------------------
    public double deposit (double amount)
    {
        balance = balance + amount;
        return balance;
    }

    //-----------------------------------------------------------------
    //  Withdraws the specified amount from the account and applies
    //  the fee. Returns the new balance.
    //-----------------------------------------------------------------
    public double withdraw (double amount)
    {
        balance = balance - amount;
        return balance;
    }

    //-----------------------------------------------------------------
    //  Adds interest to the account and returns the new balance.
    //-----------------------------------------------------------------


    //-----------------------------------------------------------------
    //  Returns the current balance of the account.
    //-----------------------------------------------------------------
    public double getBalance ()
    {
        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns a one-line description of the account as a string.
    //-----------------------------------------------------------------
    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}