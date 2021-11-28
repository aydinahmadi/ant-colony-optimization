/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class draw extends javax.swing.JFrame {


    String color;
    int Animatian=1000;
  
    public draw() {
         this.color="#0000ff";
        initComponents();
    }

    public draw(String color,int Animatian){
        
           
        
        this.color=color;
        this.Animatian=Animatian;
        initComponents();
    }
      
   
        ArrayList<coordinate> arraylist = new ArrayList<>();
        Graph gr=new Graph(20);
    static int v=0;     
   int startX, startY;                     
   int prevX, prevY;
   int endX;
   int endY;
   boolean dragging = false;                    
   int destination;
   int origin;
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(600, 500));

        canvas1.setBackground(new java.awt.Color(255, 255, 255));
        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvas1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvas1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvas1MouseReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vertex", "Edge" }));

        jButton1.setText("Clear");
        jButton1.setPreferredSize(new java.awt.Dimension(57, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Sort");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DFS", "BFS" }));

        jLabel1.setText("Sort");

        jLabel2.setText("Draw");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Draw & Sort", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        menu m=new menu();
        m.setVisible(true);
              this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        canvas1.repaint();
        arraylist.clear();
        //clear the linked list
        gr.clear();

        v=0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void canvas1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseReleased

        if("Edge".equals(jComboBox1.getSelectedItem().toString())){
            Graphics g = canvas1.getGraphics();

            if (!dragging)  // Make sure that the drag operation has been properly started.
            return;
            g.drawLine(startX,startY,prevX,prevY);  // Erase the previous line.
            endX = evt.getX();  // Where the mouse was released.
            endY = evt.getY();
            //      g.setPaintMode();
            g.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
            //      g.dispose();  // Free the graphics context, now that the draw operation is over.
            for (coordinate arraylist1 : arraylist) {

                if (arraylist1.x < endX && endX < arraylist1.x + 25 && arraylist1.y - 25 < endY && endY < arraylist1.y +25) {

                    destination = arraylist1.item;

                }

            }

            System.out.println("destination"+ destination);
            try{
                gr.addEdge(origin,destination);
                System.out.println("DONE");
            }catch(Exception e){
                System.out.println("errorrrrrrrr");
            }

        }

    }//GEN-LAST:event_canvas1MouseReleased

    private void canvas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MousePressed

        if("Edge".equals(jComboBox1.getSelectedItem().toString())){
            Graphics g = canvas1.getGraphics();
            startX = evt.getX();
            startY = evt.getY();
            prevX = startX;
            prevY = startY;
            dragging = true;
            g = getGraphics();  // Get a graphics context for use while drawing.

            g.setXORMode(getBackground());
            g.drawLine(startX, startY, prevX, prevY);
            for (coordinate arraylist1 : arraylist) {
                if (arraylist1.x < startX && startX < arraylist1.x + 25 && arraylist1.y - 25 < startY && startY < arraylist1.y +25) {

                    origin = arraylist1.item;

                }
            }

            System.out.println("origin"+ origin);

        }

    }//GEN-LAST:event_canvas1MousePressed

    private void canvas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseClicked

        if("Vertex".equals(jComboBox1.getSelectedItem().toString())){
          
            Graphics g = canvas1.getGraphics();
            
            g.setColor(Color.decode(color));
            g.fillOval(evt.getX(),evt.getY(),40,40);
            
          
            int ex=evt.getX();
            int ey=evt.getY();
            g.setColor(Color.WHITE);
            g.drawString(""+v, ex+17,ey+21);
            coordinate c=new coordinate(evt.getX(),evt.getY(),v);
            arraylist.add(c);
            System.out.println(c.x+".."+c.y+".."+c.item);

            v=++v;

        }
        else{
            JOptionPane.showMessageDialog(this, "You can not add vertex", "Draw", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_canvas1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       gr.printGraph();
          String s=jComboBox3.getSelectedItem().toString();
        Graphics g = canvas1.getGraphics();
        String start =JOptionPane.showInputDialog("enter the start vertex:");
        int st=Integer.parseInt(start);
        switch(s){
            case "DFS" :
            float x;
            float y;
            int z=10;
           
            gr.DFS(st);
              g.drawString("DFS :",150+z,640);
            for(int i=0;i<v;i++){
                for (coordinate arraylist1 : arraylist){
                    if(gr.arr[i]==arraylist1.item){
                        x=arraylist1.x;
                        y=arraylist1.y;
                        g.setColor(Color.green);
                        g.fillOval((int)x,(int)y,40,40);
                        g.setColor(Color.white);
                        g.drawString(""+gr.arr[i],(int) x+17,(int)y+21);
                        g.setColor(Color.BLACK);
                         g.drawString(""+gr.arr[i],200+z,640);
                         z+=15;
                        
                        try {
                            Thread.sleep(Animatian);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(draw.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }
            }

            break;

            case "BFS" :

            float x1;
            float y1;
            int z2=10;
           
            gr.BFS(st);
            g.drawString("BFS :",150+z2,655);
            for(int i=0;i<v;i++){
                for (coordinate arraylist1 : arraylist){
                    if(gr.arr1[i]==arraylist1.item){
                        x1=arraylist1.x;
                        y1=arraylist1.y;
                        g.setColor(Color.pink);
                        g.fillOval((int)x1,(int)y1,40,40);
                        g.setColor(Color.white);
                        g.drawString(""+gr.arr1[i],(int) x1+17,(int)y1+21);
                         g.setColor(Color.BLACK);
                         g.drawString(""+gr.arr[i],200+z2,655);
                         z2+=15;
                        try {
                            Thread.sleep(Animatian);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(draw.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }
            }

            break;
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new draw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
