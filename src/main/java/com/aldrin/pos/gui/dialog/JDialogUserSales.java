/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.aldrin.pos.gui.dialog;

import com.aldrin.pos.data.dao.impl.InvoiceEntryDAOImpl;
import com.aldrin.pos.data.dao.impl.UserSales;
import com.aldrin.pos.gui.dialog.report.JDialogUserSalesReport;
import com.aldrin.pos.gui.JFrameAldrinPOS;
import com.aldrin.pos.model.StockInEntry;
import com.aldrin.pos.util.ComboBoxList;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ALRIN B.C.
 */
public class JDialogUserSales extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPreviewStockIn
     */
    private JFrameAldrinPOS jFrameSariPOS =new JFrameAldrinPOS();
    private StockInEntry stockInEntry;
    private DecimalFormat df = new DecimalFormat("##,##0.00");

    public JDialogUserSales(JFrameAldrinPOS jFrameSariPOS, boolean modal) {
        super(jFrameSariPOS, modal);
        this.jFrameSariPOS =jFrameSariPOS;
        initComponents();
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        jPanelGrandTotal.putClientProperty(FlatClientProperties.STYLE,
                "[light]border: 0,0,0,0,shade(@background,30%),,18;" + "[dark]border: 0,0,0,0,tint(@background,30%),,8");
        setTitle("USER SALES");
        setTable();

        comboBoxStart();
        comboBoxEnd();

        selectUserSales();
        autoCalulateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanelFrameContainer = new javax.swing.JPanel();
        jPanelGrandTotal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUserSales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxEnd = new javax.swing.JComboBox<>();
        jComboBoxStart = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabelGrandTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonPreviewReport = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel10.setPreferredSize(new java.awt.Dimension(350, 80));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanelFrameContainer.setPreferredSize(new java.awt.Dimension(260, 200));
        jPanelFrameContainer.setLayout(new java.awt.BorderLayout());

        jPanelGrandTotal.setPreferredSize(new java.awt.Dimension(260, 0));
        jPanelGrandTotal.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTableUserSales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableUserSales);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanelGrandTotal.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(835, 50));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(435, 50));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("END:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 40, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("START:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));
        jPanel3.add(jComboBoxEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 220, 30));
        jPanel3.add(jComboBoxStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 10, 220, 30));

        jButton2.setIcon(new FlatSVGIcon("svg/search.svg",24,24));
        jButton2.setText("SEARCH");
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 100, 30));

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.EAST);

        jPanelGrandTotal.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanelFrameContainer.add(jPanelGrandTotal, java.awt.BorderLayout.CENTER);

        jPanel29.setOpaque(false);
        jPanel29.setPreferredSize(new java.awt.Dimension(270, 5));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanelFrameContainer.add(jPanel29, java.awt.BorderLayout.NORTH);

        jPanel30.setOpaque(false);
        jPanel30.setPreferredSize(new java.awt.Dimension(270, 60));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelGrandTotal.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N
        jLabelGrandTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel30.add(jLabelGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 10, 280, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("TOTAL");
        jPanel30.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 80, 30));

        jButtonPreviewReport.setIcon(new FlatSVGIcon("svg/print.svg",24,24));
        jButtonPreviewReport.setText("Preview Report");
        jButtonPreviewReport.setMargin(new java.awt.Insets(2, 2, 3, 2));
        jButtonPreviewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviewReportActionPerformed(evt);
            }
        });
        jPanel30.add(jButtonPreviewReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        jPanelFrameContainer.add(jPanel30, java.awt.BorderLayout.SOUTH);

        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        jPanelFrameContainer.add(jPanel31, java.awt.BorderLayout.EAST);

        jPanel32.setOpaque(false);
        jPanel32.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        jPanelFrameContainer.add(jPanel32, java.awt.BorderLayout.WEST);

        jPanel10.add(jPanelFrameContainer, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel10, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(956, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPreviewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviewReportActionPerformed
        JDialogUserSalesReport report = new JDialogUserSalesReport(jFrameSariPOS, true);
        report.setVisible(true);
    }//GEN-LAST:event_jButtonPreviewReportActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ComboBoxList startId = (ComboBoxList) this.jComboBoxStart.getSelectedItem();
        ComboBoxList endId = (ComboBoxList) this.jComboBoxEnd.getSelectedItem();
        selectUserSalesWithParam(startId.getId(), endId.getId());
        autoCalulateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonPreviewReport;
    private javax.swing.JComboBox<Object> jComboBoxEnd;
    private javax.swing.JComboBox<Object> jComboBoxStart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelGrandTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelFrameContainer;
    private javax.swing.JPanel jPanelGrandTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUserSales;
    // End of variables declaration//GEN-END:variables
    private UserSales userSales = new UserSales();
    private ArrayList<UserSales> userSalesList;

    private void selectUserSales() {
//      "#,USER, DATE, SALES"
        tableModel.setRowCount(0);
        userSalesList = userSales.selectUserSales();
        tableModel.setRowCount(0);
        for (UserSales us : userSalesList) {
            tableModel.addRow(new Object[]{us.getUserAccount().getId(), jTableUserSales.getRowCount() + 1, us.getUserAccount().getSurname() + ", " + us.getUserAccount().getFirstname(), us.getTransaction(), df.format(us.getSales())});
        }
    }

    public DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"USER ID", "#", "USER", "TRANSACTIONS", "SALES"}, 0) {
        public Class getColumnClass(int columnIndex) {
            if (columnIndex == 0) {
                return String.class;
            }
            switch (columnIndex) {
                case 1:
                    return Integer.class;
                case 2:
                    return String.class;
                case 3:
                    return Integer.class;
                case 4:
                    return Integer.class;

                default:
                    return String.class;
            }
        }

        public boolean isCellEditable(int row, int col) {
            if (col < 10) {
                return false;

            } else {
                return true;
            }
        }
    };
    private TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);

    private void setTable() {
        jTableUserSales.setCellSelectionEnabled(true);
        jTableUserSales = new JTable(tableModel);
        jScrollPane1.setViewportView(jTableUserSales);
//        jTableStockInEntry.addMouseListener(this);
        jTableUserSales.setRowSorter(sorter);

        TableColumn[] column = new TableColumn[100];

        column[0] = jTableUserSales.getColumnModel().getColumn(0);
        column[0].setPreferredWidth(30);

        column[1] = jTableUserSales.getColumnModel().getColumn(1);
        column[1].setPreferredWidth(30);

        column[2] = jTableUserSales.getColumnModel().getColumn(2);
        column[2].setPreferredWidth(260);

        column[3] = jTableUserSales.getColumnModel().getColumn(3);
        column[3].setPreferredWidth(260);

        column[4] = jTableUserSales.getColumnModel().getColumn(4);
        column[4].setPreferredWidth(260);
        TableColumn hide0 = jTableUserSales.getColumnModel().getColumn(0);
        hide0.setMinWidth(0);
        hide0.setMaxWidth(0);
        hide0.setPreferredWidth(0);
    }

    public void autoCalulateTable() {
        try {
            double grandTotal = 0.0D;
            for (int i = 0; i < jTableUserSales.getRowCount(); i++) {
                double lineTotal = Double.parseDouble(jTableUserSales.getValueAt(i, 4).toString());
                grandTotal = grandTotal + lineTotal;
                jLabelGrandTotal.setText(String.valueOf(df.format(grandTotal)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jTableUserSales.getRowCount() < 1) {
        }
    }

    private InvoiceEntryDAOImpl invoiceEntryDAOImpl = new InvoiceEntryDAOImpl();

    private void comboBoxStart() {
        invoiceEntryDAOImpl.comboBoxInvoiceStart();
        jComboBoxStart.removeAllItems();
        for (ComboBoxList a : invoiceEntryDAOImpl.getList()) {
            this.jComboBoxStart.addItem(a);
        }
    }

    private void comboBoxEnd() {
        invoiceEntryDAOImpl.comboBoxInvoiceEnd();
        jComboBoxEnd.removeAllItems();
        for (ComboBoxList a : invoiceEntryDAOImpl.getList()) {
            this.jComboBoxEnd.addItem(a);
        }
    }

    private void selectUserSalesWithParam(Long start, Long end) {
//      "#,USER, DATE, SALES"
        tableModel.setRowCount(0);
        userSalesList = userSales.selectUserSalesWithParam(start, end);
        tableModel.setRowCount(0);
        for (UserSales us : userSalesList) {
            tableModel.addRow(new Object[]{us.getUserAccount().getId(), jTableUserSales.getRowCount() + 1, us.getUserAccount().getSurname() + ", " + us.getUserAccount().getFirstname(), us.getTransaction(), df.format(us.getSales())});
        }
    }

}
