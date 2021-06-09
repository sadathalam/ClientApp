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
public class Instructor extends Employee {
    private int commission;
    public Instructor(String empID, String fName, String lName, int age, String gender, String pos, String officeID,int commission){
    super(empID, fName, lName, age,gender, pos, officeID);
    this.commission = commission;
    }
    
    public int getCommission(){
        return this.commission;
    }
}
