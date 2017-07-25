package tcc.telas;
 
import javax.swing.JOptionPane;
import tcc.Util.Validacao;

public class Estoque_tela extends javax.swing.JFrame {

    /**
     * Creates new form Estoque_tela
     */
    public Estoque_tela() {
        initComponents();
        panelEstoque.setVisible(false);
        panelAdcMais.setVisible(false);
        separaPanel1.setVisible(false);
        separaPanel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        volta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        codProd = new javax.swing.JTextField();
        botaoProcuraProd = new javax.swing.JButton();
        panelEstoque = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botaoAdc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panelAdcMais = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        adicionaMaisProd = new javax.swing.JTextField();
        botaoConfirma = new javax.swing.JButton();
        separaPanel2 = new javax.swing.JSeparator();
        separaPanel1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Estoque:");

        volta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        volta.setText("Voltar");
        volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaActionPerformed(evt);
            }
        });

        jLabel2.setText("Código do Produto");
        jLabel2.setToolTipText("");

        codProd.setToolTipText("Informe o código do produto");

        botaoProcuraProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/busca.png"))); // NOI18N
        botaoProcuraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcuraProdActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade no estoque: ");

        botaoAdc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/adicionar.png"))); // NOI18N
        botaoAdc.setText("Adicionar");
        botaoAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstoqueLayout = new javax.swing.GroupLayout(panelEstoque);
        panelEstoque.setLayout(panelEstoqueLayout);
        panelEstoqueLayout.setHorizontalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstoqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdc)
                .addGap(26, 26, 26))
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        panelEstoqueLayout.setVerticalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(botaoAdc)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setText("Adicionar:");

        adicionaMaisProd.setToolTipText("Digite a quantidade de peças a serem adicionadas");
        adicionaMaisProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionaMaisProdActionPerformed(evt);
            }
        });

        botaoConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoConfirma.setText("Confirmar");
        botaoConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAdcMaisLayout = new javax.swing.GroupLayout(panelAdcMais);
        panelAdcMais.setLayout(panelAdcMaisLayout);
        panelAdcMaisLayout.setHorizontalGroup(
            panelAdcMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdcMaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdcMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdcMaisLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adicionaMaisProd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdcMaisLayout.createSequentialGroup()
                        .addGap(0, 82, Short.MAX_VALUE)
                        .addComponent(botaoConfirma)))
                .addContainerGap())
        );
        panelAdcMaisLayout.setVerticalGroup(
            panelAdcMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdcMaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdcMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adicionaMaisProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(botaoConfirma))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(codProd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoProcuraProd))
                        .addComponent(jLabel1))
                    .addGap(43, 43, 43))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(panelAdcMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(separaPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(panelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volta, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcuraProd))
                .addGap(18, 18, 18)
                .addComponent(separaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separaPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelAdcMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(volta)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaActionPerformed
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltaActionPerformed

    private void botaoProcuraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcuraProdActionPerformed
        if(Validacao.validaTextos(codProd)){
            panelEstoque.setVisible(true);
            separaPanel1.setVisible(true);
        }
    }//GEN-LAST:event_botaoProcuraProdActionPerformed

    private void adicionaMaisProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionaMaisProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionaMaisProdActionPerformed

    private void botaoAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdcActionPerformed
        panelAdcMais.setVisible(true);
        separaPanel2.setVisible(true);
    }//GEN-LAST:event_botaoAdcActionPerformed

    private void botaoConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaActionPerformed
        if(Validacao.validaTextos(adicionaMaisProd)){
            JOptionPane.showMessageDialog(null, "Estoque atualizado!");
        }else{
            //mostra mensagem de validação
            adicionaMaisProd.requestFocus();
        }
    }//GEN-LAST:event_botaoConfirmaActionPerformed

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
            java.util.logging.Logger.getLogger(Estoque_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque_tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adicionaMaisProd;
    private javax.swing.JButton botaoAdc;
    private javax.swing.JButton botaoConfirma;
    private javax.swing.JButton botaoProcuraProd;
    private javax.swing.JTextField codProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelAdcMais;
    private javax.swing.JPanel panelEstoque;
    private javax.swing.JSeparator separaPanel1;
    private javax.swing.JSeparator separaPanel2;
    private javax.swing.JButton volta;
    // End of variables declaration//GEN-END:variables
}