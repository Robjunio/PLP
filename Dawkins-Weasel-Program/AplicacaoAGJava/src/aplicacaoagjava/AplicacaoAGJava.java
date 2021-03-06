package aplicacaoagjava;

import aplicacaoagjava.classes.WParent;
import java.util.Scanner;


import javax.swing.JOptionPane;

public class AplicacaoAGJava {
    
    //Main
    public static void main(String[] args) {
         //Declarando o scanner para ler os valores
        Scanner scan = new Scanner(System.in);
        
        System.out.println("SOLUÇÃO:");
        TARGET = scan.nextLine();
        
        System.out.println("NÚMEROS DE CÓPIAS:");
        NEW_WEASELS = scan.nextInt();
        
        //Verificação dos argumentos
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
        
         //Metodo principal AG
        runWeasel();
    }
    
   public static  String TARGET="";
    
   public static String GENES = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
   public static double MUTATION_RATE = 0.05;
    
   public static int NEW_WEASELS = 0;
    
    public  static void runWeasel(){
        JOptionPane.showMessageDialog (null, "COMEÇANDO");

        WParent theParent = new WParent(TARGET.length());
        WParent [] offspring = new WParent[NEW_WEASELS];
        int generations = 1;
        int bestAccuracy = theParent.accuracy();

        System.out.println("Geração:"+ generations +"|"+"Pontuação:"+ bestAccuracy+" Genoma: "+ theParent.getGenome());
        //loop para nova geração de individuos, pai e filho
        while(bestAccuracy < TARGET.length()){
            generations++; 
            for(int i =0; i<NEW_WEASELS;i++){
                offspring[i] = new WParent (theParent.getGenome());
            }
            //Verificação de melhor resultado de geração de filhos
            theParent = offspring[0];
            bestAccuracy = offspring[0].accuracy();
            for(int i =1;i<NEW_WEASELS; i++){
                if(offspring[i].accuracy()> bestAccuracy){
                   theParent = offspring[i];
                   bestAccuracy = offspring[i].accuracy();
                }
            }
            System.out.println("Geração:"+ generations + "|"+ "Pontuação:" + bestAccuracy+ "|"+" Genoma: "+theParent.getGenome());
        }
        JOptionPane.showMessageDialog (null, "O macaco foi gerado em: "+ generations+"°geração");
    }
}
