package rpggame;
public class being {
    private int vidabase;
    private String nome;
    private int atkbase;
    private int nivel;
    private int defesa;
    private int manaATUAL;
    private int manaMáxima;
    
    public void Atacar(){}
    
    public void restaurarMana(){}
    
    public void uparNível(){}

    // GETS E SETS
    public int getVidabase() {
        return vidabase;
    }

    public void setVidabase(int vidabase) {
        this.vidabase = vidabase;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getAtkbase() {
        return atkbase;
    }

    public void setAtkbase(int atkbase) {
        this.atkbase = atkbase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getManaATUAL() {
        return manaATUAL;
    }

    public void setManaATUAL(int manaATUAL) {
        this.manaATUAL = manaATUAL;
    }

    public int getManaMáxima() {
        return manaMáxima;
    }

    public void setManaMáxima(int manaMáxima) {
        this.manaMáxima = manaMáxima;
    }
    
    // AQUI QUE ACABA.
}
