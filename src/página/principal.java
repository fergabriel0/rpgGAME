package página;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import rpggame.loja;
import rpggame.minerios;
import java.util.Random;
import rpggame.being;

public class principal extends javax.swing.JFrame {
    public principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_jogar = new javax.swing.JButton();
        btn_inventario = new javax.swing.JButton();
        btn_loja = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAREA = new javax.swing.JTextArea();
        textfield = new javax.swing.JTextField();
        btnENVIAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_jogar.setFont(new java.awt.Font("Swis721 BT", 0, 18)); // NOI18N
        btn_jogar.setText("JOGAR");
        btn_jogar.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn_jogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_jogarMouseClicked(evt);
            }
        });

        btn_inventario.setFont(new java.awt.Font("Swis721 BT", 0, 18)); // NOI18N
        btn_inventario.setText("INVENTÁRIO");
        btn_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });

        btn_loja.setFont(new java.awt.Font("Swis721 BT", 0, 18)); // NOI18N
        btn_loja.setText("LOJA");
        btn_loja.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn_loja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lojaActionPerformed(evt);
            }
        });

        textAREA.setEditable(false);
        textAREA.setColumns(20);
        textAREA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textAREA.setLineWrap(true);
        textAREA.setRows(5);
        jScrollPane1.setViewportView(textAREA);

        textfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnENVIAR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnENVIAR.setText("ENVIAR");
        btnENVIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnENVIARMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(btn_loja, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btn_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnENVIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfield)
                    .addComponent(btnENVIAR, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_loja, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    loja mercado = new loja();
    int numeroPagina = 0;
    being Jogador = new being(1, 0, 0);
    
    int modPrata = 1;
    int modOuro = 1;
    int modPlatina = 0;
    
    ArrayList<minerios> InventarioMinerios = new ArrayList<>();
    ArrayList<loja> InventarioItems = new ArrayList<>();
    ArrayList<loja> items = mercado.getLista();
    
    minerios Prata = new minerios(20, "Prata");
    minerios Ouro = new minerios(60, "Ouro");
    minerios Platina = new minerios(150, "Platina");
    
    public void printarMinerios() {
        textAREA.setText("[MINÉRIOS]:\n");
        
        for (int i = 0; i<InventarioMinerios.size(); i++) {
        textAREA.setText(textAREA.getText() +
            "[NOME]: " + InventarioMinerios.get(i).getNomedoMinerio() + "\n" +
            "[VENDA]: " + InventarioMinerios.get(i).getValordeVENDA() + "$ \n\n");
        }
    }
    
    public void printarItems() {
        for (int i = 0; i<InventarioItems.size(); i++) {
            textAREA.setText(textAREA.getText()+
                "[NOME]: " + InventarioItems.get(i).getNome()+"\n");
        }
    }
    
    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        numeroPagina = 1;
        textfield.setEnabled(true);
        
        printarMinerios();
        
        textAREA.setText(textAREA.getText() + "[ITENS]:\n");
        
        printarItems();
        
        textAREA.setText(textAREA.getText() + "Para fazer a venda de um item, digite: vender -> nome do item\n"+
        "Para acessar o seu perfil, digite: perfil -> #");
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_lojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lojaActionPerformed
        numeroPagina = 2;
        textAREA.setText("");
        textfield.setEnabled(true);
        
        for (int i = 0; i<items.size(); i++) {
        textAREA.setText(textAREA.getText() +
            "[NOME]: " +items.get(i).getNome()+"\n"+
            "[PREÇO]: " +items.get(i).getPreco()+"$ \n"+
            "[DESCRIÇÃO]: " +items.get(i).getDescricao()+"\n\n");
        }
        
        textAREA.setText(textAREA.getText()+"Para fazer a compra de um item, digite: comprar -> nome do item");
    }//GEN-LAST:event_btn_lojaActionPerformed

    private void btn_jogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jogarMouseClicked
        textAREA.setText("[HISTÓRICO]:\n");
        textfield.setEnabled(false);

        Random gerador = new Random();
        int randomizer = gerador.nextInt(101);
        
        String luckyGUESS;
        luckyGUESS = JOptionPane.showInputDialog(null,"Escolha um número de 0 a 100.\nQuanto mais perto do número sorteado você acertar,\nmais raro será o minério adquirido.","Jogo de Adivinhação",JOptionPane.PLAIN_MESSAGE);
        
        int luckyGUESSconvertido = Integer.parseInt(luckyGUESS);
        
        if ((luckyGUESSconvertido+modPlatina) >= randomizer && (luckyGUESSconvertido-modPlatina) <= randomizer) {
            InventarioMinerios.add(Platina);
            Jogador.expMAIS(150);
            
        } else if ((luckyGUESSconvertido+15) >= randomizer && (luckyGUESSconvertido-15) <= randomizer) {
            
            for (int i = 0; i<modOuro; i++) {
            InventarioMinerios.add(Ouro);
            Jogador.expMAIS(50);
            }         
                    
        } else {
            
            for (int i = 0; i<modPrata; i++) {
            InventarioMinerios.add(Prata);
            Jogador.expMAIS(5);
            }
            
        }
        
        printarMinerios();
    }//GEN-LAST:event_btn_jogarMouseClicked
    
    private void btnENVIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnENVIARMouseClicked
        String comando = textfield.getText();
        
        textfield.setText("");
        
        String[] textoSeparado = comando.split(" -> ");
        
        String acao = textoSeparado[0];
        String item = textoSeparado[1];
        
        if (numeroPagina == 1) {
            //inventario
            comandosINV(acao, item);
        } else if (numeroPagina == 2) {
            //loja
            comandosLOJA(acao, item);
        } else {
            textfield.setText("");
        }
        
    }//GEN-LAST:event_btnENVIARMouseClicked
    
    public void comandosINV(String acao, String item) {
        //vender -> nome do item
        //perfil -> ###
        
        if ("vender".equals(acao)) {
            for (int i = 0; i<InventarioMinerios.size(); i++) {
                if (item.equals(InventarioMinerios.get(i).getNomedoMinerio())) {
                    Jogador.setOuro(Jogador.getOuro() + InventarioMinerios.get(i).getValordeVENDA());
                    InventarioMinerios.remove(i);
                    
                        printarMinerios();
        
                        textAREA.setText(textAREA.getText() + "[ITENS]:\n");
            
                        printarItems();
                        
                        textAREA.setText(textAREA.getText() + "Para fazer a venda de um item, digite: vender -> nome do item\n"+
                        "Para acessar o seu perfil, digite: perfil -> #");
                }
            }
        } else if ("perfil".equals(acao)){
            textAREA.setText(
                "[NÍVEL]: "+Jogador.getNivel()+"/"+Jogador.getNívelMáximo()+"\n"+
                "[EXP]: "+Jogador.getExperienciaATUAL()+"/"+Jogador.getExperienciaMáxima()+"\n"+
                "[OURO]: "+Jogador.getOuro()+"$\n");
        } else {}
        
    }
    
    public void comandosLOJA(String acao, String item) {      
        //comprar -> nome do item
        
        if ("comprar".equals(acao)) {
            for (int i = 0; i<items.size(); i++) {
                if (item.equals(items.get(i).getNome())) {
                    if (Jogador.getOuro() >= items.get(i).getPreco()) {
                    Jogador.setOuro(Jogador.getOuro() - items.get(i).getPreco());
                    InventarioItems.add(items.get(i));
                    
                    if (item.equals("Poção de Prata")) {
                        modPrata = 3;
                    } else if (item.equals("Colar de Ouro")) {
                        modOuro = 2;
                    } else if (item.equals("Moeda de Platina")) {
                        modPlatina = 5;
                    }
                    
                    } else {}
                }
            }
        } else {}
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnENVIAR;
    private javax.swing.JButton btn_inventario;
    private javax.swing.JButton btn_jogar;
    private javax.swing.JButton btn_loja;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAREA;
    private javax.swing.JTextField textfield;
    // End of variables declaration//GEN-END:variables
}
