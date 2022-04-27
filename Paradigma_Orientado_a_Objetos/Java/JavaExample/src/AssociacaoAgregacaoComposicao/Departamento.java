
package AssociacaoAgregacaoComposicao;

public class Departamento {
    private String nome;
    private Funcionario func;
    private Organizacao org;

    public Departamento(String nome, Funcionario func, Organizacao org) {
        this.nome = nome;
        this.func = func;
        this.org = org;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public void setOrg(Organizacao org) {
        this.org = org;
    }

    public Departamento() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario getFunc() {
        return func;
    }

    public Organizacao getOrg() {
        return org;
    }

}
