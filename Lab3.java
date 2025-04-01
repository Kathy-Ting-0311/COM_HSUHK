/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huangjianting
 * 
 * @version 1.0
 * @since 22 Jan 2025
 */
public class Lab3 {
    public static void renCode(double a){
        try{
            if(a < 0){
                throw new IllegalArgumentException("Invaild ");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("The error is " + e.getMessage());
        }
        finally{
            System.out.println("This is the \"finally\"block" );
        }
    }
    
    
}
