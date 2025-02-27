import Database.DatabaseConnect;
import Database.SetTable;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivana
 */
public class User extends javax.swing.JInternalFrame {
    
    ResultSet rs;
    DatabaseConnect con;
    /**
     * Creates new form Form_user
     */
   public User() {
        
        con =new DatabaseConnect(new Database.Parameter().HOST_DB,new Database.Parameter().USERNAME_DB,new Database.Parameter().PASSWORD_DB);
        initComponents();
        loadTabel(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_user = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_type = new javax.swing.JComboBox();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_ubah = new javax.swing.JButton();
        btn_hapus1 = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_tambah1 = new javax.swing.JButton();
        btn_cari1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        tabel_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Username", "Type"
            }
        ));
        tabel_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_user);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tambah User");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipe User");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username     ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama              ");

        cb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Pegawai" }));
        cb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_typeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password     ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_username)
                        .addComponent(txt_password)
                        .addComponent(cb_type, 0, 374, Short.MAX_VALUE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btn_ubah.setBackground(new java.awt.Color(204, 0, 0));
        btn_ubah.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ubah.setForeground(new java.awt.Color(255, 255, 255));
        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus1.setBackground(new java.awt.Color(204, 0, 0));
        btn_hapus1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_hapus1.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus1.setText("Hapus");
        btn_hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus1ActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(204, 0, 0));
        btn_batal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_tambah1.setBackground(new java.awt.Color(204, 0, 0));
        btn_tambah1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_tambah1.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah1.setText("Tambah");
        btn_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah1ActionPerformed(evt);
            }
        });

        btn_cari1.setBackground(new java.awt.Color(204, 0, 0));
        btn_cari1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_cari1.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari1.setText("Cari");
        btn_cari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cari1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_hapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tambah1)))
                        .addGap(166, 166, 166))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(344, 344, 344))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hapus1)
                    .addComponent(btn_ubah)
                    .addComponent(btn_tambah1)
                    .addComponent(btn_batal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari1))
                .addGap(209, 209, 209))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(499, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
     try {
           if( !txt_nama.getText().isEmpty() && !txt_username.getText().isEmpty() && !txt_password.getText().isEmpty()){
                String kolom[] = {"nama","username","password","type"};
                String isi[] = { txt_nama.getText(),txt_username.getText(),txt_password.getText(),cb_type.getSelectedItem().toString()};
                
                con.queryUpdate("user", kolom, isi,"id_user='"+String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),0))+"'");
                JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
            }else{
                JOptionPane.showMessageDialog(this, "Inputan tidak boleh kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mengubah data");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
      create();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void tabel_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_userMouseClicked
        txt_nama.setText(String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),1)));
        txt_username.setText(String.valueOf( tabel_user.getValueAt(tabel_user.getSelectedRow(),2)));
        txt_password.setText(String.valueOf( tabel_user.getValueAt(tabel_user.getSelectedRow(),3)));
        cb_type.setSelectedItem(String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),4)));
    }//GEN-LAST:event_tabel_userMouseClicked

    private void btn_hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus1ActionPerformed
        try {
            String id=String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),0));
                if (JOptionPane.showConfirmDialog(this, "Yakin menghapus user", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("user","id_user="+id);
                JOptionPane.showMessageDialog(this, "User berhasil dihapus");

            }else{
                return;
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Data belum dipilih");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_hapus1ActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
      txt_nama.setText("");
      txt_username.setText("");
      txt_password.setText("");
      loadTabel();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_cari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari1ActionPerformed
        if(txt_cari.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Input data pencarian");
        }else{
            try {
                String kolom[] = {"id_user","nama","username","type"};
                rs=con.querySelect(kolom ,"user", "nama LIKE '%"+txt_cari.getText()+"%' OR type LIKE '%"+txt_cari.getText()+"%'");
                tabel_user.setModel(new Database.SetTable(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian gagal");
            }
        }
        clear();
    }//GEN-LAST:event_btn_cari1ActionPerformed

    private void cb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_typeActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ubah1ActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new User().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_cari1;
    private javax.swing.JButton btn_hapus1;
    private javax.swing.JButton btn_tambah1;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox cb_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_user;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private void loadTabel() {
       String namaKolom[] = {"id_user","nama","username","type"};
        rs=con.querySelect(namaKolom,"user");
        tabel_user.setModel(new SetTable(rs));
       clear();
    }

    private void create() {
        try {
 
            if( !txt_nama.getText().isEmpty() && !txt_username.getText().isEmpty() && !txt_password.getText().isEmpty()){
                String kolom[] = {"nama","username","password","type"};
                String isi[] = { txt_nama.getText(),txt_username.getText(),txt_password.getText(),cb_type.getSelectedItem().toString()};
                
                System.out.println( con.queryInsert("user",kolom,isi));
               
                JOptionPane.showMessageDialog(this, "User berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(this, "Inputan tidak boleh kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Input data gagal");
             System.out.println("salah");
        }
        loadTabel();
        clear();
    }

    private void clear() {
        txt_nama.setText("");
        txt_username.setText("");
        cb_type.setSelectedItem("Admin");
        txt_password.setText("");
       
    }
}
