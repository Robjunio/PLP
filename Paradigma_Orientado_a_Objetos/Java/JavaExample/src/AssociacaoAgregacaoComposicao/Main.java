/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssociacaoAgregacaoComposicao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ARKADE
 */
public class Main {
    public static void main(String[] args) {
        
        //Associação: 
        Professor prof = new Professor("Jucimar Jr");
        Estudante estudante = new Estudante("Marcos");
        
        System.out.println(estudante.getNome() + " é estudante do professor "+prof.getNome());
        
        
        // Agregação
        Departamento dep = new Departamento();
        Funcionario func = new Funcionario();
        Organizacao org = new Organizacao();
        dep.setNome("TI");
        func.setId(1);
        func.setNome("Mariana");
        func.setDept(dep);
        dep.setFunc(func);
        org.setNome("CEO BLA BLA BLA");
        org.setDept(dep);
          
        System.out.println("O noem da CEO: "+org.getNome());        
        System.out.println("O nome do departamento: "+dep.getNome());
        System.out.println("Funcionario no departamento " +dep.getNome()+ "é " +func.getNome());
        
        
        //Composição
         Livro bookObj1 = new Livro("Java:A Beginner's Guide","Herbert Schildt");
         Livro bookObj2 = new Livro("Core and Advanced Java", " Dreamtech Press");
         Livro bookObj3 = new Livro("Head First Java", "Kathy Sierra");
         List<Livro> books = new ArrayList<Livro>();
         books.add(bookObj1);
         books.add(bookObj2);
         books.add(bookObj3);
         Biblioteca library = new Biblioteca(books);
         List<Livro> bks = library.totalDeLivros();
         for(Livro bk : bks){
             System.out.println("Title : " + bk.getTitulo() + " and "
          +" Author : " + bk.getAutor());
    }
        
    }
}
