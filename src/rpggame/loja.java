package rpggame;

import java.util.ArrayList;

public class loja {
    private int preco;
    private String nome;
    private String descricao;
    
    public loja() {}
    
    public loja(int preco, String nome, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    } /* construtor */
    
    ArrayList<loja> lista = new ArrayList<>();

    public ArrayList<loja> getLista() {
        
        loja item1 = new loja(400, "Poção de Prata", "Multiplica em 3x a quantidade de minérios de Prata conseguidos.");
        loja item2 = new loja(800, "Colar de Ouro", "Multiplica em 2x a quantidade de minérios de Ouro conseguidos.");
        loja item3 = new loja(1200, "Moeda de Platina", "Aumenta a chance de se conseguir minérios de Platina.");
        
        lista.add(item1);
        lista.add(item2);
        lista.add(item3);
        return lista;
    }
    
    //GETTERS
    public int getPreco() {
        return preco;
    }
    
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
