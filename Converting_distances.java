/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huangjianting
 */
import java.util.*;

public class Converting_distances {
    public static void Mean(){
        
        System.out.println("1. Convert to kilometers \n 2. Convert to invhes \n 3. Convert to feet \n 4. Quit the program");
        
    }
    
    public static double showKilometers(double meters){
        double kilometer = meters * 0.001;
        return kilometer;
    }
    
    public static double showInches(double meters){
        double inche = meters * 39.37;
        return inche;
    }
    
    public static double showFeet(double meters){
        double feet = meters * 3.281;
        return feet;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Converting_distances s = new Converting_distances();
        
        boolean a = true;
        
        
        
        System.out.println("Enter your meter: ");
        int m = in.nextInt();
        while(a){
        s.Mean();
        System.out.println("Enter your selection:");
        int n = in.nextInt();
            if(n == 1){
                System.out.println(s.showKilometers(m));
            }
            else if( n == 2){
                System.out.println(s.showInches(m));
            }
            else if(n == 3){
                System.out.println(s.showFeet(m));
            }
            else if(n == 4){
                a = false;
            }
        }
       
    }
}
