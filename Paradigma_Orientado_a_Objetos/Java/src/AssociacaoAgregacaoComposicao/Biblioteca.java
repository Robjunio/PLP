/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssociacaoAgregacaoComposicao;

import java.util.List;

/**
 *
 * @author ARKADE
 */
public class Biblioteca {
    private final List<Livro> livros;

    public Biblioteca(List<Livro> livros) {
        this.livros = livros;
    }
    public List<Livro> totalDeLivros(){
        return livros;
    }
    
}
