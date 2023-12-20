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
        
        /*
        a ideia pra conectar os dois é a seguinte:
        
        aqui tem todo o código do jogo normal, blz.
        
        vai ter métodos que serão pra comunicar com o principal.
        
        única dúvida: tem como executar no principal.java:
        a criação do objeto; pode, executa toda a pilha de comandos logo de uma vez.
        os métodos do objeto;
        
        */
        //feedback.set/get.
    }
            
    public static void main(String[] args) {
        
    }
    
    ////////////////////////////////////////////////////////////////////////////            

    public String getFeedback() {
        return feedback;
    }
    
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
