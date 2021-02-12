
package planetfood.gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import planetfood.pojo.UserProfile;

public class AdminOptionsFrame extends javax.swing.JFrame {

    public AdminOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("Hello " + UserProfile.getUsername());
    }

    private String getOption(){
        if(jrAddEmp.isSelected())
           return jrAddEmp.getText();
        else if(jrEditEmp.isSelected())
            return jrEditEmp.getText();
        else if(jrRemEmp.isSelected())
            return jrRemEmp.getText();
        else if(jrViewEmp.isSelected())
            return jrViewEmp.getText();
        else if(jrRegCash.isSelected())
            return jrRegCash.getText();
        else if(jrRemCash.isSelected())
             return jrRemCash.getText();
        else if(jrViewDate.isSelected())
            return jrViewDate.getText();
        else if(jrViewOrd.isSelected())
             return jrViewOrd.getText();
        else if(jrAddCat.isSelected())
             return jrAddCat.getText();
        else if(jrEditCat.isSelected())
            return jrEditCat.getText();
        else if(jrViewCat.isSelected())
             return jrViewCat.getText();
        else if(jrAddPrd.isSelected())
             return jrAddPrd.getText();
        else if(jrEditPrd.isSelected())
             return jrEditPrd.getText();
        else if(jrRemPrd.isSelected())
            return jrRemPrd.getText();
        else if(jrViewPrd.isSelected())
             return jrViewPrd.getText();
        return null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        btnDoTask = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jrAddEmp = new javax.swing.JRadioButton();
        jrViewEmp = new javax.swing.JRadioButton();
        jrEditEmp = new javax.swing.JRadioButton();
        jrRemEmp = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jrRegCash = new javax.swing.JRadioButton();
        jrRemCash = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jrViewOrd = new javax.swing.JRadioButton();
        jrViewDate = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jrAddCat = new javax.swing.JRadioButton();
        jrEditCat = new javax.swing.JRadioButton();
        jrViewCat = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jrAddPrd = new javax.swing.JRadioButton();
        jrViewPrd = new javax.swing.JRadioButton();
        jrEditPrd = new javax.swing.JRadioButton();
        jrRemPrd = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THE PLANET FOOD APP");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLANET FOOD ADMIN PANEL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 20, 358, 29);

        lblLogout.setBackground(new java.awt.Color(0, 102, 102));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });
        jPanel1.add(lblLogout);
        lblLogout.setBounds(940, 10, 50, 17);

        btnDoTask.setBackground(new java.awt.Color(0, 153, 153));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoTask);
        btnDoTask.setBounds(300, 500, 104, 25);

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(680, 500, 88, 25);

        lblUsername.setText("Hello null");
        jPanel1.add(lblUsername);
        lblUsername.setBounds(30, 10, 42, 20);

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Make A Choice");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 60, 132, 22);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setForeground(new java.awt.Color(255, 204, 102));

        jrAddEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAddEmp);
        jrAddEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrAddEmp.setText("Add Emp");

        jrViewEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewEmp);
        jrViewEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrViewEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrViewEmp.setText("View Emp");

        jrEditEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrEditEmp);
        jrEditEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrEditEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrEditEmp.setText("Edit Emp");
        jrEditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditEmpActionPerformed(evt);
            }
        });

        jrRemEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRemEmp);
        jrRemEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrRemEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrRemEmp.setText("Remove Emp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrRemEmp)
                    .addComponent(jrEditEmp)
                    .addComponent(jrViewEmp)
                    .addComponent(jrAddEmp))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrAddEmp)
                .addGap(6, 6, 6)
                .addComponent(jrViewEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrEditEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 140, 270, 130);

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Emp Options");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 110, 113, 20);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setForeground(new java.awt.Color(255, 204, 102));

        jrRegCash.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRegCash);
        jrRegCash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrRegCash.setForeground(new java.awt.Color(255, 255, 255));
        jrRegCash.setText("Register Cashier");
        jrRegCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRegCashActionPerformed(evt);
            }
        });

        jrRemCash.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRemCash);
        jrRemCash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrRemCash.setForeground(new java.awt.Color(255, 255, 255));
        jrRemCash.setText("Remove Cashier");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrRemCash)
                    .addComponent(jrRegCash))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jrRegCash)
                .addGap(18, 18, 18)
                .addComponent(jrRemCash)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(350, 140, 280, 130);

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cashier Options");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 100, 142, 22);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setForeground(new java.awt.Color(255, 204, 102));

        jrViewOrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewOrd);
        jrViewOrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrViewOrd.setForeground(new java.awt.Color(255, 255, 255));
        jrViewOrd.setText("View Orders");

        jrViewDate.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewDate);
        jrViewDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrViewDate.setForeground(new java.awt.Color(255, 255, 255));
        jrViewDate.setText("View DateWise");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewDate)
                    .addComponent(jrViewOrd))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrViewOrd)
                .addGap(18, 18, 18)
                .addComponent(jrViewDate)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(710, 140, 260, 130);

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Report Options");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(770, 100, 135, 22);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setForeground(new java.awt.Color(255, 204, 102));

        jrAddCat.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAddCat);
        jrAddCat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrAddCat.setForeground(new java.awt.Color(255, 255, 255));
        jrAddCat.setText("Add Category");

        jrEditCat.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrEditCat);
        jrEditCat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrEditCat.setForeground(new java.awt.Color(255, 255, 255));
        jrEditCat.setText("Edit Category");

        jrViewCat.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewCat);
        jrViewCat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrViewCat.setForeground(new java.awt.Color(255, 255, 255));
        jrViewCat.setText("View Category");
        jrViewCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddCat)
                    .addComponent(jrEditCat)
                    .addComponent(jrViewCat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jrAddCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewCat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(30, 330, 270, 130);

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category Options");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 300, 155, 22);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.setForeground(new java.awt.Color(255, 204, 102));

        jrAddPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAddPrd);
        jrAddPrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrAddPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrAddPrd.setText("Add Product");

        jrViewPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewPrd);
        jrViewPrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrViewPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrViewPrd.setText("View Product");

        jrEditPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrEditPrd);
        jrEditPrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrEditPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrEditPrd.setText("Edit Product");

        jrRemPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRemPrd);
        jrRemPrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrRemPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrRemPrd.setText("Remove Product");
        jrRemPrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRemPrdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddPrd)
                    .addComponent(jrViewPrd)
                    .addComponent(jrEditPrd)
                    .addComponent(jrRemPrd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrAddPrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewPrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditPrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemPrd)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(350, 330, 280, 130);

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Options");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(420, 300, 145, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
       lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        String task =  getOption();
        if(task==null){
            JOptionPane.showMessageDialog(null,"Please choose an option","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        JFrame jf=null;
        if(task.equals("Add Product"))
            jf=new AddProductFrame();
        else if(task.equals("Edit Product"))
            jf= new EditProductFrame();
        else if(task.equals("Remove Product"))
            jf= new RemoveProductFrame();
        else if(task.equals("View Product"))
            jf= new ViewProductsFrame();
        else if(task.equals("Register Cashier"))
        {
            jf=new RegisterCashierFrame();
        }
        else if(task.equals("Remove Cashier"))
        {
            jf=new RemoveCashierFrame();
        }
        else if(task.equals("View Orders"))
        {
            jf=new ViewAllOrdersFrame();
        }
        else if(task.equals("View DateWise"))
        {
            jf=new ViewAllDateOrdersFrame();
        }
        else if(task.equals("Add Category"))
        {
            jf=new AddCategoryFrame();
        }
        else if(task.equals("Edit Category"))
        {
            jf=new EditCategoryFrame();
        }
        else if(task.equals("View Category"))
        {
            jf=new ViewAllCategoriesFrame();
        }
        else if(task.equals("Add Emp"))
        {
            jf=new AddEmpFrame();
        }
        else if(task.equals("Edit Emp"))
        {
            jf=new EditEmpFrame();
        }
        else if(task.equals("Remove Emp"))
        {
            jf=new RemoveEmpFrame();
        }
        else if(task.equals("View Emp"))
        {
            jf=new ViewEmpFrame();
        }
        jf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jrEditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEditEmpActionPerformed

    private void jrRegCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRegCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRegCashActionPerformed

    private void jrRemPrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRemPrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRemPrdActionPerformed

    private void jrViewCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewCatActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jrAddCat;
    private javax.swing.JRadioButton jrAddEmp;
    private javax.swing.JRadioButton jrAddPrd;
    private javax.swing.JRadioButton jrEditCat;
    private javax.swing.JRadioButton jrEditEmp;
    private javax.swing.JRadioButton jrEditPrd;
    private javax.swing.JRadioButton jrRegCash;
    private javax.swing.JRadioButton jrRemCash;
    private javax.swing.JRadioButton jrRemEmp;
    private javax.swing.JRadioButton jrRemPrd;
    private javax.swing.JRadioButton jrViewCat;
    private javax.swing.JRadioButton jrViewDate;
    private javax.swing.JRadioButton jrViewEmp;
    private javax.swing.JRadioButton jrViewOrd;
    private javax.swing.JRadioButton jrViewPrd;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
