/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities;

/**
 *
 * @author User
 */
public class City {
    private String cityName;
   
    public String getcityName(){
        return cityName;
    }
    
    public void setcityName(String cityName){
        this.cityName = cityName;
    }
    
    private int cityYear;
    public void setcityYear(int cityYear){
        this.cityYear = cityYear;
    }
    public int getcityYear(){
       return cityYear;
    }

}


