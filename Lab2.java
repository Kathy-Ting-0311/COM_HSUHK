/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huangjianting
 */
public class Lab2 {
    public static void convert(String a) throws NumberFormatException, IllegalArgumentException{
       int number = Integer.parseInt(a);
    }
    public static void main(String[] args) {
        
        try{
            convert("Hello");
        }
        catch(NumberFormatException e1){
            System.out.println("NumberFormatException happen " + e1.getMessage());
        }
        catch(IllegalArgumentException e2){
            System.out.println("IllegalArgumentException happen " + e2.getMessage());
        }
    }
}
