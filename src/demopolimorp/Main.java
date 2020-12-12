/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopolimorp;
import datamodel.Employee;
import datamodel.Salary;
/**
 *
 * @author SYARIF
 */
public class Main {

   static Employee ref;
    public static void main(String[] args) {
       ref=new Salary("Syarif","Lampung",123, 20000000.0);
       ref.mailcheck();
       
       Salary salary1=new Salary("Soden","Metro",181,366000000.0);
        System.out.println("Salary Per Hari = "+salary1.paymentPerDay());
    }
    
}
