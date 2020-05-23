/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author DonTulio
 */
public class BotonAsiento extends JToggleButton{
    private Asiento asiento;
    private final ImageIcon OCUPADO;
    private final ImageIcon DISPONIBLE;
    private final ImageIcon SELECCIONADO;
    
    /**
     * Metodo definira el reseto de las casillas
     */
    public BotonAsiento(Asiento nuevoAsiento) throws IOException{
        this.setAsiento(nuevoAsiento);
        this.OCUPADO = new ImageIcon(ImageIO.read(this.getClass().getResource("/vista/imagenes/ocupado.png")));
        this.DISPONIBLE = new ImageIcon(ImageIO.read(this.getClass().getResource("/vista/imagenes/disponible.png")));
        this.SELECCIONADO = new ImageIcon(ImageIO.read(this.getClass().getResource("/vista/imagenes/seleccionado.png")));   
        // Configuramos las imagenes en base al estado del asiento
        this.setIconDefault();
    }

    private Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
    
    /**
     * Metodo que definira la acción al momento de resetear el boton
     */
    private void asignarImagenesFinales(){
        
    }
    
    public void reiniciar(){
        super.setSelected(false);
    }
    /**
     * Estado asiento 0 = Disponible
     * Estado asiento 1 = Ocupado
     * Estado asiento 2 = Seleccionado
     */
    private void setIconDefault(){
        if(this.getAsiento().getEstadoAsiento() == 0){
            // Asignamos el boton para el icono disponible
            super.setIcon(this.DISPONIBLE);
        }
        else if(this.getAsiento().getEstadoAsiento() == 1){
            // Asignamos el icono para el boton desactivado
            super.setDisabledIcon(OCUPADO);
            this.setEnabled(false);
        }
        // Asignamos la imagen para cuando está se selecciona
        if(this.isEnabled()){
            this.setSelectedIcon(SELECCIONADO);
        }
    }
    
    @Override
    public void setSelected(boolean b) {
        // Definimos. si el boton no esta seleccionado, seleccionarlo
        if(!this.isSelected()){
            //Seleccionamos el boton
            super.setSelected(b);
        }
            
        
    }
    
    
    
    
}
