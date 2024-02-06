/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.aldrin.pos.gui.dialog;

import com.aldrin.pos.data.dao.impl.ProductDAOImpl;
import com.aldrin.pos.data.dao.impl.UnitDAOImpl;
import com.aldrin.pos.util.AddProductToTable;
import com.aldrin.pos.gui.JFrameAldrinPOS;
import com.aldrin.pos.util.ComboBoxList;
import com.aldrin.pos.util.NumberInput;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;

/**
 *
 * @author ALRIN B.C.
 */
public class JDialogStockInEntryPerItem extends javax.swing.JDialog {

    /**
     * Creates new form JDialogStockInEntryPerItem
     */
    private ProductDAOImpl productDAOImpl = new ProductDAOImpl();
    private UnitDAOImpl unitDAOImpl = new UnitDAOImpl();
    private JFrameAldrinPOS jFrameSariPos;

    public JDialogStockInEntryPerItem(JFrameAldrinPOS jFrameSariPOS, boolean modal) {
        super(jFrameSariPOS, modal);
        initComponents();
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        this.jFrameSariPos = jFrameSariPOS;
        jPanelFrameTotalDetails.putClientProperty(FlatClientProperties.STYLE,
                "[light]border: 0,0,0,0,shade(@background,30%),,8;" + "[dark]border: 0,0,0,0,tint(@background,30%),,8");
        comboBoxProduct();
        comboBoxUnit();
        new NumberInput().intValidator(jTextFieldQuantity);
        new NumberInput().doubleValidator(jTextFieldBuyingPrice);
        new NumberInput().doubleValidator(jTextFieldSellingPrice);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFrameTotalDetails = new javax.swing.JPanel();
        jPanelTotalDetails = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxProduct = new javax.swing.JComboBox<>();
        jComboBoxUnit = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBuyingPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSellingPrice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextFieldQuantity = new javax.swing.JTextField();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD PRODUCT");

        jPanelFrameTotalDetails.setPreferredSize(new java.awt.Dimension(260, 200));
        jPanelFrameTotalDetails.setLayout(new java.awt.BorderLayout());

        jPanelTotalDetails.setPreferredSize(new java.awt.Dimension(260, 0));
        jPanelTotalDetails.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("QUANTITY:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 125, 80, 30));

        jPanel1.add(jComboBoxProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 29, 255, 30));

        jPanel1.add(jComboBoxUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 77, 255, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("UNIT:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 80, 80, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("SELLING PRICE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 80, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("BUYING PRICE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 175, 80, 30));
        jPanel1.add(jTextFieldBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 173, 255, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("PRODUCT:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 80, 30));
        jPanel1.add(jTextFieldSellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 254, 30));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 131, 37));
        jPanel1.add(jTextFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 125, 255, 30));

        jPanelTotalDetails.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanelFrameTotalDetails.add(jPanelTotalDetails, java.awt.BorderLayout.CENTER);

        jPanel33.setOpaque(false);
        jPanel33.setPreferredSize(new java.awt.Dimension(270, 5));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanelFrameTotalDetails.add(jPanel33, java.awt.BorderLayout.NORTH);

        jPanel34.setOpaque(false);
        jPanel34.setPreferredSize(new java.awt.Dimension(270, 5));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanelFrameTotalDetails.add(jPanel34, java.awt.BorderLayout.SOUTH);

        jPanel35.setOpaque(false);
        jPanel35.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        jPanelFrameTotalDetails.add(jPanel35, java.awt.BorderLayout.EAST);

        jPanel36.setOpaque(false);
        jPanel36.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        jPanelFrameTotalDetails.add(jPanel36, java.awt.BorderLayout.WEST);

        getContentPane().add(jPanelFrameTotalDetails, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(364, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setPreferredSize(new java.awt.Dimension(364, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel4.setPreferredSize(new java.awt.Dimension(10, 346));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel5.setPreferredSize(new java.awt.Dimension(10, 355));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.EAST);

        setSize(new java.awt.Dimension(396, 394));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ComboBoxList productId = (ComboBoxList) this.jComboBoxProduct.getSelectedItem();
        ComboBoxList unitId = (ComboBoxList) this.jComboBoxUnit.getSelectedItem();
     
        
        AddProductToTable addProductToTable = new AddProductToTable(1L, productId.getId(), unitId.getId(), Integer.parseInt(jTextFieldQuantity.getText()), jComboBoxProduct.getSelectedItem().toString(), jComboBoxUnit.getSelectedItem().toString(), jTextFieldBuyingPrice.getText(), jTextFieldSellingPrice.getText());
        new JDialogStockInEntry(addProductToTable);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Object> jComboBoxProduct;
    private javax.swing.JComboBox<Object> jComboBoxUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelFrameTotalDetails;
    private javax.swing.JPanel jPanelTotalDetails;
    private javax.swing.JTextField jTextFieldBuyingPrice;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldSellingPrice;
    // End of variables declaration//GEN-END:variables

    private void comboBoxProduct() {
        productDAOImpl.comboBoxProduct();
        jComboBoxProduct.removeAllItems();
        for (ComboBoxList a : productDAOImpl.getList()) {
            this.jComboBoxProduct.addItem(a);
        }
    }

    private void comboBoxUnit() {
        unitDAOImpl.comboBoxUnit();
        jComboBoxUnit.removeAllItems();
        for (ComboBoxList a : unitDAOImpl.getList()) {
            this.jComboBoxUnit.addItem(a);
        }
    }
    
    

}
