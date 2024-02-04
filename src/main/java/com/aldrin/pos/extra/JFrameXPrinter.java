/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aldrin.pos.extra;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Java Programming with Aldrin
 */
public class JFrameXPrinter extends javax.swing.JFrame implements Printable {

    /**
     * Creates new form JFrameXPrinter
     */
    public JFrameXPrinter() {
        initComponents();
        setTable();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldItem = new javax.swing.JTextField();
        jTextFieldQty = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCash = new javax.swing.JTextField();
        jButtonPrint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldChange = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Print to XPrinter");

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Item:");
        jPanel1.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Qty:");
        jPanel1.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Price:");
        jPanel1.add(jLabel3);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 8));
        jPanel2.add(jTextFieldItem);
        jPanel2.add(jTextFieldQty);
        jPanel2.add(jTextFieldPrice);

        jButton1.setBackground(new java.awt.Color(2, 117, 216));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total:");
        jLabel4.setToolTipText("");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cash:");
        jLabel5.setToolTipText("");

        jButtonPrint.setBackground(new java.awt.Color(2, 117, 216));
        jButtonPrint.setText("Payment/Print");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Change:");
        jLabel6.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setBackground(new java.awt.Color(156, 191, 221));
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldTotal)
                    .addComponent(jTextFieldCash)
                    .addComponent(jTextFieldChange))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(405, 405, 405))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCash, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldChange, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(28, 28, 28))
        );

        setSize(new java.awt.Dimension(986, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tableModel.addRow(new Object[]{jTextFieldItem.getText(), jTextFieldQty.getText(), jTextFieldPrice.getText(), ((Float.parseFloat(jTextFieldQty.getText().toString())) * (Float.parseFloat(jTextFieldPrice.getText())))});
        jTextFieldQty.setText("");
        jTextFieldPrice.setText("");
        jTextFieldItem.setText("");
        Float sum = 0.0F;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            Float lineTotal = Float.parseFloat(jTable1.getValueAt(i, 3).toString());
            sum = sum + lineTotal;
        }
        jTextFieldTotal.setText(String.valueOf(df.format(sum)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        createItemList();
        Float change = Float.parseFloat(jTextFieldCash.getText()) - Float.parseFloat(jTextFieldTotal.getText());
        jTextFieldChange.setText(df.format(change));

        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(this, getPageFormat(pj));

//      there's dialog
        pj.setPrintable(this);
        boolean ok = pj.printDialog();
        if (ok) {
            try {
                pj.print();
            } catch (PrinterException ex) {
            }
        }

//        auto print with out dialog
//        try {
//            pj.print();
//        } catch (PrinterException ex) {
//            ex.printStackTrace();
//        }

    }//GEN-LAST:event_jButtonPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCash;
    private javax.swing.JTextField jTextFieldChange;
    private javax.swing.JTextField jTextFieldItem;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldQty;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
    private DecimalFormat df = new DecimalFormat("#,##0.00");

    public DefaultTableModel tableModel = new DefaultTableModel() {
    };

    private void setTable() {
        try {
            String[] columnNames = {
                "Item",//
                "Qty",
                "Price",
                "LineTotal"
            };//15
            jTable1.setCellSelectionEnabled(true);
            jTable1 = new JTable(tableModel);
            JTableHeader header = jTable1.getTableHeader();
            header.setFont(new Font("Courier New", Font.PLAIN, 14));
            header.setBackground(new java.awt.Color(156, 191, 221));
            jTable1.setFont(new Font("Courier New", Font.PLAIN, 14));
            jScrollPane1.setViewportView(jTable1);
            for (int i = 0; i < columnNames.length;) {
                tableModel.addColumn(columnNames[i]);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private java.util.ArrayList<Item> itemList = new java.util.ArrayList<>();

    private java.util.ArrayList<Item> createItemList() {
        java.util.ArrayList<Item> iL = new java.util.ArrayList<Item>();
        Item itm = null;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String item = jTable1.getValueAt(i, 0).toString();
            String qty = jTable1.getValueAt(i, 1).toString();
            String price = jTable1.getValueAt(i, 2).toString();
            itm = new Item(item, qty, price);
            iL.add(itm);
        }
        return iL;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        Float totalAmount = 0.0F;
        Float change = 0.0F;
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/user-solid.png"));
        int result = NO_SUCH_PAGE;
        if (pageIndex == 0) {

            Graphics2D g2d = (Graphics2D) graphics;
            double width = pageFormat.getImageableWidth();
            g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());

            FontMetrics metrics = g2d.getFontMetrics(new Font("Arial", Font.BOLD, 7));
            try {
                int y = 15;
                int yShift = 10;
                int headerRectHeight = 15;
                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
                double wh = pageFormat.getImageableWidth();
                double ht = pageFormat.getImageableHeight();
                g2d.drawImage(null, 0, 0, (int) wh, (int) ht, null);

                g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                g2d.drawImage(icon.getImage(), 75, 20, 30, 30, rootPane);
                y += yShift + 30;
                g2d.drawString("------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Java Programming with Aldrin", 10, y);
                y += yShift;
                g2d.drawString("  Rufino St.,Legaspi Village ", 10, y);
                y += yShift;
                g2d.drawString("   Makati City, Metro Manila ", 10, y);
                y += yShift;
                y += yShift;
                y += yShift;
                g2d.drawString("------------------------------", 10, y);
                y += headerRectHeight;

                g2d.drawString(" Item                 Price  ", 10, y);
                y += yShift;
                g2d.drawString("------------------------------", 10, y);
                y += headerRectHeight;

                for (Item item : createItemList()) {
                    g2d.drawString(" " + item.getItem() + "                    ", 10, y);
                    y += yShift;
                    g2d.drawString("     " + item.getQty() + " x " + item.getPrice(), 5, y);
                    g2d.drawString(String.valueOf(df.format((Float.parseFloat(item.getQty())) * (Float.parseFloat(item.getPrice())))), 130, y);
                    y += yShift;
                    totalAmount = totalAmount + (Float.parseFloat(item.getQty())) * (Float.parseFloat(item.getPrice()));

                }
                Float cash = Float.parseFloat(jTextFieldCash.getText());

                g2d.drawString("------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Total   :            " + String.valueOf(df.format(totalAmount)) + "   ", 10, y);
                y += yShift;
                g2d.drawString("------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Cash    :            " + String.valueOf(df.format(cash)) + "   ", 10, y);
                y += yShift;
                g2d.drawString("------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Change  :            " + String.valueOf(df.format(Float.parseFloat(jTextFieldCash.getText()) - totalAmount)) + "   ", 10, y);
                y += yShift;
                y += yShift;
                y += yShift;

                g2d.drawString("******************************", 10, y);
                y += yShift;
                g2d.drawString("    THANK YOU, COME AGAIN!!    ", 10, y);
                y += yShift;
                g2d.drawString("******************************", 10, y);
                y += yShift;

            } catch (Exception e) {
                e.printStackTrace();
            }
            result = PAGE_EXISTS;
        }
        return result;
    }

    public PageFormat getPageFormat(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double width = pf.getImageableWidth();
        double height = pf.getImageableHeight();
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height - cm_to_pp(1));
        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);
        return pf;
    }

    protected static double cm_to_pp(double cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 58d;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
        }
        JFrameXPrinter x = new JFrameXPrinter();
        x.setVisible(true);
    }

}