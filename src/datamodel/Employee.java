/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel;

/**
 *
 * @author SYARIF
 */
public class Employee {
    protected String name;
    protected String address;
    protected Integer number;
    
    public Employee (String name, String address, Integer number){
        this.name=name;
        this.address=address;
        this.number=number;
        System.out.println("Employee created succesfully");
    }
    
    public void mailcheck(){
        System.out.println("Periksa Mail Untuk "+this.name);
    }
}
