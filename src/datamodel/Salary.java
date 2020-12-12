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
public class Salary extends Employee {
   private Double amount;
   
   public Salary(String name, String address, Integer number, Double amount){
       super(name, address, number);
       setAmount(amount);
       System.out.println("Salary of Employee Created Succesfully");
   }

    private void setAmount(Double amount) {
        if(amount >= 0.0){
            this.amount=amount;
        }else{
            System.out.println("Fal Error! Nominal Amount Harus Lebih Dari 0.0");
        }
   }
    public Double getAmount(){
        return amount;
    }
    public Double paymentPerDay(){
        System.out.println("Hitung Salary Per Hari Untuk "+super.name);
        return amount/30;
    }

    @Override
    public void mailcheck() {
        System.out.println("Periksa Mail Dalam Kelas Salary");
        System.out.println("Surat Tertuju Untuk " +super.name
                   + "Dengan Gaji" +amount);
    }
    
}
