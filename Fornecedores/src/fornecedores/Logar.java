
package fornecedores;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Logar extends javax.swing.JFrame {

    public Logar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jUsuarioLogar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSenhaLogar = new javax.swing.JPasswordField();
        bLogar = new javax.swing.JButton();
        bcadastrarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login");

        jLabel1.setText("Usuário: ");

        jUsuarioLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioLogarActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha: ");

        bLogar.setText("Logar ");
        bLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogarActionPerformed(evt);
            }
        });

        bcadastrarUsuario.setText("Cadastrar Usuário");
        bcadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcadastrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jUsuarioLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSenhaLogar)
                                .addGap(87, 87, 87))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(bLogar)
                        .addGap(53, 53, 53)
                        .addComponent(bcadastrarUsuario)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jUsuarioLogar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSenhaLogar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUsuarioLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioLogarActionPerformed
       new MenuPrincipal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jUsuarioLogarActionPerformed

    private void bcadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcadastrarUsuarioActionPerformed
         new CadastrarUsuario().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bcadastrarUsuarioActionPerformed

    private void bLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLogarActionPerformed

    public JPasswordField getjSenhaLogar() {
        return jSenhaLogar;
    }

    public void setjSenhaLogar(JPasswordField jSenhaLogar) {
        this.jSenhaLogar = jSenhaLogar;
    }

    public JTextField getjUsuarioLogar() {
        return jUsuarioLogar;
    }

    public void setjUsuarioLogar(JTextField jUsuarioLogar) {
        this.jUsuarioLogar = jUsuarioLogar;
    }
    
    public static void main(String args[]) {
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogar;
    private javax.swing.JButton bcadastrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jSenhaLogar;
    private javax.swing.JTextField jUsuarioLogar;
    // End of variables declaration//GEN-END:variables
}
