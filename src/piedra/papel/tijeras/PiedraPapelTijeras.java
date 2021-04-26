package piedra.papel.tijeras;

import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class PiedraPapelTijeras extends javax.swing.JFrame {
    
    
    private int opcionJugador;
    private int opcionCPU;
    //victoria, empate, derrota
    private int cont[] = {0,0,0};
    
    public PiedraPapelTijeras() {
        initComponents();
    }
    
    public void jugadorVScpu(int opcionjugador){
        opcionCPU = (int)(Math.random()*3+1);
        
        if(opcionjugador == 1 && opcionCPU == 1){
            cont[1]++;
            JOptionPane.showMessageDialog(this, "Empate");
        }else if(opcionjugador == 1 && opcionCPU == 2){
            cont[0]++;
            JOptionPane.showMessageDialog(this, "Ganaste");
        }
        else if(opcionjugador == 1 && opcionCPU == 3){
            cont[2]++;
            JOptionPane.showMessageDialog(this, "Derrota");
        }
        else if(opcionjugador == 2 && opcionCPU == 1){
            cont[2]++;
            JOptionPane.showMessageDialog(this, "Derrota");
        }
        else if(opcionjugador == 2 && opcionCPU == 2){
            cont[1]++;
            JOptionPane.showMessageDialog(this, "Empate");
        }else if(opcionjugador == 2 && opcionCPU == 3){
            cont[0]++;
            JOptionPane.showMessageDialog(this, "Ganaste");
        }
        else if(opcionjugador == 3 && opcionCPU == 1){
            cont[0]++;
            JOptionPane.showMessageDialog(this, "Ganaste");
        }else if(opcionjugador == 3 && opcionCPU == 2){
            cont[2]++;
            JOptionPane.showMessageDialog(this, "Derrota");
        }
        else if(opcionjugador == 3 && opcionCPU == 3){
            cont[1]++;
            JOptionPane.showMessageDialog(this, "Empate");
        }
        
        txtVictorias.setText("" + cont[0]);
        txtEmpates.setText("" + cont[1]);
        txtDerrotas.setText("" + cont[2]);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPapel = new javax.swing.JButton();
        btnPiedra = new javax.swing.JButton();
        btnTijera = new javax.swing.JButton();
        btnCPUpapel = new javax.swing.JButton();
        btnCPUpiedra = new javax.swing.JButton();
        btnCPUtijera = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtVictorias = new javax.swing.JTextField();
        txtEmpates = new javax.swing.JTextField();
        txtDerrotas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Jugador");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Resultados");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CPU");

        btnPapel.setBackground(new java.awt.Color(255, 205, 0));
        btnPapel.setIcon(new javax.swing.ImageIcon("C:\\Users\\jesus\\Documents\\Piedra-Papel-Tijeras\\src\\img\\manos-papel.jpg")); // NOI18N
        btnPapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPapelMouseClicked(evt);
            }
        });

        btnPiedra.setIcon(new javax.swing.ImageIcon("C:\\Users\\jesus\\Documents\\Piedra-Papel-Tijeras\\src\\img\\manos-piedra.jpg")); // NOI18N
        btnPiedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPiedraMouseClicked(evt);
            }
        });

        btnTijera.setIcon(new javax.swing.ImageIcon("C:\\Users\\jesus\\Documents\\Piedra-Papel-Tijeras\\src\\img\\manos-tijeras.jpg")); // NOI18N
        btnTijera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTijeraMouseClicked(evt);
            }
        });

        btnCPUpapel.setBackground(new java.awt.Color(255, 194, 2));
        btnCPUpapel.setIcon(new javax.swing.ImageIcon("C:\\Users\\jesus\\Documents\\Piedra-Papel-Tijeras\\src\\img\\manos-papel.jpg")); // NOI18N
        btnCPUpapel.setText("jButton4");

        btnCPUpiedra.setIcon(new javax.swing.ImageIcon("C:\\Users\\jesus\\Documents\\Piedra-Papel-Tijeras\\src\\img\\manos-piedra.jpg")); // NOI18N

        btnCPUtijera.setIcon(new javax.swing.ImageIcon("C:\\Users\\jesus\\Documents\\Piedra-Papel-Tijeras\\src\\img\\manos-tijeras.jpg")); // NOI18N

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Victorias");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Empates");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Derrotas");

        txtVictorias.setBackground(new java.awt.Color(255, 255, 255));
        txtVictorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtEmpates.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpates.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDerrotas.setBackground(new java.awt.Color(255, 255, 255));
        txtDerrotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVictorias, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCPUpapel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCPUpiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCPUtijera, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCPUpapel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVictorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCPUpiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCPUtijera, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPapelMouseClicked
        opcionJugador = 1;
        jugadorVScpu(opcionJugador);
    }//GEN-LAST:event_btnPapelMouseClicked

    private void btnPiedraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPiedraMouseClicked
        opcionJugador = 2;
        jugadorVScpu(opcionJugador);
    }//GEN-LAST:event_btnPiedraMouseClicked

    private void btnTijeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTijeraMouseClicked
        opcionJugador = 3;
        jugadorVScpu(opcionJugador);
    }//GEN-LAST:event_btnTijeraMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PiedraPapelTijeras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PiedraPapelTijeras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PiedraPapelTijeras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PiedraPapelTijeras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PiedraPapelTijeras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCPUpapel;
    private javax.swing.JButton btnCPUpiedra;
    private javax.swing.JButton btnCPUtijera;
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPiedra;
    private javax.swing.JButton btnTijera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDerrotas;
    private javax.swing.JTextField txtEmpates;
    private javax.swing.JTextField txtVictorias;
    // End of variables declaration//GEN-END:variables
}
