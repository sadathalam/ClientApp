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
public class Employee {
    private String empID; 
    private String fName; 
    private String lName; 
    private int age; 
    private String gender; 
    private String pos; 
    private String officeID;
    
    public Employee(String empID, String fName, String lName, int age,String gender, String pos, String officeID){
        this.empID = empID; 
        this.fName = fName; 
        this.lName = lName; 
        this.age = age; 
        this.gender = gender; 
        this.pos = pos; 
        this.officeID = officeID; 
    }
    
    public String getEmpID(){
        return this.empID;
    }
    public String getFName(){
        return this.fName; 
    }
    public String getLName(){
        return this.lName;
    }
    public int getAge(){
        return this.age; 
    }
    public String getPos(){
        return this.pos; 
    }
    public String getOfficeID(){
        return this.officeID;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    
}
