package rpggame;
public class being {
    private String nome;
    private int nivel;
    private int experienciaATUAL;
    private int ouro;
    
    public being(){
    }

    // GETS E SETS
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

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
}
