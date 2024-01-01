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

    public void addITEMSlista1() {
        loja item1 = new loja(100, "Poção de Prata", "Multiplica em 3x a quantidade de minérios de Prata conseguidos.",45);
        loja item2 = new loja(200, "Colar de Ouro", "Multiplica em 3x a quantidade de minérios de Ouro conseguidos.",100);
        loja item3 = new loja(400, "Moeda de Platina", "Aumenta a chance de se conseguir minérios de Platina.",200);
        
        lista1.add(item1);
        lista1.add(item2);
        lista1.add(item3);
    }
    
    public void addITEMSlista2() {
        loja item4 = new loja(1000, "Localizador Sonar", "Permite encontrar tesouros.",5);
        loja item5 = new loja(1300, "Sexto Sentido", "Permite encontrar joias.",10);
        
        lista2.add(item4);
        lista2.add(item5);
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
