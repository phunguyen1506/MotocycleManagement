/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotocycleManage;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author phu ngu
 */
public final class EmployeeDetail extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDetail
     */
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private User user;

    public EmployeeDetail(User u) {
        initComponents();
        user = new User(u);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        con = new db().mycon();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "fb not available");
        }
        showTableData();
        txtEID.setEnabled(false);
        disable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbAcnn = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtEID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtEName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        cb_bike = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        lbAcnn1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Employee Detail");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Phone", "Email", "Dob", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lbAcnn.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbAcnn.setForeground(new java.awt.Color(255, 0, 0));
        lbAcnn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbEmail.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 0, 51));
        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setText("Employee ID");

        txtEPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEPhoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEPhoneKeyTyped(evt);
            }
        });

        jLabel6.setText("Phone");

        jLabel4.setText("Dob");

        jLabel3.setText("Employee Name");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel8.setText("Email");

        jLabel9.setText("Address");

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cb_bike.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Email" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Search");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_bike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_bike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        btDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete20.png"))); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update20.png"))); // NOI18N
        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MotocycleManage/Reset20.png"))); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        btSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save20.png"))); // NOI18N
        btSave.setText("Save");
        btSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSaveMouseClicked(evt);
            }
        });
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btNew.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add20.png"))); // NOI18N
        btNew.setText("Add");
        btNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNewMouseClicked(evt);
            }
        });
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        lbAcnn1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbAcnn1.setForeground(new java.awt.Color(255, 0, 51));
        lbAcnn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbAcnn1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtEName)
                            .addComponent(txtAddress))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btUpdate)
                        .addGap(64, 64, 64)
                        .addComponent(btDelete)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtEPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbAcnn1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btReset))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back20.png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lbAcnn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 238, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAcnn)
                    .addComponent(lbEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void updateTable() {
        try {
            pst = con.prepareStatement("Select * from employee");
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:

        try {
            String select = (String) cb_bike.getSelectedItem();
            if (select.equals("Name")) {
                pst = con.prepareStatement("select * from employee where EmployeeName=? ");
                pst.setString(1, txtSearch.getText());

                rs = pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (select.equals("Email")) {
                pst = con.prepareStatement("select * from employee where Email=? ");
                pst.setString(1, txtSearch.getText());

                rs = pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    public final void showTableData() {

        try {

            pst = con.prepareStatement("Select * from employee order by EmployeeName");
            rs = pst.executeQuery();

            ResultSetMetaData stdata = rs.getMetaData();
            int q = stdata.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();

            while (rs.next()) {
                Vector columdata = new Vector();
                int i;
                for (i = 1; i < q; i++) {
                    columdata.add(rs.getString("EmployeeID"));
                    columdata.add(rs.getString("EmployeeName"));
                    columdata.add(rs.getString("Phone"));
                    columdata.add(rs.getString("Email"));
                    columdata.add(rs.getString("Dob"));
                    columdata.add(rs.getString("Address"));

                }
                RecordTable.addRow(columdata);
            }

        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "cant show");
        }
    }

    public void checkEmailValidate() {
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", txtEmail.getText()))) {
            lbEmail.setText("Invalid Email !!!");
        } else {
            lbEmail.setText("Email valid !!! ");
            lbEmail.setForeground(Color.GREEN);
        }
    }

    void enablee() {
        txtAddress.setEnabled(true);
        txtEName.setEnabled(true);
        txtEPhone.setEnabled(true);
        txtEmail.setEnabled(true);
        jDateChooser1.setEnabled(true);
    }

    public void disable() {
        txtAddress.setEnabled(false);
        txtEName.setEnabled(false);
        txtEPhone.setEnabled(false);
        txtEmail.setEnabled(false);
        jDateChooser1.setEnabled(false);
        btDelete.setEnabled(false);

        btUpdate.setEnabled(false);
        btSave.setEnabled(false);
    }
    
    
    
    
    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNewActionPerformed

    
    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String dob = sdf.format(this.jDateChooser1.getDate());
            String sql = "UPDATE employee SET EmployeeName=?,Phone=?"
                    + ",Email=?,Dob=?,Address=? WHERE EmployeeID ='" + txtEID.getText() + "'";
            pst = con.prepareStatement(sql);

            pst.setString(1, txtEName.getText());
            pst.setInt(2, Integer.parseInt(txtEPhone.getText()));
            pst.setString(3, txtEmail.getText());
            pst.setString(4, dob);
            pst.setString(5, txtAddress.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Updated");
            updateTable();
        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int selectRows = jTable1.getSelectedRow();
        try {
            int id = Integer.parseInt(RecordTable.getValueAt(selectRows, 0).toString());
            int deleteItem = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete ?", "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION) {
                pst = con.prepareStatement("DELETE FROM employee WHERE EmployeeID =?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Deleted");

                txtEID.setText("");
                txtEName.setText("");
                jDateChooser1.setCalendar(null);
                txtEPhone.setText("");
                txtEmail.setText("");
                txtAddress.setText("");
                updateTable();
                disable();
                btReset.setEnabled(false);
                btSave.setEnabled(false);
                btUpdate.setEnabled(false);
                
            }
        } catch (Exception e) {
            System.out.print(e);
        }

    }//GEN-LAST:event_btDeleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (this.user.getUser_Name().equals("admin")) {
            Home home = new Home(user);
            this.dispose();
            home.setVisible(true);
        } else {
            HomeEmploy home = new HomeEmploy(user);
            this.dispose();
            home.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        enablee();
        btUpdate.setEnabled(true);
        btDelete.setEnabled(true);
        btReset.setEnabled(true);
        btNew.setEnabled(false);
        btSave.setEnabled(false);
      
        try {
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();

            int selectRows = jTable1.getSelectedRow();
            txtEID.setText(RecordTable.getValueAt(selectRows, 0).toString());
            txtEName.setText(RecordTable.getValueAt(selectRows, 1).toString());
            txtEPhone.setText(RecordTable.getValueAt(selectRows, 2).toString());
            txtEmail.setText(RecordTable.getValueAt(selectRows, 3).toString());
            jDateChooser1.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) RecordTable.getValueAt(selectRows, 4).toString()));
            txtAddress.setText(RecordTable.getValueAt(selectRows, 5).toString());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        txtAddress.setText("");
        txtEID.setText("");
        txtEName.setText("");
        txtEPhone.setText("");
        txtEmail.setText("");
        txtSearch.setText("");
        jDateChooser1.setCalendar(null);
        btNew.setEnabled(true);
        btDelete.setEnabled(false);
        btUpdate.setEnabled(false);
        updateTable();
    }//GEN-LAST:event_btResetActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        try {
           if(txtAddress.getText().equals("") || txtEName.getText().equals("") || txtEPhone.getText().equals("") || txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Plese Enter enough information", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String dob = sdf.format(this.jDateChooser1.getDate());
            String sql = "INSERT INTO employee(EmployeeName, Phone, Email, Dob, Address) "
                    + "VALUES (?,?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setString(1, txtEName.getText());
            pst.setString(2, txtEPhone.getText());
            pst.setString(3, txtEmail.getText());
            pst.setString(4, dob);
            pst.setString(5, txtAddress.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Save sussess");
            updateTable();
           }
            
        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSaveMouseClicked
        // TODO add your handling code here:
        btNew.setEnabled(false);
        btDelete.setEnabled(false);
        btReset.setEnabled(false);
        btUpdate.setEnabled(false);
    }//GEN-LAST:event_btSaveMouseClicked

    private void btNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNewMouseClicked
        // TODO add your handling code here:
        txtAddress.setEnabled(true);
        txtEName.setEnabled(true);
        txtEPhone.setEnabled(true);
        txtEmail.setEnabled(true);
        txtSearch.setEnabled(true);
        jDateChooser1.setEnabled(true);
        btSave.setEnabled(true);
        btReset.setEnabled(true);
    }//GEN-LAST:event_btNewMouseClicked

    private void txtEPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEPhoneKeyPressed
        // TODO add your handling code here:
        String phone = txtEPhone.getText();
        int lenght = phone.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                txtEPhone.setEditable(true);
            } else {
                txtEPhone.setEditable(false);
                lbAcnn1.setText("No more than 10 Numbers !!!");
            }

        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                txtEPhone.setEditable(true);
                lbAcnn1.setText("");
            } else {
                txtEPhone.setEditable(false);
            }
        }

    }//GEN-LAST:event_txtEPhoneKeyPressed

    private void txtEPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEPhoneKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEPhoneKeyTyped

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        checkEmailValidate();
    }//GEN-LAST:event_txtEmailKeyPressed

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
            java.util.logging.Logger.getLogger(EmployeeDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User user = new User();
                new EmployeeDetail(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox<String> cb_bike;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbAcnn;
    private javax.swing.JLabel lbAcnn1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtEName;
    private javax.swing.JTextField txtEPhone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
