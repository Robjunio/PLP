/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssociacaoAgregacaoComposicao;

/**
 *
 * @author ARKADE
 */
public class Funcionario {
    private String nome;
    private int id;
    private Departamento dept;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public Departamento getDept() {
        return dept;
    }

    public Funcionario(String nome, int id, Departamento dept) {
        this.nome = nome;
        this.id = id;
        this.dept = dept;
    }

    public Funcionario() {
    }

    public void setDept(Departamento dept) {
        this.dept = dept;
    }
    
}
