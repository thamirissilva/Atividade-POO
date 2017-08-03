

/*
 *    ---------- PRONTO ---------
 */
package br.com.senac.portfolio;

/**
 *
 * @author thamiris.ssouza
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
     
    }
   
                                   
    
    
    
    

    

/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valor1txt = new javax.swing.JTextField();
        valor2txt = new javax.swing.JTextField();
        valor1 = new javax.swing.JLabel();
        valor2 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        txtresultado = new javax.swing.JLabel();
        soma = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        porcentagem = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        resporc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        valor1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1txtActionPerformed(evt);
            }
        });

        valor2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2txtActionPerformed(evt);
            }
        });

        valor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor1.setText("1º Valor");

        valor2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor2.setText("2º Valor");

        resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultado.setText("Resultado:");

        txtresultado.setBackground(new java.awt.Color(255, 204, 204));
        txtresultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtresultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        soma.setText("+");
        soma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        subtracao.setText("-");
        subtracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        divisao.setText("/");
        divisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoActionPerformed(evt);
            }
        });

        porcentagem.setText("PORCENTAGEM");
        porcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentagemActionPerformed(evt);
            }
        });

        multiplicacao.setText("x");
        multiplicacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacaoActionPerformed(evt);
            }
        });

        limpar.setText("LIMPAR");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        resporc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resporcActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Digite um valor para calcular % :");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(valor1)
                        .addGap(69, 69, 69)
                        .addComponent(valor2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(valor1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(valor2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(resultado)
                            .addGap(18, 18, 18)
                            .addComponent(txtresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(resporc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {divisao, multiplicacao, subtracao});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resporc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(porcentagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valor1)
                                    .addComponent(valor2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valor2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valor1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subtracao)
                                    .addComponent(divisao)
                                    .addComponent(multiplicacao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(resultado)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {divisao, multiplicacao, soma, subtracao});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void valor1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1txtActionPerformed
        
    }//GEN-LAST:event_valor1txtActionPerformed

    private void valor2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2txtActionPerformed
       
    }//GEN-LAST:event_valor2txtActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        
        float valor1, valor2,resultado;
        //Recebendo os valores
        valor1 = Float.parseFloat(valor1txt.getText());
        valor2 = Float.parseFloat(valor2txt.getText());
        
        //Fazendo a conta
        resultado = valor2+valor1;
        
        //Aparecer o resultado
        txtresultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_somaActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        txtresultado.setText("");
        valor1txt.setText("");
        valor2txt.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        
        //Recebendo os valores
        float valor1, valor2,resultado;
        //Recebendo os valores
        valor1 = Float.parseFloat(valor1txt.getText());
        valor2 = Float.parseFloat(valor2txt.getText());
        
        //Fazendo a conta
        resultado = valor2-valor1;
        
        //Aparecer o resultado
        txtresultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_subtracaoActionPerformed

    private void divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaoActionPerformed
        
        //Recebendo os valores
        float valor1, valor2,resultado;
        //Recebendo os valores
        valor1 = Float.parseFloat(valor1txt.getText());
        valor2 = Float.parseFloat(valor2txt.getText());
        
        //Fazendo a conta
        resultado = valor2/valor1;
        
        //Aparecer o resultado
        txtresultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_divisaoActionPerformed

    private void multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacaoActionPerformed
        
        //Recebendo os valores
        float valor1, valor2,resultado;
        //Recebendo os valores
        valor1 = Float.parseFloat(valor1txt.getText());
        valor2 = Float.parseFloat(valor2txt.getText());
        
        //Fazendo a conta
        resultado = valor2*valor1;
        
        //Aparecer o resultado
        txtresultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_multiplicacaoActionPerformed

    private void porcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentagemActionPerformed
        
        float valor1,resultado;
        //Recebendo os valores
        valor1 = Float.parseFloat(resporc.getText());
        
        //Fazendo a conta
        resultado = (valor1/100);
        
        //Aparecer o resultado
        txtresultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_porcentagemActionPerformed

    private void resporcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resporcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resporcActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton divisao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton porcentagem;
    private javax.swing.JTextField resporc;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtracao;
    private javax.swing.JLabel txtresultado;
    private javax.swing.JLabel valor1;
    private javax.swing.JTextField valor1txt;
    private javax.swing.JLabel valor2;
    private javax.swing.JTextField valor2txt;
    // End of variables declaration//GEN-END:variables

   
}