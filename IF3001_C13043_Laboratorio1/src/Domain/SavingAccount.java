/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.Date;

/**
 *
 * @author Mariana
 */
public class SavingAccount extends Account{
    
    //Atributes
    private Date date;
    private int monthlyTerm;
    private float interest;

    public SavingAccount() {
    }

    public SavingAccount(Date date, int monthlyTerm, float interest) {
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
    }

    public SavingAccount(Date date, int monthlyTerm, float interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMonthlyTerm() {
        return monthlyTerm;
    }

    public void setMonthlyTerm(int monthlyTerm) {
        this.monthlyTerm = monthlyTerm;
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
        totalInterest = this.getMonthlyTerm()*this.getInterest()*this.getBalance();
        return this.getBalance()+totalInterest;
    }//interestCalculaation

    @Override
    public void withdraw(double money) {
        if (money>this.getBalance()) {
            System.out.println("You dont have enough money");  
        }else{
            super.setBalance(this.getBalance()-money);
            System.out.println(money+" Has been withdraw");
        }
        
    }//withdraw

    @Override
    public void deposit(double money) {
        super.setBalance(this.getBalance()+money);
    }//deposit

    @Override
    public String toString() {
        String info = "Saving Account information: ";
        info+="\nMonthlyTerm: "+ this.getMonthlyTerm();
        return super.toString()+info; 
    }
    
    
    
}//end class
