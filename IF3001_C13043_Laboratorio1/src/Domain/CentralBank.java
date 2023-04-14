/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Mariana
 */
public class CentralBank {
    
    public void sinpe(ComercialBank cbTransmiter, ComercialBank cbReceiver, int amount){
        if(cbTransmiter.getBalanceBank()>=amount){
            cbTransmiter.setBalanceBank(cbTransmiter.getBalanceBank()-amount);
            cbReceiver.setBalanceBank(cbReceiver.getBalanceBank()+amount);
            System.out.println(cbTransmiter.getName() +" has transfered "+amount+" to "+cbReceiver.getName());
        }else{
            System.out.println(cbTransmiter.getName()+" does not have sufficient balance for the SinpeMovil");
        } 
    }
    
}//end class
