/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class TemperatureConversor {
        public static int converChoice;
        public  static float fahrenheintDegree;
        public static float celsiusDegree;
        public static float kelvinDegree;
        
        public static void main(String[]args) {
            
            Scanner input = new Scanner(System.in);
            
            System.out.print("Type 1 for F to C, 2 for C to K: ");
            converChoice = input.nextInt();
            
            if(converChoice == 1) {
                System.out.print("Enter temperature in F:");
                fahrenheintDegree = input.nextFloat();
                celsiusDegree = (((fahrenheintDegree - 32) * 5) /9);
                
                System.out.print("Your temperature is: " + celsiusDegree + " degrees Celsius");
            }
            
            else if(converChoice == 2) {
                System.out.print("Enter temperature in F:");
                fahrenheintDegree = input.nextFloat();
                kelvinDegree = (float) (((fahrenheintDegree + 459.67) * 5) /9);
                
                System.out.println("Your temperature is: " + kelvinDegree + " degrees Kelvin");
                          
            }
            
            else {
                System.out.print("Enter temperature in C:");
                celsiusDegree = input.nextFloat();
                kelvinDegree = (celsiusDegree + 273);
                
                System.out.println("Your temperature is " + kelvinDegree + " degrees Kelvin");
                
            }
        }  
    }
        
        
        
    
        
        
        
        
        
        
        
        
