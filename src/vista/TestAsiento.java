/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import javax.swing.JToggleButton;
import modelo.Asiento;
import modelo.BotonAsiento;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DonTulio
 */
public class TestAsiento extends javax.swing.JFrame {

    /**
     * Creates new form TestAsiento
     */
    public TestAsiento() {
        initComponents();
        this.crearAsientos();
    }

    private void crearAsientos() {
        List<Asiento> asientos = new ArrayList<Asiento>();
        Random random = new Random();
        int posicionColumna = 5; // Posición inicial del primer elemento
        int posicionFila = 5; // Posicición inicial del primer elemento
        int cantFilas = 5; // Cantidad de filas que tendra el cuadrado
        int contador = 1; // un acumulador del for each
        // creamos 45 asientos con un estado al azar entre 0 y 1 (Disponible/ocupado)
        //Simulando los datos de la base de datos
        for (int i = 0; i < 45; i++) {

            asientos.add(
                    new Asiento(i, (byte) random.nextInt(2))
            );
        }
        try {
            for (Asiento temp : asientos) {
                // Creamos un asiento (ToggleButton con la información de la clase asiento)
                // Con esto damos la creación de los asientos por fila y columnas definidos arriba
                BotonAsiento nuevoAsiento = new BotonAsiento(temp);
                nuevoAsiento.setSize(128,128);
                nuevoAsiento.setLocation(posicionColumna, posicionFila);
                posicionFila = posicionFila + 128;
                // Preguntamos si el residuo del contador es 0 en base a las filas que definimos
                // Si es así creara las columnas correspondientes :D
                if(contador%cantFilas == 0){
                    posicionColumna = posicionColumna+128;
                    posicionFila = 5;
                }
                //Añadimos el nuevo elemento al JFrame en sus posición antes asignadas
                this.add(nuevoAsiento);
                contador++;
            }
            // Definimos el comportamiendo del JFrame
            this.setSize(128*(45/5)+30, 128*5+50);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
        } catch (IOException e) {
            System.out.println(e.getMessage());
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TestAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestAsiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}