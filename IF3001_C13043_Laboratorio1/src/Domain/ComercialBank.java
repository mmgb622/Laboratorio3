/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Mariana
 */
public class ComercialBank extends CentralBank{
    
    private String name;
    private double balanceBank;
    private Account account;

    public ComercialBank(String name,double balanceBank, Account account) {
        this.name = name;
        this.balanceBank = balanceBank;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalanceBank() {
        return balanceBank;
    }

    public void setBalanceBank(double balanceBank) {
        this.balanceBank = balanceBank;
    }
   
    
}//end class
