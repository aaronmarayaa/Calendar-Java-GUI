package main;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JButton;

public class Cell extends JButton{
    
    private Date date;
    private boolean title;
    private boolean isToday;
    
    public Cell(){
        setContentAreaFilled(false);
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
    @Override
    protected void paintComponent(Graphics graphics){
        if(isToday){
            Graphics2D g2 = (Graphics2D)graphics;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(25,70,255));
            g2.fillRoundRect(25, 10, getWidth()-50, getHeight()-20, 50, 50);
        }
        super.paintComponent(graphics);
    }
}
