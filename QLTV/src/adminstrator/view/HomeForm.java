/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adminstrator.view;

import adminstrator.model.Employee;
import book.view.BookForm;
import javax.swing.JOptionPane;
import registerbook.view.HomeRegisterBookForm;
import student.view.StudentForm;

/**
 *
 * @author DELL
 */
public class HomeForm extends javax.swing.JFrame {

    private Employee e;

    /**
     * Creates new form Home
     */
    public HomeForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public HomeForm(Employee checkE) {
        this();
        this.e = checkE;
    }

    public Employee getE() {
        return e;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStudent = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        btnResgisterBook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudent.setBackground(new java.awt.Color(153, 153, 153));
        btnStudent.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(51, 51, 51));
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/student.png"))); // NOI18N
        btnStudent.setText("Quản Lý Sinh Viên");
        btnStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 51), 1, true));
        btnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 310, 60));

        btnBook.setBackground(new java.awt.Color(153, 153, 153));
        btnBook.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBook.setForeground(new java.awt.Color(51, 51, 51));
        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/books.png"))); // NOI18N
        btnBook.setText("    Quản Lý Sách");
        btnBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 51), 1, true));
        btnBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 310, 60));

        btnResgisterBook.setBackground(new java.awt.Color(153, 153, 153));
        btnResgisterBook.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnResgisterBook.setForeground(new java.awt.Color(51, 51, 51));
        btnResgisterBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/online-test.png"))); // NOI18N
        btnResgisterBook.setText("Quản Lý Mượn Trả");
        btnResgisterBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 51), 1, true));
        btnResgisterBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResgisterBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResgisterBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnResgisterBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 310, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rsz_2homeadmin.png"))); // NOI18N
        jLabel2.setText("backgroundHome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/setting (1).png"))); // NOI18N
        jMenu1.setText("Hệ Thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        jMenuItem1.setText("Thông Tin Tài Khoản");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/padlock (1).png"))); // NOI18N
        jMenuItem3.setText("Đổi Mật Khẩu");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shutdown.png"))); // NOI18N
        jMenuItem2.setText("Đăng Xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int choic = JOptionPane.showConfirmDialog(rootPane, "bạn có chắc chắn muốn đăng xuất!");
        if (choic == JOptionPane.YES_OPTION) {
            LoginAdminForm laf = new LoginAdminForm();
            laf.setVisible(true);
            this.dispose();

        }


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnResgisterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResgisterBookActionPerformed
        HomeRegisterBookForm hRBF = new HomeRegisterBookForm(e);
        hRBF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResgisterBookActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        BookForm bf = new BookForm(e);
        bf.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBookActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        StudentForm sf = new StudentForm(e);
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        InforEmployee info = new InforEmployee(this, rootPaneCheckingEnabled);
        info.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ChangePasswd cp = new ChangePasswd(this, rootPaneCheckingEnabled);
        cp.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnResgisterBook;
    private javax.swing.JButton btnStudent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
