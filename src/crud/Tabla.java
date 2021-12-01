
package crud;

import MySQL_conexion.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tabla extends javax.swing.JFrame {
    conexion con = new conexion();
    Connection cc;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int ID;
    
    public Tabla() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        TXTlastName = new javax.swing.JTextField();
        TXTuserName = new javax.swing.JTextField();
        TXTnumber = new javax.swing.JTextField();
        TXTemail = new javax.swing.JTextField();
        TXTname = new javax.swing.JTextField();
        TXTpassword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnLogout = new javax.swing.JButton();
        update = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();
        TXTid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        jLabel2.setText("Registros");

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de usuario", "Nombre", "Apellido", "Telefono", "Correo Electronico", "Contraseña"
            }
        ));
        datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datos);

        TXTlastName.setBackground(new java.awt.Color(255, 255, 255));
        TXTlastName.setBorder(null);

        TXTuserName.setBackground(new java.awt.Color(255, 255, 255));
        TXTuserName.setBorder(null);
        TXTuserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTuserNameActionPerformed(evt);
            }
        });

        TXTnumber.setBackground(new java.awt.Color(255, 255, 255));
        TXTnumber.setBorder(null);

        TXTemail.setBackground(new java.awt.Color(255, 255, 255));
        TXTemail.setBorder(null);

        TXTname.setBackground(new java.awt.Color(255, 255, 255));
        TXTname.setBorder(null);

        TXTpassword.setBackground(new java.awt.Color(255, 255, 255));
        TXTpassword.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        btnLogout.setBackground(new java.awt.Color(255, 0, 51));
        btnLogout.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(51, 51, 51));
        btnLogout.setText("Cerrar sesion");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        update.setForeground(new java.awt.Color(51, 51, 51));
        update.setText("Agregar");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(255, 255, 255));
        borrar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(51, 51, 51));
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(51, 51, 51));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel3.setText("Nombre de usuario");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel6.setText("Apellido");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel7.setText("Correo Electronico");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel8.setText("Contraseña");

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(51, 51, 51));
        modificar.setText("Modificar");
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        TXTid.setEditable(false);
        TXTid.setBackground(new java.awt.Color(255, 255, 255));
        TXTid.setBorder(null);
        TXTid.setEnabled(false);
        TXTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTidActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel9.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(update)
                .addGap(18, 18, 18)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TXTnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(282, 282, 282)
                            .addComponent(TXTpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(114, 114, 114))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(40, 40, 40)))
                                    .addGap(179, 179, 179))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TXTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TXTuserName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(TXTname, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))))
                                    .addGap(26, 26, 26)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(TXTlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))))
                    .addComponent(TXTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTuserName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login_screen logout = new Login_screen();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        agregar();
        consultar();
        nuevo();
    }//GEN-LAST:event_updateActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        eliminar();
        consultar();
        nuevo();
    }//GEN-LAST:event_borrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void TXTuserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTuserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTuserNameActionPerformed

    private void datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosMouseClicked
        int fila = datos.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(null,"Usuario no seleccionado");
        } else {
            ID = Integer.parseInt((String)datos.getValueAt(fila, 0).toString());
            String userName = (String)datos.getValueAt(fila,1);
            String name = (String)datos.getValueAt(fila,2);
            String lastname = (String)datos.getValueAt(fila,3);
            String number = (String)datos.getValueAt(fila,4);
            String email = (String)datos.getValueAt(fila,5);
            String password = (String)datos.getValueAt(fila,6);
            TXTid.setText(""+ID);
            TXTuserName.setText(userName);
            TXTname.setText(name);
            TXTlastName.setText(lastname);
            TXTnumber.setText(number);
            TXTemail.setText(email);
            TXTpassword.setText(password);
        }
    }//GEN-LAST:event_datosMouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        modificar();
        consultar();
    }//GEN-LAST:event_modificarActionPerformed

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
       
    }//GEN-LAST:event_modificarMouseClicked

    private void TXTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTidActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }
    
    private void consultar(){
        String sql = "select * from usuarios";
        try{
            cc = con.conexion();
            st = cc.createStatement();
            rs = st.executeQuery(sql);
            Object[]usuarios = new Object[7];
            modelo = (DefaultTableModel)datos.getModel();
            while (rs.next()){
                usuarios[0] = rs.getInt("ID");
                usuarios[1] = rs.getString("Nombre_usuario");
                usuarios[2] = rs.getString("Nombre");
                usuarios[3] = rs.getString("Apellido");
                usuarios[4] = rs.getString("Telefono");
                usuarios[5] = rs.getString("Correo");
                usuarios[6] = rs.getString("Contraseña");
                modelo.addRow(usuarios);
            }
        } catch (SQLException e){
            System.out.println("Error al conectarse a la base de datos"+e);
                    }
    }
    
    private void agregar(){
        
        String userName = TXTuserName.getText();
        String name = TXTname.getText();
        String lastName = TXTlastName.getText();
        String number = TXTnumber.getText();
        String email = TXTemail.getText();
        String password = TXTpassword.getText();
        if (lastName.equals("") || email.equals("") || userName.equals("") || password.equals("") || number.equals("") || name.equals("")) {
            JOptionPane.showMessageDialog(null, "Tiene que llenar los campos antes de proceder");
        }else {try{
            String sql = "INSERT INTO usuarios (`Nombre_Usuario`, `Nombre`, `Apellido`, `Telefono`, `Correo`, `Contraseña`) VALUES ('"+userName+"','"+name+"','"+lastName+"','"+number+"','"+email+"','"+password+"')";
            cc = con.conexion();
            st = cc.createStatement();
            rs = st.executeQuery(sql);
            JOptionPane.showMessageDialog(null,"Usuario agregado");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error  al agregar el usuario");
                    }
    }}
    
    void modificar(){
        String userName = TXTuserName.getText();
        String name = TXTname.getText();
        String lastName = TXTlastName.getText();
        String number = TXTnumber.getText();
        String email = TXTemail.getText();
        String password = TXTpassword.getText();
        String sql = "update usuarios set Nombre_Usuario='"+userName+"', Nombre='"+name+"', Apellido='"+lastName+"', Telefono='"+number+"', Correo='"+email+"', Contraseña='"+password+"' where ID="+ID;
        try{
            cc = con.conexion();
            st = cc.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Usuario actualizado");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al actualizar el usuario");
                    }
    }
    
    void eliminar(){
        int filas = datos.getSelectedRow();
        if (filas == -1){
            JOptionPane.showMessageDialog(null,"Seleccione por lo menos una fila antes de proceder");
        } else {
            String sql = "delete from usuarios where ID="+ID;
            try{
            cc = con.conexion();
            st = cc.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Usuario eliminado");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar el usuario");
                    }
        }
    }
    
    void nuevo(){
        TXTuserName.setText("");
        TXTname.setText("");
        TXTlastName.setText("");
        TXTnumber.setText("");
        TXTemail.setText("");
        TXTpassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTemail;
    private javax.swing.JTextField TXTid;
    private javax.swing.JTextField TXTlastName;
    private javax.swing.JTextField TXTname;
    private javax.swing.JTextField TXTnumber;
    private javax.swing.JTextField TXTpassword;
    private javax.swing.JTextField TXTuserName;
    private javax.swing.JButton borrar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton cancelar;
    private javax.swing.JTable datos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
