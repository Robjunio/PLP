package aplicacaoagjava.classes;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author danysamis
 */
public class Algoritmo {
    
    int score = 0;
    int generation = 0;
    int bigScore;
    public char TARGET [] = {'M','E','T','H','I','N','K','S', ' ', 'I','T', ' ', 'I','S', ' ', 'L','I','K','E',' ', 'A', ' ', 'W','E','A','S','E','L'};                        
    
  
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
        for(int j =0; j<newMonkey.length;j++){
           
        }
        
        return newMonkey;
        
    }
    
    
    public void DarwinTEST(Monkey monkey){
        
        Random random = new Random();
        Monkey monkeys[] = new Monkey[100];
        int index = 0,bigValue = 0;
        
        
        while(monkey.getPhrase()!= TARGET){
           for (int i =0; i<100;i++) {
               System.out.println("a");
                if(monkeys[i]==null){
                    System.out.print("mamamco null");
                }
                //monkeys[i].setPhrase(monkey.getPhrase()); 
                //System.out.println(monkeys[i].getPhrase());
                int value = 0;
              for(int j =0; j<29; j++){
                  if(random.nextInt(101)<=5){
                       monkeys[i].phrase[j]= ALPHABERT[random.nextInt(27)];
                  }
                  if (monkeys[i].phrase[j]==TARGET[j]){                   
                      value +=1;
                  }
                }
             if(value>bigValue){
                 bigValue = value;
                 index = i;
             }
             
           }
          System.out.print(index);
        }
        
        //monkey.setPhrase;
        
    }
    
}