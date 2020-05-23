/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DonTulio
 */
public class Asiento {
    private int numeroAsiento;
    private byte estadoAsiento;

    public Asiento() {
    }

    public Asiento(int numeroAsiento, byte estadoAsiento) {
        this.numeroAsiento = numeroAsiento;
        this.estadoAsiento = estadoAsiento;
    }

    
    
    
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public byte getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(byte estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }
    
    
    
}
