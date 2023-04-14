/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Mariana
 */
public class Client {
    
    //atributtes
    private String id;
    private String name;
    private String telephone;
    private String address;

   public Client() {
        
    }//constructor default
    
    public Client(String id, String name, String telephone, String address) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
    }//constructor sobrecargado
    
    //getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toString(){
        String info = "Client personal data\n";
        info +="Id: "+getId()+"\n";
        info +="Name: "+getName()+"\n";
        info +="Address: "+getAddress()+"\n";
        info +="Phone: "+getTelephone()+"\n";
        
        return info;
    }//toString
    
}//end class
