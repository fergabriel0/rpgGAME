package rpggame;

import java.util.ArrayList;

public class loja {
    private int preco;
    private int precoVENDA;
    private String nome;
    private String descricao;
    
    public loja() {}
    
    public loja(int preco, String nome, String descricao, int precoVENDA) {
        preco = this.preco;
        nome = this.nome;
        descricao = this.descricao;
        precoVENDA = this.precoVENDA;
    } /* construtor */
    
    /* arrays de objetos a serem vendidos */
    ArrayList<loja> lista1 = new ArrayList<loja>();

    public void getLista1() {
        loja item1 = new loja(10, "poção de cura", "cura o usuário em 10 pontos.",5);
        loja item2 = new loja(20, "poção de mana", "cura a mana do usuário em 50 pontos.",10);
        loja item3 = new loja(15, "poção de defesa", "concede 4 de defesa por 1 batalha.",8);
        
        lista1.add(item1);
        lista1.add(item2);
        lista1.add(item3);
    }
}
