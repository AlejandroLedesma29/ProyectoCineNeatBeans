/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Controladores.controlador_usuario;
import Modelos.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author jero7
 */
public class informacion_usuario extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form Editar_usuario
     */
    controlador_usuario miControlador;
    
    public informacion_usuario() {
        initComponents();
        String urlServidor = "http://127.0.0.1:8080";
        this.miControlador = new controlador_usuario(urlServidor, "/usuarios");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtCedulaBuscarUsuario = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCedulaUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAñoNacimientoUsuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Informacion de un usuario");

        jLabel3.setText("Cédula");

        txtCedulaBuscarUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtCedulaBuscarUsuario.setText("cédula del usuario");
        txtCedulaBuscarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCedulaBuscarUsuarioMouseClicked(evt);
            }
        });
        txtCedulaBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaBuscarUsuarioActionPerformed(evt);
            }
        });

        btnBuscarUsuario.setBackground(new java.awt.Color(102, 255, 102));
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        txtNombreUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreUsuario.setText("nombre del usuario");
        txtNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreUsuarioMouseClicked(evt);
            }
        });
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("E-mail:");

        txtEmailUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtEmailUsuario.setText("e-mail del usuario");
        txtEmailUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailUsuarioMouseClicked(evt);
            }
        });
        txtEmailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        txtIdUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtIdUsuario.setText("identificador");
        txtIdUsuario.setEnabled(false);
        txtIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Cédula");

        txtCedulaUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtCedulaUsuario.setText("cédula del usuario");
        txtCedulaUsuario.setEnabled(false);
        txtCedulaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaUsuarioActionPerformed(evt);
            }
        });

        jLabel6.setText("Año de nacimiento:");

        txtAñoNacimientoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtAñoNacimientoUsuario.setText("año de nacimiento del usuario");
        txtAñoNacimientoUsuario.setEnabled(false);
        txtAñoNacimientoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoNacimientoUsuarioActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscarUsuario)
                .addGap(293, 293, 293))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(txtCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(txtCedulaBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton2)
                        .addGap(68, 68, 68)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtAñoNacimientoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCedulaBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarUsuario)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAñoNacimientoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaBuscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaBuscarUsuarioActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        // TODO add your handling code here:
        String cedula = this.txtCedulaBuscarUsuario.getText();
        Usuario encontrado = this.miControlador.buscarPorCedula(cedula);
        if (encontrado != null) {
            this.txtIdUsuario.setText(encontrado.getId());
            this.txtNombreUsuario.setText(encontrado.getNombre());
            this.txtCedulaUsuario.setText(encontrado.getCedula());
            this.txtEmailUsuario.setText(encontrado.getEmail());
            this.txtAñoNacimientoUsuario.setText(""+encontrado.getAnoNacimiento());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el Usuario");
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtEmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailUsuarioActionPerformed

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed

    private void txtCedulaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaUsuarioActionPerformed

    private void txtAñoNacimientoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoNacimientoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoNacimientoUsuarioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Ha sido un placer, vuelva pronto");
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCedulaBuscarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaBuscarUsuarioMouseClicked
        // TODO add your handling code here:
        this.txtCedulaBuscarUsuario.setText("");
    }//GEN-LAST:event_txtCedulaBuscarUsuarioMouseClicked

    private void txtNombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUsuarioMouseClicked
        // TODO add your handling code here:
        this.txtNombreUsuario.setText("");
    }//GEN-LAST:event_txtNombreUsuarioMouseClicked

    private void txtEmailUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailUsuarioMouseClicked
        // TODO add your handling code here:
        this.txtEmailUsuario.setText("");
    }//GEN-LAST:event_txtEmailUsuarioMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String cedula = this.txtCedulaUsuario.getText();
        Usuario encontrado = this.miControlador.buscarPorCedula(cedula);
        encontrado.setNombre(this.txtNombreUsuario.getText());
        encontrado.setEmail(this.txtEmailUsuario.getText());
        encontrado = miControlador.actualizar(encontrado);
        if(encontrado == null){
            JOptionPane.showMessageDialog(null,"El usuario NO ha sido actualizado correctamente");
        }else{
            JOptionPane.showMessageDialog(null,"El usuario ha sido actualizado correctamente");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void limpiarCampos(){
        this.txtAñoNacimientoUsuario.setText("");
        this.txtCedulaBuscarUsuario.setText("");
        this.txtEmailUsuario.setText("");
        this.txtCedulaUsuario.setText("");
        this.txtNombreUsuario.setText("");
        this.txtIdUsuario.setText("");
        
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String cedula = this.txtCedulaBuscarUsuario.getText();
        Usuario encontrado = this.miControlador.buscarPorCedula(cedula);
        try{
        miControlador.eliminar(encontrado.getId());
        JOptionPane.showMessageDialog(null, "Eliminación exitosa");
        limpiarCampos();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error -> " + e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAñoNacimientoUsuario;
    private javax.swing.JTextField txtCedulaBuscarUsuario;
    private javax.swing.JTextField txtCedulaUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
