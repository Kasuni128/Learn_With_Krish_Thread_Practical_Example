package model;

public class ATM {

    public static void main(String[] args){
        BankAccount bankaccount = new BankAccount();
        Customer customer = new Customer(bankaccount);
        Thread cus1 = new Thread(customer);
        Thread cus2 = new Thread(customer);

        cus1.setName("Kasuni");
        cus2.setName("Tharaka");

        cus1.start();
        cus2.start();
    }
}
