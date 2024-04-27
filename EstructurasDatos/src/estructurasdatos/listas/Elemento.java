/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.listas;

/**
 *
 * @author sehjud
 */
public class Elemento<E> {
    private Elemento sig = null, ant = null;
    private E elemento;

    public Elemento(E elemento) {
        this.elemento = elemento;
    }
    
    
    
    public void agregarSiguiente(Elemento<E> e){
        setSig(e);
    }

    /**
     * @return the sig
     */
    public Elemento getSig() {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Elemento sig) {
        this.sig = sig;
    }

    /**
     * @return the ant
     */
    public Elemento getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(Elemento ant) {
        this.ant = ant;
    }

    /**
     * @return the elemento
     */
    public E getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }
    
    
    
}
