package rpggame;

import java.util.ArrayList;

public class loja {
    private int preco;
    private int precoVENDA;
    private String nome;
    private String descricao;
    
    public loja(int preco, String nome, String descricao, int precoVENDA) {
        preco = this.preco;
        nome = this.nome;
        descricao = this.descricao;
        precoVENDA = this.precoVENDA;
    } /* construtor */
    
    /* arrays de objetos a serem vendidos */
    ArrayList<loja> lista1 = new ArrayList<loja>();
    loja item1 = new loja(10, "poção de cura", "cura o usuário em 10 pontos.",5);
    loja item2 = new loja(20, "poção de mana", "cura a mana do usuário em 50 pontos.",10);
    loja item3 = new loja(15, "poção de defesa", "concede 4 de defesa por 1 batalha.",8);
    
    ArrayList<loja> lista2 = new ArrayList<loja>();
    loja item4 = new loja(30, "poção de ataque", "concede 4 de ataque por 1 batalha.",15);
    loja item5 = new loja(40, "amuleto da sorte", "enche o usuário com fortuna e sorte.",20);
    loja item6 = new loja(50, "espada enferrujada", "quando equipada concede +2 em cada ataque.",25);
    
}
