/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dao.DPersona;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Sexo;

/**
 *
 * @author labc205
 */
public class FrmPersona extends javax.swing.JFrame {

    DPersona dP = new DPersona();
    private int pos = 0;

    /**
     * Creates new form FrmPersona
     */
    public FrmPersona() {
        initComponents();
        jBtnLimpiar.setToolTipText("Limpiar");
        jBtnAgregar.setToolTipText("Agregar");
        jCmbSexo.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblID = new javax.swing.JLabel();
        jLblNombres = new javax.swing.JLabel();
        jLblApellidos = new javax.swing.JLabel();
        jLblEmail = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jTfId = new javax.swing.JTextField();
        jTfNombres = new javax.swing.JTextField();
        jTfApellidos = new javax.swing.JTextField();
        jTfEmail = new javax.swing.JTextField();
        jCmbSexo = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jBtnPrimero = new javax.swing.JButton();
        jBtnAnterior = new javax.swing.JButton();
        jBtnSiguiente = new javax.swing.JButton();
        jBtnUltimo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblRegistros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listado de Personas");

        jLblID.setText("ID:");

        jLblNombres.setText("NOMBRES:");

        jLblApellidos.setText("APELLIDOS:");

        jLblEmail.setText("EMAIL:");

        jLblSexo.setText("SEXO:");

        jCmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        jToolBar1.setRollover(true);

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/img/Nuevo.png"))); // NOI18N
        jBtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnLimpiar.setFocusable(false);
        jBtnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnLimpiar);

        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/img/Guardar.png"))); // NOI18N
        jBtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAgregar.setFocusable(false);
        jBtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnAgregar);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator1);

        jBtnPrimero.setText("|<");
        jBtnPrimero.setFocusable(false);
        jBtnPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPrimeroActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnPrimero);

        jBtnAnterior.setText("<<");
        jBtnAnterior.setFocusable(false);
        jBtnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnteriorActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnAnterior);

        jBtnSiguiente.setText(">>");
        jBtnSiguiente.setFocusable(false);
        jBtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSiguienteActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnSiguiente);

        jBtnUltimo.setText(">|");
        jBtnUltimo.setFocusable(false);
        jBtnUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUltimoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnUltimo);

        jTblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTblRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblSexo)
                    .addComponent(jLblEmail)
                    .addComponent(jLblApellidos)
                    .addComponent(jLblNombres)
                    .addComponent(jLblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTfNombres)
                    .addComponent(jTfApellidos)
                    .addComponent(jTfEmail)
                    .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCmbSexo, 0, 235, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblID)
                            .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblNombres)
                            .addComponent(jTfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblApellidos)
                            .addComponent(jTfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblEmail)
                            .addComponent(jTfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblSexo)
                            .addComponent(jCmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // TODO add your handling code here:
        llenarTabla();
        limpiar();
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        if (jTfId.getText().length() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Necesita agregar el ID",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (jTfNombres.getText().length() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Necesita agregar el Nombre",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        int id = Integer.parseInt(jTfId.getText());
        String nom = jTfNombres.getText();
        String ape = jTfApellidos.getText();
        String email = jTfEmail.getText();
        Sexo s;
        if (jCmbSexo.getSelectedIndex() == 0) {
            s = Sexo.HOMBRE;
        } else {
            s = Sexo.MUJER;
        }
        int b = dP.agregarPersona(id, nom, ape, email, s);
        if (b == 1) {
            JOptionPane.showMessageDialog(this,
                    "Registro Agregado...",
                    "Guardar",
                    JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error al guardar...",
                    "Guardar",
                    JOptionPane.ERROR_MESSAGE);
        }
        llenarTabla();
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrimeroActionPerformed
        // TODO add your handling code here:
        if (!dP.getListPersona().isEmpty()) {
            try {
                pos = 0;
                int id = dP.getListPersona().get(pos).getId();
                String nom = dP.getListPersona().get(pos).getNombre();
                String ape = dP.getListPersona().get(pos).getApellidos();
                String ema = dP.getListPersona().get(pos).getEmail();
                Sexo sex = dP.getListPersona().get(pos).getSexo();
                jTfId.setText(""+id);
                jTfNombres.setText(nom);
                jTfApellidos.setText(ape);
                jTfEmail.setText(ema);
                if(sex == Sexo.HOMBRE) jCmbSexo.setSelectedIndex(0);
                else jCmbSexo.setSelectedIndex(1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(this, "No hay registros...",
                    "Registros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnPrimeroActionPerformed

    private void jBtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUltimoActionPerformed
        // TODO add your handling code here:
        if(!dP.getListPersona().isEmpty()){
            try {
                pos = dP.getListPersona().size() -1;
                int id = dP.getListPersona().get(pos).getId();
                String nom = dP.getListPersona().get(pos).getNombre();
                String ape = dP.getListPersona().get(pos).getApellidos();
                String ema = dP.getListPersona().get(pos).getEmail();
                Sexo sex = dP.getListPersona().get(pos).getSexo();
                jTfId.setText(""+id);
                jTfNombres.setText(nom);
                jTfApellidos.setText(ape);
                jTfEmail.setText(ema);
                if(sex == Sexo.HOMBRE) jCmbSexo.setSelectedIndex(0);
                else jCmbSexo.setSelectedIndex(1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(this, "No hay registros...",
                    "Registros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnUltimoActionPerformed

    private void jBtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnteriorActionPerformed
        // TODO add your handling code here:
        if(!dP.getListPersona().isEmpty()){
            try {
                pos--;
                if (pos < 0) pos = dP.getListPersona().size()-1;
                int id = dP.getListPersona().get(pos).getId();
                String nom = dP.getListPersona().get(pos).getNombre();
                String ape = dP.getListPersona().get(pos).getApellidos();
                String ema = dP.getListPersona().get(pos).getEmail();
                Sexo sex = dP.getListPersona().get(pos).getSexo();
                jTfId.setText(""+id);
                jTfNombres.setText(nom);
                jTfApellidos.setText(ape);
                jTfEmail.setText(ema);
                if(sex == Sexo.HOMBRE) jCmbSexo.setSelectedIndex(0);
                else jCmbSexo.setSelectedIndex(1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(this, "No hay registros...",
                    "Registros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnAnteriorActionPerformed

    private void jBtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSiguienteActionPerformed
        // TODO add your handling code here:
        if(!dP.getListPersona().isEmpty()){
            try {
                pos ++;
                if(pos == dP.getListPersona().size()) pos = 0;
                int id = dP.getListPersona().get(pos).getId();
                String nom = dP.getListPersona().get(pos).getNombre();
                String ape = dP.getListPersona().get(pos).getApellidos();
                String ema = dP.getListPersona().get(pos).getEmail();
                Sexo sex = dP.getListPersona().get(pos).getSexo();
                jTfId.setText(""+id);
                jTfNombres.setText(nom);
                jTfApellidos.setText(ape);
                jTfEmail.setText(ema);
                if(sex == Sexo.HOMBRE) jCmbSexo.setSelectedIndex(0);
                else jCmbSexo.setSelectedIndex(1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(this, "No hay registros...",
                    "Registros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnSiguienteActionPerformed

    private void llenarTabla() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl = dP.getListPers();
        jTblRegistros.setModel(tbl);
    }

    private void limpiar() {
        jTfId.setText("");
        jTfNombres.setText("");
        jTfApellidos.setText("");
        jTfEmail.setText("");
        jCmbSexo.setSelectedIndex(-1);
        jTfId.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnAnterior;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnPrimero;
    private javax.swing.JButton jBtnSiguiente;
    private javax.swing.JButton jBtnUltimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCmbSexo;
    private javax.swing.JLabel jLblApellidos;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblID;
    private javax.swing.JLabel jLblNombres;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTblRegistros;
    private javax.swing.JTextField jTfApellidos;
    private javax.swing.JTextField jTfEmail;
    private javax.swing.JTextField jTfId;
    private javax.swing.JTextField jTfNombres;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}