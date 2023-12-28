package rpggame;
public class mainGAME {
    
    /* Mudança:
    Por conta da complexidade relacionada ao desenvolvimento desse projeto, tendo em conta que ele é apenas para
    ser um projeto de treino para os conceitos de P.O.O, ele terá seu foco principal mudado: de um jogo de RPG em
    turnos com sistema de inimigos, vida, ataque e magia, para uma abordagem um tanto quanto mais pé no chão: um
    simples simulador de minerar e aprimorar equipamentos com o objetivo de conseguir minérios melhores. Isto
    através de um mini-game que ainda não foi decidido qual será.
    
    Isso se aplica principalmente ao jeito que o personagem e os itens da loja irão se comportar porém mecânicas como
    a de inventário e a da base da loja em si irão continuar tendo a mesma ideia. Com um escopo mais simples de projeto,
    sobrará mais espaço para pensar em qual lugar o pilar X poderá ser introduzido, sem ter que lidar com o estresse de
    desenvolver mecânicas no escuro.
    */
    
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
