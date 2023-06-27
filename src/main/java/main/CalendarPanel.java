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

        monthLabel = new javax.swing.JLabel();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        displayDate = new main.DisplayDatePanel();
        clock1 = new main.Clock();

        setBackground(new java.awt.Color(68, 68, 68));

        monthLabel.setBackground(new java.awt.Color(255, 255, 255));
        monthLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        monthLabel.setForeground(new java.awt.Color(153, 153, 153));
        monthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monthLabel.setText("Month Year ");

        prevButton.setIcon(new javax.swing.ImageIcon("C:\\Programming\\Netbeans\\Calendar\\images\\arrow-left.png")); // NOI18N
        prevButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        prevButton.setContentAreaFilled(false);
        prevButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        nextButton.setIcon(new javax.swing.ImageIcon("C:\\Programming\\Netbeans\\Calendar\\images\\arrow-right.png")); // NOI18N
        nextButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nextButton.setContentAreaFilled(false);
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayDateLayout = new javax.swing.GroupLayout(displayDate);
        displayDate.setLayout(displayDateLayout);
        displayDateLayout.setHorizontalGroup(
            displayDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        displayDateLayout.setVerticalGroup(
            displayDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(clock1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prevButton, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addComponent(monthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(displayDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthLabel)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(displayDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(clock1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        displayDate.show(new DatePanel(month, year));
        showMonthYear();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        displayDate.show(new DatePanel(month, year));
        showMonthYear();
    }//GEN-LAST:event_prevButtonActionPerformed
    
    private void thisMonth() {
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
        SimpleDateFormat currentMonth = new SimpleDateFormat("MMMM yyyy");
        monthLabel.setText(currentMonth.format(calendar.getTime()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.Clock clock1;
    private main.DisplayDatePanel displayDate;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    // End of variables declaration//GEN-END:variables
}
