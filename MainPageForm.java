/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BSIT2103_FDOS;

import BSIT2103_FDOS.BackEnd2.CalendarTable;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import BSIT2103_FDOS.BackEnd2.Reservation;
import BSIT2103_FDOS.BackEnd2.WalkIn;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainPageForm extends javax.swing.JFrame {

    Reservation reservation = new Reservation();
    WalkIn walkin = new WalkIn();
    private CalendarTable calendar;
    //Customer customer = new Customer();
    
    public MainPageForm() {
        initComponents();
        
        int min = 1;
        int max = 8;
        int initialValue = 1;
        int stepSize = 1;
        SpinnerNumberModel model = new SpinnerNumberModel(initialValue, min, max, stepSize);
        PartySizeSpinner.setModel(model);
        WalkInPartySize.setModel(model);
        
        calendar = new CalendarTable();
        updateCalendar();
        
        TimeChoices(ReservationStartTime);  // Populate the start time ComboBox
        TimeChoices(ReservationEndTime);
        TimeChoices(WalkInEndTime);
        setDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        ReservationHandlingPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ReservationStartTime = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        EnterReservationButton = new javax.swing.JButton();
        SelectedDateDisplay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CalendarForReservation = new javax.swing.JTable();
        NextMonthButton = new javax.swing.JButton();
        PreviousMonthButton = new javax.swing.JButton();
        PartySizeSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        ReservationEndTime = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        FullNameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        ContactNoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        AlreadyReservedButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        FullNameLabel = new javax.swing.JLabel();
        customerFullNameField = new javax.swing.JTextField();
        customerEmailField = new javax.swing.JTextField();
        customerContactNoField = new javax.swing.JTextField();
        EmailAddressLabel = new javax.swing.JLabel();
        ContactNumberLabel = new javax.swing.JLabel();
        CustomerInformation = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        WalkInPartySize = new javax.swing.JSpinner();
        WalkInEndTime = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblCurrentDate = new javax.swing.JLabel();
        customerEnter = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(161, 138, 121));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel15.setText("Interface");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel16.setText("Enter      Management");

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jButton2.setText("LOG IN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BSIT2103_FDOS/images/image-139x309.jpg"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        jLabel21.setText("\"Elevating taste,");

        jLabel22.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        jLabel22.setText("redefining elegance.\" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jButton2))
                .addGap(15, 15, 15))
        );

        jPanel5.setBackground(new java.awt.Color(161, 138, 121));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 75, 57));
        jLabel3.setText("DECEMBER 2024");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ReservationStartTime.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ReservationStartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationStartTimeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(100, 75, 57));
        jLabel5.setText("Strating Time");

        EnterReservationButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        EnterReservationButton.setForeground(new java.awt.Color(100, 75, 57));
        EnterReservationButton.setText("NEXT");
        EnterReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterReservationButtonActionPerformed(evt);
            }
        });

        SelectedDateDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectedDateDisplayActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 75, 57));
        jLabel1.setText("Party Size");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel4.setText("Selected Date");

        CalendarForReservation.setAutoCreateRowSorter(true);
        CalendarForReservation.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        CalendarForReservation.setForeground(new java.awt.Color(102, 0, 0));
        CalendarForReservation.setRowHeight(30);
        CalendarForReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalendarForReservationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CalendarForReservation);

        NextMonthButton.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        NextMonthButton.setText(">");
        NextMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextMonthButtonActionPerformed(evt);
            }
        });

        PreviousMonthButton.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        PreviousMonthButton.setText("<");
        PreviousMonthButton.setToolTipText("");
        PreviousMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousMonthButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 75, 57));
        jLabel2.setText("RESERVATION");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ReservationEndTime.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ReservationEndTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationEndTimeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel11.setText("Ending Time");

        javax.swing.GroupLayout ReservationHandlingPanelLayout = new javax.swing.GroupLayout(ReservationHandlingPanel);
        ReservationHandlingPanel.setLayout(ReservationHandlingPanelLayout);
        ReservationHandlingPanelLayout.setHorizontalGroup(
            ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservationHandlingPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservationHandlingPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ReservationHandlingPanelLayout.createSequentialGroup()
                        .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ReservationHandlingPanelLayout.createSequentialGroup()
                                .addComponent(ReservationStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(SelectedDateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PartySizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ReservationHandlingPanelLayout.createSequentialGroup()
                                .addComponent(ReservationEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EnterReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReservationHandlingPanelLayout.createSequentialGroup()
                                .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(ReservationHandlingPanelLayout.createSequentialGroup()
                                            .addComponent(PreviousMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(ReservationHandlingPanelLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jLabel2))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(NextMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReservationHandlingPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))))
        );
        ReservationHandlingPanelLayout.setVerticalGroup(
            ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservationHandlingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PreviousMonthButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(NextMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PartySizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReservationStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectedDateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReservationHandlingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReservationEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FullNameField.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        EmailField.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        ContactNoField.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        ContactNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNoFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("CUSTOMER");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("INFORMATION");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel8.setText("Full Name");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel10.setText("Contact Number");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(EmailField)
                                .addComponent(FullNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addComponent(ContactNoField)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(FullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel12.setText("BAGGY'S");

        jLabel13.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel13.setText("DINER");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel19.setText("Already reserved?");

        AlreadyReservedButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        AlreadyReservedButton.setText("YES");
        AlreadyReservedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlreadyReservedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AlreadyReservedButton)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReservationHandlingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(ReservationHandlingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlreadyReservedButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("RESERVATION", jPanel5);

        jPanel4.setBackground(new java.awt.Color(161, 138, 121));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(301, 210));

        FullNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        FullNameLabel.setForeground(new java.awt.Color(100, 75, 57));
        FullNameLabel.setText("Full Name:");

        customerFullNameField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        customerFullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerFullNameFieldActionPerformed(evt);
            }
        });

        customerEmailField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        customerEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerEmailFieldActionPerformed(evt);
            }
        });

        customerContactNoField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        customerContactNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerContactNoFieldActionPerformed(evt);
            }
        });

        EmailAddressLabel.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        EmailAddressLabel.setForeground(new java.awt.Color(100, 75, 57));
        EmailAddressLabel.setText("Email Address:");

        ContactNumberLabel.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        ContactNumberLabel.setForeground(new java.awt.Color(100, 75, 57));
        ContactNumberLabel.setText("Contact Number:");

        CustomerInformation.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomerInformation.setForeground(new java.awt.Color(100, 75, 57));
        CustomerInformation.setText("CUSTOMER INFORMATION");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel17.setText("Party Size");

        WalkInEndTime.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        WalkInEndTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalkInEndTimeActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel23.setText("Walk-In Date");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel25.setText("End Time");

        lblCurrentDate.setBackground(new java.awt.Color(250, 250, 250));
        lblCurrentDate.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblCurrentDate, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblCurrentDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(WalkInPartySize, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(WalkInEndTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(58, 58, 58)))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CustomerInformation)
                    .addComponent(EmailAddressLabel)
                    .addComponent(customerContactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerFullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FullNameLabel)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ContactNumberLabel)
                        .addGap(156, 156, 156)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CustomerInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FullNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerFullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ContactNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerContactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WalkInPartySize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WalkInEndTime, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        customerEnter.setBackground(new java.awt.Color(228, 224, 225));
        customerEnter.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        customerEnter.setForeground(new java.awt.Color(100, 75, 57));
        customerEnter.setText("NEXT");
        customerEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerEnterActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        jLabel14.setText("BAGGY'S DINER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customerEnter)
                .addGap(38, 38, 38))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("WALK IN", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("WALK IN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateCalendar(){
        String[] columns = {"SUN", "MON", "TUE", "WED", "THUR", "FRI", "SAT"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        
        int[][] days = calendar.getMonthDays();
        for(int[]week : days){
            Object[] row = new Object[7];
            for(int i = 0; i < 7; i++){
                row[i] = week[i] == 0 ? "" : week[i];
            }
            
            model.addRow(row);
        }
        
        CalendarForReservation.setModel(model);
        jLabel3.setText(calendar.getMonthYear());
    }
    
    private void TimeChoices(JComboBox<String> comboBox){
        List<String> validTimeoptions = new ArrayList<>();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Calendar cal = Calendar.getInstance();
        
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        
        for(int i = 0; i <= 48; i++){
            validTimeoptions.add(timeFormat.format(cal.getTime()));
            cal.add(Calendar.MINUTE,30);
        }
        
        ReservationStartTime.setModel(new DefaultComboBoxModel<>(validTimeoptions.toArray(new String[0])));
        ReservationEndTime.setModel(new DefaultComboBoxModel<>(validTimeoptions.toArray(new String[0])));
        WalkInEndTime.setModel(new DefaultComboBoxModel<>(validTimeoptions.toArray(new String[0])));
        
    }
    
    private void ReservationStartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationStartTimeActionPerformed

    }//GEN-LAST:event_ReservationStartTimeActionPerformed

    private void EnterReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterReservationButtonActionPerformed
        String reservationfullName = FullNameField.getText();
        String reservationemail = EmailField.getText();
        String reservationcontactNo = ContactNoField.getText();
        String startTime = ReservationStartTime.getSelectedItem().toString();
        String endTime = ReservationEndTime.getSelectedItem().toString();
        String partySize = PartySizeSpinner.getValue().toString();
        
        String selectedDate = SelectedDateDisplay.getText();
        
        reservation.reservationCustomer(reservationfullName, reservationemail, reservationcontactNo, startTime, endTime, selectedDate, partySize);

        FullNameField.setText("");
        EmailField.setText("");
        ContactNoField.setText("");
        ReservationStartTime.setSelectedIndex(0); 
        ReservationEndTime.setSelectedIndex(0); 
        PartySizeSpinner.setValue(1); 
        SelectedDateDisplay.setText("");
    }//GEN-LAST:event_EnterReservationButtonActionPerformed

    private void SelectedDateDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectedDateDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectedDateDisplayActionPerformed

    private void CalendarForReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarForReservationMouseClicked
        int row = CalendarForReservation.rowAtPoint(evt.getPoint());
        int column = CalendarForReservation.columnAtPoint(evt.getPoint());

        if (row >= 0 && column >= 0) {
            Object value = CalendarForReservation.getValueAt(row, column);
            if (value != null) {
                int day = (int) value;

                String currentMonthYear = calendar.getMonthYear();
                String[] monthYearParts = currentMonthYear.split(" "); 
                String month = monthYearParts[0];
                String year = monthYearParts[1];

                int monthNumber = getMonthNumber(month); 

                String formattedDate = String.format("%04d-%02d-%02d", Integer.parseInt(year), monthNumber, day);
                SelectedDateDisplay.setText(formattedDate);
            } else {
                SelectedDateDisplay.setText("No date selected.");
            }
        }
    }

    private int getMonthNumber(String month) {
        switch (month.toLowerCase()) {
            case "january": return 1;
            case "february": return 2;
            case "march": return 3;
            case "april": return 4;
            case "may": return 5;
            case "june": return 6;
            case "july": return 7;
            case "august": return 8;
            case "september": return 9;
            case "october": return 10;
            case "november": return 11;
            case "december": return 12;
            default: return 0;
        }
    }//GEN-LAST:event_CalendarForReservationMouseClicked

    private void NextMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextMonthButtonActionPerformed
        calendar.nextMonth();
        updateCalendar();
    }//GEN-LAST:event_NextMonthButtonActionPerformed

    private void PreviousMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousMonthButtonActionPerformed
        calendar.previousMonth();
        updateCalendar();
    }//GEN-LAST:event_PreviousMonthButtonActionPerformed

    private void ContactNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNoFieldActionPerformed

    private void ReservationEndTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationEndTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReservationEndTimeActionPerformed

    private void customerFullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerFullNameFieldActionPerformed

    }//GEN-LAST:event_customerFullNameFieldActionPerformed

    private void customerEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerEmailFieldActionPerformed

    private void customerContactNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerContactNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerContactNoFieldActionPerformed

    private void customerEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerEnterActionPerformed
        String WalkInfullName = customerFullNameField.getText();
        String WalkInemail = customerEmailField.getText();
        String WalkIncontactNo = customerContactNoField.getText();
        String startTime = ReservationStartTime.getSelectedItem().toString();
        String endTime = ReservationEndTime.getSelectedItem().toString();
        String partySize = WalkInPartySize.getValue().toString();

        LocalDate currentDate1 = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        String currentDate = LocalDate.now().toString();
        // Update labels with the generated values
        lblCurrentDate.setText(currentDate1.toString());

        LocalTime openTime = LocalTime.of(0, 0);
        LocalTime closeTime = LocalTime.of(23, 59); 

        if (currentTime.isBefore(openTime) || currentTime.isAfter(closeTime)) {
            JOptionPane.showMessageDialog(null, "Reservations can only be made between 5:00 PM and 9:30 PM.", "Reservation Hours", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        walkin.walkInCustomer(WalkInfullName, WalkInemail, WalkIncontactNo, startTime, endTime, currentDate, partySize);
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_customerEnterActionPerformed

    private void setDate() {
        // Create a Timer to update the label every second
        javax.swing.Timer timer = new javax.swing.Timer(1000, e -> {
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            lblCurrentDate.setText(df.format(date));
        });
        timer.start(); // Start the timer
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LogInManagementForm managementlog = new LogInManagementForm();
        managementlog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void WalkInEndTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalkInEndTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WalkInEndTimeActionPerformed

    private void AlreadyReservedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlreadyReservedButtonActionPerformed
        VerifyReservationDetails verify = new VerifyReservationDetails();
        
        verify.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlreadyReservedButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlreadyReservedButton;
    private javax.swing.JTable CalendarForReservation;
    private javax.swing.JTextField ContactNoField;
    private javax.swing.JLabel ContactNumberLabel;
    private javax.swing.JLabel CustomerInformation;
    private javax.swing.JLabel EmailAddressLabel;
    private javax.swing.JTextField EmailField;
    private javax.swing.JButton EnterReservationButton;
    private javax.swing.JTextField FullNameField;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JButton NextMonthButton;
    private javax.swing.JSpinner PartySizeSpinner;
    private javax.swing.JButton PreviousMonthButton;
    private javax.swing.JComboBox<String> ReservationEndTime;
    private javax.swing.JPanel ReservationHandlingPanel;
    private javax.swing.JComboBox<String> ReservationStartTime;
    private javax.swing.JTextField SelectedDateDisplay;
    private javax.swing.JComboBox<String> WalkInEndTime;
    private javax.swing.JSpinner WalkInPartySize;
    private javax.swing.JTextField customerContactNoField;
    private javax.swing.JTextField customerEmailField;
    private javax.swing.JButton customerEnter;
    private javax.swing.JTextField customerFullNameField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCurrentDate;
    // End of variables declaration//GEN-END:variables

    private void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
