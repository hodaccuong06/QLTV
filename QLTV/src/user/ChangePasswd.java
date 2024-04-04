/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package user;

import javax.swing.JOptionPane;
import student.controller.DataStudentFuctionImp;

/**
 *
 * @author DELL
 */
public class ChangePasswd extends javax.swing.JDialog {

    private InForStudentRegister info;

    /**
     * Creates new form ChangePasswd
     */
    public ChangePasswd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        info = (InForStudentRegister) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        txtpasswdOld = new javax.swing.JPasswordField();
        txtpasswdNew1 = new javax.swing.JPasswordField();
        txtpasswdNew2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mật Khẩu Cũ:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mật Khẩu Mới:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nhập Lại Mật Khẩu Mới:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        btnOk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOk.setText("Thay Đổi");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 150, -1));

        btnclose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnclose.setText("Hủy");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 150, -1));

        txtpasswdOld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtpasswdOld, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 280, -1));

        txtpasswdNew1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtpasswdNew1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 280, -1));

        txtpasswdNew2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtpasswdNew2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 280, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rsz_1changepasswd.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        var passwdOld = new String(txtpasswdOld.getPassword());
        var passwdNew1 = new String(txtpasswdNew1.getPassword());
        var passwdNew2 = new String(txtpasswdNew2.getPassword());
        if (!passwdOld.isEmpty() && !passwdNew1.isEmpty() && !passwdNew2.isEmpty()) {
            if (passwdOld.compareTo(info.getSt().getPassword()) == 0) {
                if (passwdNew1.compareTo(passwdNew2) == 0) {
                    boolean flag = checkpasswd(passwdNew1);
                    if (flag) {
                        info.getSt().setPassword(passwdNew1);
                        DataStudentFuctionImp dataST = new DataStudentFuctionImp();
                        dataST.updateStudent(info.getSt());
                        JOptionPane.showMessageDialog(rootPane, "đổi mật khẩu thành công");
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "mật khẩu tối thiểu 8 kí tự");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "mật khẩu mới không khớp "
                            + "vui lòng nhập lại!");

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "mật khẩu cũ không chính xác!");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "vui lòng không để rỗng các ô!");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePasswd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangePasswd dialog = new ChangePasswd(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtpasswdNew1;
    private javax.swing.JPasswordField txtpasswdNew2;
    private javax.swing.JPasswordField txtpasswdOld;
    // End of variables declaration//GEN-END:variables

    private boolean checkpasswd(String passwdNew1) {

        var passwd = passwdNew1.split("");
        if (passwd.length >= 6) {
            return true;

        }
        return false;
    }
}
