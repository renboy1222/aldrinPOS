/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aldrin.pos.gui;

import com.aldrin.pos.data.dao.impl.UserAccountDAOImpl;
import com.aldrin.pos.model.UserAccount;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

/**
 *
 * @author ALDRIN B. C.
 */
public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin
     */
    public JFrameLogin() {
        initComponents();
//        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        FlatSVGIcon icon = new FlatSVGIcon("svg/user.svg");
        setIconImage(icon.getImage());
        try {
            File fontStyle = new File("src/main/resources/fonts/TitanOne-Regular.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStyle);
            jLabelTitle.setFont(font.deriveFont(32f));
            jButtonLogin.setFont(font.deriveFont(16f));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //placeHolder
        jTextFieldUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        jPasswordFieldPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");

        //clear button
        jTextFieldUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        //reveal button
        jPasswordFieldPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true;" + "showCapsLock:true");

    }

    public void addLoingListener(ActionListener listener) {
        jButtonLogin.addActionListener(listener);
    }

    public void addLoginKeyListener(KeyAdapter keyAdapter) {
        jPasswordFieldPassword.addKeyListener(keyAdapter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelErrorMessage = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("LOG IN WITH USERNAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 320, -1));

        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(7, 35));
        jPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 317, -1));

        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, -1));

        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(7, 35));
        jPasswordFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, 317, -1));

        jButtonLogin.setForeground(new java.awt.Color(102, 102, 102));
        jButtonLogin.setIcon(new FlatSVGIcon("svg/login.svg",32,32));
        jButtonLogin.setText("Login");
        jButtonLogin.setPreferredSize(new java.awt.Dimension(71, 35));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 263, -1));

        jLabelErrorMessage.setForeground(new java.awt.Color(153, 0, 0));
        jLabelErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelErrorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 20));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 102, 153));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Login");
        jLabelTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 320, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(220, 10));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ALDRIN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("POS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 177, 110, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 220));

        jLabel7.setText("Freeware");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, 190, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        setSize(new java.awt.Dimension(570, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed


    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jPasswordFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordKeyPressed

    }//GEN-LAST:event_jPasswordFieldPasswordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelErrorMessage;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTextFieldUsername
     */
    public javax.swing.JTextField getjTextFieldUsername() {
        return jTextFieldUsername;
    }

    /**
     * @param jTextFieldUsername the jTextFieldUsername to set
     */
    public void setjTextFieldUsername(javax.swing.JTextField jTextFieldUsername) {
        this.jTextFieldUsername = jTextFieldUsername;
    }

    /**
     * @return the jPasswordFieldPassword
     */
    public javax.swing.JPasswordField getjPasswordFieldPassword() {
        return jPasswordFieldPassword;
    }

    /**
     * @param jPasswordFieldPassword the jPasswordFieldPassword to set
     */
    public void setjPasswordFieldPassword(javax.swing.JPasswordField jPasswordFieldPassword) {
        this.jPasswordFieldPassword = jPasswordFieldPassword;
    }

    /**
     * @return the jLabelErrorMessage
     */
    public javax.swing.JLabel getjLabelErrorMessage() {
        return jLabelErrorMessage;
    }

    /**
     * @param jLabelErrorMessage the jLabelErrorMessage to set
     */
    public void setjLabelErrorMessage(javax.swing.JLabel jLabelErrorMessage) {
        this.jLabelErrorMessage = jLabelErrorMessage;
    }
}
