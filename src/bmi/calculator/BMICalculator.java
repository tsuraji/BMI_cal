/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author MY SAMSUNG
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Welcome to BMI Calculator");
        String height = JOptionPane.showInputDialog(null,"Enter Height : ");
        String weight = JOptionPane.showInputDialog(null,"Enter weight : ");
        double h = Double.parseDouble(height);
        double w = Double.parseDouble(weight);
        double bmi = w/(h*h);
        Long bmis = Math.round(bmi);
        JOptionPane.showMessageDialog(null,"Your BMI is "+bmis+" kg/m2");
        if (bmi>=25){
        JOptionPane.showMessageDialog(null,"You are Obese"); 
        }
        else if (bmi<=20 && bmi>=20){
        JOptionPane.showMessageDialog(null,"You are in Normal Range");}
        else 
        {
        JOptionPane.showMessageDialog(null,"You are Underweight");
        }
        
            
            
        }
        
        
        
                
        
        
    }
    

