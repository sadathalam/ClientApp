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
public class Vehicle {
    
    private String vehicleID; 
    private String make; 
    private String model;
    private String color; 
    private int year; 
    private int miles; 
    private String officeLocation;
    
    public Vehicle(String vehicleId, String make, String model, String color, int year, int miles, String officeLoaction){
        this.vehicleID = vehicleId; 
        this.make = make; 
        this.model = model; 
        this.color = color; 
        this.year = year; 
        this.miles = miles; 
        this.officeLocation = officeLoaction; 
    }
    
    public String getID(){
        return this.vehicleID;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model; 
    }
    public String getColor(){
        return this.color; 
    }
    public int getYear(){
        return this.year; 
    }
    public int getMiles(){
        return this.miles;
    }
    public String getLocation(){
        return this.officeLocation; 
    }
    
}
