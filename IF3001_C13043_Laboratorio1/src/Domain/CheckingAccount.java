/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Mariana
 */
public class CheckingAccount extends Account{

    //atributes
    private float interest;

    public CheckingAccount(float interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.interest = interest;
    }

    public CheckingAccount(float interest) {
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    @Override
    public double interestCalculaation() {
         double totalInterest;
        totalInterest = this.getInterest()*this.getBalance();
        return this.getBalance()+totalInterest;
    }

    @Override
    public void withdraw(double money) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deposit(double money) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}//end class
