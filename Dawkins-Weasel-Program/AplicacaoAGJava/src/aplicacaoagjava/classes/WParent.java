package aplicacaoagjava.classes;
/**
 *
 * @author danysimas / luamaquine
 */
public class WParent {
    // classe referente ao individuo
    private String genome ="";
    // Geração de genomas aleatorios
    public WParent(int genomeLenght) {
        for(int i =0; i< genomeLenght; i++){
            genome += randomGene();
        }
    }
    //Aplicação das mutaçoes para as proximas gerações
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
     
    //Retorna o maior score do individuo que seria accuracy
     public int accuracy(){
         int accuracyScore =0;
         for(int i=0; i<aplicacaoagjava.AplicacaoAGJava.TARGET.length(); i++){
             if(aplicacaoagjava.AplicacaoAGJava.TARGET.charAt(i)==genome.charAt(i)){
                 accuracyScore++;
             }
             
         }
         return accuracyScore;
     }
    //Retornando char de um gene que fica na string de "genes" a partir de um randomIndex
    public static char randomGene(){
        int randomIndex = (int) Math.floor(Math.random()*aplicacaoagjava.AplicacaoAGJava.GENES.length());
        return aplicacaoagjava.AplicacaoAGJava.GENES.charAt(randomIndex);
    }
    
}
