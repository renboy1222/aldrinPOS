/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.aldrin.pos.gui.dialog.au;

import com.aldrin.pos.data.dao.impl.CategoryDAOImpl;
import com.aldrin.pos.data.dao.impl.ProductDAOImpl;
import com.aldrin.pos.gui.JFrameAldrinPOS;
import com.aldrin.pos.model.Category;
import com.aldrin.pos.model.Product;
import com.aldrin.pos.util.ComboBoxList;
import com.aldrin.pos.util.NumberInput;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ALDRIN B. C.
 */
public class JDialogProductAU extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCourseAU
     */
    private JFrameAldrinPOS jFrameSariPOS;
    private Product product = new Product();
    static String title;
    private CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
    private ProductDAOImpl courseDAOImpl = new ProductDAOImpl();

    public JDialogProductAU(JFrameAldrinPOS jFrameSariPOS, boolean modal) {
        super(jFrameSariPOS, modal);
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        initComponents();
        setTitle("New");
        this.title = "New";
        jButton1.setIcon(new FlatSVGIcon("svg/save.svg",24,24));
        jTextFieldProduct.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PRODUCT");
        jTextFieldBarcode.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "BARCODE");
        jTextFieldProduct.setText(product.getProduct());
        jTextFieldBarcode.setText(product.getBarcode());
        comboBoxCategory();
        new NumberInput().intValidator(jTextFieldBarcode);
    }

    public JDialogProductAU(JFrameAldrinPOS jFrameSariPOS, boolean modal, Product product, String title) {
        super(jFrameSariPOS, modal);
        initComponents();
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        setTitle(title);
        this.title = title;
        this.product = product;
        jButton1.setIcon(new FlatSVGIcon("svg/edit.svg",24,24));
        jButton1.setText(title);
        jTextFieldProduct.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PRODUCT");
        jTextFieldBarcode.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "BARCODE");
        jTextFieldProduct.setText(product.getProduct());
        jTextFieldBarcode.setText(product.getBarcode());
        comboBoxCategory();
        for (ComboBoxList a : this.categoryDAOImpl.getList()) {
            a.setSelectedId(categoryDAOImpl.getList(), String.valueOf(product.getCategory().getId()), jComboBoxCategory);
        }
        new NumberInput().intValidator(jTextFieldBarcode);
    }

    public JDialogProductAU(JFrameAldrinPOS jFrameSariPOS, boolean modal, String title, Product product) {
        super(jFrameSariPOS, modal);
        initComponents();
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        setTitle(title);
        this.product = product;
        this.title = title;
        jButton1.setIcon(new FlatSVGIcon("svg/delete.svg",24,24));
        jButton1.setText(title);
        jTextFieldProduct.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PRODUCT");
        jTextFieldBarcode.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "BARCODE");
        jTextFieldProduct.setText(product.getProduct());
        jTextFieldBarcode.setText(product.getBarcode());
        comboBoxCategory();
        for (ComboBoxList a : this.categoryDAOImpl.getList()) {
            a.setSelectedId(categoryDAOImpl.getList(), String.valueOf(product.getCategory().getId()), jComboBoxCategory);
        }
        new NumberInput().intValidator(jTextFieldBarcode);

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
        jTextFieldBarcode = new javax.swing.JTextField();
        jTextFieldProduct = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("PRODUCT:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, 80, 30));
        getContentPane().add(jTextFieldBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 250, 30));
        getContentPane().add(jTextFieldProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 250, 30));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CATEGORY:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 100, 80, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("BARCODE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 80, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("BARCODE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 80, 30));

        getContentPane().add(jComboBoxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 250, 30));

        setSize(new java.awt.Dimension(366, 234));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.title.equals("New")) {
            int response = JOptionPane.showConfirmDialog(jFrameSariPOS, "Are you sure to save " + jTextFieldProduct.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                this.product.setId(null);
                this.product.setProduct(jTextFieldProduct.getText());
                this.product.setBarcode(jTextFieldBarcode.getText());
                ComboBoxList categoryId = (ComboBoxList) this.jComboBoxCategory.getSelectedItem();
                Category category = new Category(categoryId.getId(), jComboBoxCategory.getSelectedItem().toString());
                this.product.setCategory(category);
                courseDAOImpl.addProduct(product);
            }
            this.dispose();
        } else if (this.title.equals("Update")) {
            int response = JOptionPane.showConfirmDialog(jFrameSariPOS, "Are you sure to update " + jTextFieldProduct.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                this.product.setProduct(jTextFieldProduct.getText());
                this.product.setBarcode(jTextFieldBarcode.getText());
                ComboBoxList categoryId = (ComboBoxList) this.jComboBoxCategory.getSelectedItem();
                Category category = new Category(categoryId.getId(), jComboBoxCategory.getSelectedItem().toString());
                this.product.setCategory(category);
                courseDAOImpl.updateProduct(product);
                this.dispose();
            }
        } else if (this.title.equals("Delete")) {
            int response = JOptionPane.showConfirmDialog(jFrameSariPOS, "Are you sure to delete " + jTextFieldProduct.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                courseDAOImpl.deleteProduct(product);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Object> jComboBoxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldBarcode;
    private javax.swing.JTextField jTextFieldProduct;
    // End of variables declaration//GEN-END:variables

    private void comboBoxCategory() {
        categoryDAOImpl.comboBoxCategory();
        jComboBoxCategory.removeAllItems();
        for (ComboBoxList a : categoryDAOImpl.getList()) {
            this.jComboBoxCategory.addItem(a);
        }
    }

}
