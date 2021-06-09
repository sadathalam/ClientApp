/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author mdala
 */
public class TestScore {
    
    private String customerFirstName;
    private String customerLastName;
    private int score; 
    private String employeeFirstName;
    private String employeeLastName;
    private Date date; 
    
    public TestScore(String customerFirstName,String customerLastName, int score, String employeeFirstName, String employeeLastName, Date date){
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName; 
        this.score = score; 
        this.employeeFirstName = employeeFirstName; 
        this.employeeLastName = employeeLastName; 
        this.date = date; 
    }
    
    public String getCustomerFirstName(){
        return this.customerFirstName;
    }
    public String getCustomerLastName(){
        return this.customerLastName;
    }
    public int getScore(){
        return this.score;
    }
    public String getEmployeeFirstName(){
        return this.employeeFirstName;
    }
    public String getEmployeeLastName(){
        return this.employeeLastName;
    }
    public Date getDate(){
        return this.date; 
    }
}
