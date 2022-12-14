/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import javax.swing.JOptionPane;
import modelo.logic.UsuarioLogic;
import modelo.beans.Usuario;
/**
 *
 * @author Oyunde
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null); //para centrar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_inicioSesion = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_contrasenia = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_contrasenia = new javax.swing.JPasswordField();
        chk_MostrarContrasenia = new javax.swing.JCheckBox();
        btn_ingresar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_inicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_inicioSesion.setText("Inicio de sesión");
        getContentPane().add(lbl_inicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 65, -1, -1));

        lbl_usuario.setText("Usuario");
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 135, -1, -1));

        lbl_contrasenia.setText("Contraseña");
        getContentPane().add(lbl_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 195, -1, -1));
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 132, 252, -1));
        getContentPane().add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 192, 252, -1));

        chk_MostrarContrasenia.setText("Mostrar contraseña");
        chk_MostrarContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_MostrarContraseniaActionPerformed(evt);
            }
        });
        getContentPane().add(chk_MostrarContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 220, -1, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 258, -1, -1));

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk_MostrarContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_MostrarContraseniaActionPerformed
        // TODO add your handling code here:
        if(chk_MostrarContrasenia.isSelected()) {
            txt_contrasenia.setEchoChar((char)0);
        }else {
            txt_contrasenia.setEchoChar('*');
        }
    }//GEN-LAST:event_chk_MostrarContraseniaActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
        UsuarioLogic.listar();
        if(!txt_usuario.getText().isEmpty()&&!txt_contrasenia.getText().isEmpty()){
            System.out.println(txt_usuario.getText() + txt_contrasenia.getText());
            
         
            if(UsuarioLogic.autentificar(txt_usuario.getText(), txt_contrasenia.getText())){
                JOptionPane.showMessageDialog(this, "Bienvenido");
                this.dispose();
                
                FrmPaginaPrincipal frmPaginaPrincipal = new FrmPaginaPrincipal(UsuarioLogic.obtener(txt_usuario.getText()));
                frmPaginaPrincipal.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(this, "Usuario y contraseña incorrectos");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Falta ingresar usuario contraseña");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        FrmRegistrarUsuario frmRegistrarUsuario = new FrmRegistrarUsuario(this, true);
        frmRegistrarUsuario.setVisible(true);
    }//GEN-LAST:event_btn_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JCheckBox chk_MostrarContrasenia;
    private javax.swing.JLabel lbl_contrasenia;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_inicioSesion;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
