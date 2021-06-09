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
public class Order {
    private String orderID; 
    private Date date; 
    private String customerNum;
    private String serviceID;
    private String vehicleID; 
    private String empID; 
    
    public Order(String orderID, Date date, String customerNum, String serviceID, String vehicleID, String empID){
        this.orderID = orderID; 
        this.date = date; 
        this.customerNum = customerNum;
        this.serviceID = serviceID; 
        this.vehicleID = vehicleID; 
        this.empID = empID; 
    }
    
    public String getOrderID(){
        return this.orderID; 
    }
    public Date getDate(){
        return this.date; 
    }
    public String getCusomterNum(){
        return this.customerNum; 
    }
    public String getServiceID(){
        return this.serviceID;
    }
    public String getVehicleID(){
        return this.vehicleID;
    }
    public String getEmpID(){
        return this.empID;
    }
   
    
}
