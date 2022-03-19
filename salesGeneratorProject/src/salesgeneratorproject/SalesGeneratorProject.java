/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SalesGeneratorProject;

import java.awt.Label;
import java.awt.TextField;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author nadeen
 */
public class SalesGeneratorProject extends JFrame {
    // Variables declaration                   
    private JButton cancelBtn;
    private JButton createBtn;
    private TextField dateTextField;
    private JButton deleteBtn;
    private JTable invoiceItemsTable;
    private JTable invoicesTable;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane leftScrollPane;
    private JScrollPane rightScrollPane2;
    private Label label1;
    private Label label3;
    private Label label4;
    private Label label5;
    private JMenuItem loadFileTab;
    private TextField nameTextField;
    private JTextField numTextField;
    private JButton saveBtn;
    private JMenuItem saveFileTab;
    private JTextField totalTextField;
    // End of variables declaration   

    //put your 2 files path
    String path1 = "";
    String path2 = "";

    public SalesGeneratorProject() {
        components();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void components() {

        jPanel1 = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        leftScrollPane = new javax.swing.JScrollPane();
        invoicesTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        dateTextField = new java.awt.TextField();
        label4 = new java.awt.Label();
        nameTextField = new java.awt.TextField();
        label5 = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        rightScrollPane2 = new javax.swing.JScrollPane();
        invoiceItemsTable = new javax.swing.JTable();
        numTextField = new javax.swing.JTextField();
        totalTextField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileTab = new javax.swing.JMenuItem();
        saveFileTab = new javax.swing.JMenuItem("saveBtn",'S');

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createBtn.setText("create new invoice");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("delete invoice");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(BorderFactory.createTitledBorder("invoice table"));

        invoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        invoicesTable.setColumnSelectionAllowed(false);
        invoicesTable.setRowSelectionAllowed(true);

        leftScrollPane.setViewportView(invoicesTable);
        invoicesTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(leftScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(leftScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(createBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(createBtn))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        saveBtn.setText("save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    cancelBtnActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        label1.setText("invoice number");

        label3.setText("invoice date");

        label4.setText("customer name");

        label5.setText("invoice total");

        jPanel4.setBorder(BorderFactory.createTitledBorder("invoice total"));

        invoiceItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "item name", "item price", "count", "item total"
            }
        ));
        invoiceItemsTable.setRowSelectionAllowed(true);
        rightScrollPane2.setViewportView(invoiceItemsTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(rightScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(rightScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        numTextField.setBackground(new java.awt.Color(240, 240, 240));
        numTextField.setText("23");
        numTextField.setBorder(null);

        totalTextField.setBackground(new java.awt.Color(240, 240, 240));
        totalTextField.setText("350.50");
        totalTextField.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(cancelBtn)
                                .addGap(70, 70, 70))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                                    .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(77, 77, 77)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        loadFileTab.setText("Load File");
        loadFileTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileTabActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileTab);

        saveFileTab.setText("Save File");
        //jMenuItem2.setAccelerator('S');
        saveFileTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileTabActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileTab);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }
    
    
    
    
    
    //action listeners
    private void loadFileTabActionPerformed(java.awt.event.ActionEvent evt) {                                            

        // if you want to choose the 2 files
        //two path fields will be changed as you selected
        BufferedReader br = null;
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            path1 = fc.getSelectedFile().getPath();

            try {
                br = new BufferedReader(new FileReader(new File(path1)));
                DefaultTableModel model = (DefaultTableModel) invoicesTable.getModel();
                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);
                }
            } catch (IOException ex) {
                Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        BufferedReader br2 = null;
        JFileChooser fc2 = new JFileChooser();
        int result2 = fc2.showOpenDialog(this);
        if (result2 == JFileChooser.APPROVE_OPTION) {
            path2 = fc2.getSelectedFile().getPath();

            try {
                br2 = new BufferedReader(new FileReader(new File(path2)));
                DefaultTableModel model = (DefaultTableModel) invoiceItemsTable.getModel();
                Object[] tableLines = br2.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);
                }
            } catch (IOException ex) {
                Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br2.close();
                } catch (IOException ex) {
                    Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        /*
        //if you know where your files located
        //it will use the 2 paths fields
        BufferedReader br = null;
        try {
            File file = new File(path1);
            br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) invoicesTable.getModel();
                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);
                }
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        BufferedReader br2 = null;
        try {
            File file2 = new File(path2);
            br2 = new BufferedReader(new FileReader(file2));
            DefaultTableModel model2 = (DefaultTableModel) invoiceItemsTable.getModel();
                Object[] tableLines = br2.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model2.addRow(dataRow);
                }
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br2.close();
                } catch (IOException ex) {
                    Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

         */

    }                                           

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // create new invoice row as you typed in invoice data
        DefaultTableModel model = (DefaultTableModel) invoicesTable.getModel();
        model.addRow(new Object[]{
            numTextField.getText(),
            dateTextField.getText(),
            nameTextField.getText(),
            totalTextField.getText()
        });
    }                                         

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // save invoice items table in the specified csv file
        BufferedWriter bw2 = null;
        try {
            File file2 = new File(path2);
            bw2 = new BufferedWriter(new FileWriter(file2.getAbsoluteFile()));

            for (int i = 0; i < invoiceItemsTable.getRowCount(); i++) {
                for (int j = 0; j < invoiceItemsTable.getColumnCount(); j++) {
                    String s = (String) invoiceItemsTable.getModel().getValueAt(i, j);
                    if (s == null) {
                        bw2.write(" ");
                    } else {
                        bw2.write(s + ",");
                    }
                }
                bw2.write("\n");
            }
            JOptionPane.showMessageDialog(null, "Saved successfully");

        } catch (IOException ex) {
            Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw2.close();
            } catch (IOException ex) {
                Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }                                                                                 

    private void saveFileTabActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // save 2 csv files

        BufferedWriter bw = null;
        try {
            File file = new File(path1);
            bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
            for (int i = 0; i < invoicesTable.getRowCount(); i++) {
                for (int j = 0; j < invoicesTable.getColumnCount(); j++) {
                    String s = (String) invoicesTable.getModel().getValueAt(i, j);
                    if (s == null) {
                        bw.write(" ");
                    } else {
                        bw.write(s + ",");
                    }
                }
                bw.write("\n");
            }

        } catch (IOException ex) {
            Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        BufferedWriter bw2 = null;
        try {
            File file2 = new File(path2);
            bw2 = new BufferedWriter(new FileWriter(file2.getAbsoluteFile()));
            for (int i = 0; i < invoiceItemsTable.getRowCount(); i++) {
                for (int j = 0; j < invoiceItemsTable.getColumnCount(); j++) {
                    String s = (String) invoiceItemsTable.getModel().getValueAt(i, j);
                    if (s == null) {
                        bw2.write(" ");
                    } else {
                        bw2.write(s + ",");
                    }
                }
                bw2.write("\n");
            }

        } catch (IOException ex) {
            Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw2.close();
            } catch (IOException ex) {
                Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }                                           

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        DefaultTableModel model = (DefaultTableModel) invoicesTable.getModel();
        if (invoicesTable.getSelectedRowCount() == 1) { //if you already select a row
            model.removeRow(invoicesTable.getSelectedRow());            // remove selected row from the model
            JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
        } else {
            if (invoicesTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Empty Table, please load a txt file");
            } else {
                JOptionPane.showMessageDialog(null, "Select a row to delete");

            }
        }
    }                                         

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) throws IOException {     
  
        // undo changes , read the file again
        DefaultTableModel model2 = (DefaultTableModel) invoiceItemsTable.getModel();

        if (invoiceItemsTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Empty Table, please load a txt file");
        }else{
        model2.setNumRows(0);
        BufferedReader br2 = null;
        try {
            File file2 = new File(path2);
            br2 = new BufferedReader(new FileReader(file2));
            Object[] tableLines = br2.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model2.addRow(dataRow);
            }
        } catch (IOException ex) {
            Logger.getLogger(SalesGeneratorProject.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            br2.close();
        }
        }
        
        

    }                                         


}
