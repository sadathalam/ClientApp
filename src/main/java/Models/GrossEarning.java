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
public class GrossEarning {
    private Date date; 
    private int grossIncome; 
    
    public GrossEarning(Date date, int grossIncome){
        this.date = date; 
        this.grossIncome = grossIncome; 
    }
    
    public Date getDate(){
        return this.date; 
    }
    public int getGrossIncome(){
        return this.grossIncome;
    }
    
    
}
