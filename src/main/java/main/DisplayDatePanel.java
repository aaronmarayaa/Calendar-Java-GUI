package main;

import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class DisplayDatePanel extends javax.swing.JPanel {
    
    private Component comExit;
    private Component comShow;
    
    public DisplayDatePanel() {
       initComponents();
    }
    
    public void show(Component com) {
        comShow = com;
        if(getComponentCount() == 0) {
            addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent ce) {
                    comShow.setSize(getSize());
                    revalidate();
                }
            });
            
            add(comShow);
            comExit = com;
        } else {
            comShow.setSize(getSize());
            add(comShow);
            removeSlide();
        }
    }
    
    private void removeSlide(){
        remove(comExit);
        comExit = comShow;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
