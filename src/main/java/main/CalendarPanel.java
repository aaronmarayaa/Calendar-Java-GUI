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
        cmdPrev = new javax.swing.JButton();
        cmdNext = new javax.swing.JButton();
        displayDate = new main.DisplayDatePanel();
        clock1 = new main.Clock();

        setBackground(new java.awt.Color(68, 68, 68));
        setLayout(null);

        monthLabel.setBackground(new java.awt.Color(255, 255, 255));
        monthLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        monthLabel.setForeground(new java.awt.Color(153, 153, 153));
        monthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monthLabel.setText("Month Year ");
        add(monthLabel);
        monthLabel.setBounds(450, 10, 330, 42);

        cmdPrev.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\prev.png")); // NOI18N
        cmdPrev.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdPrev.setContentAreaFilled(false);
        cmdPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrevActionPerformed(evt);
            }
        });
        add(cmdPrev);
        cmdPrev.setBounds(330, 10, 83, 42);

        cmdNext.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\arrow-right (1).png")); // NOI18N
        cmdNext.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdNext.setContentAreaFilled(false);
        cmdNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNextActionPerformed(evt);
            }
        });
        add(cmdNext);
        cmdNext.setBounds(780, 10, 76, 42);
        add(displayDate);
        displayDate.setBounds(330, 60, 530, 280);
        add(clock1);
        clock1.setBounds(0, 0, 330, 340);
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
        SimpleDateFormat currentMonth = new SimpleDateFormat("MMMM yyyy");
        monthLabel.setText(currentMonth.format(calendar.getTime()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.Clock clock1;
    private javax.swing.JButton cmdNext;
    private javax.swing.JButton cmdPrev;
    private main.DisplayDatePanel displayDate;
    private javax.swing.JLabel monthLabel;
    // End of variables declaration//GEN-END:variables
}
