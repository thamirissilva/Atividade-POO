/*
 *
 *
 *           PRONTO / TERMINADO / JOGO DA VELHA
 *
 *
 */


package br.com.senac.portfolio;

import javax.swing.JOptionPane;

/**
 *
 * @author Thamiris da Silva Souza
 * @author Leila J. Nascimento de Aquino 
 *  
 */


public class JogoDaVelha extends javax.swing.JFrame {

    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    
    int VitoriaDoJogador1 = 0;
    int VitoriaDoJogador2 = 0;
    int PartidasEmpatadas = 0;
 
    
    public void JogadorAtivo() {
        
        if (Jogador1Ativo == true) {
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
        }
        
        JogadorVencedor("X");
        JogadorVencedor("0");
        
    }
    
    
    public void JogadorVencedor(String Jogador) {
        
        
        /******************* Verificando Linhas *********************/
        if (B1.getText().equals(Jogador) &&
                B2.getText().equals(Jogador) &&
                B3.getText().equals(Jogador)) {
            
            if (B1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B4.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B6.getText().equals(Jogador)) {
            
            if (B4.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B7.getText().equals(Jogador) &&
                B8.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
            
            if (B7.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        /******************* Verificando Colunas *********************/
        if (B1.getText().equals(Jogador) &&
                B4.getText().equals(Jogador) &&
                B7.getText().equals(Jogador)) {
            
            if (B1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B2.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B8.getText().equals(Jogador)) {
            
            if (B2.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B3.getText().equals(Jogador) &&
                B6.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
            
            if (B3.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        //-------------- Verificando Diagonais --------------//
        
        if (B1.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
            
            if (B1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B3.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B7.getText().equals(Jogador)) {
            
            if (B3.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        /******************* Verificando Empate *********************/
        if ( !B1.getText().equals("") &&
                !B2.getText().equals("") &&
                !B3.getText().equals("") &&
                !B4.getText().equals("") &&
                !B5.getText().equals("") &&
                !B6.getText().equals("") &&
                !B7.getText().equals("") &&
                !B8.getText().equals("") &&
                !B9.getText().equals("") ) {
            
            Vencedor("Empate");
        }
        
    }
    
    
    public void Vencedor(String JogadorVencedor) {
        
        if (JogadorVencedor.equals("Jogador 1")) {
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Parabéns Jogador 1. Você venceu o Jogo!");
            VitoriaDoJogador1++;
            NumeroDeVitoriasDoJogador1.setText("Número de Vitórias: " + VitoriaDoJogador1);
            LimparCampos();
        }
        
        
        if (JogadorVencedor.equals("Jogador 2")) {
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Parabéns Jogador 2. Você venceu o Jogo!");
            VitoriaDoJogador2++;
            NumeroDeVitoriasDoJogador2.setText("Número de Vitórias: " + VitoriaDoJogador2);
            LimparCampos();
        }
        
        
        if (JogadorVencedor.equals("Empate")) {
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Jogo Empatado! Joguem Novamente!");
            PartidasEmpatadas++;
            NumeroDeEmpate.setText("Número de Empates: " + PartidasEmpatadas);
            LimparCampos();
        }
        
    }
    
    
    public void LimparCampos() {
        
        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");
        
        Jogador1Ativo = true;
        Jogador2Ativo = false;
        
    }                                 
   
    
    //---------------------Botões e suas ações-------------------//
    
    
   public JogoDaVelha() {
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

        paineldojogo = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        paineldeinformacoes = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SairDoJogo = new javax.swing.JButton();
        informacaodojogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador2 = new javax.swing.JLabel();
        NumeroDeEmpate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        paineldojogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), null, null));

        B1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        B1.setToolTipText("");
        B1.setPreferredSize(new java.awt.Dimension(100, 100));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        B2.setToolTipText("");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        B3.setToolTipText("");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        B4.setToolTipText("");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        B5.setToolTipText("");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        B6.setToolTipText("");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        B7.setToolTipText("");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        B8.setToolTipText("");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        B9.setToolTipText("");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paineldojogoLayout = new javax.swing.GroupLayout(paineldojogo);
        paineldojogo.setLayout(paineldojogoLayout);
        paineldojogoLayout.setHorizontalGroup(
            paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldojogoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B5)
                    .addGroup(paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineldojogoLayout.createSequentialGroup()
                                .addComponent(B4)
                                .addGap(148, 148, 148))
                            .addGroup(paineldojogoLayout.createSequentialGroup()
                                .addComponent(B7)
                                .addGap(18, 18, 18)
                                .addComponent(B8)))
                        .addGroup(paineldojogoLayout.createSequentialGroup()
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(B2))))
                .addGap(18, 18, 18)
                .addGroup(paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B6)
                    .addComponent(B3)
                    .addComponent(B9))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        paineldojogoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        paineldojogoLayout.setVerticalGroup(
            paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldojogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B9)
                    .addGroup(paineldojogoLayout.createSequentialGroup()
                        .addGroup(paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B5)
                            .addComponent(B4)
                            .addComponent(B6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paineldojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B7)
                            .addComponent(B8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paineldojogoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        paineldeinformacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        paineldeinformacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        SairDoJogo.setText("Sair do Jogo");
        SairDoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoJogoActionPerformed(evt);
            }
        });

        informacaodojogo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        informacaodojogo.setText("Informações do Jogo:");
        informacaodojogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Jogador 1      Símbolo: X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NumeroDeVitoriasDoJogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeVitoriasDoJogador1.setText("Número de vitórias:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Jogador 2          Símbolo: O");

        NumeroDeVitoriasDoJogador2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeVitoriasDoJogador2.setText("Número de vitórias:");

        NumeroDeEmpate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeEmpate.setText("Número de empates:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Controle do Jogo:");

        javax.swing.GroupLayout paineldeinformacoesLayout = new javax.swing.GroupLayout(paineldeinformacoes);
        paineldeinformacoes.setLayout(paineldeinformacoesLayout);
        paineldeinformacoesLayout.setHorizontalGroup(
            paineldeinformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldeinformacoesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(paineldeinformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumeroDeEmpate)
                    .addComponent(NumeroDeVitoriasDoJogador2)
                    .addComponent(jLabel4)
                    .addComponent(NumeroDeVitoriasDoJogador1)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineldeinformacoesLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(paineldeinformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paineldeinformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SairDoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(informacaodojogo)
                    .addGroup(paineldeinformacoesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8)))
                .addGap(82, 82, 82))
        );

        paineldeinformacoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NovoJogo, SairDoJogo});

        paineldeinformacoesLayout.setVerticalGroup(
            paineldeinformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineldeinformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(informacaodojogo)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeVitoriasDoJogador1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeVitoriasDoJogador2)
                .addGap(18, 18, 18)
                .addComponent(NumeroDeEmpate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(NovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SairDoJogo)
                .addGap(46, 46, 46))
        );

        paineldeinformacoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NovoJogo, SairDoJogo});

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Sobre o Jogo:");

        jLabel3.setText("Criado em 28/07/2017");

        jLabel5.setText("Por: Thamiris da S. Souza e ");

        jLabel6.setText("Leila J. Nascimento de Aquino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(paineldojogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paineldeinformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paineldojogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paineldeinformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
         LimparCampos();
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void SairDoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoJogoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairDoJogoActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
             if (Jogador1Ativo == true) {
            if (B1.getText().equals("")) {
                B1.setText("X");
                JogadorAtivo();
            }
        } else {
            if (B1.getText().equals("")) {
                B1.setText("0");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
            if (Jogador1Ativo == true) {
            if (B2.getText().equals("")) {
                B2.setText("X");
                JogadorAtivo();
            }
        } else {
            if (B2.getText().equals("")) {
                B2.setText("0");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
           if (Jogador1Ativo == true) {
            if (B3.getText().equals("")) {
                B3.setText("X");
                JogadorAtivo();
            }
        } else {
            if (B3.getText().equals("")) {
                B3.setText("0");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
           if (Jogador1Ativo == true) {
            if (B4.getText().equals("")) {
                B4.setText("X");
                JogadorAtivo();
            }
        } else {
            if (B4.getText().equals("")) {
                B4.setText("0");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if (Jogador1Ativo == true) {
            if (B5.getText().equals("")) {
                B5.setText("X");
                JogadorAtivo();
            }
        } else {
            if (B5.getText().equals("")) {
                B5.setText("0");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
          if (Jogador1Ativo == true) {
            if (B6.getText().equals("")) {
                B6.setText("X");
                JogadorAtivo();
            }
        } else {
            if (B6.getText().equals("")) {
                B6.setText("0");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
         if (Jogador1Ativo == true) {
            if (B7.getText().equals("")) {
                B7.setText("X");
                JogadorAtivo();
            }
        } else {
            if (B7.getText().equals("")) {
                B7.setText("0");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        if (Jogador1Ativo == true) {
            if (B8.getText().equals("")) {
                B8.setText("X");
                JogadorAtivo();
            }
        } else {
            if (B8.getText().equals("")) {
                B8.setText("0");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
            if (Jogador1Ativo == true) {
            if (B9.getText().equals("")) {
                B9.setText("X");
                JogadorAtivo();
            }
        } else {
            if (B9.getText().equals("")) {
                B9.setText("0");
                JogadorAtivo();
            }
        }
       
    }//GEN-LAST:event_B9ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel NumeroDeEmpate;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador1;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador2;
    private javax.swing.JButton SairDoJogo;
    private javax.swing.JLabel informacaodojogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel paineldeinformacoes;
    private javax.swing.JPanel paineldojogo;
    // End of variables declaration//GEN-END:variables
}
