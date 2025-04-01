/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huangjianting
 */
public class TestScores {
    public static boolean demostrateClass(double[] a){
        boolean v = true;
        
        try{
            for (int i = 0; i < a.length; i++) {
                if( 0 > a[i] || a[i] > 100){
                    throw new IllegalArgumentException("Invalid score is find");
                }
            }
            
        }
        catch(IllegalArgumentException e){
            v = false;
            System.out.println("IllegalArgumentException " + e.getMessage());
        }
        
        return v;
    }
    
    public static void main(String[] args) {
        TestScores testOne = new TestScores();
        double [] badScores= {97.5, 66.7, 88.0, 101.0, 99.0};
        double [] goodScores= {97.5, 66.7, 88.0, 100.0, 99.0};
        
        
        if(testOne.demostrateClass(badScores) == false){
            System.out.println("The badScores contain at least one invalid score");
        }
        else{
            System.out.println("The badScores do not contain at least one invalid scores");
        }
        
        if(testOne.demostrateClass(goodScores) == false){
            System.out.println("The goodScores contain at least one invalid score");
        }
        else{
            System.out.println("The goodScores do not contain at least one invalid score");
        }
        
        
    }
}
