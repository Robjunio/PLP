/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssociacaoAgregacaoComposicao;

/**
 *
 * @author ARKADE
 */
public class Main {
    public static void main(String[] args) {
        
        //Associação: 
        Professor prof = new Professor("Jucimar Jr");
        Estudante estudante = new Estudante("Marcos");
        
        System.out.println(estudante.getNome() + "é estudante do professor"+prof.getNome());
        
        
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
          
        System.out.println("O noem da CEO:"+org.getNome());        
        System.out.println("O nome do departamento:"+dep.getNome());
        System.out.println("Funcionario no departamento é" +anim2.getDieta());
        System.out.println("Seu porte é: " +anim2.getPorte());
        System.out.println("Sua categoria: " +anim2.getCategoria());
        
        
    }
}
