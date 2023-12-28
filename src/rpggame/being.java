package rpggame;
public class being {
    private int vidabase;
    private String nome;
    private int atkbase;
    private int nivel;
    private int defesa;
    private int manaATUAL;
    private int manaMáxima;
    private int experienciaATUAL;
    private int ouro;
    
    public being(String nome, int atkbase, int defesa, int vidabase) {
        nome = this.nome;
        atkbase = this.atkbase;
        defesa = this.defesa;
        vidabase = this.vidabase;
    } /* inimigo */
    
    public being(){}
    
    public void Atacar(int golpe){
        
    }
    
    public void restaurarMana(){
        if (manaATUAL == manaMáxima) {
            System.out.println("A mana já está cheia.");
        } else {
            manaATUAL = manaMáxima;
        }
    }
    
    public void uparAtributos(){
    defesa+=3;
    atkbase+=3;
    manaMáxima+= 10;
    vidabase = (vidabase/2) + vidabase;
    
    }
    
    public void uparNível() {
        if (getExperienciaATUAL() >= 200) {
            uparAtributos();
        } else if (getExperienciaATUAL() >= 400) {
            uparAtributos();
        }
    }

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

    /**
     * @return the experienciaATUAL
     */
    public int getExperienciaATUAL() {
        return experienciaATUAL;
    }

    /**
     * @param experienciaATUAL the experienciaATUAL to set
     */
    public void setExperienciaATUAL(int experienciaATUAL) {
        this.experienciaATUAL = experienciaATUAL;
    }

    /**
     * @return the ouro
     */
    public int getOuro() {
        return ouro;
    }

    /**
     * @param ouro the ouro to set
     */
    public void setOuro(int ouro) {
        this.ouro = ouro;
    }
}
