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
        setLayout(null);

        monthLabel.setBackground(new java.awt.Color(255, 255, 255));
        monthLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        monthLabel.setForeground(new java.awt.Color(153, 153, 153));
        monthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monthLabel.setText("Month Year ");
        add(monthLabel);
        monthLabel.setBounds(450, 10, 330, 42);

        prevButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\prev.png")); // NOI18N
        prevButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        prevButton.setContentAreaFilled(false);
        prevButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        add(prevButton);
        prevButton.setBounds(330, 10, 83, 42);

        nextButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\arrow-right (1).png")); // NOI18N
        nextButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nextButton.setContentAreaFilled(false);
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        add(nextButton);
        nextButton.setBounds(780, 10, 76, 42);
        add(displayDate);
        displayDate.setBounds(330, 60, 530, 280);
        add(clock1);
        clock1.setBounds(0, 0, 330, 340);
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
    public final void thisMonth() {
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
