package main;

import java.awt.Component;
import java.util.Calendar;


public class DatePanel extends javax.swing.JPanel {
    
    private final int month;
    private final int year;
    
    public DatePanel(int month, int year) {
        this.month = month;
        this.year = year;
        
        initComponents();
        init();
    }
    
    private void init(){
        sun.asTitle();
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        setDate();
    }
    
    public void setDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        calendar.add(Calendar.DATE, -startDay);
        for (Component com : getComponents()) {
            Cell cell = (Cell) com;
            if (!cell.isTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                calendar.add(Calendar.DATE, 1);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new main.Cell();
        mon = new main.Cell();
        tue = new main.Cell();
        wed = new main.Cell();
        thu = new main.Cell();
        fri = new main.Cell();
        sat = new main.Cell();
        cell8 = new main.Cell();
        cell9 = new main.Cell();
        cell10 = new main.Cell();
        cell11 = new main.Cell();
        cell12 = new main.Cell();
        cell13 = new main.Cell();
        cell14 = new main.Cell();
        cell15 = new main.Cell();
        cell16 = new main.Cell();
        cell17 = new main.Cell();
        cell18 = new main.Cell();
        cell19 = new main.Cell();
        cell20 = new main.Cell();
        cell21 = new main.Cell();
        cell22 = new main.Cell();
        cell23 = new main.Cell();
        cell24 = new main.Cell();
        cell25 = new main.Cell();
        cell26 = new main.Cell();
        cell27 = new main.Cell();
        cell28 = new main.Cell();
        cell29 = new main.Cell();
        cell30 = new main.Cell();
        cell31 = new main.Cell();
        cell32 = new main.Cell();
        cell33 = new main.Cell();
        cell34 = new main.Cell();
        cell35 = new main.Cell();
        cell36 = new main.Cell();
        cell37 = new main.Cell();
        cell38 = new main.Cell();
        cell39 = new main.Cell();
        cell40 = new main.Cell();
        cell41 = new main.Cell();
        cell42 = new main.Cell();
        cell43 = new main.Cell();
        cell44 = new main.Cell();
        cell45 = new main.Cell();
        cell46 = new main.Cell();
        cell47 = new main.Cell();
        cell48 = new main.Cell();
        cell49 = new main.Cell();

        setBackground(new java.awt.Color(68, 68, 68));
        setLayout(new java.awt.GridLayout(7, 7));

        sun.setForeground(new java.awt.Color(204, 5, 5));
        sun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sun.setText("Sun");
        sun.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        add(sun);

        mon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mon.setText("Mon");
        mon.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        add(mon);

        tue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tue.setText("Tue");
        tue.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        add(tue);

        wed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wed.setText("Wed");
        wed.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        add(wed);

        thu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thu.setText("Thu");
        thu.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        add(thu);

        fri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fri.setText("Fri");
        fri.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        add(fri);

        sat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sat.setText("Sat");
        sat.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        add(sat);

        cell8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell8);

        cell9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell9);

        cell10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell10);

        cell11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell11);

        cell12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell12);

        cell13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell13);

        cell14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell14);

        cell15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell15);

        cell16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell16);

        cell17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell17);

        cell18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell18);

        cell19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell19);

        cell20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell20);

        cell21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell21);

        cell22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell22);

        cell23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell23);

        cell24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell24);

        cell25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell25);

        cell26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell26);

        cell27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell27);

        cell28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell28);

        cell29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell29);

        cell30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell30);

        cell31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell31);

        cell32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell32);

        cell33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell33);

        cell34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell34);

        cell35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell35);

        cell36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell36);

        cell37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell37);

        cell38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell38);

        cell39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell39);

        cell40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell40);

        cell41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell41);

        cell42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell42);

        cell43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell43);

        cell44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell44);

        cell45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell45);

        cell46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell46);

        cell47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell47);

        cell48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell48);

        cell49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.Cell cell10;
    private main.Cell cell11;
    private main.Cell cell12;
    private main.Cell cell13;
    private main.Cell cell14;
    private main.Cell cell15;
    private main.Cell cell16;
    private main.Cell cell17;
    private main.Cell cell18;
    private main.Cell cell19;
    private main.Cell cell20;
    private main.Cell cell21;
    private main.Cell cell22;
    private main.Cell cell23;
    private main.Cell cell24;
    private main.Cell cell25;
    private main.Cell cell26;
    private main.Cell cell27;
    private main.Cell cell28;
    private main.Cell cell29;
    private main.Cell cell30;
    private main.Cell cell31;
    private main.Cell cell32;
    private main.Cell cell33;
    private main.Cell cell34;
    private main.Cell cell35;
    private main.Cell cell36;
    private main.Cell cell37;
    private main.Cell cell38;
    private main.Cell cell39;
    private main.Cell cell40;
    private main.Cell cell41;
    private main.Cell cell42;
    private main.Cell cell43;
    private main.Cell cell44;
    private main.Cell cell45;
    private main.Cell cell46;
    private main.Cell cell47;
    private main.Cell cell48;
    private main.Cell cell49;
    private main.Cell cell8;
    private main.Cell cell9;
    private main.Cell fri;
    private main.Cell mon;
    private main.Cell sat;
    private main.Cell sun;
    private main.Cell thu;
    private main.Cell tue;
    private main.Cell wed;
    // End of variables declaration//GEN-END:variables
}
