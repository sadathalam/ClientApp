/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author mdala
 */
public class Test {
    
    private String testNum; 
    private Date date;
    private int score; 
    private String employeeNum; 
    private String customerNum;
    
    public Test(String testNum, Date date, int score, String employeeNum, String customerNum){
        this.testNum = testNum;
        this.date = date; 
        this.score = score; 
        this.employeeNum = employeeNum; 
        this.customerNum = customerNum; 
    }
    
    public String getTestNum(){
        return this.testNum;
    }
    public Date getDate(){
        return this.date; 
    }
    public int getScore(){
        return this.score; 
    }
    public String getEmployeeNum(){
        return this.employeeNum;
    }
    public String getCucsomterNum(){
        return this.customerNum;
    }
    
    
    
    
}
