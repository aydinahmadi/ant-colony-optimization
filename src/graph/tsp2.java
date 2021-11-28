/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

import static graph.Tsp.v;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class tsp2 extends javax.swing.JFrame {

    String color;
    int Animatian=1000;
  
    public tsp2() {
         this.color="#0000ff";
        initComponents();
    }

    public tsp2(String color,int Animatian){
        
           
        
        this.color=color;
        this.Animatian=Animatian;
        initComponents();
    }
    
        ArrayList<coordinate> arraylist = new ArrayList<>();
        Graphh m=new Graphh(30);
    static int v=0;     
   int startX, startY;                     
   int prevX, prevY;
   int endX;
   int endY;
   boolean dragging = false;                    
   int destination;
   int origin;
    int yy,xx=0;
    int yy1,xx1=0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButton1.setText("Tsp");
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

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(84, 84, 84)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Tsp AntColony", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canvas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseClicked
       if("Vertex".equals(jComboBox1.getSelectedItem().toString())){
          
            Graphics g = canvas1.getGraphics();
            
            g.setColor(Color.decode(color));
            g.fillOval(evt.getX(),evt.getY(),40,40);
            
          
            int ex=evt.getX();
            int ey=evt.getY();
            g.setColor(Color.WHITE);
           v=++v;
            g.drawString(""+v, ex+17,ey+21);
            coordinate c=new coordinate(evt.getX(),evt.getY(),v);
            arraylist.add(c);
            System.out.println(c.x+".."+c.y+".."+c.item);

          

        }
        else{
            JOptionPane.showMessageDialog(this, "You can not add vertex", "Tsp", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_canvas1MouseClicked

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
//            g.drawLine(startX, startY, prevX, prevY);
            for (coordinate arraylist1 : arraylist) {
                if (arraylist1.x < startX && startX < arraylist1.x + 25 && arraylist1.y - 25 < startY && startY < arraylist1.y +25) {

                    origin = arraylist1.item;
                         yy= arraylist1.y;
                         xx= arraylist1.x;
                }
            }

            
            System.out.println("origin"+ origin);

        }
        
    }//GEN-LAST:event_canvas1MousePressed

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

                if (arraylist1.x < endX && endX < arraylist1.x + 40 && arraylist1.y  < endY && endY < arraylist1.y +40) {

                    destination = arraylist1.item;
                      
                }

            }
            
//            Stroke stroke = new BasicStroke(2f);
//             Graphics2D g2d = (Graphics2D) g;
//            g2d.setStroke(stroke);

//            int[]x = new int[3];
//            int[]y = new int[3];
//            int n=3;  // count of points
////            xx=xx+17;
////            yy=yy+21;
//            x[0]=endX;y[0]=endY;
//            //حالت اول
//            if(xx < endX && yy > endY ){
//                if( endX-xx <60 ){
//                    x[1]=endX+10; x[2]=endX-10;
//                    y[1]=endY+10; y[2]=endY+10;
//                }
////                if(yy-endY <60){
////                 x[1]=endX-10; x[2]=endX-10;
////                 y[1]=endY-10; y[2]=endY+10;
////                }
//                else{
//                 x[1]=endX; x[2]=endX-13;
//                 y[1]=endY+13; y[2]=endY;
//                }
//            }
//            //حالت دوم
//            if(xx > endX && yy < endY){
//                if(xx-endX < 60){
//                 x[1]=endX+10; x[2]=endX-10;
//                 y[1]=endY-10; y[2]=endY-10;
//                }
////                if(endY-yy <60){
////                 x[1]=endX+10; x[2]=endX+10;
////                 y[1]=endY-10; y[2]=endY+10;
////                }
//                else{
//                 x[1]=endX; x[2]=endX+13;
//                 y[1]=endY-13; y[2]=endY;
//                }
//            }
//            //ok
//            //حالت سوم
//            if(xx < endX && yy < endY ){
//                if(endY-yy <50){
//                 x[1]=endX-10; x[2]=endX-10;
//                 y[1]=endY-10; y[2]=endY+10;
//                }
//                else{
//                 x[1]=endX; x[2]=endX-13;
//                 y[1]=endY-13; y[2]=endY;
//                }
//            }
//            //حالت چهارم
//            if(xx > endX && yy > endY ){
//                if(yy-endY<50){
//                 x[1]=endX+13; x[2]=endX+13;
//                 y[1]=endY-10; y[2]=endY+10;
//                }
////                if(xx-endX < 60){
////                     x[1]=endX-10; x[2]=endX+10;
////                     y[1]=endY+10; y[2]=endY+10;
////                }
//                else{
//                 x[1]=endX; x[2]=endX+13;
//                 y[1]=endY+13; y[2]=endY;
//                }
//            }
//            
            
         

//              Polygon myTri = new Polygon(x, y, n);  // a triangle
//              g.fillPolygon(myTri);
                String name=JOptionPane.showInputDialog( "Enter the weight:");
  
         
          int nn=Integer.parseInt(name);
             g.setColor(Color.red);
          //increase the size 
              
            g.drawString(" "+nn,(xx+endX)/2,(yy+endY)/2);
             
               System.out.println("destination"+ destination);
            try{
                
                m.addege(origin,destination,nn);
                System.out.println("DONE");
            }catch(Exception e){
                System.out.println("erorr");
            }
          
           
         }
    }//GEN-LAST:event_canvas1MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         menu m =new menu();
        m.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         canvas1.repaint();
         arraylist.clear();
         m.clear();
          v=1;
         
         
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Graphics g = canvas1.getGraphics();
     
         System.out.println(v);
     int a[][]=new int[v+2][v+2];
           for(int i=1;i<=v;i++){
             for(int j=1;j<=v;j++){
                 if(m.adjacencyMatrix[i][j]!=0 && i!=j){
                     a[i][j]=m.adjacencyMatrix[i][j];
                 }
             }
         }
           System.out.println(v);
           for(int i=0;i<=v;i++){
             for(int j=0;j<=v;j++){
                 System.out.print(m.adjacencyMatrix[i][j]);
             }
              System.out.println();
           }
           System.out.println();
         for(int i=1;i<=v+1;i++){
             for(int j=1;j<=v+1;j++){
                 System.out.print(a[i][j]);
             }
             System.out.println();
         }
          
           
           Graphh graph = new Graphh(v, a);
        Salesman salesman = new Salesman(v, 20, graph);
        String name=JOptionPane.showInputDialog( "enter the amount of alpha:");
          double n=Double.parseDouble(name);
           
          String name1=JOptionPane.showInputDialog( "enter the amount of beta");
          double nm=Double.parseDouble(name1);
          
           String name2=JOptionPane.showInputDialog( "enter the amount of vaporize");
          double o=Double.parseDouble(name2);
          salesman.alpha=n;
          salesman.beta=nm;
          salesman.vaporize=0;
         salesman.startAlgorithm();
              int z=20;
              for(int i=0;i<v;i++){
                   for(int j=0;j<arraylist.size();j++){
                        if(salesman.maxTraveled[i]==arraylist.get(j).item)
                  {
                      int x=arraylist.get(j).x;
                      int y=arraylist.get(j).y;
                       g.setColor(Color.green);
                        g.fillOval((int)x,(int)y,40,40);
                        g.setColor(Color.white);
                        g.drawString(""+arraylist.get(j).item,(int) x+17,(int)y+21);
                        g.setColor(Color.black);
                         g.drawString(""+salesman.maxTraveled[i],200+z,550);
                        z+=20;
                         try {
                            Thread.sleep(Animatian);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(tsp2.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                  }
                    g.setColor(Color.black);
                   }
              }
        
         g.drawString("Cost : "+(int)salesman.maxTravaledDistance,200,580);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tsp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tsp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tsp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tsp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tsp2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
