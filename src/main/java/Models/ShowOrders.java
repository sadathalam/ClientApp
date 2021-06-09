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
public class ShowOrders {
    
    private String customerFName; 
    private String customerLName; 
    private String service; 
    private int price; 
    private String employeeFName; 
    private String employeeLName; 
    private Date orderDate; 
    
    public ShowOrders(String customerFName, String customerLName, String service, int price, String employeeFName, String employeeLName, Date orderDate){
        this.customerFName = customerFName; 
        this.customerLName = customerLName; 
        this.service = service; 
        this.price = price; 
        this.employeeFName = employeeFName; 
        this.employeeLName = employeeLName; 
        this.orderDate = orderDate; 
    }
    
    public String getCustomerFName(){
        return this.customerFName;
    }
    public String getCustomerLName(){
        return this.customerLName;
    }
    public String getService(){
        return this.service; 
    }
    public int getPrice(){
        return this.price; 
    }
    public String getEmployeeFName(){
        return this.employeeFName;
    }
    public String getEmployeeLName(){
        return this.employeeLName;
    }
    public Date getDate(){
        return this.orderDate;
    }
    
}
    
