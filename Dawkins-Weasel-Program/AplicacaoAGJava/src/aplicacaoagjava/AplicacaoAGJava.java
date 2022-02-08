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
    
    public  static void runWeasel(){
        System.out.println("COMEÇANDO");
        
        WParent theParent = new WParent(TARGET.length());
        WParent [] offspring = new WParent[NEW_WEASELS];
        int generations = 1;
        int bestAccuracy = theParent.accuracy();
        
        System.out.println("Geração:"+generations+"|"+"Pontuação:"+bestAccuracy+"Genoma: "+theParent.getGenome());
        
        while(bestAccuracy< TARGET.length()){
            generations++;
        
        
        for(int i =0; i<NEW_WEASELS;i++){
            offspring[i] = new WParent (theParent.getGenome());
        }
        theParent = offspring[0];
        bestAccuracy = offspring[0].accuracy();
        for(int i =1;i<NEW_WEASELS; i++){
            if(offspring[i].accuracy()> bestAccuracy){
                theParent = offspring[i];
                bestAccuracy = offspring[i].accuracy();
            }
            
        }
        System.out.println("Geração:"+generations+"|"+"Pontuação:"+bestAccuracy+"Genoma: "+theParent.getGenome());
          
    }
    System.out.println("O macaco foi");
    }
}
