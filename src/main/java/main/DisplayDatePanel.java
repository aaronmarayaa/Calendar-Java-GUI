package main;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Timer;

public class DisplayDatePanel extends javax.swing.JPanel {
    
    public DisplayDatePanel() {
       initComponents();
       setLayout(null);
       addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent ce) {
                comShow.setSize(getSize());
                add(comShow);
                comExit = comShow;
                repaint();
                revalidate();
            }
        });
        timer = new Timer(0, (ActionEvent evt) -> {
            animate();
       });
    }

    private final Timer timer;
    private Component comExit;
    private Component comShow;

    public void show(Component com) {
        if (!timer.isRunning()) {
            this.comShow = com;
            com.setSize(getSize());
            if (getComponentCount() == 0) {
                add(com);
                comExit = com;
                repaint();
                revalidate();
            } else {
                comShow.setLocation(getWidth(), 0);
                add(com);
                repaint();
                revalidate();
                timer.start();
            }
        }
    }

    private void animate() {
        comShow.setLocation(0, 0);
        comExit.setLocation(getWidth(), 0);
        timer.stop();
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
