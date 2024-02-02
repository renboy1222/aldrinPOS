/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aldrin.pos.gui.dialog;

//import com.aldrin.pharsys.data.AppQuery;
//import com.aldrin.pharsys.util.NumberInput;
import com.aldrin.pos.gui.JFrameAldrinPOS;
import com.aldrin.pos.util.NumberInput;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Java Programming with Aldrin
 */
public class JDialogPayment extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPayment
     */
    private DecimalFormat df = new DecimalFormat("##,##0.00");
    private Float totalAmount;
    private static String input = "";
//    private AppQuery query = new AppQuery();
    private Integer takingMeals;
    private static boolean paid;
    private static String change;
    private static String cash;

    public JDialogPayment(JFrameAldrinPOS parent, boolean modal, Float totaLAmount) {
        super(parent, modal);
        initComponents();
        jTextFieldAmountDue.setText(df.format(totaLAmount));
        setTotalAmount(totaLAmount);
        jTextFieldAmountDue.setEnabled(false);
        jTextFieldChange.setEnabled(false);
        jButtonPayment.setEnabled(false);
        new NumberInput().doubleValidator(jTextFieldCash);
        setPaid(false);
        setCash("");
        setChange("");

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
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCash = new javax.swing.JTextField();
        jTextFieldAmountDue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldChange = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButtonPayment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payment");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(250, 244));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 403));
        jPanel2.setLayout(new java.awt.GridLayout(0, 3, 5, 5));

        jButton1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton1.setText("7");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton2.setText("8");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton3.setText("9");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton4.setText("4");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton5.setText("5");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton6.setText("6");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton7.setText("1");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton8.setText("2");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton9.setText("3");
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jButton10.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton10.setText("0");
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);

        jButton11.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton11.setText(".");
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);

        jButton12.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jButton12.setText(">");
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);

        jPanel4.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel5.setPreferredSize(new java.awt.Dimension(250, 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel7.setPreferredSize(new java.awt.Dimension(10, 224));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel4, java.awt.BorderLayout.EAST);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cash:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 5, 170, 40));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Amount Due:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 40));

        jTextFieldCash.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        jTextFieldCash.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCashKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCashKeyReleased(evt);
            }
        });
        jPanel3.add(jTextFieldCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 5, 182, 40));

        jTextFieldAmountDue.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        jTextFieldAmountDue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(jTextFieldAmountDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 182, 40));

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Change:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 120, 160, 40));

        jTextFieldChange.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        jTextFieldChange.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(jTextFieldChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 182, 40));

        jPanel8.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel9.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel11.setPreferredSize(new java.awt.Dimension(10, 224));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel11, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel12.setPreferredSize(new java.awt.Dimension(569, 60));

        jButtonPayment.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButtonPayment.setMnemonic('P');
        jButtonPayment.setText("Payment");
        jButtonPayment.setFocusable(false);
        jButtonPayment.setPreferredSize(new java.awt.Dimension(610, 50));
        jButtonPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaymentActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonPayment);

        jPanel1.add(jPanel12, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(649, 301));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCashKeyReleased
        Double change = 0.0;
        Double cash = 0.0;

        if (jTextFieldCash.getText().length() < 1) {
            cash = 0.0;
            jTextFieldChange.setText("0.00");
            return;
        } else {
            cash = Double.parseDouble(jTextFieldCash.getText());
            change = cash - getTotalAmount();
        }
        jTextFieldChange.setText(String.valueOf(df.format(change)));
        if (change > 0) {
            jButtonPayment.setEnabled(true);
        } else {
            jButtonPayment.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldCashKeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (jTextFieldCash.getText().length() < 1) {
            return;
        }
        int curInputLength = getInput().length();

        String currentInput = getInput().substring(0, curInputLength - 1);
        this.input = "";
        setInput(currentInput);
        jTextFieldCash.setText(currentInput);
        inputNumber();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setInput("7");
        inputNumber();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setInput("8");
        inputNumber();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setInput("9");
        inputNumber();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setInput("4");
        inputNumber();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setInput("5");
        inputNumber();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setInput("6");
        inputNumber();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setInput("1");
        inputNumber();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        setInput("2");
        inputNumber();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        setInput("3");
        inputNumber();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        setInput("0");
        inputNumber();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        setInput(".");
        inputNumber();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextFieldCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCashKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            setPaid(true);
            setChange(jTextFieldChange.getText().toString());
            setCash(jTextFieldCash.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jTextFieldCashKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.input = "";
    }//GEN-LAST:event_formWindowClosed

    private void jButtonPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaymentActionPerformed
        setPaid(true);
        setChange(jTextFieldChange.getText().toString());
        setCash(jTextFieldCash.getText());
        this.dispose();
    }//GEN-LAST:event_jButtonPaymentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonPayment;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextFieldAmountDue;
    private javax.swing.JTextField jTextFieldCash;
    private javax.swing.JTextField jTextFieldChange;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the totalAmount
     */
    public Float getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return the input
     */
    public static String getInput() {
        return input;
    }

    /**
     * @param aInput the input to set
     */
    public static void setInput(String aInput) {
        input = input + aInput;
    }

    private void inputNumber() {
        Double change = 0.0;
        Double cash = 0.0;

        if (getInput().isEmpty()) {
            cash = 0.0;
            jTextFieldChange.setText("0.00");
            return;
        } else {
            jTextFieldCash.setText(getInput());
            cash = Double.parseDouble(jTextFieldCash.getText());
            change = cash - getTotalAmount();
        }

        jTextFieldChange.setText(String.valueOf(df.format(change)));
        if (change > 0) {
            jButtonPayment.setEnabled(true);
        } else {
            jButtonPayment.setEnabled(false);
        }
        setChange(String.valueOf(df.format(change)));
    }

    private void calculate() {
        Double change = 0.0;
        Double cash = 0.0;

        if (jTextFieldCash.getText().length() < 1) {
            cash = 0.0;
            jTextFieldChange.setText("0.00");
            return;
        } else {
            cash = Double.parseDouble(jTextFieldCash.getText());
            change = cash - getTotalAmount();
        }
        jTextFieldChange.setText(String.valueOf(df.format(change)));
        if (change > 0) {
            jButtonPayment.setEnabled(true);
        } else {
            jButtonPayment.setEnabled(false);
        }
    }

    /**
     * @return the takingMeals
     */
    public Integer getTakingMeals() {
        return takingMeals;
    }

    /**
     * @param takingMeals the takingMeals to set
     */
    public void setTakingMeals(Integer takingMeals) {
        this.takingMeals = takingMeals;
    }

    /**
     * @return the paid
     */
    public static boolean isPaid() {
        return paid;
    }

    /**
     * @param aPaid the paid to set
     */
    public static void setPaid(boolean aPaid) {
        paid = aPaid;
    }

    /**
     * @return the change
     */
    public static String getChange() {
        return change;
    }

    /**
     * @param aChange the change to set
     */
    public static void setChange(String aChange) {
        change = aChange;
    }

    /**
     * @return the cash
     */
    public static String getCash() {
        return cash;
    }

    /**
     * @param aCash the cash to set
     */
    public static void setCash(String aCash) {
        cash = aCash;
    }

}
