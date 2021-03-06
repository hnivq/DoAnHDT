/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package view;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Ceramic;
import model.Check;
import model.DanhSachQuanLy;
import model.Electronic;
import model.FileHandle;
import model.Food;
import model.FormatDate;
import model.Serial;
/**
 *
 * @author HnivGnauq
 */
public class ImportFrm extends javax.swing.JDialog {
    private String name = null;
    private Date importDate = null;
    private long importPrice = 0;
    private float inventory = 0.0f;
    private Serial serial = null;
    
    Food food = null;
    Ceramic ceramic = null;
    Electronic electronic = null;
   
    
    
    private HomeFrm home;
    /** Creates new form ImportFrm */
    public ImportFrm() {
        initComponents();
        
    }
    
    public ImportFrm(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        home = (HomeFrm) parent;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        typeLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        inventoryLabel = new javax.swing.JLabel();
        inventoryTxt = new javax.swing.JTextField();
        imPriceLabel = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        serialLabel = new javax.swing.JLabel();
        serialTxt = new javax.swing.JTextField();
        imDateLabel = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        typeChoiceBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        importBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nhập hàng");

        typeLabel.setText("Loại");

        nameLabel.setText("Tên sản phẩm");

        nameTxt.setToolTipText("tên sản phẩm");
        nameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        inventoryLabel.setText("Số lượng nhập");

        inventoryTxt.setToolTipText("kg hoặc cái");

        imPriceLabel.setText("Giá nhập");

        priceTxt.setToolTipText("giá trên 1kg hoặc 1 cái");

        serialLabel.setText("Mã hàng hóa");

        serialTxt.setEditable(false);
        serialTxt.setToolTipText("được tạo mặc định");

        imDateLabel.setText("Ngày nhập");

        dateTxt.setToolTipText("định dạng dd/mm/yyyy");

        typeChoiceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại", "Thực phẩm", "Sành sứ", "Đồ điện tử" }));
        typeChoiceBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeChoiceBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeChoiceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(imPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inventoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(imDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(serialLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(serialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(inventoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeChoiceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inventoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        importBtn.setMnemonic(KeyEvent.VK_ENTER
        );
        importBtn.setText("Nhập");
        importBtn.setToolTipText("alt+Enter để nhập");
        importBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtnActionPerformed(evt);
            }
        });

        showBtn.setText("Xem bảng");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Quay lại");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(importBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(importBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        try {
            FileHandle.saveFile();
        } catch (Exception ex) {
            Logger.getLogger(ImportFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        home = new HomeFrm();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void importBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtnActionPerformed
        
        boolean isOK = true;
        isOK = typeChoiceProcess();
        isOK = nameTxtProcess();
        isOK = priceTxtProcess();
        isOK = inventoryTxtProcess();
        isOK = dateTxtProcess();

        if(isOK) {   
            if(typeChoiceBox.getSelectedItem().equals("Thực phẩm")) {
                food = new Food(name,serial,importPrice,inventory,importDate);
                DanhSachQuanLy.list.add(food);
            } else
            if(typeChoiceBox.getSelectedItem().equals("Sành sứ")) {
                ceramic = new Ceramic(name,serial,importPrice,inventory,importDate);
                DanhSachQuanLy.list.add(ceramic);
            } else
            if(typeChoiceBox.getSelectedItem().equals("Đồ điện tử")) {
               electronic = new Electronic(name,serial,importPrice,inventory,importDate);
                DanhSachQuanLy.list.add(electronic); 
            }
            JOptionPane.showMessageDialog(rootPane, "Nhập hàng thành công !!!");
            typeChoiceBox.setSelectedItem("Loại");
            nameTxt.setText("");
            priceTxt.setText("");
            inventoryTxt.setText("");
            dateTxt.setText("");
            serialTxt.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_importBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        ShowFrm showFrm = new ShowFrm();
        showFrm.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_showBtnActionPerformed

    private void typeChoiceBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeChoiceBoxItemStateChanged
        if(typeChoiceBox.getSelectedItem().equals("Thực phẩm")) {
            serial = new Serial("FD", Food.getCountFD());
            serialTxt.setText(serial.getSerial());
        } else
        if(typeChoiceBox.getSelectedItem().equals("Sành sứ")) {
            serial = new Serial("CM", Ceramic.getCountCM());
            serialTxt.setText(serial.getSerial()); 
        } else
        if(typeChoiceBox.getSelectedItem().equals("Đồ điện tử")) {
            serial = new Serial("EC", Electronic.getCountEC());
            serialTxt.setText(serial.getSerial()); 
        } else
            serialTxt.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_typeChoiceBoxItemStateChanged
    
    private boolean typeChoiceProcess() {
        
        boolean isOK = true;
        if(typeChoiceBox.getSelectedItem().equals("Loại")) {
            JOptionPane.showMessageDialog(rootPane, "Chưa chọn loại sản phẩm");
            typeChoiceBox.requestFocus();
            return isOK = false;
        } else { 
            return isOK;
        }  
    }
    
    private boolean nameTxtProcess() {
        boolean isOK = true;
        if(nameTxt.getText().equals("") || Check.checkName(nameTxt.getText()) == false) {
            nameTxt.setText("");
            JOptionPane.showMessageDialog(rootPane, "Tên sản phẩm đã tồn tại hoặc chưa nhập tên");
            nameTxt.requestFocus();
            return isOK = false;
        } else {
            name = nameTxt.getText();
            return isOK;
        } 
    }
    
    private boolean priceTxtProcess() {
        boolean isOK = true;
        try {
            importPrice = Long.parseLong(priceTxt.getText());
        } catch (Exception e) {
            priceTxt.setText("");
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập giá nhập hoặc nhập không đúng định dạng");
            priceTxt.requestFocus();
            return isOK = false;
        }
        return isOK;
    }
    
    private boolean inventoryTxtProcess() {
        boolean isOK = true;
        try {
            inventory = Float.parseFloat(inventoryTxt.getText());
        } catch (Exception e) {
            inventoryTxt.setText("");
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập số lượng tồn kho nhập hoặc nhập không đúng định dạng");
            priceTxt.requestFocus();
            return isOK = false;
        }
        return isOK;
    }
    
    private boolean dateTxtProcess() {
        boolean isOK = true;
        String importDateString = dateTxt.getText();
        if(Check.checkDate(importDateString) == false || importDateString.equals("")) {
            dateTxt.setText("");
            JOptionPane.showMessageDialog(rootPane, "Bạn nhập không đúng định dạng hoặc bạn đang là người đến từ tương lai :))");
            dateTxt.requestFocus();
            return isOK = false;
        } else {
            importDate = FormatDate.nhapNgay(importDateString);
            return isOK;         
        }      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImportFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel imDateLabel;
    private javax.swing.JLabel imPriceLabel;
    private javax.swing.JButton importBtn;
    private javax.swing.JLabel inventoryLabel;
    private javax.swing.JTextField inventoryTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JLabel serialLabel;
    private javax.swing.JTextField serialTxt;
    private javax.swing.JButton showBtn;
    private javax.swing.JComboBox<String> typeChoiceBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

}
