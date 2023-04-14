/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Domain.Account;
import java.util.Date;

/**
 *
 * @author Mariana
 */
public class TransactionLog {//bitacora
    
    //atributes
    private int transactionId;
    private String event;
    private Date date;
    private Account account;
    private double movement;
    
    private static int consecutive=0;

    public TransactionLog() {
        this.transactionId = ++consecutive;
    }

    public TransactionLog(String event, Account account, double movement) {
        this();
        this.date = new java.util.Date();
        this.event = event;
        this.account = account;
        this.movement = movement;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public static int getConsecutive() {
        return consecutive;
    }

    public static void setConsecutive(int consecutive) {
        TransactionLog.consecutive = consecutive;
    }

    @Override
    public String toString() {
        String info ="General bank information: ";
        info+="\n Event id" + this.getTransactionId();
        info+="\n Eventy Type: " + this.getEvent();
        info+="\n Date: " +this.getDate();
        info+="\n Movement: " + this.getMovement();
        info+="\n AffectedAccount: "+this.getAccount().toString();
        return info; 
    }//toString

}//end class
