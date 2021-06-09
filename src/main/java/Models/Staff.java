/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author mdala
 */
public class Staff extends Employee {
    private int hourlyPay;
     public Staff(String empID, String fName, String lName, int age,String gender, String pos, String officeID,int hourlyPay){
    super(empID, fName, lName, age,gender, pos, officeID);
    this.hourlyPay = hourlyPay;
    }
    
    public int getHourlyPay(){
        return this.hourlyPay;
    }
    
}
