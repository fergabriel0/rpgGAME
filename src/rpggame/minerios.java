package rpggame;

public class minerios {
    private int valordeVENDA;
    private String NomedoMinerio;
    private int quantidade;
    
    public minerios(int valor, String nome) {
        this.valordeVENDA = valor;
        this.NomedoMinerio = nome;
    }
    
    public minerios(){}
    
    public int getValordeVENDA() {
        return valordeVENDA;
    }

    public void setValordeVENDA(int valordeVENDA) {
        this.valordeVENDA = valordeVENDA;
    }

    public String getNomedoMinerio() {
        return NomedoMinerio;
    }

    public void setNomedoMinerio(String NomedoMinerio) {
        this.NomedoMinerio = NomedoMinerio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
