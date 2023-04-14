/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Domain.Account;
import Domain.CentralBank;
import Domain.CheckingAccount;
import Domain.Client;
import Domain.ComercialBank;
import Domain.SavingAccount;
import java.util.Date;

/**
 *
 * @author Mariana
 */
public class TransactionLogTest {

    public TransactionLogTest() {
    }
    
    public void test(){
        Client  clients[] = new Client[10];
        
        clients[0] = new Client("305370792", "Mariana Garcia", "84995785", "Turrialba");
        clients[1] = new Client("302700623", "Maritza Brenes", "84062068", "Cartago");
        
        Date date = new Date(2022, 3,1);
        float currentInterest = (float)(0.02);
        
        ComercialBank cb[] = new ComercialBank[2];
        
        Account accounts[] = new Account[10];
        accounts[0] = new SavingAccount(date, 12, currentInterest, "1", 1000000, clients[0]);
        accounts[1] = new CheckingAccount(currentInterest, "123", 10000000, clients[1]);
        
        cb[0] = new ComercialBank("BCR",1000000.0, accounts[0]);
        cb[1] = new ComercialBank("BN",1000000.0,accounts[1]);
        
        //bank simulation
        TransactionLog tl[] = new TransactionLog[5];
        accounts[0].withdraw(250000);
        tl[0] = new TransactionLog("retiro", accounts[0], 250000);
        
        CentralBank centralBank = new CentralBank();
        centralBank.sinpe(cb[0], cb[1], 20000);
        
        for (int i = 0; i < tl.length; i++) {
            if (tl[i]!=null) {
                System.out.println(tl[i].toString());
            }
        }
        
    }
    
}
