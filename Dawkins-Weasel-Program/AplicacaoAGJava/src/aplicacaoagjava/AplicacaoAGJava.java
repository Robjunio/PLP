/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaoagjava;

import aplicacaoagjava.classes.Algoritmo;
import aplicacaoagjava.classes.Monkey;


/**
 *
 * @author danysimas
 */

public class AplicacaoAGJava {
    
    public static void main(String[] args) {
       
        Monkey monkey = new Monkey();
        
        Algoritmo algorimto = new Algoritmo();
        
        
       
        monkey.setPhrase(algorimto.DarwinMonkey());
        
        //System.out.println(monkey.getPhrase());
        
        char [] m = monkey.getPhrase();
        
        //System.out.println(m);
        
        System.out.println(monkey.getPhrase() != algorimto.TARGET);
        
        algorimto.DarwinTEST(monkey);
        
        
        
        
      
        
        
    }
    
    
}
