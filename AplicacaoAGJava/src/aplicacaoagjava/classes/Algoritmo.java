/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoagjava.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danysamis
 */
public class Algoritmo {
    
    int score = 0;
    int generation = 0;
    int bigScore;
    public static final String TARGET = "TARGET \"METHINKS IT IS LIKE A WEASEL";
    public static final String ALPHABERT = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

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
        List <Monkey> monkeys = new ArrayList<Monkey>(29);
        while(monkey.getPhrase().equals(TARGET)){
            
        }
        for (Monkey monkey1 : monkeys) {
            monkey1.setPhrase(monkey.getPhrase());
        }
        
        
        
    }
    
    
    
    
    
}
