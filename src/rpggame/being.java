package rpggame;
public class being {
    private int nivel;
    private int experienciaATUAL;
    private int ouro;
    
    private int nívelMáximo = 8;
    private double experienciaMáxima = 200;
    
    public being(int nivel, int exp, int ouro){
        this.nivel = nivel;
        this.experienciaATUAL = exp;
        this.ouro = ouro;
    }
    
    public void expMAIS(int val){
        experienciaATUAL += val;
        
        if (experienciaATUAL >= experienciaMáxima) {
            ouro += 100;
            nivel += 1;
            experienciaATUAL = 0;
            experienciaMáxima = experienciaMáxima*3;
        }
    }

    // GETS E SETS
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperienciaATUAL() {
        return experienciaATUAL;
    }

    public void setExperienciaATUAL(int experienciaATUAL) {
        this.experienciaATUAL = experienciaATUAL;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public int getNívelMáximo() {
        return nívelMáximo;
    }

    public void setNívelMáximo(int nívelMáximo) {
        this.nívelMáximo = nívelMáximo;
    }

    public double getExperienciaMáxima() {
        return experienciaMáxima;
    }

    public void setExperienciaMáxima(double experienciaMáxima) {
        this.experienciaMáxima = experienciaMáxima;
    }
}
