/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ARKADE
 */
public class MainNormal {
    public static void main(String[] args) {
        Animal anim1 = new Animal();
        Animal anim2 = new Animal("Pequeno", "Panda Vermelho", "Panda", "Onivoro");
        anim1.setNome("Guaxinim");
        anim1.setPorte("Pequeno");
        anim1.setCategoria("Mamífero");
        anim1.setDieta("Onivoro");
       
      
       
        
        
        
        System.out.println("O primeiro Animal :");        
        System.out.println("O nome do animal é : " +anim1.getNome());
        System.out.println("Sua dieta : " +anim1.getDieta());
        System.out.println("Seu porte é: " +anim1.getPorte());
        System.out.println("Sua categoria: " +anim1.getCategoria());
        //Animal 1
        anim1.andar();
        anim1.comer();
        anim1.reproduzir();
        
        
        System.out.println("O segundo Animal :");        
        System.out.println("O nome do animal é : " +anim2.getNome());
        System.out.println("Sua dieta : " +anim2.getDieta());
        System.out.println("Seu porte é: " +anim2.getPorte());
        System.out.println("Sua categoria: " +anim2.getCategoria());
        //Animal 2
        anim2.andar();
        anim2.comer();
        anim2.reproduzir();
        
    }
}
