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
public class VehicleUse {
    private String make; 
    private String model; 
    private String color; 
    private int miles; 
    private String customerFirstName; 
    private String customerLastName; 
    private String employeeFirstName; 
    private String employeeLastName; 
    private Date date; 
    
    public VehicleUse(String make, String model, String color, int miles, String customerFirstName, String customerLastName, String employeeFirstName, String employeeLastName, Date date){
        this.make = make; 
        this.model = model; 
        this.color = color;
        this.miles = miles; 
        this.customerFirstName = customerFirstName; 
        this.customerLastName = customerLastName; 
        this.employeeFirstName = employeeFirstName; 
        this.employeeLastName = employeeLastName; 
        this.date = date; 
    }
    
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public String getColr(){
        return this.color;
    }
    public int getMiles(){
        return this.miles; 
    }
    public String getCustomerFirstName(){
        return this.customerFirstName;
    }
    public String getCustomerLastName(){
        return this.customerLastName;
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
