/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoagjava.classes;
/**
 *
 * @author danysimas
 */
public class WParent {
    
    private String genome ="";

    public WParent(int genomeLenght) {
        for(int i =0; i< genomeLenght; i++){
            genome += randomGene();
        }
    }

     public WParent(String parentGenome) {
         for(int i =0; i<parentGenome.length();i++){
             if(aplicacaoagjava.AplicacaoAGJava.MUTATION_RATE>=Math.random()){
                 genome += randomGene();
             }else{
                 genome+=parentGenome.charAt(i);
             }
         }
    }
     
     public String getGenome(){
         return genome;
     }
     
     public int accuracy(){
         int accuracyScore =0;
         for(int i=0; i<aplicacaoagjava.AplicacaoAGJava.TARGET.length(); i++){
             accuracyScore++;
         }
         return accuracyScore;
     }
    
    public static char randomGene(){
        int randomIndex = (int) Math.floor(Math.random()*aplicacaoagjava.AplicacaoAGJava.GENES.length());
        return aplicacaoagjava.AplicacaoAGJava.GENES.charAt(randomIndex);
    }
    
}
