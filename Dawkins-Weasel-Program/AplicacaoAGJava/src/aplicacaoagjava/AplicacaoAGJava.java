/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaoagjava;

import aplicacaoagjava.classes.WParent;


import javax.swing.JOptionPane;
public class AplicacaoAGJava {
    
    public static void main(String[] args) {
        
        for(String arg: args){
            arg =arg.toUpperCase();
            if(arg.matches("^[0-9]+$")){
                NEW_WEASELS = Integer.parseInt(arg);
            }else if(arg.matches("^["+GENES+"]+$")){
                TARGET = arg;
            }else{
                System.out.println("Argumento["+arg+"] não é válido");
            }
                
            }
        runWeasel();
    }
    
    public static String TARGET="METHNKS IT IS LIKE A WEASEL";
    
    public static String GENES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public static double MUTATION_RATE = 0.05;
    
    public static int NEW_WEASELS = 50;
    
    public void runWeasel(){
        System.out.println("COMEÇANDO");
        
        WParent theParent = new WParent(TARGET.length());
        WParent [] offspring = new WParent[NEW_WEASELS];
        int generations = 1;
        int bestAccuracy = theParent.accuracy();
        
        JOptionPane.showConfirmDialog(null, "Geração:"+generations+"|"+"Maior precisão");
        
        
        
    }
    
    
    
}
