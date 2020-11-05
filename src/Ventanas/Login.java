/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import Clases.Conexion;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author sotel
 */
public class Login extends javax.swing.JFrame {

    public static String user = "";
    String pass = "";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(400, 650);
        setResizable(false);
        setTitle("FamilyBoock  ||  Ingresar");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //codigo de el icono
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src\\imagenes\\Icono.png");
        setIconImage(miIcono);
        
        //codigo del fondo de pantalla
        ImageIcon wallPaper = new ImageIcon("src\\Imagenes\\WallPaperR.png");
        Icon icono = new ImageIcon(wallPaper.getImage().getScaledInstance(JL_Wallpaper.getWidth(), JL_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        JL_Wallpaper.setIcon(icono);
        this.repaint();
        
        //Codigo del logo 
        ImageIcon wallPaperLogo = new ImageIcon("src\\Imagenes\\WallPaperLogo.png");
        Icon Logo = new ImageIcon(wallPaperLogo.getImage().getScaledInstance(JL_WallPaper_Logo.getWidth(), JL_WallPaper_Logo.getHeight(), Image.SCALE_DEFAULT));
        JL_WallPaper_Logo.setIcon(Logo);
        this.repaint();

    }
    
    public void ValidacionCaracteres(java.awt.event.KeyEvent evento){
        if(evento.getKeyChar() >= 33 && evento.getKeyChar() <= 47
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 208
                || evento.getKeyChar() >= 210 && evento.getKeyChar() <= 240
                || evento.getKeyChar() >= 242 && evento.getKeyChar() <= 8482){
            evento.consume();
            JOptionPane.showMessageDialog(rootPane, "No esta permitido este caracter especial:   " + evento.getKeyChar());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_Registrar = new javax.swing.JButton();
        JB_Ingresar = new javax.swing.JButton();
        JTP_Clave = new javax.swing.JPasswordField();
        JL_Clave = new javax.swing.JLabel();
        JT_Nombre = new javax.swing.JTextField();
        JL_Nombre = new javax.swing.JLabel();
        JL_C = new javax.swing.JLabel();
        JL_B = new javax.swing.JLabel();
        JL_WallPaper_Logo = new javax.swing.JLabel();
        JL_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(400, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_Registrar.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        JB_Registrar.setText("Registrar");
        JB_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        JB_Ingresar.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        JB_Ingresar.setText("Ingresar");
        JB_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        JTP_Clave.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        JTP_Clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTP_ClaveKeyTyped(evt);
            }
        });
        getContentPane().add(JTP_Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 300, -1));

        JL_Clave.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        JL_Clave.setForeground(new java.awt.Color(204, 204, 204));
        JL_Clave.setText("Contraseña");
        getContentPane().add(JL_Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        JT_Nombre.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        JT_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_NombreKeyTyped(evt);
            }
        });
        getContentPane().add(JT_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 300, -1));

        JL_Nombre.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        JL_Nombre.setForeground(new java.awt.Color(204, 204, 204));
        JL_Nombre.setText("Nombre de usuario");
        getContentPane().add(JL_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        JL_C.setForeground(new java.awt.Color(204, 204, 204));
        JL_C.setText("Creado por Juan de dios ");
        getContentPane().add(JL_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, -1));

        JL_B.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        JL_B.setForeground(new java.awt.Color(204, 204, 204));
        JL_B.setText("FamilyBoock ®");
        getContentPane().add(JL_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));
        getContentPane().add(JL_WallPaper_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 280));
        getContentPane().add(JL_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_IngresarActionPerformed
        user = JT_Nombre.getText().trim();
        pass = JTP_Clave.getText().trim();

        if (!user.equals("") || !pass.equals("")) {

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("Select Nivel, Estatus from usuario where NombreU = '" + user + "' and Clave = '" + pass + "'");

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {

                    String Tipo_Nivel = rs.getString("Nivel");
                    String Estatus = rs.getString("Estatus");

                    if (Tipo_Nivel.equalsIgnoreCase("Administrador") && Estatus.equalsIgnoreCase("Activo")) {

                        dispose();
                        new Administrador().setVisible(true);

                    } else if (Tipo_Nivel.equalsIgnoreCase("Editor") && Estatus.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Editor().setVisible(true);
                    } else if (Tipo_Nivel.equalsIgnoreCase("Usuario") && Estatus.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Usuario().setVisible(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                    JTP_Clave.setText("");
                    JT_Nombre.setText("");

                }

            } catch (SQLException e) {
                System.err.println("Se a generado un error" + e);
                JOptionPane.showMessageDialog(null, "¡Error al iniciar seccion!, por favor comunicarse con el administrador");
            }

        } else {
            JOptionPane.showMessageDialog(null, "debes de completar los datos");
        }
    }//GEN-LAST:event_JB_IngresarActionPerformed

    private void JB_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegistrarActionPerformed
        dispose();
        new RegistroUsuario().setVisible(true);
    }//GEN-LAST:event_JB_RegistrarActionPerformed

    private void JT_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_NombreKeyTyped
        ValidacionCaracteres(evt);
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Porfavor, Ingresar solo letras");

        }
    }//GEN-LAST:event_JT_NombreKeyTyped

    private void JTP_ClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTP_ClaveKeyTyped
        ValidacionCaracteres(evt);
    }//GEN-LAST:event_JTP_ClaveKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Ingresar;
    private javax.swing.JButton JB_Registrar;
    private javax.swing.JLabel JL_B;
    private javax.swing.JLabel JL_C;
    private javax.swing.JLabel JL_Clave;
    private javax.swing.JLabel JL_Nombre;
    private javax.swing.JLabel JL_WallPaper_Logo;
    private javax.swing.JLabel JL_Wallpaper;
    private javax.swing.JPasswordField JTP_Clave;
    private javax.swing.JTextField JT_Nombre;
    // End of variables declaration//GEN-END:variables
}
