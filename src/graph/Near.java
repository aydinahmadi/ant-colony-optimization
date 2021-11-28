/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Near extends javax.swing.JFrame {

    String color;
    int Animatian=1000;
  
    public Near() {
         this.color="#0000ff";
        initComponents();
    }

    public Near(String color,int Animatian){
        
           
        
        this.color=color;
        this.Animatian=Animatian;
        initComponents();
    }
      
   
        ArrayList<coordinate> arraylist = new ArrayList<>();
        mgraph2 m=new mgraph2(20);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 600));

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

        jButton1.setText("Path");
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vertex", "Edge" }));

        jLabel1.setText("Draw");

        jLabel2.setText("Near");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Near Path", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
//            g.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
            //      g.dispose();  // Free the graphics context, now that the draw operation is over.
            for (coordinate arraylist1 : arraylist) {

                if (arraylist1.x < endX && endX < arraylist1.x + 25 && arraylist1.y - 25 < endY && endY < arraylist1.y +25) {

                    destination = arraylist1.item;
                         yy1= arraylist1.y;
                         xx1= arraylist1.x;
                }

            }
            g.drawLine(xx+15,yy+20,xx1+15,yy1+20);
            
           
          String name=JOptionPane.showInputDialog( "Enter the weight:");
  
         
          int n=Integer.parseInt(name);
          g.setColor(Color.red);
            if(m.array[destination][origin]==0){
            g.drawString("( " +n+ " )",(xx+xx1)/2,(yy+yy1)/2);
            
             g.drawString(" "+origin+" -> "+destination,(xx+xx1)/2+20,(yy+yy1)/2);
            }else{
                     g.drawString("( " +n+ " )",(xx+xx1)/2,(yy+yy1)/2+20);
            
             g.drawString(" "+origin+" -> "+destination,(xx+xx1)/2+20,(yy+yy1)/2+20);
                     }
             g.setColor(Color.black);
            
            System.out.println("destination"+ destination);
            try{
                m.addege(origin,destination,n);
                System.out.println("DONE");
            }catch(Exception e){
                System.out.println("errorrrrrrrr");
            }
          
            
            m.printGraph();
        
          }
        
        
        
    }//GEN-LAST:event_canvas1MouseReleased

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu m =new menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Graphics g = canvas1.getGraphics();
        //write dijkstra
         String s=JOptionPane.showInputDialog( "Enter the source vertex::");
       int source =Integer.parseInt(s);
        String s2=JOptionPane.showInputDialog( "Enter the destination vertex::");
        int desti=Integer.parseInt(s2);
        
        DijkstrasAlgorithm d=new DijkstrasAlgorithm(v);
        d.dijkstra(m.array, source, desti);
            
        for(int i=0;i<d.arraylist1.size();i++){
             for(int j=0;j<arraylist.size();j++)
            
                  if(d.arraylist1.get(i)==arraylist.get(j).item)
                  {
                      int x=arraylist.get(j).x;
                      int y=arraylist.get(j).y;
                       g.setColor(Color.green);
                        g.fillOval((int)x,(int)y,40,40);
                        g.setColor(Color.white);
                        g.drawString(""+arraylist.get(j).item,(int) x+17,(int)y+21);
                         try {
                            Thread.sleep(Animatian);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Near.class.getName()).log(Level.SEVERE, null, ex);
                        }
                         
                  }
                    g.setColor(Color.black);
        }
        
        for (int vertexIndex = 0; vertexIndex < m.v; vertexIndex++) 
		{ 
			if (vertexIndex != source && vertexIndex==desti) 
			{ 
				g.drawString(""+source,200,550);
                                g.drawString(" ->> ",215, 550);
				g.drawString(" "+desti,235,550); 
				g.drawString(" : "+d.count,246,550); 
				
                             
                               
			} 
		} 
      
        
        
        
        
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
            java.util.logging.Logger.getLogger(Near.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Near.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Near.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Near.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Near().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
