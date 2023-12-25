package rpggame;

import java.util.ArrayList;

public class loja {
    private int preco;
    private String nome;
    private String descricao;
    
    public loja(int preco, String nome, String descricao) {
        preco = this.preco;
        nome = this.nome;
        descricao = this.descricao;
    } /* construtor */
    
    /* array de objetos a serem vendidos */
    ArrayList<loja> lista1 = new ArrayList<loja>();
    loja item1 = new loja(10, "poção de cura", "cura o usuário em 10 pontos.");
    loja item2 = new loja(10, "poção de mana", "cura a mana do usuário em 50 pontos.");
    loja item3 = new loja(10, "poção de defesa", "concede 4 de defesa por 1 batalha.");
    /* método para pegar essa lista (ou outra, se preciso)*/
    
    /* método para acessar um item dessa lista */
}
