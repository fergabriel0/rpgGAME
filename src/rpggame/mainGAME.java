package rpggame;
public class mainGAME {
    
    private String feedback; //getter e setter
    
    public void iniciarJOGO() {
        being Jogador = new being();
        Jogador.setAtkbase(3);
        Jogador.setDefesa(4);
        Jogador.setManaATUAL(0);
        Jogador.setManaMáxima(100);
        Jogador.setNivel(2);
        Jogador.setNome("Jogador1");
        Jogador.setVidabase(20);
    }
    
    ////////////////////////////////////////////////////////////////////////////            

    public String getFeedback() {
        return feedback;
    }
    
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
