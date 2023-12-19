package páginas;
public class jogar extends javax.swing.JPanel {
    public jogar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vidaINIMIGO = new javax.swing.JLabel();
        nomeINIMIGO = new javax.swing.JLabel();
        btnATACAR = new javax.swing.JButton();
        btnCURA = new javax.swing.JButton();
        btnITEM = new javax.swing.JButton();
        vidaJOGADOR = new javax.swing.JLabel();
        sel1 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vidaINIMIGO.setText("vidaINIMIGOS");
        add(vidaINIMIGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 6, -1, -1));

        nomeINIMIGO.setText("nomeINIMIGOS");
        add(nomeINIMIGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 28, -1, -1));

        btnATACAR.setText("ATACAR");
        btnATACAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnATACARActionPerformed(evt);
            }
        });
        add(btnATACAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 130, 64));

        btnCURA.setText("CURAR");
        btnCURA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCURAActionPerformed(evt);
            }
        });
        add(btnCURA, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 130, 64));

        btnITEM.setText("ITEM");
        add(btnITEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 130, 64));

        vidaJOGADOR.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        vidaJOGADOR.setText("VIDA BASE");
        add(vidaJOGADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 174, -1, -1));
        add(sel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 158, 727, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btnATACARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnATACARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnATACARActionPerformed

    private void btnCURAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCURAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCURAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnATACAR;
    private javax.swing.JButton btnCURA;
    private javax.swing.JButton btnITEM;
    private javax.swing.JLabel nomeINIMIGO;
    private javax.swing.JSeparator sel1;
    private javax.swing.JLabel vidaINIMIGO;
    private javax.swing.JLabel vidaJOGADOR;
    // End of variables declaration//GEN-END:variables
}
