package model;

public class BankAccount {

    private int balance = 100000;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int amount){
        this.balance = balance - amount;
    }

}
