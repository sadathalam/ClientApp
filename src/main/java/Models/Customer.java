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
public class Customer {
    private String customerNum; 
    private String fName; 
    private String lName; 
    private int age; 
    private String gender; 
    private String address; 
    private String officeId; 
    
        public Customer(String customerNum, String fName, String lName, int age, String gender, String address, String officeId){
        this.customerNum = customerNum; 
        this.fName = fName; 
        this.lName = lName; 
        this.age = age; 
        this.gender = gender; 
        this.address = address; 
        this.officeId = officeId; 
        
    }
        
        public String getCustomerNum(){
            return this.customerNum;
        }
         public String getfName(){
            return this.fName; 
        }
          public String getlName(){
            return this.lName;
        }
           public int getAge(){
            return this.age;
        }
            public String getGender(){
            return this.gender;
        }
             public String getAddress(){
            return this.address;
        }
              public String getOfficeId(){
            return this.officeId;
        }
    
    
}
