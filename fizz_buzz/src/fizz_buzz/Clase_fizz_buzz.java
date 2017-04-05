/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizz_buzz;

/**
 *
 * @author daw108
 */
public class Clase_fizz_buzz {
        
    public Clase_fizz_buzz(){}
    
    public String getfizz_buzz(int n){
        String r=String.valueOf(n);    
        
        if (n%3==0 & n % 5 == 0)
            
            r= "fizz buzz";
        
        else if (n%5==0 & n%2==0)
            
            r="pepe buzz";
        
        else if (n%5==0 & n%2==0 & n%3==0)
            
            r="pepe buzz fizz";
        
        else if (n%3==0){
            r= "fizz";
        }
        else if (n % 5 == 0) {
            r = "buzz";
        }
        else if (n % 2 == 0) {
            r = "pepe";
        }        
        return r;
    }
    
}
