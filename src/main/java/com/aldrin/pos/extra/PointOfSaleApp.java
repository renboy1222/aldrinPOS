/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.pos.extra;

/**
 *
 * @author ALRIN B.C.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;

public class PointOfSaleApp extends JFrame implements Printable {
    private JTextArea receiptTextArea;
    private double totalAmount;

    public PointOfSaleApp() {
        setTitle("Point of Sale");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize UI components
        receiptTextArea = new JTextArea();
        JButton addItemButton = new JButton("Add Item");
        JButton previewButton = new JButton("Preview Receipt");
        JButton printButton = new JButton("Print Receipt");

        // Set layout
        setLayout(new BorderLayout());

        // Add components to the frame
        add(new JScrollPane(receiptTextArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addItemButton);
        buttonPanel.add(previewButton);
        buttonPanel.add(printButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        previewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previewReceipt();
            }
        });

        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printReceipt();
            }
        });
    }

    private void addItem() {
        // Replace this with your logic to add items to the receipt
        String itemName = JOptionPane.showInputDialog(this, "Enter Item Name:");
        String itemPriceStr = JOptionPane.showInputDialog(this, "Enter Item Price:");
        double itemPrice = Double.parseDouble(itemPriceStr);

        totalAmount += itemPrice;
        receiptTextArea.append(itemName + "\t$" + itemPrice + "\n");
        updateTotal();
    }

    private void updateTotal() {
        receiptTextArea.append("-----------------------\n");
        receiptTextArea.append("Total\t$" + totalAmount + "\n");
        receiptTextArea.append("=======================\n");
    }

    private void previewReceipt() {
        // Show the preview in a dialog
        JOptionPane.showMessageDialog(this, new JScrollPane(receiptTextArea), "Receipt Preview", JOptionPane.PLAIN_MESSAGE);
    }

    private void printReceipt() {
        // Create a printer job
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);

        // Show the print dialog
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error printing receipt", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        // Get the graphics context for the page
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        // Print the content of the JTextArea
        receiptTextArea.print(g2d);

        return PAGE_EXISTS;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PointOfSaleApp().setVisible(true);
            }
        });
    }
}

