package rpggame;

import java.util.ArrayList;
import java.util.Random;

public class minerios {
    private int valordeVENDA;
    private String NomedoMinerio;
    
    public minerios(int valor, String nome) {
        this.valordeVENDA = valor;
        this.NomedoMinerio = nome;
    }
    
    public minerios(){}
    
    ArrayList<minerios> minerios_conseguidos = new ArrayList<>();
    
    Random gerador = new Random();
    
    public ArrayList<minerios> minerar() {
        
        minerios Prata = new minerios(10, "Prata");
        minerios Ouro = new minerios(20, "Ouro");
        minerios Platina = new minerios(30, "Platina");
        
        int randomizer = gerador.nextInt(26);
        int continuo = 10;
        
        for (int i = 0; i<continuo; i++) {
            
            if (randomizer > 0 && randomizer < 15) {
                minerios_conseguidos.add(Prata);
            } else if (randomizer > 15 && randomizer < 24) {
                minerios_conseguidos.add(Ouro);
            } else if (randomizer > 25) {
                minerios_conseguidos.add(Platina);
            }
            
            randomizer = gerador.nextInt(26);
        }
        
        return minerios_conseguidos;
    }

    ///////////////////////////////////////////////////////
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
}
