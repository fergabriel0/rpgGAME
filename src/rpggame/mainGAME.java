package rpggame;
public class mainGAME {
    public void iniciarPersonagem() {
        being Jogador = new being();
        Jogador.setAtkbase(3);
        Jogador.setDefesa(4);
        Jogador.setManaATUAL(0);
        Jogador.setManaMáxima(100);
        Jogador.setNivel(2);
        Jogador.setNome("Jogador");
        Jogador.setVidabase(20);
        Jogador.setOuro(500);
    }
    
    public void performAction(being target){
        //battleAction.execute(this, target);
    };
    
    public void setBattleAction(being chosenAction){
        //battleAction = chosenAction;
    }

    ////////////////////////////////////////////////////////////////////////////            
}
