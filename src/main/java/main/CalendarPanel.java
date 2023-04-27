package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPanel extends javax.swing.JPanel {
    
    private int month;
    private int year;
    
    public CalendarPanel() {
        initComponents();
        thisMonth();
        showMonthYear();
        displayDate.show(new DatePanel(month, year));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmdPrev = new javax.swing.JButton();
        monthLabel = new javax.swing.JLabel();
        cmdNext = new javax.swing.JButton();
        displayDate = new main.DisplayDatePanel();
        yearLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(42, 71, 13));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));

        cmdPrev.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\prev.png")); // NOI18N
        cmdPrev.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdPrev.setContentAreaFilled(false);
        cmdPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrevActionPerformed(evt);
            }
        });

        monthLabel.setBackground(new java.awt.Color(255, 255, 255));
        monthLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        monthLabel.setForeground(new java.awt.Color(239, 237, 239));
        monthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monthLabel.setText("Month ");

        cmdNext.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\next-removebg-preview.png")); // NOI18N
        cmdNext.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdNext.setContentAreaFilled(false);
        cmdNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdNext, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdPrev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(displayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        yearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(42, 71, 13));
        yearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearLabel.setText("Year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNextActionPerformed
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        displayDate.show(new DatePanel(month, year));
        showMonthYear();// TODO add your handling code here:
    }//GEN-LAST:event_cmdNextActionPerformed

    private void cmdPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrevActionPerformed
        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        displayDate.show(new DatePanel(month, year));
        showMonthYear();
    }//GEN-LAST:event_cmdPrevActionPerformed
     public void thisMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());   //  today
        month = calendar.get(Calendar.MONTH) + 1;
        year = calendar.get(Calendar.YEAR);
    }
    private void showMonthYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DATE, 1);
        SimpleDateFormat currentMonth = new SimpleDateFormat("MMMM");
        monthLabel.setText(currentMonth.format(calendar.getTime()));
        SimpleDateFormat currentYear = new SimpleDateFormat("yyyy");
        yearLabel.setText(currentYear.format(calendar.getTime()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdNext;
    private javax.swing.JButton cmdPrev;
    private main.DisplayDatePanel displayDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
