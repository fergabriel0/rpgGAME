package rpggame;

import java.util.ArrayList;

public class loja {
    private int preco;
    private int precoVENDA;
    private String nome;
    private String descricao;
    
    public loja() {}
    
    public loja(int preco, String nome, String descricao, int precoVENDA) {
        /* MANO, O ERRO QUE TAVA ANTES: preco = this.preco; */
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.precoVENDA = precoVENDA;
    } /* construtor */
    
    /* arrays de objetos a serem vendidos */
    ArrayList<loja> lista1 = new ArrayList<>();
    ArrayList<loja> lista2 = new ArrayList<>();

    public void addITEMS() {
        loja item1 = new loja(10, "Poção de Cura", "Cura o usuário em 10 pontos.",5);
        loja item2 = new loja(20, "Poção de Mana", "Cura a mana do usuário em 50 pontos.",10);
        loja item3 = new loja(15, "Poção de Defesa", "Concede 4 de defesa por 1 batalha.",8);
        loja item4 = new loja(15, "Poção de Ataque", "Concede 3 de ataque por 1 batalha.",8);
        
        lista1.add(item1);
        lista1.add(item2);
        lista1.add(item3);
        lista1.add(item4);
        
        //a lista2 pode adicionar depois (é a que se refere a armas).
    }

    public ArrayList<loja> getLista1() {
        return lista1;
    }
    
    public ArrayList<loja> getLista2() {
        return lista2;
    }
    
    //GETTERS
    public int getPreco() {
        return preco;
    }
    
    public String getNome() {
        return nome;
    }

    public int getPrecoVENDA() {
        return precoVENDA;
    }

    public String getDescricao() {
        return descricao;
    }
}
