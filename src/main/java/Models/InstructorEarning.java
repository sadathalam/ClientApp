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
public class InstructorEarning {
    
    private String employeeFName; 
    private String employeeLName; 
    private String officeAddress; 
    private int income; 
    
    public InstructorEarning(String employeeFName, String employeeLName, String officeAddress, int income){
        this.employeeFName = employeeFName; 
        this.employeeLName = employeeLName;
        this.officeAddress = officeAddress; 
        this.income = income; 
    }
    
    public String getEmployeeFName(){
        return this.employeeFName;
    }
    public String getEmployeeLname(){
        return this.employeeLName;
    }
    public String getOfficeAddress(){
        return this.officeAddress;
    }
    public int getIncome(){
        return this.income;
    }
       
    
}
