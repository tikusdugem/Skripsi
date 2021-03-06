/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LREO
 */
public class Register extends javax.swing.JFrame {
    
    public DefaultTableModel tabModel;

    /**
     * Creates new form frameRegister
     */
    public Register() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Logo/LogoDNetHouse.png")).getImage());
        setLocationRelativeTo(null);
        setJTable();        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAdmin = new javax.swing.JTable();
        bAdd = new javax.swing.JButton();
        cStatus = new javax.swing.JComboBox<>();
        txtAlamat = new javax.swing.JTextField();
        bCancel = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register | Sistem Informasi Penjualan D-Net House");

        jLabel1.setText("Nama");

        jLabel2.setText("Kata Sandi");

        jLabel3.setText("Alamat");

        jLabel4.setText("Telepon");

        jLabel5.setText("Status");

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        txtTelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeleponKeyTyped(evt);
            }
        });

        tabAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabAdmin);

        bAdd.setText("Tambah");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        cStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -", "Admin", "Operator" }));

        bCancel.setText("Batal");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.setEnabled(false);
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bEdit.setText("Ubah");
        bEdit.setEnabled(false);
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bSave.setText("Simpan");
        bSave.setEnabled(false);
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(28, 28, 28)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelepon)
                            .addComponent(txtAlamat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bEdit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bSave))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bAdd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bHapus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bCancel))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEdit)
                    .addComponent(bSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAdd)
                    .addComponent(bCancel)
                    .addComponent(bHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        //validasiTextField();
        tambahData();
    }//GEN-LAST:event_bAddActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        deleteData();
    }//GEN-LAST:event_bHapusActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        takeDataJTable();
        bSave.setEnabled(true);
        bEdit.setEnabled(false);
        bAdd.setEnabled(false);
        bHapus.setEnabled(false);
    }//GEN-LAST:event_bEditActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        editData();
        editData();
        txtNama.setText("");        
        txtPassword.setText("");
        txtAlamat.setText("");
        txtTelepon.setText("");
        cStatus.setSelectedItem("- Pilih -");
        bEdit.setEnabled(true);
        bAdd.setEnabled(true);
        bHapus.setEnabled(true);
        bSave.setEnabled(false);
        JOptionPane.showMessageDialog(null,"Edit Berhasil");
    }//GEN-LAST:event_bSaveActionPerformed

    private void tabAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAdminMouseClicked
        bHapus.setEnabled(true);
        bEdit.setEnabled(true);
    }//GEN-LAST:event_tabAdminMouseClicked

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        if(Character.isDigit(evt.getKeyChar())){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Inputan Harus Huruf");
        }
    }//GEN-LAST:event_txtNamaKeyTyped

    private void txtTeleponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeleponKeyTyped
        if(Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Inputan Harus Angka");
        }
    }//GEN-LAST:event_txtTeleponKeyTyped

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    
    private void getData(){
        
        try{            
            
            Connection conn = Koneksi.koneksiDatabase();
            String sql = "Select * From User";
            PreparedStatement s = conn.prepareStatement(sql);
            ResultSet r = s.executeQuery();
            
            String Nama, Password, Alamat, Telepon, Status;
            while(r.next()){            
            Nama = r.getString("Nama");
            Password = r.getString("Password");
            Alamat = r.getString("Alamat");
            Telepon = r.getString("Telepon");
            Status = r.getString("Status");
            
            Object Data[] = {Nama,Password,Alamat,Telepon,Status};
            tabModel.addRow(Data);
            }
            
            s.close();
            conn.close();
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,"" +sqle.getMessage());        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"" +e.getMessage());
        }
        
    }
    
    private void setJTable(){
        
        String [] JudulKolom = {"Nama","Kata Sandi","Alamat","Telepon","Status"};
        tabModel = new DefaultTableModel(null,JudulKolom){
            boolean[] canEdit = new boolean[] {false,false,false,false,false};
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
        };
        tabAdmin.setModel(tabModel);
        tabAdmin.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabAdmin.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabAdmin.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabAdmin.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabAdmin.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabAdmin.getColumnModel().getColumn(4).setPreferredWidth(100);        
        
        getData();
        
    }
    
    public void tambahData(){
        
        if(txtNama.getText().isEmpty() || txtPassword.getText().isEmpty() || txtAlamat.getText().isEmpty() || txtTelepon.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Kolom Masih Ada Yang Kosong");
            return;
        }else{
            
            try{
                
                Connection conn = Koneksi.koneksiDatabase();
                String sql = "Insert into User values(?,?,?,?,?)";
                PreparedStatement s = conn.prepareStatement(sql);                
                    s.setString(1, txtNama.getText());
                    s.setString(2, txtPassword.getText());
                    s.setString(3, txtAlamat.getText());
                    s.setString(4, txtTelepon.getText());
                    s.setString(5, (String) cStatus.getSelectedItem());
                int r = s.executeUpdate();
            
                if(r>0){
                    JOptionPane.showMessageDialog(null,"Register Berhasil");
                    setJTable();
                }
            
                s.close();
                conn.close();
            
                txtNama.setText("");
                txtPassword.setText("");
                txtAlamat.setText("");
                txtTelepon.setText("");
                cStatus.setSelectedItem("- Pilih -");
               
            }catch(SQLException sqle){
                JOptionPane.showMessageDialog(null,"" +sqle.getMessage());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"" +e.getMessage());
            }
        
        }
        
    }     
    
    public void takeDataJTable(){
        
        int row = tabAdmin.getSelectedRow();

        String Nama, Password, Alamat, Telepon, Status;        
        Nama = tabModel.getValueAt(row, 0).toString();
        Password = tabModel.getValueAt(row, 1).toString();
        Alamat = tabModel.getValueAt(row, 2).toString();
        Telepon = tabModel.getValueAt(row, 3).toString();
        Status = tabModel.getValueAt(row, 4).toString();
            
        txtNama.setText(Nama);
        txtPassword.setText(Password);
        txtAlamat.setText(Alamat);
        txtTelepon.setText(Telepon);
        cStatus.setSelectedItem(Status);
        
    }
    
    public void deleteJTable(){
        
        int row = tabModel.getRowCount();
        
        for(int i=0;i<row;i++){
            tabModel.removeRow(0);
        }

    }
    
    public void showDataJTable(){        
        
        deleteJTable();
                
        try {            
            
            Connection conn = Koneksi.koneksiDatabase();
            String sql = "Select * from User";
            PreparedStatement s = conn.prepareStatement(sql);
            ResultSet r = s.executeQuery();
            
            String Nama, Password, Alamat, Telepon, Status;
            while(r.next()){            
            Nama = r.getString("Nama");
            Password = r.getString("Password");
            Alamat = r.getString("Alamat");
            Telepon = r.getString("Telepon");
            Status = r.getString("Status");
            
            Object Data[] = {Nama,Password,Alamat,Telepon,Status};
            tabModel.addRow(Data);
            }
            
            s.close();
            conn.close();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage());    
        }

    }
    
    public void deleteData(){
        
        takeDataJTable();
        
        try {
            
            Connection conn = Koneksi.koneksiDatabase();
            String sql = "DELETE FROM User WHERE Nama = ?";
            PreparedStatement s = conn.prepareStatement(sql);
                s.setString(1, txtNama.getText());
            int r = s.executeUpdate();
            
            if(r>0){
            JOptionPane.showMessageDialog(this,"Data Sudah dihapus");
            deleteJTable();
            getData();
            }
            
            s.close();
            conn.close();
            
            txtNama.setText("");
            txtPassword.setText("");
            txtAlamat.setText("");
            txtTelepon.setText("");
            cStatus.setSelectedItem("- Pilih -");
        
        }catch(Exception e){
         JOptionPane.showMessageDialog(this,"" +e.getMessage());
        }
        
    }
    
    public void editData(){
        
        try{
            Connection conn = Koneksi.koneksiDatabase();
            String sql = "UPDATE User SET Password=?,Alamat=?,Telepon=?,Status=? where Nama=?";
            PreparedStatement s = conn.prepareStatement(sql);                
                s.setString(1, txtPassword.getText());
                s.setString(2, txtAlamat.getText());
                s.setString(3, txtTelepon.getText());
                s.setString(4, (String) cStatus.getSelectedItem());
                s.setString(5, txtNama.getText());
            int r = s.executeUpdate();
            
            deleteJTable();
            getData();         
                        
            s.close();
            conn.close();
                      
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,"" +sqle.getMessage());                       
        }
        
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bSave;
    private javax.swing.JComboBox<String> cStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabAdmin;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables
}
