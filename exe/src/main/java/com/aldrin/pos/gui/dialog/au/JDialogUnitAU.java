/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.aldrin.pos.gui.dialog.au;

import com.aldrin.pos.data.dao.impl.UnitDAOImpl;
import com.aldrin.pos.gui.JFrameAldrinPOS;
import com.aldrin.pos.model.Unit;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ALDRIN B. C.
 */
public class JDialogUnitAU extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCourseAU
     */
    private JFrameAldrinPOS jFrameSariPOS;
    private Unit unit = new Unit();
    static String title;
    private UnitDAOImpl unitDAOImpl = new UnitDAOImpl();

    public JDialogUnitAU(JFrameAldrinPOS jFrameSariPOS, boolean modal) {
        super(jFrameSariPOS, modal);
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        initComponents();
        setTitle("New");
        this.title = "New";
        jButton1.setIcon(new FlatSVGIcon("svg/save.svg",24,24));
        jTextFieldUnit.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "UNIT");
        jTextFieldDescription.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "DESCRIPTION");
        jTextFieldUnit.setText(unit.getUnit());
        jTextFieldDescription.setText(unit.getDescription());
    }

    public JDialogUnitAU(JFrameAldrinPOS jFrameSariPOS, boolean modal, Unit unit, String title) {
        super(jFrameSariPOS, modal);
        initComponents();
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        setTitle(title);
        this.title = title;
        this.unit = unit;
        jButton1.setIcon(new FlatSVGIcon("svg/edit.svg",24,24));
        jButton1.setText(title);
        jTextFieldUnit.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "UNIT");
        jTextFieldDescription.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "DESCRIPTION");
        jTextFieldUnit.setText(unit.getUnit());
        jTextFieldDescription.setText(unit.getDescription());
    }

    public JDialogUnitAU(JFrameAldrinPOS jFrameSariPOS, boolean modal, String title, Unit unit) {
        super(jFrameSariPOS, modal);
        initComponents();
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        setTitle(title);
        this.unit = unit;
        this.title = title;
        jButton1.setIcon(new FlatSVGIcon("svg/delete.svg",24,24));
        jButton1.setText(title);
        jTextFieldUnit.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "UNIT");
        jTextFieldDescription.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "DESCRIPTION");
        jTextFieldUnit.setText(unit.getUnit());
        jTextFieldDescription.setText(unit.getDescription());

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
        jTextFieldDescription = new javax.swing.JTextField();
        jTextFieldUnit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("UNIT:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, 80, 30));
        getContentPane().add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 250, 30));
        getContentPane().add(jTextFieldUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 250, 30));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 140, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DESCRIPTION:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 80, 30));

        setSize(new java.awt.Dimension(366, 203));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.title.equals("New")) {
            int response = JOptionPane.showConfirmDialog(jFrameSariPOS, "Are you sure to save " + jTextFieldUnit.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                this.unit.setId(null);
                this.unit.setUnit(jTextFieldUnit.getText());
                this.unit.setDescription(jTextFieldDescription.getText());
                unitDAOImpl.addUnit(unit);
                this.dispose();
            }
        } else if (this.title.equals("Update")) {
            int response = JOptionPane.showConfirmDialog(jFrameSariPOS, "Are you sure to update " + jTextFieldUnit.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                this.unit.setUnit(jTextFieldUnit.getText());
                this.unit.setDescription(jTextFieldDescription.getText());
                unitDAOImpl.updateUnit(unit);
                this.dispose();
            }
        } else if (this.title.equals("Delete")) {
            int response = JOptionPane.showConfirmDialog(jFrameSariPOS, "Are you sure to delete " + jTextFieldUnit.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                unitDAOImpl.deleteUnit(unit);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldUnit;
    // End of variables declaration//GEN-END:variables
}
