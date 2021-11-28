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
public class random extends javax.swing.JFrame {

  
    public random() {
        
          arr[0]=5; arr[1]=7; arr[2]=10;arr[3]=2; 
        arr[4]=9;arr[5]=4;  arr[6]=16; arr[7]=12;
       int v=0;
       
       int x[]={68,212,73,297,173,398,452,550,546,92,318,234,459,388,76,206,522};
       int y[]={101,300,311,143,204,275,119,225,360,440,369,467,410,496,545,626,566};
      
       for(int i=0;i<8;i++){
           
               for(int j=1;j<=arr[i];j++){
                    coordinate c=new coordinate(x[j-1],y[j-1],v);
                 
                    v++;
                   switch(arr[i]){
                       case 5:
                           arraylist1.add(c);
                           break;
                        case 7:
                           arraylist2.add(c);
                           break;
                       case 10:
                           arraylist3.add(c);
                           break;
                       case 2:
                           arraylist4.add(c);
                           break;
                        case 9:
                           arraylist5.add(c);
                           break;
                        case 4:
                           arraylist6.add(c);
                           break;
                        case 16:
                           arraylist7.add(c);
                           break;
                        case 12:
                           arraylist8.add(c);
                           break;
                        
                            
                        
               }
           }
               v=0;
               
       }
       
         gr1.addEdge(0, 1);gr1.addEdge(1, 2);
         gr1.addEdge(2, 3); gr1.addEdge(3, 4);
         ////
       gr2.addEdge(0, 2); gr2.addEdge(2, 1);gr2.addEdge(2, 3); 
       gr2.addEdge(3, 1); gr2.addEdge(3, 4); gr2.addEdge(4, 5);
       gr2.addEdge(5, 6);
       //////////
       gr3.addEdge(0, 3); gr3.addEdge(3, 1); gr3.addEdge(1, 2);
       gr3.addEdge(4, 5); gr3.addEdge(3, 5); gr3.addEdge(4, 6);
       gr3.addEdge(4, 7); gr3.addEdge(7, 8); gr3.addEdge(8, 9);
       //////////
      gr4.addEdge(0, 1);
       /////////
       gr5.addEdge(0, 3);gr5.addEdge(0, 1);gr5.addEdge(0, 2);
       gr5.addEdge(3, 4);gr5.addEdge(3, 5);gr5.addEdge(3, 6);
       gr5.addEdge(6, 7);gr5.addEdge(6, 8);
       /////////
       gr6.addEdge(0, 3);  gr6.addEdge(3, 2);  gr6.addEdge(0, 1);
       /////////
       gr7.addEdge(0, 2);gr7.addEdge(1, 5);gr7.addEdge(2, 1);
       gr7.addEdge(3, 1);gr7.addEdge(7, 8);gr7.addEdge(6, 9);gr7.addEdge(5, 4);
       gr7.addEdge(6, 7);gr7.addEdge(9, 10);gr7.addEdge(9, 12);gr7.addEdge(13, 14);
       gr7.addEdge(8, 11);gr7.addEdge(12, 13);gr7.addEdge(13, 11);gr7.addEdge(14, 15);
       //////////
       gr8.addEdge(0, 2); gr8.addEdge(1, 3); gr8.addEdge(2, 1);
       gr8.addEdge(4, 6); gr8.addEdge(5, 8); gr8.addEdge(7, 4);
       gr8.addEdge(9, 10); gr8.addEdge(11, 10); gr8.addEdge(6, 10);
       
       
        initComponents(); 
    }

   Graph gr1=new Graph(5);
    Graph gr2=new Graph(7);
     Graph gr3=new Graph(10);
      Graph gr4=new Graph(2);
       Graph gr5=new Graph(9);
        Graph gr6=new Graph(4);
         Graph gr7=new Graph(16);
          Graph gr8=new Graph(12);
         
           int arr[]=new int[8];
  
  ArrayList<coordinate> arraylist1 = new ArrayList<>();
  ArrayList<coordinate> arraylist2= new ArrayList<>();
  ArrayList<coordinate> arraylist3 = new ArrayList<>();
  ArrayList<coordinate> arraylist4 = new ArrayList<>();
  ArrayList<coordinate> arraylist5 = new ArrayList<>();
  ArrayList<coordinate> arraylist6 = new ArrayList<>();
  ArrayList<coordinate> arraylist7 = new ArrayList<>();
  ArrayList<coordinate> arraylist8 = new ArrayList<>();
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        canvas1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("random");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Random", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
      
      
        Graphics g = canvas1.getGraphics();
       

    double r=Math.random()*9;
     int r1=(int)r;
     System.out.println(r1);
        switch(r1){
                       case 1:
       
           for (int i = 0; i <arr[0] ; i++) {
                     if(gr1.list[i].size()>0) {
                               g.setColor(Color.red);
                                 System.out.print("Vertex " + i + " is connected to: ");
                                   g.fillOval(arraylist1.get(i).x,arraylist1.get(i).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                      g.drawString(""+i, arraylist1.get(i).x+17,arraylist1.get(i).y+21);
                     
                          for (int j = 0; j < gr1.list[i].size(); j++) {
                     
                                  System.out.print(gr1.list[i].get(j) + " ");
                                     g.setColor(Color.red);
                                     g.fillOval(arraylist1.get(gr1.list[i].get(j)).x,arraylist1.get(gr1.list[i].get(j)).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                     g.drawString(""+gr1.list[i].get(j), arraylist1.get(gr1.list[i].get(j)).x+17,arraylist1.get(gr1.list[i].get(j)).y+21);
                      
                                     g.setColor(Color.black);
                                     g.drawLine(arraylist1.get(i).x+15,arraylist1.get(i).y+15,arraylist1.get(gr1.list[i].get(j)).x+15,arraylist1.get(gr1.list[i].get(j)).y+15);
                              
                          }
                          
                        System.out.println();
                     }
                }
                           
   
                           break;
                        case 2:
                         
             for (int i = 0; i <arr[1] ; i++) {
                     if(gr2.list[i].size()>0) {
                               g.setColor(Color.red);
                                 System.out.print("Vertex " + i + " is connected to: ");
                                   g.fillOval(arraylist2.get(i).x,arraylist2.get(i).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                      g.drawString(""+i, arraylist2.get(i).x+17,arraylist2.get(i).y+21);
                      
                          for (int j = 0; j < gr2.list[i].size(); j++) {
                                  System.out.print(gr2.list[i].get(j) + " ");
                     
                                     g.setColor(Color.red);
                                     g.fillOval(arraylist2.get(gr2.list[i].get(j)).x,arraylist2.get(gr2.list[i].get(j)).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                     g.drawString(""+gr2.list[i].get(j), arraylist2.get(gr2.list[i].get(j)).x+17,arraylist2.get(gr2.list[i].get(j)).y+21);
                              
                                     g.setColor(Color.black);
                                     g.drawLine(arraylist2.get(i).x+15,arraylist2.get(i).y+15,arraylist2.get(gr2.list[i].get(j)).x+15,arraylist2.get(gr2.list[i].get(j)).y+15);
                                
                          
                          }
                        System.out.println();
                     }
                }    
                            
             
                           break;
                       case 3:
                          
                           
              for (int i = 0; i <arr[2] ; i++) {
                     if(gr3.list[i].size()>0) {
                               g.setColor(Color.red);
                                 System.out.print("Vertex " + i + " is connected to: ");
                                   g.fillOval(arraylist3.get(i).x,arraylist3.get(i).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                      g.drawString(""+i, arraylist3.get(i).x+17,arraylist3.get(i).y+21);
                               
                          for (int j = 0; j < gr3.list[i].size(); j++) {
                                  System.out.print(gr3.list[i].get(j) + " ");
                               
                                     g.setColor(Color.red);
                                     g.fillOval(arraylist3.get(gr3.list[i].get(j)).x,arraylist3.get(gr3.list[i].get(j)).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                     g.drawString(""+gr3.list[i].get(j), arraylist3.get(gr3.list[i].get(j)).x+17,arraylist3.get(gr3.list[i].get(j)).y+21);
                            
                                     g.setColor(Color.black);
                                     g.drawLine(arraylist3.get(i).x+15,arraylist3.get(i).y+15,arraylist3.get(gr3.list[i].get(j)).x+15,arraylist3.get(gr3.list[i].get(j)).y+15);
                       
                          }
                        System.out.println();
                     }
                }
 
                           break;
                       case 4:
                           
             
                           
               for (int i = 0; i <arr[3] ; i++) {
                     if(gr4.list[i].size()>0) {
                               g.setColor(Color.red);
                                 System.out.print("Vertex " + i + " is connected to: ");
                                   g.fillOval(arraylist4.get(i).x,arraylist4.get(i).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                      g.drawString(""+i, arraylist4.get(i).x+17,arraylist4.get(i).y+21);
                            
                          for (int j = 0; j < gr4.list[i].size(); j++) {
                                  System.out.print(gr4.list[i].get(j) + " ");
                             
                                     g.setColor(Color.red);
                                     g.fillOval(arraylist4.get(gr4.list[i].get(j)).x,arraylist4.get(gr4.list[i].get(j)).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                     g.drawString(""+gr4.list[i].get(j), arraylist4.get(gr4.list[i].get(j)).x+17,arraylist4.get(gr4.list[i].get(j)).y+21);
                              
                                     g.setColor(Color.black);
                                     g.drawLine(arraylist4.get(i).x+15,arraylist4.get(i).y+15,arraylist4.get(gr4.list[i].get(j)).x+15,arraylist4.get(gr4.list[i].get(j)).y+15);
                            
                          }
                        System.out.println();
                     }
                }                   
                           
                           break;
                        case 5:
                          
                            
                 for (int i = 0; i <arr[4] ; i++) {
                     if(gr5.list[i].size()>0) {
                               g.setColor(Color.red);
                                 System.out.print("Vertex " + i + " is connected to: ");
                                   g.fillOval(arraylist5.get(i).x,arraylist5.get(i).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                      g.drawString(""+i, arraylist5.get(i).x+17,arraylist5.get(i).y+21);
                                      
                             
                          for (int j = 0; j < gr5.list[i].size(); j++) {
                                  System.out.print(gr5.list[i].get(j) + " ");
                               
                                     g.setColor(Color.red);
                                     g.fillOval(arraylist5.get(gr5.list[i].get(j)).x,arraylist5.get(gr5.list[i].get(j)).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                     g.drawString(""+gr5.list[i].get(j), arraylist5.get(gr5.list[i].get(j)).x+17,arraylist5.get(gr5.list[i].get(j)).y+21);
                              
                                     g.setColor(Color.black);
                                     g.drawLine(arraylist5.get(i).x+15,arraylist5.get(i).y+15,arraylist5.get(gr5.list[i].get(j)).x+15,arraylist5.get(gr5.list[i].get(j)).y+15);
                           
                          }
                        System.out.println();
                     }
                }             
                                
                           break;
                        case 6:
                         
                            
                   for (int i = 0; i <arr[5] ; i++) {
                     if(gr6.list[i].size()>0) {
                               g.setColor(Color.red);
                                 System.out.print("Vertex " + i + " is connected to: ");
                                   g.fillOval(arraylist6.get(i).x,arraylist6.get(i).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                      g.drawString(""+i, arraylist6.get(i).x+17,arraylist6.get(i).y+21);
                                      
                                
                          for (int j = 0; j < gr6.list[i].size(); j++) {
                                  System.out.print(gr6.list[i].get(j) + " ");
                               
                                     g.setColor(Color.red);
                                     g.fillOval(arraylist6.get(gr6.list[i].get(j)).x,arraylist6.get(gr6.list[i].get(j)).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                     g.drawString(""+gr6.list[i].get(j), arraylist6.get(gr6.list[i].get(j)).x+17,arraylist6.get(gr6.list[i].get(j)).y+21);
                              
                                     g.setColor(Color.black);
                                     g.drawLine(arraylist6.get(i).x+15,arraylist6.get(i).y+15,arraylist6.get(gr6.list[i].get(j)).x+15,arraylist6.get(gr6.list[i].get(j)).y+15);
                        
                          }
                        System.out.println();
                     }
                }           
                            
                   
                           break;
                        case 7:
                         
                            
                   for (int i = 0; i <arr[6] ; i++) {
                     if(gr7.list[i].size()>0) {
                               g.setColor(Color.red);
                                 System.out.print("Vertex " + i + " is connected to: ");
                                   g.fillOval(arraylist7.get(i).x,arraylist7.get(i).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                      g.drawString(""+i, arraylist7.get(i).x+17,arraylist7.get(i).y+21);
                                  
                          for (int j = 0; j < gr7.list[i].size(); j++) {
                                  System.out.print(gr7.list[i].get(j) + " ");
                                 
                                     g.setColor(Color.red);
                                     g.fillOval(arraylist7.get(gr7.list[i].get(j)).x,arraylist7.get(gr7.list[i].get(j)).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                     g.drawString(""+gr7.list[i].get(j), arraylist7.get(gr7.list[i].get(j)).x+17,arraylist7.get(gr7.list[i].get(j)).y+21);
                             
                                     g.setColor(Color.black);
                                     g.drawLine(arraylist7.get(i).x+15,arraylist7.get(i).y+15,arraylist7.get(gr7.list[i].get(j)).x+15,arraylist7.get(gr7.list[i].get(j)).y+15);
                          
                          }
                        System.out.println();
                     }
                }           
                            
      
                           break;
                        case 8:
                         
                  for (int i = 0; i <arr[7] ; i++) {
                     if(gr8.list[i].size()>0) {
                               g.setColor(Color.red);
                                 System.out.print("Vertex " + i + " is connected to: ");
                                   g.fillOval(arraylist8.get(i).x,arraylist8.get(i).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                      g.drawString(""+i, arraylist8.get(i).x+17,arraylist8.get(i).y+21);
                                 
                          for (int j = 0; j < gr8.list[i].size(); j++) {
                                  System.out.print(gr8.list[i].get(j) + " ");
                                  
                                     g.setColor(Color.red);
                                     g.fillOval(arraylist8.get(gr8.list[i].get(j)).x,arraylist8.get(gr8.list[i].get(j)).y, 40, 40);
                                     g.setColor(Color.WHITE);
                                     g.drawString(""+gr8.list[i].get(j), arraylist8.get(gr8.list[i].get(j)).x+17,arraylist8.get(gr8.list[i].get(j)).y+21);
                                
                                     
                                     g.setColor(Color.black);
                                     g.drawLine(arraylist8.get(i).x+15,arraylist8.get(i).y+15,arraylist8.get(gr8.list[i].get(j)).x+15,arraylist8.get(gr8.list[i].get(j)).y+15);
                            
                          }
                        System.out.println();
                     }
                }            
                            
                               break;
                        case 0:
                             JOptionPane.showMessageDialog(this, "Poch!:)", "Random", JOptionPane.INFORMATION_MESSAGE);
                            
                        
               }
         
     
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
          canvas1.repaint();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menu m =new menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new random().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
