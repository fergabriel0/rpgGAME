package página;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import rpggame.mainGAME;
import rpggame.loja;
import rpggame.minerios;
import java.util.Random;

public class principal extends javax.swing.JFrame {
    public principal() {
        initComponents();
        
        jogo.iniciarPersonagem();
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
        textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldActionPerformed(evt);
            }
        });

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
    
    mainGAME jogo = new mainGAME();
    loja mercado = new loja();
    int numeroPagina = 0;
    
    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        numeroPagina = 1;
        textAREA.setText("");
        
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_lojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lojaActionPerformed
        numeroPagina = 2;
        
        textAREA.setText("");
        
        ArrayList<loja> items = mercado.getLista1();
        mercado.addITEMS();
        
        for (int i = 0; i<items.size(); i++) {
        textAREA.setText(textAREA.getText() +
            "[NOME]: " + items.get(i).getNome() + "\n" +
            "[PREÇO]: " + items.get(i).getPreco() + "$ \n" +
            "[DESCRIÇÃO]: " + items.get(i).getDescricao() + "\n" +
            "[VENDA]: " + items.get(i).getPrecoVENDA() + "$ \n\n");
        }
        
        textAREA.setText(textAREA.getText()+"Para fazer a compra de um item, digite: comprar -> nome do item -> quantidade.");
    }//GEN-LAST:event_btn_lojaActionPerformed

    private void btn_jogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jogarMouseClicked
        numeroPagina = 3;
        textAREA.setText("");

        Random gerador = new Random();
        int randomizer = gerador.nextInt(101);
        System.out.println(randomizer);
        
        String luckyGUESS;
        luckyGUESS = JOptionPane.showInputDialog("Escolha um número de 0 a 100.\nquanto mais perto do número sorteado você acertar,\nmais serão as recompensas.");
        
        int luckyGUESSconvertido = Integer.parseInt(luckyGUESS);
        
        ArrayList<minerios> minerios_conseguidos = new ArrayList<>();
        
        minerios Prata = new minerios(10, "Prata");
        minerios Ouro = new minerios(20, "Ouro");
        minerios Platina = new minerios(30, "Platina");
        
        //modificação;
        if (luckyGUESSconvertido == randomizer) {
            minerios_conseguidos.add(Platina);
        } else if ((luckyGUESSconvertido+20) >= randomizer && (luckyGUESSconvertido-20) <= randomizer) {
            minerios_conseguidos.add(Ouro);
        } else {
            minerios_conseguidos.add(Prata);
        }
        
        for (int i = 0; i<minerios_conseguidos.size(); i++) {
        textAREA.setText(textAREA.getText() +
            "[NOME]: " + minerios_conseguidos.get(i).getNomedoMinerio() + "\n" +
            "[VENDA]: " + minerios_conseguidos.get(i).getValordeVENDA() + "$ \n\n");
        }
        
    }//GEN-LAST:event_btn_jogarMouseClicked

    private void btnENVIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnENVIARMouseClicked
        String comando = textfield.getText();
        
        if (numeroPagina == 1) {
            //inventario
            comandosINV(comando);
        } else if (numeroPagina == 2) {
            //loja
            comandosLOJA(comando);
        } else if (numeroPagina == 3) {
            //jogar
            comandosJOGAR(comando);
        } else {
            textfield.setToolTipText("Essa ação não existe, tente outra.");
        }
        
    }//GEN-LAST:event_btnENVIARMouseClicked

    private void textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldActionPerformed
    
    public void comandosINV(String c) {
        
    }
    
    public void comandosLOJA(String c) {
        //comprar -> POÇÃO DE CURA -> 5
        String[] textoSeparado = c.split("->");
        //System.out.println(Arrays.toString(textoSeparado));
        
        String acao = textoSeparado[0];
        String item = textoSeparado[1];
        int quantidade = parseInt(textoSeparado[2]);
        
        if (acao == "comprar") {
            
        } else if (acao == "vender") {
            
        }
        
    }
    
    public void comandosJOGAR(String c) {
        
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
