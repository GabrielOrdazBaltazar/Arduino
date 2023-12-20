
package controlrobot;

import java.util.logging.Level;
import java.util.logging.Logger;
import panamahitek.Arduino.PanamaHitek_Arduino;

public class ControlPrincipalVista extends javax.swing.JFrame {
    //Libreria para comunicar con arduino
    PanamaHitek_Arduino Controlador = new PanamaHitek_Arduino();
    public ControlPrincipalVista() {
        initComponents();
        try {
            Controlador.arduinoTX("COM4", 9600);
        } catch (Exception ex) {
            Logger.getLogger(ControlPrincipalVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnArriba = new javax.swing.JButton();
        btnAbajo = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnArriba.setText("ARRIBA");
        btnArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaActionPerformed(evt);
            }
        });

        btnAbajo.setText("ABAJO");
        btnAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoActionPerformed(evt);
            }
        });

        btnIzquierda.setText("IZQUIERDA");
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        btnDerecha.setText("DERECHA");
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnIzquierda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(btnArriba)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzquierda)
                    .addComponent(btnDerecha))
                .addGap(52, 52, 52)
                .addComponent(btnAbajo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArribaActionPerformed

    private void btnAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbajoActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        try {
            //Mover a la izquierda
            Controlador.sendData("I");
        } catch (Exception ex) {
            Logger.getLogger(ControlPrincipalVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // Termina el programa
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        try {
            //Mover a la izquierda
            Controlador.sendData("D");
        } catch (Exception ex) {
            Logger.getLogger(ControlPrincipalVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDerechaActionPerformed

    public static void main(String args[]) {
             
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPrincipalVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbajo;
    private javax.swing.JButton btnArriba;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIzquierda;
    // End of variables declaration//GEN-END:variables
}
