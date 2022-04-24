package filosofos;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Usuario 1
 */
public class NewJFrame extends javax.swing.JFrame {
    
    ImagenFondo fondo = new ImagenFondo();
    JLabel imagen = new JLabel();
    Border border = BorderFactory.createLineBorder(Color.WHITE);
    Border border2 = BorderFactory.createLineBorder(Color.BLUE, 4, true);
    Panel Panel1 = new Panel();
    ArrayList<JLabel> listaLabel = new ArrayList();
    ArrayList<Filosofo> listaProcesos = new ArrayList();
    ArrayList<JLabel> listatenedores = new ArrayList();
    Monitor monitor = Monitor.getInstance();
    IdFilosofo idF = new IdFilosofo();
    
    int anterior =0,actual=0;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        this.setContentPane(fondo);
        NewJFrame.this.setUndecorated(true);
        initComponents();
        idF.start();
        NewJFrame.this.setLocationRelativeTo(null);
        NewJFrame.this.setBackground(new Color(0, 0, 0, 0));
        NewJFrame.this.setVisible(true);
        fSTexFieldMD2.setText("");
    }
    
    public class IdFilosofo extends Thread{
        public Boolean encendido = false;
        
        public void apagar() {
            this.encendido = false;
        }
        
        public void encender() {
            this.encendido = true;
        }
        
        @Override
        public void run(){
            
            while(true) {
                                        System.out.print("");

                if(encendido){
                                            System.out.print("");

                for (int i = 0; i < monitor.getListaFilosofos().size(); i++) {
                    if (monitor.getListaFilosofos().get(i).getComiendo()) {
                        System.out.print("");
                         listaLabel.get(i).setBorder(border2);

                    } else {
                          listaLabel.get(i).setBorder(border);
                    }
                    if (monitor.getListaTenedores().get(i).getIsActive()) {
                         listatenedores.get(i).setBorder(border2);

                    } else {
                          listatenedores.get(i).setBorder(border);
                    }
                }
                    try {
                        sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            }
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel1 = new LIB.FSGradientPanel();
        fSTexFieldMD2 = new LIB.FSTexFieldMD();
        fSButtonMD1 = new LIB.FSButtonMD();
        jLabel2 = new javax.swing.JLabel();
        fSButtonMD2 = new LIB.FSButtonMD();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fSGradientPanel1.setFSEndColor(new java.awt.Color(240, 132, 218));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(128, 175, 255));

        fSTexFieldMD2.setForeground(new java.awt.Color(0, 0, 0));
        fSTexFieldMD2.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        fSTexFieldMD2.setPlaceholder("Ingresar número");
        fSTexFieldMD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSTexFieldMD2ActionPerformed(evt);
            }
        });

        fSButtonMD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        fSButtonMD1.setText("Iniciar");
        fSButtonMD1.setColorNormal(new java.awt.Color(255, 255, 255));
        fSButtonMD1.setColorPressed(new java.awt.Color(255, 255, 255));
        fSButtonMD1.setColorTextNormal(new java.awt.Color(0, 0, 0));
        fSButtonMD1.setColorTextPressed(new java.awt.Color(255, 153, 153));
        fSButtonMD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabel2.setText("Cantidad de filosofos");

        fSButtonMD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        fSButtonMD2.setText("Resetear");
        fSButtonMD2.setColorNormal(new java.awt.Color(255, 255, 255));
        fSButtonMD2.setColorPressed(new java.awt.Color(255, 255, 255));
        fSButtonMD2.setColorTextNormal(new java.awt.Color(0, 0, 0));
        fSButtonMD2.setColorTextPressed(new java.awt.Color(255, 153, 153));
        fSButtonMD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fSGradientPanel1Layout = new javax.swing.GroupLayout(fSGradientPanel1);
        fSGradientPanel1.setLayout(fSGradientPanel1Layout);
        fSGradientPanel1Layout.setHorizontalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fSGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fSButtonMD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fSTexFieldMD2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fSButtonMD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fSGradientPanel1Layout.setVerticalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fSTexFieldMD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fSButtonMD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fSButtonMD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel1.setText("X ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(467, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fSGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fSGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void fSTexFieldMD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSTexFieldMD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fSTexFieldMD2ActionPerformed

    private void fSButtonMD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD1ActionPerformed
        if(!"".equals(fSTexFieldMD2.getText())){
            Integer cantidadFilosofos = Integer.parseInt(fSTexFieldMD2.getText());
            float angulos;//Distancia entre angulos de filosofos
            float angulos2;
            
            float angulostenedor;//Distancia entre angulos de tenedores
            float angulostenedor2;
            
            float dis; //Distancia promedio entre platos
            
            //Conseguir distancia de Angulos entre cada plato
            angulos = 360/cantidadFilosofos;
            angulos2 = angulos;
            
            //Calcilo de distancia entre platos
            dis = angulos/2;
            
            angulostenedor = angulos + dis;
            angulostenedor2 = angulostenedor;
                       
            //int aux = 1;
            for (int i = 0; i < cantidadFilosofos; i++) {

                //Obtener su valor en Radianes
                double b = Math.toRadians(angulos2);
                double t = Math.toRadians(angulostenedor2);

                //Valor para los ejes
                double ejex = (200 * Math.cos(b)) +200;
                double ejey = (200 * Math.sin(b))+200;

                double ejetx = (200 * Math.cos(t)) +200;
                double ejety = (200 * Math.sin(t))+200;
                
                //Guarda los valores como enteros para poder posicionar en circulo
                int ix = (int) Math.round(ejex);
                int iy = (int) Math.round(ejey);
                
                int itx = (int) Math.round(ejetx);
                int ity = (int) Math.round(ejety);
                
                /*System.out.println("Circulo "+ aux);
                
                System.out.println("eje x " + ix);
                System.out.println("eje y " + iy);
                
                aux++;*/
                
                //Añadir la cantidad de platos necesarios
                JLabel x = new JLabel("Plato Filosofo " + (i + 1));
                x.setBounds(ix, iy, 30, 30);// esto es lo que se buscará corregir para que quede circular
                ImageIcon imagen = new ImageIcon("src/Imagenes/1.png");
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(x.getWidth(), x.getHeight(), Image.SCALE_DEFAULT));
                x.setIcon(icono);
                this.add(x);
                x.setBorder(border);
                listaLabel.add(x);
                
                //Añadir la cantidad de tenedores necesarios
                
                JLabel tenedor = new JLabel();
                tenedor.setBounds(itx, ity, 30, 30);
                ImageIcon imagen2 = new ImageIcon("src/Imagenes/tenedor.png");
                Icon iconot = new ImageIcon(imagen2.getImage().getScaledInstance(tenedor.getWidth(), tenedor.getHeight(), Image.SCALE_DEFAULT));
                tenedor.setIcon(iconot);
                this.add(tenedor);
                tenedor.setBorder(border);
                listatenedores.add(tenedor);
                
                //Suma para agregar siguiente plato y tenedor
                angulos2 = angulos2 + angulos;
                angulostenedor2 = angulostenedor2 + angulos;
                // aquí se deberían crear los filosofos
            }
            monitor.addFilosofos(cantidadFilosofos);
            
            idF.encender();
            monitor.encender();
            fSButtonMD1.setEnabled(false);
            fSButtonMD2.setEnabled(true);
        }
    }//GEN-LAST:event_fSButtonMD1ActionPerformed

    private void fSButtonMD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD2ActionPerformed
        Integer a = Integer.parseInt(fSTexFieldMD2.getText());
        fSTexFieldMD2.setText("");
        idF.apagar();
        monitor.apagar();
       
        for (int i = 0; i < listaLabel.size(); i++) {
            this.remove(listaLabel.get(i));
            this.remove(listatenedores.get(i));
        }
        listatenedores.clear();
        listaLabel.clear();
        listaProcesos.clear();
        
        this.repaint();
        //System.out.println(listaLabel.size());
        //System.out.println(listaLabel.size());
        fSButtonMD1.setEnabled(true);
        monitor.eliminarFilosofos();
    }//GEN-LAST:event_fSButtonMD2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(idF.encendido);
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD fSButtonMD1;
    private LIB.FSButtonMD fSButtonMD2;
    private LIB.FSGradientPanel fSGradientPanel1;
    private LIB.FSTexFieldMD fSTexFieldMD2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    class ImagenFondo extends JPanel{
        private Image imagen2;
        @Override
        public void paint(Graphics g){
            imagen2 = new ImageIcon(getClass().getResource("circulo.png")).getImage();
            g.drawImage(imagen2, 0, 0, 440, 440, this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
