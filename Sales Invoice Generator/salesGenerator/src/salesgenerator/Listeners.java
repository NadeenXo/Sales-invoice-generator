/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesgenerator;

//import Model.InvoiceLine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadeen
 */
public class Listeners {

    MyFrame frame;
    String path1 = "../InvoiceHeader.csv";
    String path2 = "../InvoiceLine.csv";
    static int NoNum;
    DefaultTableModel model;
//    DefaultTableModel IHmodel = (DefaultTableModel) frame.getInvoicesTable().getModel();
//    DefaultTableModel ILmodel = (DefaultTableModel) frame.getInvoiceItemsTable().getModel();
//    

    public Listeners(MyFrame frame) {
        this.frame = frame;
    }

    public void loadFileTabActionPerformed(java.awt.event.ActionEvent evt) {

        // if you want to choose the 2 files
        //two path fields will be changed as you selected
        BufferedReader br = null;
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            path1 = fc.getSelectedFile().getPath();

            try {
                br = new BufferedReader(new FileReader(new File(path1)));
                model = (DefaultTableModel) frame.getInvoicesTable().getModel();
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
        }
        //invoice line
        BufferedReader br2 = null;
        JFileChooser fc2 = new JFileChooser();
        int result2 = fc2.showOpenDialog(frame);
        if (result2 == JFileChooser.APPROVE_OPTION) {
            path2 = fc2.getSelectedFile().getPath();

            try {
                br2 = new BufferedReader(new FileReader(new File(path2)));
                model = (DefaultTableModel) frame.getInvoiceItemsTable().getModel();
                Object[] tableLines = br2.lines().toArray();
                //String s= model.getColumnName(4);
                int[] n = new int[tableLines.length];//  n=itemCount*itemPrice
                int num;
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);
                    n[i] = Integer.parseInt(model.getValueAt(i, 2).toString()) * Integer.parseInt(model.getValueAt(i, 3).toString());

                    //System.out.println(n[i]);
                    num = n[i];
                    model.setValueAt(String.valueOf(num), i, 4);
                }
                //
                 NoNum = model.getRowCount();
                 //
                 
                 
                 
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br2.close();
                } catch (IOException ex) {
                    Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
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
            model = (DefaultTableModel) frame.getInvoicesTable().getModel();
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
            model2 = (DefaultTableModel) frame.getInvoiceItemsTable().getModel();
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

    public void createBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // create new invoice row as you typed in invoice data
        model = (DefaultTableModel) frame.getInvoicesTable().getModel();
        model.addRow(new Object[]{
            frame.getNumTextField().getText(),
            frame.getDateTextField().getText(),
            frame.getNameTextField().getText(),
            frame.getTotalTextField().getText()
        });
        NoNum = model.getRowCount();
        NoNum++; //to increase invoice number
        frame.getNumTextField().setText(String.valueOf(NoNum));
    }

    public void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // save invoice items table in the specified csv file
        if (frame.getInvoiceItemsTable().getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Empty Table, please load a txt file");
        } else {

            BufferedWriter bw2 = null;
            File file2 = null;
            try {
                file2 = new File(path2);
                bw2 = new BufferedWriter(new FileWriter(file2.getAbsoluteFile()));
                for (int i = 0; i < frame.getInvoiceItemsTable().getRowCount(); i++) {
                    for (int j = 0; j < frame.getInvoiceItemsTable().getColumnCount(); j++) {
                        String s = (String) frame.getInvoiceItemsTable().getModel().getValueAt(i, j);
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
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                bw2.close();
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void saveFileTabActionPerformed(java.awt.event.ActionEvent evt) {
        // save 2 csv files

        BufferedWriter bw = null;
        try {
            File file = new File(path1);
            bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
            for (int i = 0; i < frame.getInvoicesTable().getRowCount(); i++) {
                for (int j = 0; j < frame.getInvoicesTable().getColumnCount(); j++) {
                    String s = (String) frame.getInvoicesTable().getModel().getValueAt(i, j);
                    if (s == null) {
                        bw.write(" ");
                    } else {
                        bw.write(s + ",");
                    }
                }
                bw.write("\n");
            }

        } catch (IOException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        BufferedWriter bw2 = null;
        try {
            File file2 = new File(path2);
            bw2 = new BufferedWriter(new FileWriter(file2.getAbsoluteFile()));
            for (int i = 0; i < frame.getInvoiceItemsTable().getRowCount(); i++) {
                for (int j = 0; j < frame.getInvoiceItemsTable().getColumnCount(); j++) {
                    String s = (String) frame.getInvoiceItemsTable().getModel().getValueAt(i, j);
                    if (s == null) {
                        bw2.write(" ");
                    } else {
                        bw2.write(s + ",");
                    }
                }
                bw2.write("\n");
            }

        } catch (IOException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw2.close();
            } catch (IOException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        model = (DefaultTableModel) frame.getInvoicesTable().getModel();
        if (frame.getInvoicesTable().getSelectedRowCount() == 1) { //if you already select a row
            model.removeRow(frame.getInvoicesTable().getSelectedRow());            // remove selected row from the model
            JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
        } else {
            if (frame.getInvoicesTable().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Empty Table, please load a txt file");
            } else {
                JOptionPane.showMessageDialog(null, "Select a row to delete");

            }
        }
    }

    public void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // undo changes , read the file again
        model = (DefaultTableModel) frame.getInvoiceItemsTable().getModel();

        if (frame.getInvoiceItemsTable().getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Empty Table, please load a txt file");
        } else {
            model.setNumRows(0);
            BufferedReader br2 = null;
            try {
                File file2 = new File(path2);
                br2 = new BufferedReader(new FileReader(file2));
                Object[] tableLines = br2.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);
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
        }

    }

}
