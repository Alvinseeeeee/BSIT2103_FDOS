package BSIT2103_FDOS;

import BSIT2103_FDOS.BackEnd2.Customers;
import BSIT2103_FDOS.BackEnd2.Management;
import BSIT2103_FDOS.BackEnd2.Reservation;
import BSIT2103_FDOS.BackEnd2.Waiter;
import BSIT2103_FDOS.Control_Connector.DBConnect;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class ManagementPageForm extends javax.swing.JFrame {

    private Waiter waiter;
    private Connection connect;
    private Component rootPane;

 
    public ManagementPageForm() {
        initComponents();
        
        DBConnect dbconnect = new DBConnect();
        this.connect = dbconnect.getConnection();
        populateReservationTable(); 
        populateCustomerTable();
        displayWaiterAssignedTables();
        displayTotalSales();
        displayTop10BestSellers();
        displayMaxCustomerId();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        SearchCustomer = new javax.swing.JTextField();
        SearchCustomerButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        WaiterTableList = new javax.swing.JTable();
        AddWaitstaffbtn = new javax.swing.JButton();
        RemoveWaitstaffBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationCustomerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        SearchCustomerByReservation = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        SearchCustomerReservationButton = new javax.swing.JButton();
        BackButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TotalSales = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        bestSellersTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        TotalCustomers = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        AddManagementEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        AddManagementPassword = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BackButton1 = new javax.swing.JButton();

        jScrollPane4.setViewportView(jEditorPane1);

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
        jScrollPane6.setViewportView(jTable1);

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(161, 138, 121));

        jTabbedPane2.setBackground(new java.awt.Color(161, 138, 121));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel4.setBackground(new java.awt.Color(161, 138, 121));

        CustomerTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Customer", "Email", "Contact Number", "Start Time", "End Time", "Title 7"
            }
        ));
        jScrollPane2.setViewportView(CustomerTable);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("ALL CUSTOMERS");

        SearchCustomer.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        SearchCustomerButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SearchCustomerButton.setText("SEARCH");
        SearchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCustomerButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Search for a Customer:");

        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchCustomerButton)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchCustomerButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CUSTOMERS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(161, 138, 121));

        WaiterTableList.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        WaiterTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Waiter ID", "Name", "Table ID", "Table Capacity"
            }
        ));
        jScrollPane3.setViewportView(WaiterTableList);

        AddWaitstaffbtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        AddWaitstaffbtn.setText("ADD WAITER");
        AddWaitstaffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddWaitstaffbtnActionPerformed(evt);
            }
        });

        RemoveWaitstaffBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        RemoveWaitstaffBtn.setText("DELETE WAITER");
        RemoveWaitstaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveWaitstaffBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("ASSIGN WAITER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setText("DISPLAYING:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Baggy's Diner");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Waiters and Tables");

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RemoveWaitstaffBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddWaitstaffbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(AddWaitstaffbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RemoveWaitstaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("WAITERS", jPanel5);

        jPanel1.setBackground(new java.awt.Color(161, 138, 121));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reservationCustomerTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        reservationCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Reservation ID", "Customer", "Email", "Contact Number", "Start Time", "End Time", "Date"
            }
        ));
        jScrollPane1.setViewportView(reservationCustomerTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 600, 340));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("RESERVATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 40));

        SearchCustomerByReservation.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(SearchCustomerByReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 170, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Search for a Customer:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        SearchCustomerReservationButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SearchCustomerReservationButton.setText("SEARCH");
        SearchCustomerReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCustomerReservationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SearchCustomerReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        BackButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        BackButton2.setText("BACK");
        BackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, -1));

        jTabbedPane2.addTab("RESERVATIONS", jPanel1);

        jPanel3.setBackground(new java.awt.Color(161, 138, 121));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("SALES:");

        TotalSales.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("Restaurant's Total Sales");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalSales, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalSales, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("WELCOME TO MANAGEMENT'S DASHBOARD");

        bestSellersTable.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        bestSellersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Category", "Total Quantities Sold"
            }
        ));
        jScrollPane5.setViewportView(bestSellersTable);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("TOP 10 BEST SELLERS");

        TotalCustomers.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("TOTAL NO CUSTOMERS:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TotalCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TotalCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        AddManagementEmail.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("ADD ADMIN:");

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        AddManagementPassword.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        AddManagementPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddManagementPasswordActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel11.setText("Email");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel14.setText("Password");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AddManagementPassword))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AddManagementEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddManagementEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddManagementPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        BackButton1.setText("BACK");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BackButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("DASHBOARD", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddWaitstaffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddWaitstaffbtnActionPerformed
        AddWaiter addWaiter = new AddWaiter();
        addWaiter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddWaitstaffbtnActionPerformed

    private void RemoveWaitstaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveWaitstaffBtnActionPerformed
        DeleteWaiter deleteWaiter = new DeleteWaiter();
        deleteWaiter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RemoveWaitstaffBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AssignTables assigntables = new AssignTables();
        assigntables.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Management admin = new Management();
        String adminEmail = AddManagementEmail.getText();
        String adminPassword = new String(AddManagementPassword.getPassword());
        
        admin.addManagementCredentials(adminEmail, adminPassword);
        AddManagementEmail.setText("");
        AddManagementPassword.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AddManagementPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddManagementPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddManagementPasswordActionPerformed

    private void SearchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCustomerButtonActionPerformed
        Customers customer = new Customers();
        
        String customerName = SearchCustomer.getText();
        if (!customerName.isEmpty()) {
            customer.searchCustomerByName(customerName);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a customer name to search.", "Input Required", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SearchCustomerButtonActionPerformed

    private void SearchCustomerReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCustomerReservationButtonActionPerformed
        Reservation reservation = new Reservation();
        
        String reservationcust = SearchCustomerByReservation.getText();
        if(!reservationcust.isEmpty()){
            reservation.searchCustomerByReservationType(reservationcust);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a customer name to search.", "Input Required", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SearchCustomerReservationButtonActionPerformed

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed
        MainPageForm main = new MainPageForm();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButton1ActionPerformed

    private void BackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton2ActionPerformed
        MainPageForm main = new MainPageForm();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainPageForm main = new MainPageForm();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MainPageForm main = new MainPageForm();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void displayWaiterAssignedTables() {
        String query = "SELECT w.waiter_id, w.waiter_name, t.table_id, t.capacity " +
                       "FROM waiters w " +
                       "JOIN tables t ON w.waiter_id = t.waiter_id";

        try (PreparedStatement stmt = connect.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            // Assuming you have a JTable to display the data
            DefaultTableModel model = (DefaultTableModel) WaiterTableList.getModel();
            model.setRowCount(0);  // Clear any existing rows

            // Loop through the results and add them to the table model
            while (rs.next()) {
                int waiterId = rs.getInt("waiter_id");
                String waiterName = rs.getString("waiter_name");
                int tableId = rs.getInt("table_id");
                int capacity = rs.getInt("capacity");

                model.addRow(new Object[]{waiterId, waiterName, tableId, capacity});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving waiter and table data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    /*private void populateReservationTable() {
        try {
            String populateReservationQuery = "SELECT c.customer_fullname, c.customer_email, "
                + "c.customer_contact_no, r.start_time, r.end_time, r.date, r.party_size "
                + "FROM customer AS c LEFT JOIN reservationdetails AS r "
                + "ON c.customer_id = r.customer_id "
                + "WHERE c.customer_type = 'reservation'";
            
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(populateReservationQuery);

            DefaultTableModel model = (DefaultTableModel) reservationCustomerTable.getModel();
            model.setRowCount(0);

            while(rs.next()){
                String customerFullName = rs.getString("customer_fullname");
                String customerEmail = rs.getString("customer_email");
                String customerContactNo= rs.getString("customer_contact_no");
                String startTime = rs.getString("start_time");
                String endTime = rs.getString("end_time");
                String date = rs.getString("date");

                model.addRow(new Object[]{customerFullName, customerEmail, customerContactNo, startTime, endTime, date});
            }

            if(model.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "No customers found.");
            }

        } 
        catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching tables: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}

    private void populateCustomerTable() {
    try {
        String query = "SELECT c.customer_fullname, c.customer_email, c.customer_contact_no, "
                     + "r.start_time, r.end_time, r.date "
                     + "FROM customer AS c "
                     + "LEFT JOIN reservationdetails AS r ON c.customer_id = r.customer_id";

        Statement stmt = connect.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            String customerFullName = rs.getString("customer_fullname");
            String customerEmail = rs.getString("customer_email");
            String customerContactNo = rs.getString("customer_contact_no");
            String startTime = rs.getString("start_time") != null ? rs.getString("start_time") : "";
            String endTime = rs.getString("end_time") != null ? rs.getString("end_time") : "";
            String date = rs.getString("date") != null ? rs.getString("date") : "";

            model.addRow(new Object[]{customerFullName, customerEmail, customerContactNo, startTime, endTime, date});
        }

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No customers or reservations found.");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}*/
    
    private void populateReservationTable() {
        try {
            // Updated query to include reservation_id
            String populateReservationQuery = "SELECT c.customer_fullname, c.customer_email, "
                + "c.customer_contact_no, r.reservation_id, r.start_time, r.end_time, r.date, r.party_size "
                + "FROM customer AS c LEFT JOIN reservationdetails AS r "
                + "ON c.customer_id = r.customer_id "
                + "WHERE c.customer_type = 'reservation'";

            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(populateReservationQuery);

            // Get the table model and reset its rows
            DefaultTableModel model = (DefaultTableModel) reservationCustomerTable.getModel();
            model.setRowCount(0);

            // Add data to the table model
            while (rs.next()) {
                String customerFullName = rs.getString("customer_fullname");
                String customerEmail = rs.getString("customer_email");
                String customerContactNo = rs.getString("customer_contact_no");
                String reservationId = rs.getString("reservation_id"); // Added reservation_id
                String startTime = rs.getString("start_time");
                String endTime = rs.getString("end_time");
                String date = rs.getString("date");

                // Add a row with the reservation_id and other details
                model.addRow(new Object[]{customerFullName, customerEmail, customerContactNo, reservationId, startTime, endTime, date});
            }

            // Show a message if no data is found
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No customers found.");
            }

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching tables: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void populateCustomerTable() {
    try {
        String query = "SELECT c.customer_id, c.customer_fullname, c.customer_email, c.customer_contact_no, "
                     + "r.start_time, r.end_time, r.date "
                     + "FROM customer AS c "
                     + "LEFT JOIN reservationdetails AS r ON c.customer_id = r.customer_id";

        Statement stmt = connect.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            int customerId = rs.getInt("customer_id");
            String customerFullName = rs.getString("customer_fullname");
            String customerEmail = rs.getString("customer_email");
            String customerContactNo = rs.getString("customer_contact_no");
            String startTime = rs.getString("start_time") != null ? rs.getString("start_time") : "";
            String endTime = rs.getString("end_time") != null ? rs.getString("end_time") : "";
            String date = rs.getString("date") != null ? rs.getString("date") : "";

            model.addRow(new Object[]{customerId, customerFullName, customerEmail, customerContactNo, startTime, endTime, date});
        }

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No customers or reservations found.");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
        public void displayTotalSales() {
            String query = "SELECT SUM(total_price) AS total_sales FROM orders";

            try (PreparedStatement stmt = connect.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    double totalSales = rs.getDouble("total_sales");
                    TotalSales.setText(String.format("%.2f", totalSales)); // Format as currency
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error calculating total sales: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
    }
        
        public void displayTop10BestSellers() {
            String query = "SELECT m.item_name, m.category, SUM(oi.quantity) AS total_quantity_sold " +
                           "FROM order_items oi " +
                           "JOIN menu m ON oi.menu_id = m.menu_id " +
                           "GROUP BY oi.menu_id, m.item_name, m.category " +
                           "ORDER BY total_quantity_sold DESC " +
                           "LIMIT 10";

            DefaultTableModel model = (DefaultTableModel) bestSellersTable.getModel();
            model.setRowCount(0);

            try (PreparedStatement stmt = connect.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    String itemName = rs.getString("item_name");
                    String category = rs.getString("category");
                    int totalQuantitySold = rs.getInt("total_quantity_sold");

                    model.addRow(new Object[] { itemName, category, totalQuantitySold });
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error retrieving top sellers: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        public void displayMaxCustomerId() {
            String query = "SELECT MAX(customer_id) AS max_customer_id FROM customer";

            try (PreparedStatement stmt = connect.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    int maxCustomerId = rs.getInt("max_customer_id");
                    TotalCustomers.setText(String.format("%d", maxCustomerId));
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error retrieving max customer ID: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(ManagementPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementPageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddManagementEmail;
    private javax.swing.JPasswordField AddManagementPassword;
    private javax.swing.JButton AddWaitstaffbtn;
    private javax.swing.JButton BackButton1;
    private javax.swing.JButton BackButton2;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton RemoveWaitstaffBtn;
    private javax.swing.JTextField SearchCustomer;
    private javax.swing.JButton SearchCustomerButton;
    private javax.swing.JTextField SearchCustomerByReservation;
    private javax.swing.JButton SearchCustomerReservationButton;
    private javax.swing.JTextField TotalCustomers;
    private javax.swing.JTextField TotalSales;
    private javax.swing.JTable WaiterTableList;
    private javax.swing.JTable bestSellersTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable reservationCustomerTable;
    // End of variables declaration//GEN-END:variables
}
