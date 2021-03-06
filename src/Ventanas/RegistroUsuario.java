package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Clases.*;
import java.text.SimpleDateFormat;
import java.time.*;
import javax.swing.WindowConstants;

public class RegistroUsuario extends javax.swing.JFrame {

    Otros o = new Otros();

    public RegistroUsuario() {

        initComponents();

        //Diseño base del programa
        setTitle("FamilyBoock  ||  Registro");
        setLocationRelativeTo(null);
        JB_Registro.setEnabled(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Icono para el programa
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src\\imagenes\\Icono.png");
        setIconImage(miIcono);

        // WallPaper o fondo de pantalla 
        ImageIcon wallPaper = new ImageIcon("src\\Imagenes\\WallPaperR.png");
        Icon icono = new ImageIcon(wallPaper.getImage().getScaledInstance(JL_Wallpaper.getWidth(), JL_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        JL_Wallpaper.setIcon(icono);
        this.repaint();

    }
// Validacion de espacios en los JLabels / sonas de texto

    public void ValidacionEspacios() {
        if (JTF_Nombre_U.getText().isEmpty()) {
            JLADU.setText("*");
        } else {
            JLADU.setText("");
        }
        if (JTF_Nombre.getText().isEmpty()) {
            JLADN.setText("*");
        } else {
            JLADN.setText("");
        }
        if (JTF_ApellidoM.getText().isEmpty()) {
            JLADAM.setText("*");
        } else {
            JLADAM.setText("");
        }
        if (JTF_ApellidoP.getText().isEmpty()) {
            JLADAP.setText("*");
        } else {
            JLADAP.setText("");
        }
        if (JTF_Clave.getText().isEmpty()) {
            JLADP.setText("*");
        } else {
            JLADP.setText("");
        }
        if (JTF_Correo.getText().isEmpty() || !JTF_Correo.getText().contains(".") || !JTF_Correo.getText().contains(".")) {
            JLADC.setText("*");
        } else {
            JLADC.setText("");
        }

    }

//Condiciones para habilitar el boton
    public void HabilitarBoton() {

        if (JTF_Nombre.getText().isEmpty() || JL_Clave.getText().isEmpty() || JTF_Correo.getText().isEmpty() || JTF_ApellidoM.getText().isEmpty() || JTF_ApellidoP.getText().isEmpty() || JTF_Telefono.getText().isEmpty() || JTF_Clave.getText().isEmpty() || jDateChooser1.getDate() == null) {
            JB_Registro.setEnabled(false);
        } else {
            JB_Registro.setEnabled(true);
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

        JL_Nombre = new javax.swing.JLabel();
        JL_Clave = new javax.swing.JLabel();
        JL_Datos = new javax.swing.JLabel();
        JL_Nivel = new javax.swing.JLabel();
        JTF_Nombre_U = new javax.swing.JTextField();
        JLADP = new javax.swing.JLabel();
        JB_Registro = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        JL_Registro = new javax.swing.JLabel();
        JLADU = new javax.swing.JLabel();
        JL_Correo = new javax.swing.JLabel();
        JTF_Correo = new javax.swing.JTextField();
        JL_Telefono = new javax.swing.JLabel();
        JTF_Telefono = new javax.swing.JTextField();
        JCB_Nivel = new javax.swing.JComboBox<>();
        JB_Login = new javax.swing.JButton();
        JTF_Nombre = new javax.swing.JTextField();
        JTF_ApellidoP = new javax.swing.JTextField();
        JTF_ApellidoM = new javax.swing.JTextField();
        JTF_Clave = new javax.swing.JPasswordField();
        JLADC = new javax.swing.JLabel();
        JLADAP = new javax.swing.JLabel();
        JLADAM = new javax.swing.JLabel();
        JLADN = new javax.swing.JLabel();
        JL_ApellidoM = new javax.swing.JLabel();
        JL_NombreN = new javax.swing.JLabel();
        JL_ApellidoP = new javax.swing.JLabel();
        JL_Advertencia_Correo = new javax.swing.JLabel();
        JL_C = new javax.swing.JLabel();
        JL_B = new javax.swing.JLabel();
        JL_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setName("Registro"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Nombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_Nombre.setForeground(new java.awt.Color(204, 204, 204));
        JL_Nombre.setText("Usuario");
        getContentPane().add(JL_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        JL_Clave.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_Clave.setForeground(new java.awt.Color(204, 204, 204));
        JL_Clave.setText("Contraseña");
        getContentPane().add(JL_Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        JL_Datos.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_Datos.setForeground(new java.awt.Color(204, 204, 204));
        JL_Datos.setText("Datos");
        getContentPane().add(JL_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        JL_Nivel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_Nivel.setForeground(new java.awt.Color(204, 204, 204));
        JL_Nivel.setText("Nivel");
        getContentPane().add(JL_Nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        JTF_Nombre_U.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        JTF_Nombre_U.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JTF_Nombre_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_Nombre_UActionPerformed(evt);
            }
        });
        JTF_Nombre_U.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTF_Nombre_UKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_Nombre_UKeyTyped(evt);
            }
        });
        getContentPane().add(JTF_Nombre_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 239, -1));
        JTF_Nombre_U.getAccessibleContext().setAccessibleName("");
        JTF_Nombre_U.getAccessibleContext().setAccessibleDescription("");

        JLADP.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JLADP.setForeground(new java.awt.Color(250, 0, 0));
        getContentPane().add(JLADP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 40, 20));

        JB_Registro.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        JB_Registro.setText("Registrar");
        JB_Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JB_Registro.setEnabled(false);
        JB_Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_RegistroMouseClicked(evt);
            }
        });
        JB_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegistroActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 311, 100, 30));

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyTyped(evt);
            }
        });
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 120, 30));

        JL_Registro.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        getContentPane().add(JL_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 219, 45));

        JLADU.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        JLADU.setForeground(new java.awt.Color(250, 0, 0));
        getContentPane().add(JLADU, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 40, 23));

        JL_Correo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_Correo.setForeground(new java.awt.Color(204, 204, 204));
        JL_Correo.setText("Correo Electronico");
        getContentPane().add(JL_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        JTF_Correo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        JTF_Correo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JTF_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_CorreoActionPerformed(evt);
            }
        });
        JTF_Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTF_CorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_CorreoKeyTyped(evt);
            }
        });
        getContentPane().add(JTF_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 239, -1));

        JL_Telefono.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_Telefono.setForeground(new java.awt.Color(204, 204, 204));
        JL_Telefono.setText("Telefono");
        getContentPane().add(JL_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        JTF_Telefono.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        JTF_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTF_TelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_TelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(JTF_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 239, 29));

        JCB_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Editor", "Administrador" }));
        getContentPane().add(JCB_Nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 100, 31));

        JB_Login.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        JB_Login.setText("Ingresar ");
        JB_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 100, -1));

        JTF_Nombre.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        JTF_Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JTF_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_NombreActionPerformed(evt);
            }
        });
        JTF_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTF_NombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_NombreKeyTyped(evt);
            }
        });
        getContentPane().add(JTF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 239, -1));

        JTF_ApellidoP.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        JTF_ApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTF_ApellidoPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_ApellidoPKeyTyped(evt);
            }
        });
        getContentPane().add(JTF_ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 239, 29));

        JTF_ApellidoM.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        JTF_ApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTF_ApellidoMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_ApellidoMKeyTyped(evt);
            }
        });
        getContentPane().add(JTF_ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 239, 29));

        JTF_Clave.setText("jPasswordField1");
        JTF_Clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTF_ClaveKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_ClaveKeyTyped(evt);
            }
        });
        getContentPane().add(JTF_Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 172, 240, 30));

        JLADC.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        JLADC.setForeground(new java.awt.Color(250, 0, 0));
        getContentPane().add(JLADC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 40, 23));

        JLADAP.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        JLADAP.setForeground(new java.awt.Color(250, 0, 0));
        getContentPane().add(JLADAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 40, 23));

        JLADAM.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        JLADAM.setForeground(new java.awt.Color(250, 0, 0));
        getContentPane().add(JLADAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 40, 23));

        JLADN.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        JLADN.setForeground(new java.awt.Color(250, 0, 0));
        getContentPane().add(JLADN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 40, 23));

        JL_ApellidoM.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_ApellidoM.setForeground(new java.awt.Color(204, 204, 204));
        JL_ApellidoM.setText("Apellido M");
        getContentPane().add(JL_ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        JL_NombreN.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_NombreN.setForeground(new java.awt.Color(204, 204, 204));
        JL_NombreN.setText("Nombre");
        getContentPane().add(JL_NombreN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        JL_ApellidoP.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_ApellidoP.setForeground(new java.awt.Color(204, 204, 204));
        JL_ApellidoP.setText("Apellido P");
        getContentPane().add(JL_ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        JL_Advertencia_Correo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JL_Advertencia_Correo.setForeground(new java.awt.Color(250, 0, 0));
        getContentPane().add(JL_Advertencia_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 18, 23));

        JL_C.setForeground(new java.awt.Color(204, 204, 204));
        JL_C.setText("Creado por Juan de Dios");
        getContentPane().add(JL_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        JL_B.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        JL_B.setForeground(new java.awt.Color(204, 204, 204));
        JL_B.setText("FamilyBoock ®");
        getContentPane().add(JL_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));
        getContentPane().add(JL_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_Nombre_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_Nombre_UActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_Nombre_UActionPerformed

    private void JTF_Nombre_UKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_Nombre_UKeyReleased
        HabilitarBoton();
        ValidacionEspacios();
    }//GEN-LAST:event_JTF_Nombre_UKeyReleased

    private void JTF_Nombre_UKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_Nombre_UKeyTyped
        char validar = evt.getKeyChar();
        String Caracteres = JTF_Nombre_U.getText();

        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Porfavor, Ingresar solo letras");

        }
        o.VCaracteres(evt);

        if (JTF_Nombre_U.getText().length() >= 30) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Solo se permiten maximo 30 caracteres");

        }
    }//GEN-LAST:event_JTF_Nombre_UKeyTyped

    String Lv = "";
    String E = "";

    private void JB_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegistroActionPerformed

        String NombreU, Nombre, ApellidoM, ApellidoP, Mail, Telefono, Pass, Nivel, Apellidos, fecha;
        int año, mes, dia;
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        fecha = dFormat.format(jDateChooser1.getDate());

        Nombre = JTF_Nombre.getText().trim();
        NombreU = JTF_Nombre_U.getText().trim();
        Nivel = JCB_Nivel.getSelectedItem().toString();
        ApellidoM = JTF_ApellidoM.getText().trim();
        ApellidoP = JTF_ApellidoP.getText().trim();
        Mail = JTF_Correo.getText().trim();
        Telefono = JTF_Telefono.getText().trim();
        Pass = JTF_Clave.getText().trim();
        Apellidos = ApellidoM + ApellidoP;

        año = Integer.parseInt(fecha.split("-")[2]);
        mes = Integer.parseInt(fecha.split("-")[1]);
        dia = Integer.parseInt(fecha.split("-")[0]);

        LocalDate AñoS = LocalDate.of(año, mes, dia);
        LocalDate Actual = LocalDate.now();

        Period dif = Period.between(AñoS, Actual);

        int ed = dif.getYears();
        String edad = Integer.toString(ed);

        int h = 0;

        // Validar campos++ en Nombre u
        if (NombreU.contains("a")) {
            if (NombreU.length() >= 5) {
                h++;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu usuario es demasiado corto");
            }
        } else if (NombreU.contains("e")) {
            if (NombreU.length() >= 5) {
                h++;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu usuario es demasiado corto");
            }
        } else if (NombreU.contains("i")) {
            if (NombreU.length() >= 5) {
                h++;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu usuario es demasiado corto");
            }
        } else if (NombreU.contains("o")) {
            if (NombreU.length() >= 5) {
                h++;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu usuario es demasiado corto");
            }
        } else if (NombreU.contains("u")) {
            if (NombreU.length() >= 5) {
                h++;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu usuario es demasiado corto");
            }
        } else if (h == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu usuario no cumple con los caracteres minimos");
        }
//Validar campos++ en Nombre
        if (h == 1) {
            if (Nombre.contains("a")) {
                if (Nombre.length() >= 10) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu nombre es demasiado corto");
                }
            } else if (Nombre.contains("e")) {
                if (Nombre.length() >= 10) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu nombre es demasiado corto");
                }
            } else if (Nombre.contains("i")) {
                if (Nombre.length() >= 10) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu nombre es demasiado corto");
                }
            } else if (Nombre.contains("o")) {
                if (Nombre.length() >= 10) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu nombre es demasiado corto");
                }
            } else if (Nombre.contains("u")) {
                if (Nombre.length() >= 10) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu nombre es demasiado corto");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu nombre no cumple con los caracteres minimos");
            }
        }

//Validar cammpos++ en Apellidos
        if (h == 2) {
            if (Apellidos.contains("a")) {
                if (Apellidos.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tus apellidos son demasiado cortos");
                }
            } else if (Apellidos.contains("e")) {
                if (Apellidos.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tus apellidos son demasiado cortos");
                }
            } else if (Apellidos.contains("i")) {
                if (Apellidos.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tus apellidos son demasiado cortos");
                }
            } else if (Apellidos.contains("o")) {
                if (Apellidos.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tus apellidos son demasiado cortos");
                }
            } else if (Apellidos.contains("u")) {
                if (Apellidos.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tus apellidos son demasiado cortos");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tus apellidos no contienen caracteres minimos");
            }

        }

//Validar campos++ en correo
        if (h == 3) {
            if (Mail.contains("@gmail.com")) {
                if (Mail.length() >= 6) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, como minimo deben de ser 6 caracteres tu correo");
                }
            } else if (Mail.contains("@hotmail.com")) {
                if (Mail.length() >= 6) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, como minimo deben de ser 6 caracteres tu correo");
                }
            } else if (Mail.contains("@Outlook.com")) {
                if (Mail.length() >= 6) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, como minimo deben de ser 6 caracteres tu correo");
                }
            } else if (Mail.contains("@yahoo.com")) {
                if (Mail.length() >= 6) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, como minimo deben de ser 6 caracteres tu correo");
                }
            } else if (Mail.contains("@hotmail.es")) {
                if (Mail.length() >= 6) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, como minimo deben de ser 6 caracteres tu correo");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, correo no reconocido");
            }

        }

//Validar campos en Telefono
        if (h == 4) {
            if (Telefono.length() == 10) {
                h++;
            } else if (Telefono.length() <= 9) {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, Tu numero de telefono no se puede reconocer");
            }

        }

//Validar campos en clave
        if (h == 5) {
            if (Pass.contains("a")) {
                if (Pass.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu contraseña es demaciado corta");
                }
            } else if (Pass.contains("e")) {
                if (Pass.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu contraseña es demaciado corta");
                }
            } else if (Pass.contains("i")) {
                if (Pass.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu contraseña es demaciado corta");
                }
            } else if (Pass.contains("o")) {
                if (Pass.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu contraseña es demaciado corta");
                }
            } else if (Pass.contains("u")) {
                if (Pass.length() >= 8) {
                    h++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu contraseña es demaciado corta");
                }
            } else if (Pass.contains("0")) {
                h++;
            } else if (Pass.contains("1")) {
                h++;
            } else if (Pass.contains("2")) {
                h++;
            } else if (Pass.contains("3")) {
                h++;
            } else if (Pass.contains("4")) {
                h++;
            } else if (Pass.contains("5")) {
                h++;
            } else if (Pass.contains("6")) {
                h++;
            } else if (Pass.contains("7")) {
                h++;
            } else if (Pass.contains("8")) {
                h++;
            } else if (Pass.contains("9")) {
                h++;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, tu contraseña no contiene caracteres minimos");
            }

        }

//Validacion de que todos los campos esten correctos + comunicacion con base de datos(Accion del boton)      
        if (h == 6) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into usuario values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

                pst.setString(1, "0");
                pst.setString(2, NombreU);
                pst.setString(3, Pass);
                pst.setString(4, edad);
                pst.setString(5, Nivel);
                pst.setString(6, "Activo");
                pst.setString(7, Nombre);
                pst.setString(8, ApellidoM);
                pst.setString(9, ApellidoP);
                pst.setString(10, Mail);
                pst.setString(11, Telefono);
                pst.setString(12, fecha);
                pst.setString(13, "");

                pst.executeUpdate();

                JOptionPane.showMessageDialog(rootPane, "El Usuario " + NombreU + " se a creado correctamente");
                dispose();
                new Administrador().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "se a producido el error: " + e + "Por favor comunicarse con un administrador");
            }
        }

    }//GEN-LAST:event_JB_RegistroActionPerformed

    private void JB_RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_RegistroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_RegistroMouseClicked

    private void JB_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LoginActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_JB_LoginActionPerformed

    private void JTF_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_CorreoActionPerformed

    private void JTF_CorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_CorreoKeyReleased
        HabilitarBoton();
        ValidacionEspacios();
    }//GEN-LAST:event_JTF_CorreoKeyReleased

    private void JTF_CorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_CorreoKeyTyped
        o.VCorreo(evt);
    }//GEN-LAST:event_JTF_CorreoKeyTyped

    private void JTF_TelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_TelefonoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_TelefonoKeyReleased

    private void JTF_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_TelefonoKeyTyped
        o.VCaracteres(evt);
        if (JTF_Telefono.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Solo se permiten maximo 10 caracteres");

        }

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Porfavor, Ingresar solo numeros!");
        }
    }//GEN-LAST:event_JTF_TelefonoKeyTyped

    private void JTF_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_NombreActionPerformed

    private void JTF_NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_NombreKeyReleased
        HabilitarBoton();
        ValidacionEspacios();
    }//GEN-LAST:event_JTF_NombreKeyReleased

    private void JTF_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_NombreKeyTyped
        o.VCaracteres(evt);
    }//GEN-LAST:event_JTF_NombreKeyTyped

    private void JTF_ApellidoPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_ApellidoPKeyReleased
        HabilitarBoton();
        ValidacionEspacios();
    }//GEN-LAST:event_JTF_ApellidoPKeyReleased

    private void JTF_ApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_ApellidoPKeyTyped
        o.VCaracteres(evt);
    }//GEN-LAST:event_JTF_ApellidoPKeyTyped

    private void JTF_ApellidoMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_ApellidoMKeyReleased
        HabilitarBoton();
        ValidacionEspacios();
    }//GEN-LAST:event_JTF_ApellidoMKeyReleased

    private void JTF_ApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_ApellidoMKeyTyped
        o.VCaracteres(evt);
    }//GEN-LAST:event_JTF_ApellidoMKeyTyped

    private void JTF_ClaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_ClaveKeyReleased
        HabilitarBoton();
        ValidacionEspacios();
    }//GEN-LAST:event_JTF_ClaveKeyReleased

    private void JTF_ClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_ClaveKeyTyped
        o.VCaracteres(evt);
    }//GEN-LAST:event_JTF_ClaveKeyTyped

    private void jDateChooser1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyTyped
        HabilitarBoton();
        
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Porfavor, Ingresar solo numeros, de lo contrario seleccionar el boton para buscar la fecha");
        }
    }//GEN-LAST:event_jDateChooser1KeyTyped

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        HabilitarBoton();
    }//GEN-LAST:event_jDateChooser1MouseClicked

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Login;
    private javax.swing.JButton JB_Registro;
    private javax.swing.JComboBox<String> JCB_Nivel;
    private javax.swing.JLabel JLADAM;
    private javax.swing.JLabel JLADAP;
    private javax.swing.JLabel JLADC;
    private javax.swing.JLabel JLADN;
    private javax.swing.JLabel JLADP;
    private javax.swing.JLabel JLADU;
    private javax.swing.JLabel JL_Advertencia_Correo;
    private javax.swing.JLabel JL_ApellidoM;
    private javax.swing.JLabel JL_ApellidoP;
    private javax.swing.JLabel JL_B;
    private javax.swing.JLabel JL_C;
    private javax.swing.JLabel JL_Clave;
    private javax.swing.JLabel JL_Correo;
    private javax.swing.JLabel JL_Datos;
    private javax.swing.JLabel JL_Nivel;
    private javax.swing.JLabel JL_Nombre;
    private javax.swing.JLabel JL_NombreN;
    private javax.swing.JLabel JL_Registro;
    private javax.swing.JLabel JL_Telefono;
    private javax.swing.JLabel JL_Wallpaper;
    private javax.swing.JTextField JTF_ApellidoM;
    private javax.swing.JTextField JTF_ApellidoP;
    private javax.swing.JPasswordField JTF_Clave;
    private javax.swing.JTextField JTF_Correo;
    private javax.swing.JTextField JTF_Nombre;
    private javax.swing.JTextField JTF_Nombre_U;
    private javax.swing.JTextField JTF_Telefono;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration//GEN-END:variables
}
