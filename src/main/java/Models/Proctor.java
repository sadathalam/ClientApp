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
public class Proctor extends Employee {
    private int salary;
     public Proctor(String empID, String fName, String lName, int age,String gender, String pos, String officeID,int salary){
    super(empID, fName, lName, age,gender, pos, officeID);
    this.salary = salary;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
}
