package página;
import rpggame.mainGAME;
import rpggame.inventario;

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
        btn_inventario.setText("LOJA");
        btn_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });

        btn_loja.setFont(new java.awt.Font("Swis721 BT", 0, 18)); // NOI18N
        btn_loja.setText("INVENTÁRIO");
        btn_loja.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn_loja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lojaActionPerformed(evt);
            }
        });

        textAREA.setEditable(false);
        textAREA.setColumns(20);
        textAREA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
                .addGap(97, 97, 97)
                .addComponent(btn_loja, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
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
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfield)
                    .addComponent(btnENVIAR, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_loja, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    inventario INV = new inventario();
    mainGAME jogo = new mainGAME();
    int numeroPagina = 0;
    
    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        numeroPagina = 1;
        
        //
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_lojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lojaActionPerformed
        numeroPagina = 2;
        
    }//GEN-LAST:event_btn_lojaActionPerformed

    private void btn_jogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jogarMouseClicked
        numeroPagina = 3;
        
        jogo.iniciarJOGO();
    }//GEN-LAST:event_btn_jogarMouseClicked

    private void btnENVIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnENVIARMouseClicked
        String comando = textfield.getText();
        
        if (numeroPagina == 1) {
            
        } else if (numeroPagina == 2) {
            
        } else if (numeroPagina == 3) {
            
        } else {
            textfield.setToolTipText("Essa ação não existe, tente outra.");
        }
        /* ai é de cada classe o comando a ser usado */
        
    }//GEN-LAST:event_btnENVIARMouseClicked

    private void textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldActionPerformed

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
