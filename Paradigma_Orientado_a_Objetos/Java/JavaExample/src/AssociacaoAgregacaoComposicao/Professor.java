
package AssociacaoAgregacaoComposicao;


//Associação
public class Professor {
    
    private String nome;
    
    Professor (){
        
    }
    
    Professor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

