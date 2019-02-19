/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbank;

import Database.DBConnect;
import Model.DonarModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Medul
 */
public class UpdateDelete extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDelete
     */
    DBConnect db = new DBConnect();
    DefaultTableModel dm = new DefaultTableModel();

    String value;
    String value1;
    String value2;
    String value3;
    String value4;
    String value5;
    String value6;
    String value7;
    String value8;
    String value9;
    String value10;
    //String value11;

    public UpdateDelete() {
        initComponents();
        Update_Table();
//        java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
//        int xsize = (int) tk.getScreenSize().getWidth();
//        int ysize = (int) tk.getScreenSize().getHeight();
//        this.setSize(xsize, ysize);
    }

    private void filter(String sql) {
        dm = (DefaultTableModel) UpDelTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        UpDelTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(sql));

    }

    private void Update_Table() {

        try {
            for (int i = 0; i < db.getAll_donar().size(); i++) {
                DefaultTableModel model = (DefaultTableModel) UpDelTable.getModel();
                model.addRow(new Object[]{db.getAll_donar().get(i).getId(), db.getAll_donar().get(i).getName(), db.getAll_donar().get(i).getEmail(), db.getAll_donar().get(i).getAddress(), db.getAll_donar().get(i).getPhn(), db.getAll_donar().get(i).getDateOfBirth(), db.getAll_donar().get(i).getAge(), db.getAll_donar().get(i).getSex(), db.getAll_donar().get(i).getBloodGroup(),
                    db.getAll_donar().get(i).getLastDonate(), db.getAll_donar().get(i).getStatus()});
            }
        } catch (Exception e) {

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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UpDelTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UpDelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Address", "Phone", "DateOfBirth", "Age", "Sex", "BloodGroup", "LastDonate", "Status"
            }
        ));
        UpDelTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UpDelTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(UpDelTable);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpDelTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpDelTableKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            int p = JOptionPane.showConfirmDialog(null, "Do you want to update", "Update", JOptionPane.YES_NO_OPTION);
            if (p == 0 || evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                int index = UpDelTable.getSelectedRow();
                TableModel model = UpDelTable.getModel();
                value = model.getValueAt(index, 0).toString();
                value1 = model.getValueAt(index, 1).toString();
                value2 = model.getValueAt(index, 2).toString();
                value3 = model.getValueAt(index, 3).toString();
                value4 = model.getValueAt(index, 4).toString();
                value5 = model.getValueAt(index, 5).toString();
                value6 = model.getValueAt(index, 6).toString();
                value7 = model.getValueAt(index, 7).toString();
                value8 = model.getValueAt(index, 8).toString();
                value9 = model.getValueAt(index, 9).toString();
                value10 = model.getValueAt(index, 10).toString();
                //value11 = model.getValueAt(index, 11).toString();
                //DonarModel a = null;
                DonarModel a = new DonarModel(Integer.parseInt(value), value1, value2, value3, value4, value5, value6, value7, value8, value9, value10);
                db.updateIntoDonar(a, value);
                // Update_Table();
            }

        }

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE) {
            int p = JOptionPane.showConfirmDialog(null, "Do you want to Delete", "Delete", JOptionPane.YES_NO_OPTION);
            if (p == 0 || evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                int index = UpDelTable.getSelectedRow();
                TableModel model = UpDelTable.getModel();
                value = model.getValueAt(index, 0).toString();
                db.deleteFromDonar(value);
                // Update_Table();
            }

        }

    }//GEN-LAST:event_UpDelTableKeyPressed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.hide();
        MainMenu x = new MainMenu();
        x.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String txt = txtSearch.getText();
        filter(txt);
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UpDelTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
