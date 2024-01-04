package rpggame;

import java.util.ArrayList;

public class loja {
    private int preco;
    private int precoVENDA;
    private String nome;
    private String descricao;
    
    public loja() {}
    
    public loja(int preco, String nome, String descricao, int precoVENDA) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.precoVENDA = precoVENDA;
    } /* construtor */
    
    //LISTA
    /*loja item1 = new loja(100, "Poção de Prata", "Multiplica em 3x a quantidade de minérios de Prata conseguidos.",50);
    loja item2 = new loja(200, "Colar de Ouro", "Multiplica em 3x a quantidade de minérios de Ouro conseguidos.",100);
    loja item3 = new loja(400, "Moeda de Platina", "Aumenta a chance de se conseguir minérios de Platina.",200);*/
    
    ArrayList<loja> lista = new ArrayList<>();
    
    /*public void addITEMSlista() {
        lista.add(item1);
        lista.add(item2);
        lista.add(item3);
    }*/

    public ArrayList<loja> getLista() {
        /*lista.add(item1);
        lista.add(item2);
        lista.add(item3);*/
        return lista;
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
