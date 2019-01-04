/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;

/**
 *
 * @author Sebastian
 */
public class Vino {
    private String title;
    private String country;
    private String description;
    private double price;
    
    public Vino(String title, String country, String description, double price){
        this.title = title;
        this.country = country;
        this.description = description;
        this.price = price;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public double getPrice(){
        return this.price;
    }
    
}
