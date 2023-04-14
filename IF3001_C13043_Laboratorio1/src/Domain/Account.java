/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Mariana
 */
public abstract class Account {
    
    //atributes
    private String accountNumber;
    private double balance;
    private Client client;

    public Account() {
    }

    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    //methods in order to represent polymorphism
    public abstract double interestCalculaation();
    public abstract void withdraw(double money);
    public abstract void deposit(double money);

    @Override
    public String toString() {
        String info = "Account information\n";
        info += "Account Number: "+this.getAccountNumber()+"\n";
        info += "Balance: "+this.getBalance()+"\n";
        info += "Account name:"+this.getClient().toString()+"\n";
        return info;
    }//toString
 
}//end class
