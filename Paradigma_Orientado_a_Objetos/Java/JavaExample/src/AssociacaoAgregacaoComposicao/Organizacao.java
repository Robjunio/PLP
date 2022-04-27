
package AssociacaoAgregacaoComposicao;


 public class Organizacao {
    private String nome;
    private Departamento dept;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDept() {
        return dept;
    }

    public Organizacao(String nome, Departamento dept) {
        this.nome = nome;
        this.dept = dept;
    }

    public Organizacao() {
    }

    public void setDept(Departamento dept) {
        this.dept = dept;
    }
    
     
}
