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
    char TARGET [] = {'M','E','T','H','I','N','K','S', 'I','T', 'I','S', 'L','I','K','E','A', 'W','E','A','S','E','L'};                        
    
  
    char ALPHABERT[]= { ' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

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
    
    
    public char[] DarwinMonkey(){
        char[] newMonkey = new char[29];
        Random random = new Random();
        
        for(int i =0; i<29; i++){
            newMonkey[i] = ALPHABERT[random.nextInt(27)];
        }
        return newMonkey;
        
    }
    
    
    public void DarwinTEST(Monkey monkey){
        Random random = new Random();
        ArrayList<Monkey> monkeys = new ArrayList <>();
        int index = 0,bigValue = 0;
        while(monkey.getPhrase() != TARGET){
           for (int i =0; i<monkeys.size();i++) {
               monkeys.get(i).phrase = monkey.getPhrase();
               int value = 0;
              for(int j =0; j<29; j++){
                  if(random.nextInt(101)<=5){
                      System.out.println(monkeys.get(i).phrase[j]);
                      monkeys.get(i).phrase[j] = ALPHABERT[random.nextInt(27)];
                  }
                  System.out.println(monkeys.get(i).phrase[j]);
                  if(monkeys.get(i).phrase[j]==TARGET[j]){
                      
                      
                      value +=1;
                  }
                }
             if(value>bigValue){
                 bigValue = value;
                 index = i;
             }
             
           }
           

          //System.out.print(index);
          
           
        }
        
        
        
    }
    
}
