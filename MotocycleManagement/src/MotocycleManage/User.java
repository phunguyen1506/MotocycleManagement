/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotocycleManage;

/**
 *
 * @author phu ngu
 */
public class User {


    private String User_Name;
  
    
    public User(){
        User_Name = "";
     
    }

    public User(String User_Name, String Role) {
        this.User_Name = User_Name;
       
    }

    public User(User user){
        this.User_Name = user.User_Name;
     
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

   
  
    
   

}
