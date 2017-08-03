/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.portfolio;

/**
 *
 * @author thamiris.ssouza
 */
public class JogoCartas extends javax.swing.JFrame {

    
    // ---------- PADRÃO ------------
    /**
     * Creates new form JogoCartas
     */
    public JogoCartas() {
        initComponents();
    }
    // ------------------------------
    
    public void sortear(){
     int sorteio = (int) (Math.random()*52); 
     
     switch  (sorteio + 1){
         case 1: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("copas2.jpg")));
         break;
         
         case 2:
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("copas3.jpg")));
         break;
     
         case 3: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("copas4.jpg")));
         break;
         
         case 4: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("copas5.jpg")));
         break;
         
         case 5: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("copas6.jpg")));
         break;
         
         case 6: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("copas7.jpg")));
         break; 
         
         case 7: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("copas8.jpg")));
         break; 
         
         case 8: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("copas9.jpg")));
         break; 
         
         case 9: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("copas10.jpg")));
         break; 
         
         case 10: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("dama_copas.jpg")));
         break; 
         
         case 11: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("dama_espadas.jpg")));
         break; 
         
         case 12: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("dama_ouros.jpg")));
         break; 
         
         case 13:
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("dama_paus.jpg")));
         break; 
         
         case 14: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("espadas2.jpg")));
         break; 
         
         case 15: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("espadas3.jpg")));
         break; 
         
         case 16: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("espadas4.jpg")));
         break; 
         
         case 17: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("espadas5.jpg")));
         break; 
         
         case 18: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("espadas6.jpg")));
         break; 
         
         case 19:
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("espadas7.jpg")));
         break; 
         
         case 20: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("espadas8.jpg")));
         break; 
         
         case 21: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("espadas9.jpg")));
         break; 
         
         case 22: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("espadas10.jpg")));
         break; 
         
         case 23: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("ouros2.jpg")));
         break; 
         
         case 24: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("ouros3.jpg")));
         break; 
         
         case 25: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("ouros4.jpg")));
         break; 
         
         case 26: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("ouros5.jpg")));
         break; 
         
         case 27: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("ouros6.jpg")));
         break; 
         
         case 28: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("ouros7.jpg")));
         break; 
         
         case 29: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("ouros8.jpg")));
         break; 
         
         case 30: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("ouros9.jpg")));
         break; 

         case 31: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("ouros10.jpg")));
         break; 
         
         case 32: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("paus2.jpg")));
         break; 
         
         case 33: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("paus3.jpg")));
         break; 
         
         case 34: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("paus4.jpg")));
         break; 
         
         case 35: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("paus5.jpg")));
         break; 
         
         case 36: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("paus6.jpg")));
         break; 
         
         case 37: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("paus7.jpg")));
         break; 
         
         case 38: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("paus8.jpg")));
         break; 
         
         case 39: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("paus9.jpg")));
         break; 
         
         case 40: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("paus10.jpg")));
         break; 
         
         case 41: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("rei_copas.jpg")));
         break; 
         
         case 42: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("rei_espadas.jpg")));
         break; 
         
         case 43: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("rei_ouros.jpg")));
         break; 
         
         case 44: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("rei_paus.jpg")));
         break; 
         
         case 45: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("valete_copas.jpg")));
         break; 
         
         case 46: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("valete_espadas.jpg")));
         break; 
         
         case 47: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("valete_ouros.jpg")));
         break;  
         
         case 48: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("valete_paus.jpg")));
         break;
         
         case 49: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("az_espadas.png")));
         break;
         
         case 50: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("az_copas.png")));
         break;
         
         case 51: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("az_ouros.png")));
         break;
     
         case 52: 
         lblcartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("coringa.jpg")));
         break;
     }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcartas = new javax.swing.JLabel();
        sortear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sortear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sortear.setText("SORTEAR CARTAS");
        sortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcartas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortear, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblcartas, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sortear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortearActionPerformed
        sortear();
    }//GEN-LAST:event_sortearActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JogoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoCartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblcartas;
    private javax.swing.JButton sortear;
    // End of variables declaration//GEN-END:variables

}
