package aplicacaoagjava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author danysamis
 */
public class Algoritmo {
    
    int score = 0;
    int generation = 0;
    int bigScore;
    public static final String TARGET = "TARGET \"METHINKS IT IS LIKE A WEASEL";
    char  ALPHABERT[]= { ' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getBigScore() {
        return bigScore;
    }

    public void setBigScore(int bigScore) {
        this.bigScore = bigScore;
    }
    
    
    private void DarwinTEST(Monkey monkey){
        Random random = new Random();
        ArrayList <Monkey> monkeys = new ArrayList<>();
        while(monkey.getPhrase().equals(TARGET)){
           for (int i =0; i<monkeys.size();i++) {
              monkeys.get(i).setPhrase(monkey.getPhrase());
              for(int j =0; j<29; j++){
                  if(random.nextInt(101)<=5){
                      
                      
                  }
                  
             }
               
            
           }
        
        }
        
        
        
    }
    
    
    
    
    
}
