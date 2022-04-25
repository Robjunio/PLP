
package ConceitosSimples;
public class Animal {

    private String dieta;
    private String porte;
    private String categoria;
    private String nome;
    
    
    
    Animal(){
        
    }
    
    Animal (String porte, String nome, String categoria, String dieta ){
        this.porte = porte;
        this.categoria = categoria;
        this.dieta = dieta;
        this.nome = nome;
    }
    
    public void comer (){
        System.out.println("O "+this.nome+" está comendo ");
    }
    
    public void reproduzir(){
        System.out.println("O "+this.nome+" está reproduzindo ");
    }
    
    public void andar(){
        System.out.println("O "+this.nome+" está andando ");
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
