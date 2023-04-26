package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarCustom extends javax.swing.JPanel {
    
    private int month;
    private int year;
    
    public CalendarCustom() {
        initComponents();
        thisMonth();
        showMonthYear();
        slide.show(new PanelDate(month, year));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdNext = new javax.swing.JButton();
        lbMonthYear = new javax.swing.JLabel();
        cmdPrev = new javax.swing.JButton();
        slide = new main.PanelSlide();

        cmdNext.setText("Next");
        cmdNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNextActionPerformed(evt);
            }
        });

        lbMonthYear.setBackground(new java.awt.Color(255, 255, 255));
        lbMonthYear.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbMonthYear.setForeground(new java.awt.Color(243, 51, 51));
        lbMonthYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMonthYear.setText("Month - Year");

        cmdPrev.setText("Prev");
        cmdPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMonthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdNext, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMonthYear)
                    .addComponent(cmdNext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNextActionPerformed
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        slide.show(new PanelDate(month, year));
        showMonthYear();// TODO add your handling code here:
    }//GEN-LAST:event_cmdNextActionPerformed
    private void cmdPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrevActionPerformed
        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        slide.show(new PanelDate(month, year));
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
        SimpleDateFormat monthYear = new SimpleDateFormat("MMMM-yyyy");
        lbMonthYear.setText(monthYear.format(calendar.getTime()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdNext;
    private javax.swing.JButton cmdPrev;
    private javax.swing.JLabel lbMonthYear;
    private main.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
