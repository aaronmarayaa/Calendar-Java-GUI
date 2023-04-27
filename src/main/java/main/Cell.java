package main;


import java.awt.Color;
import java.util.Date;
import javax.swing.JButton;

public class Cell extends JButton{
    
    private Date date;
    private boolean title;
    
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
}
