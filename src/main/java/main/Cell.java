package main;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.Timer;

public class Cell extends javax.swing.JLabel{
    
    private Date date;
    private boolean title;
    private boolean isToday;
    private final Timer timer;
    
    public Cell(){
        timer = new Timer(1000, e -> { 
            updateDayMarking();
        });
        timer.setInitialDelay(0);
        timer.start();  
        repaint();
    }
    
    public void asTitle(){
        title = true;
    }
    
    public boolean isTitle(){
        return title;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public void currentMonth(boolean daysOfCurrentMonth){
        if(daysOfCurrentMonth){
            setForeground(new Color(0, 0, 0));
        }
        else
            setForeground(new Color(169,169, 169));
    }
    
    public void setToday(boolean isToday){
        this.isToday = isToday;
    }
    
    private void updateDayMarking(){
        LocalDate currentDate = LocalDate.now();
    
        if (date != null) {
            LocalDate cellDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            isToday = currentDate.equals(cellDate);
            repaint();
        }
    }
    
    @Override
    protected void paintComponent(Graphics graphics){
        if(!isTitle()){
            Graphics2D border = (Graphics2D) graphics.create();
            border.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            border.setColor(new Color(175, 175, 175));
            border.setStroke(new BasicStroke(0.5f));
            border.drawRoundRect(10, 5, getWidth()-20, getHeight()-10, 25, 25);    
        }
        if(isToday){
            Graphics2D dayMarking = (Graphics2D)graphics;
            dayMarking.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            dayMarking.setColor(new Color(25,70,255));
            dayMarking.fillRoundRect(25, 10, getWidth()-50, getHeight()-20, 50, 50);
        } 
        super.paintComponent(graphics);
    }
}
